package jp.co.axio.masterMentsetSystem.service;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.common.MmsConstants;
import jp.co.axio.masterMentsetSystem.controller.ChgPwdForm;
import jp.co.axio.masterMentsetSystem.controller.LoginInfo;
import jp.co.axio.masterMentsetSystem.dto.PulldownItemDto;
import jp.co.axio.masterMentsetSystem.model.MPassword;
import jp.co.axio.masterMentsetSystem.model.TPasswordHist;
import jp.co.axio.masterMentsetSystem.repository.MPasswordMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserExpansionMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserMapper;
import jp.co.axio.masterMentsetSystem.repository.MgpCodeMstMapper;
import jp.co.axio.masterMentsetSystem.repository.TPasswordHistMapper;
import jp.co.axio.masterMentsetSystem.repository.TUserSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.TUserSystemSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.VAdminMaintenanceEntityMapper;
import jp.co.axio.masterMentsetSystem.util.HttpUtil;
import jp.co.axio.masterMentsetSystem.util.StringUtil;
import jp.co.axio.masterMentsetSystem.util.XmlUtil;
import java.util.regex.Pattern;

/**
 * ユーザーサービスクラス
 *
 * @author AXIO
 * @version 1.0
 */
@Service
public class ChgPwdService {


	@Autowired
	CommonService commonService;

	@Autowired
	TPasswordHistMapper tPasswordHistMapper;

	@Autowired
	TUserSubEntityMapper tUserSubEntityMapper;

	@Autowired
	TUserSystemSubEntityMapper tUserSystemSubEntityMapper;

	@Autowired
	VAdminMaintenanceEntityMapper vAdminMaintenanceEntityMapper;

	@Autowired
	MUserExpansionMapper mUserExpansionMapper;

	@Autowired
	MgpCodeMstMapper mgpCodeMstMapper;

	@Autowired
	MPasswordMapper mPasswordMapper;

	@Autowired
	MUserMapper mUserMapper;

	public String errorMsg;

	/**
	 * メッセージソース
	 */
	@Autowired
	MessageSource messageSource;
	/**
	 * セッション
	 */
	@Autowired
	HttpSession session;

    /** 自画面のタイトル */
    public static final String OWN_TITLE = "利用者管理機能：利用者詳細";

    private final DatabaseService databaseService;

    @Autowired
    public ChgPwdService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

	/**
	 * パスワード変更の入力内容の有効性をチェックする
	 * @param form
	 * @return
	 */
	public String checkPwdValidate(ChgPwdForm form) {
//		(1)	「SQL パスワード取得」にて、ログインユーザのユーザIDからパスワードを複合化し、取得する
//
		MPassword mPass = mPasswordMapper.selectByPrimaryKey(form.getUserId());

		//パスワード暗号用共通鍵
        List<PulldownItemDto> codeList = commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01008);
        String encKey = (String)codeList.get(1).getValue();
		String textPass = databaseService.getString("select f_decrypt('%s','%s')".formatted(mPass.getCurrPassword(), encKey));


//		(2)	入力されたパスワードと(1)で取得したパスワードを比較する
//			・	値が同じ場合
//				(3)の処理へ
//			・	値が異なる場合
//				エラーメッセージを表示する
//				「現行パスワードが正しくありません。」
		if(textPass != null && !textPass.equals(form.getNowPassword())) {
			//現行パスワードが一致しない
			if(MmsConstants.LANG_CODE_JP.equals(form.langDiv)) {
				return messageSource.getMessage(MmsConstants.MSG_MSTO0017M0101JP, null,null);
			}else {
				return messageSource.getMessage(MmsConstants.MSG_MSTO0017M0101EN, null,null);
			}
		}

//
//		(3)	新パスワードがパスワードのポリシーを満たしていることを確認する
//
		if(!validatePassword(form.getNewPassword())) {
			if(MmsConstants.LANG_CODE_JP.equals(form.langDiv)) {
				return messageSource.getMessage(MmsConstants.MSG_MSTO0017M0102JP, null,null);
			}else {
				return messageSource.getMessage(MmsConstants.MSG_MSTO0017M0102EN, null,null);
			}
		}

//		(4)	新パスワードと新パスワード（確認）が同じ値であることを確認する
		if(form.getNewPassword() != null
				&& !form.getNewPassword().equals(form.getNewPasswordConfirm())) {
			if(MmsConstants.LANG_CODE_JP.equals(form.langDiv)) {
				return messageSource.getMessage(MmsConstants.MSG_MSTO0017M0103JP, null,null);
			}else {
				return messageSource.getMessage(MmsConstants.MSG_MSTO0017M0103EN, null,null);
			}
		}

		return "";
	}

	/**
	 * パスワードの有効性をチェック
	 * @param newPassword
	 * @return
	 */
	private boolean validatePassword(String password) {

//		1)	「SQL　パスワードポリシー取得」より、汎用コードマスタからパスワードポリシー設定を取得する
//
//		2)	英大文字が含まれていることを確認する
//			英大文字必須フラグが1の場合、チェックを行う
		String tmpStr = databaseService.getString("select value_1 from m_gp_code_mst where class_code = '01012' and code_value='00001'");
		if("1".equals(tmpStr)) {
	        if (!containsUppercase(password)) {
	            return false;
	        }
		}
//
//		3)	英小文字が含まれていることを確認する
//			英小文字必須フラグが1の場合、チェックを行う
		tmpStr = databaseService.getString("select value_1 from m_gp_code_mst where class_code = '01012' and code_value='00002'");
		if("1".equals(tmpStr)) {
			if (!containsLowercase(password)) {
				return false;
			}
		}
//
//		3)	数字が含まれていることを確認する
//			数字必須フラグが1の場合、チェックを行う
		tmpStr = databaseService.getString("select value_1 from m_gp_code_mst where class_code = '01012' and code_value='00003'");
		if("1".equals(tmpStr)) {
			if (!containsDigit(password)) {
				return false;
			}
		}
//
//		4)	禁止文字以外の記号が含まれていることを確認する
//			記号確認フラグが1の場合、チェックを行う
		tmpStr = databaseService.getString("select value_1 from m_gp_code_mst where class_code = '01012' and code_value='00004'");
		if("1".equals(tmpStr)) {
			tmpStr = databaseService.getString("select value_2 from m_gp_code_mst where class_code = '01012' and code_value='00004'");
			if (tmpStr != null && containsAllowedSymbols(password, tmpStr)) {
				return false;
			}
		}

//
//		5)	最大文字数以内であることを確認する
//			最大文字数確認フラグが1の場合、チェックを行う
		tmpStr = databaseService.getString("select value_1 from m_gp_code_mst where class_code = '01012' and code_value='00005'");
		if("1".equals(tmpStr)) {
			tmpStr = databaseService.getString("select value_4 from m_gp_code_mst where class_code = '01012' and code_value='00005'");
			if (tmpStr != null && (password.length() > Integer.parseInt(tmpStr))) {
				return false;
			}
		}
//
//		6)	最小文字数以上であることを確認する
//			最大文字数確認フラグが1の場合、チェックを行う
		tmpStr = databaseService.getString("select value_1 from m_gp_code_mst where class_code = '01012' and code_value='00006'");
		if("1".equals(tmpStr)) {
			tmpStr = databaseService.getString("select value_4 from m_gp_code_mst where class_code = '01012' and code_value='00006'");
			if (tmpStr != null && (password.length() < Integer.parseInt(tmpStr))) {
				return false;
			}
		}

		return true;
	}

    private boolean containsUppercase(String str) {
        return str.matches(".*[A-Z]+.*");
    }

    private boolean containsLowercase(String str) {
        return str.matches(".*[a-z]+.*");
    }

    private boolean containsDigit(String str) {
        return str.matches(".*\\d+.*");
    }

    private boolean containsAllowedSymbols(String str, String forbiddenStr) {
        return str.matches(".*[" + Pattern.quote(forbiddenStr) + "]+.*");
    }

	/**
//		(5)	パスワードを更新する
//			1)	新パスワードを暗号化する
//			2)	「SQL-xx-U-01　ユーザパスワード更新」よりパスワードマスタを更新する
//			3)	「SQL-xx-U-01　ユーザパスワード更新履歴登録」よりパスワード履歴を登録する
//			4)	SQL「SQL-xx-S-02　SIME管理者情報取得」にて、管理者のIDとパスワードを取得する
//			5)	APIを実行し、SIME連携セッションIDを発行する
//			6)	APIを実行し、SIMEパスワード連携APIを実行する
//			7)	「SQL-xx-U-02　ユーザパスワード反映完了」よりパスワード履歴の反映フラグを完了済みにする
//			8)	「SQL-02-U-01　パスワード変更操作ログ登録」より、パスワード変更のログを操作ログに登録する
//			9)	パスワード変更完了モーダルを表示する
	 * @param form
	 * @return
	 */
	public String changePwd(ChgPwdForm form) {
//		パスワード変更 変更押下時
		@SuppressWarnings("unused")
		int count = 0;

		Date startDateTime = commonService.getDbSysDt();
		String userId = form.getUserId();
		String sessionUserId = ((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId();
		String textPass = form.getNewPassword();
		String langDiv = form.langDiv;

		final String CHANGE_PWD_ERROR = "CHANGE_PWD_ERROR";

//
//		(5)	パスワードを更新する
//
//			1)	新パスワードを暗号化する
//
		//パスワード暗号用共通鍵
		List<PulldownItemDto> codeList = commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01008);
		String encKey = (String)codeList.get(1).getValue();
		String encPass = databaseService.getString("select f_encrypt('%s','%s')".formatted(textPass, encKey));

//			2)	「SQL-xx-U-01　ユーザパスワード更新」よりパスワードマスタを更新する
//
		MPassword mPassword = mPasswordMapper.selectByPrimaryKey(userId);

		// ユーザーID	user_id
		// mPassword.setUserId(userId);
		// パスワード curr_password
		mPassword.setCurrPassword(encPass);
		// 初期パスワード init_password
		// mPassword.setInitPassword();
		// ユーザパスワード user_password
		mPassword.setUserPassword(encPass);
		// ロックパスワード lock_passwod
		// mPassword.setLockPasswod();
		// 登録者ID	register_id
		// mPassword.setRegisterId();
		// 登録日時	regist_ts
		// mPassword.setRegistTs();
		// 更新者ID	updater_id
		mPassword.setUpdaterId(sessionUserId);
		// 更新日時	update_ts
		mPassword.setUpdateTs(startDateTime);

		count += mPasswordMapper.updateByPrimaryKey(mPassword);


//			3)	「SQL-xx-U-01　ユーザパスワード更新履歴登録」よりパスワード履歴を登録する
//

		TPasswordHist tPasswordHist = new TPasswordHist();

		// ユーザーID user_id
		tPasswordHist.setUserId(sessionUserId);
		// パスワード更新者ID password_updater_id
		tPasswordHist.setPasswordUpdaterId(sessionUserId);
		// パスワード更新日時 password_update_ts
		tPasswordHist.setPasswordUpdateTs(startDateTime);
		// パスワード curr_password
		tPasswordHist.setCurrPassword(encPass);
		// 反映フラグ reflection_flag
		tPasswordHist.setReflectionFlag("1");
		// 操作ID
		tPasswordHist.setOpeId(MmsConstants.FUNC_ID_5000);
		// 登録者ID register_id
		tPasswordHist.setRegisterId(sessionUserId);
		// 登録日時 regist_ts
		tPasswordHist.setRegistTs(startDateTime);
		// 更新者ID updater_id
		tPasswordHist.setUpdaterId(sessionUserId);
		// 更新日時 update_ts
		tPasswordHist.setUpdateTs(startDateTime);

		count += tPasswordHistMapper.insert(tPasswordHist);

//			4)	SQL「SQL-xx-S-02　SIME管理者情報取得」にて、管理者のIDとパスワードを取得する
//
    	List<Map<String, Object>> mstCode = databaseService.executeSqlQuery("select * from m_gp_code_mst where class_code = '01014' and code_value='00001'");
    	if(mstCode.size() == 0) {
    		LogService.system(OWN_TITLE, this.getClass().getSimpleName(), "パスワード変更処理", "汎用コードマスタにSIMEログイン情報がありません。" );
    		return CHANGE_PWD_ERROR;
    	}
    	String apiUrl = mstCode.get(0).get("value_1").toString();
    	String apiUid = mstCode.get(0).get("value_2").toString();
    	String apiPass = mstCode.get(0).get("value_3").toString();

//			5)	APIを実行し、SIME連携セッションIDを発行する
//
    	String sessid = "";
        // 受信したXMLを解析してsessidを取得
        try {
			sessid = execSimeLogin(apiUrl, apiUid, apiPass);
		} catch (Exception e) {
			e.printStackTrace();
    		LogService.system(OWN_TITLE, this.getClass().getSimpleName(), "パスワード変更処理", "SIME APIのセッション取得に失敗しました。" );
    		LogService.system(OWN_TITLE, this.getClass().getSimpleName(), "パスワード変更処理", e.getMessage() );
    		return CHANGE_PWD_ERROR;
		}

//			6)	APIを実行し、SIMEパスワード連携APIを実行する
//

        int iRet = 0;
		try {
			iRet = execSimeSetPassword(apiUrl, sessid, userId, textPass);
		} catch (Exception e) {
			e.printStackTrace();
    		LogService.system(OWN_TITLE, this.getClass().getSimpleName(), "パスワード変更処理", "SIME APIのパスワード更新に失敗しました。" );
    		LogService.system(OWN_TITLE, this.getClass().getSimpleName(), "パスワード変更処理", e.getMessage() );
    		return CHANGE_PWD_ERROR;
		}
        if (iRet != 0 ) {
        	//throw new Exception("SIME パスワード変更処理が失敗しました。");
    		LogService.system(OWN_TITLE, this.getClass().getSimpleName(), "パスワード変更処理", "SIME APIのパスワード更新に失敗しました。" );
    		return CHANGE_PWD_ERROR;
        }


//			7)	「SQL-xx-U-02　ユーザパスワード反映完了」よりパスワード履歴の反映フラグを完了済みにする
//
//
		// ユーザーID user_id
		//tPasswordHist.setUserId(sessionUserId);
		// パスワード更新者ID password_updater_id
		//tPasswordHist.setPasswordUpdaterId(sessionUserId);
		// パスワード更新日時 password_update_ts
		//tPasswordHist.setPasswordUpdateTs(startDateTime);
		// パスワード curr_password
		//tPasswordHist.setCurrPassword(encPass);
		// 反映フラグ reflection_flag
		tPasswordHist.setReflectionFlag("0");
		// 操作ID
		//tPasswordHist.setOpeId(MmsConstants.FUNC_ID_5000);
		// 登録者ID register_id
		//tPasswordHist.setRegisterId(sessionUserId);
		// 登録日時 regist_ts
		//tPasswordHist.setRegistTs(startDateTime);
		// 更新者ID updater_id
		tPasswordHist.setUpdaterId(sessionUserId);
		// 更新日時 update_ts
		tPasswordHist.setUpdateTs(startDateTime);
		count += tPasswordHistMapper.updateByPrimaryKey(tPasswordHist);

//			8)	「SQL-02-U-01　パスワード変更操作ログ登録」より、パスワード変更のログを操作ログに登録する
//
		//操作ログを登録
		commonService.insOpelog(MmsConstants.FUNC_ID_5000, MmsConstants.FUNC_ID_5000_LABEL, userId, "パスワードを変更しました。");

//			9)	パスワード変更完了モーダルを表示する



		return "";
	}

	/**
	 * @param url
	 * @param sysUseid
	 * @param sysPassword
	 * @return
	 * @throws Exception
	 */
	private String execSimeLogin(String url, String sysUseid, String sysPassword) throws Exception 	{
		// SIME API へのログイン
		// curl -X POST -H "Content-Type: application/x-www-form-urlencoded" -sk http://138.3.214.9/admin/api/ -d action_login=true -d id=admin -d password=Axio0940
		// curl -X POST -H "Content-Type: multipart/form-data" -sk http://138.3.214.9/admin/api/ -F action_login=true -F id=admin -F password=Axio0940

		LinkedHashMap<String, String> headers = new LinkedHashMap<String, String>();
		LinkedHashMap<String, String> datas = new LinkedHashMap<String, String>();
		datas.put("action_login", "true");
		datas.put("id", sysUseid);
		datas.put("password", sysPassword);

		String resBody;
		String resCode;
		String resMessage;
		String resSessid;

		try {
			// resBody = HttpUtil.executePost(url, headers, datas);
			resBody = HttpUtil.executePostAcceptAll(url, headers, datas);
		} catch (IOException | KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "SIME APIとの通信に失敗しました。", e.getMessage() );
			throw e;
		}
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "body：", resBody );

		try {
			resCode = XmlUtil.evaluateXPath(resBody, "/response/code/text()");
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "code：", resCode );
		} catch (XPathExpressionException | ParserConfigurationException | SAXException | IOException e) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "SIME APIとの通信に失敗しました。", e.getMessage() );
			throw e;
		}

		try {
			resMessage = XmlUtil.evaluateXPath(resBody, "/response/message/text()");
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "message：", resMessage );
		} catch (XPathExpressionException | ParserConfigurationException | SAXException | IOException e) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "SIME APIとの通信に失敗しました。", e.getMessage() );
			throw e;
		}

		try {
			resSessid = XmlUtil.evaluateXPath(resBody, "/response/sessid/text()");
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "sessid：", resSessid );
		} catch (XPathExpressionException | ParserConfigurationException | SAXException | IOException e) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "SIME APIとの通信に失敗しました。", e.getMessage() );
			throw e;
		}

		if( ! StringUtil.equals(resCode, "0") || StringUtil.isBlank(resSessid)) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "SIME API 認証に失敗しました。code：", resCode );
			return "";
		}

		return resSessid;
	}
	/**
	 * @param url
	 * @param sessid
	 * @param useid
	 * @param password
	 * @return
	 * @throws Exception
	 */
	private int execSimeSetPassword(String url, String sessid, String useid, String password) throws Exception 	{

		// SIME パスワードAPI の実行
		// curl -X POST -H "Content-Type: application/x-www-form-urlencoded" -sk http://138.3.214.9/admin/api/ -d action_user_setPasswd=true -d sessid=87auqs33bncu9iatnjs3h64l7t -d id=test2001 -d password=Axio0940
		// curl -X POST -H "Content-Type: multipart/form-data" -sk http://138.3.214.9/admin/api/ -F action_user_setPasswd=true -F sessid=n7fpij0mru7cfoaaq59cqi37v4 -F id=test2001 -F password=Axio0940

		LinkedHashMap<String, String> headers = new LinkedHashMap<String, String>();
		LinkedHashMap<String, String> datas = new LinkedHashMap<String, String>();
		datas.put("action_user_setPasswd", "true");
		datas.put("sessid", sessid);
		datas.put("id", useid);
		datas.put("password", password);

		String resBody;
		String resCode;
		String resMessage;

		try {
			//resBody = HttpUtil.executePost(url, headers, datas);
			resBody = HttpUtil.executePostAcceptAll(url, headers, datas);
		} catch (IOException | KeyManagementException | NoSuchAlgorithmException | KeyStoreException e) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "SIME APIとの通信に失敗しました。", e.getMessage() );
			throw e;
		}
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "body：", resBody );
		try {
			resCode = XmlUtil.evaluateXPath(resBody, "/response/code/text()");
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "code：", resCode );
		} catch (XPathExpressionException | ParserConfigurationException | SAXException | IOException e) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "SIME APIとの通信に失敗しました。", e.getMessage() );
			throw e;
		}

		try {
			resMessage = XmlUtil.evaluateXPath(resBody, "/response/message/text()");
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "message：", resMessage );
		} catch (XPathExpressionException | ParserConfigurationException | SAXException | IOException e) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "SIME APIとの通信に失敗しました。", e.getMessage() );
			throw e;
		}

		if( ! StringUtil.equals(resCode, "0") ) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "SIME API 認証に失敗しました。code：", resCode );
			return 1;
		}

		return 0;
	}

}
