package jp.co.axio.masterMentsetSystem.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.common.MmsConstants;
import jp.co.axio.masterMentsetSystem.controller.LoginInfo;
import jp.co.axio.masterMentsetSystem.controller.UserRegistForm;
import jp.co.axio.masterMentsetSystem.dto.PulldownItemDto;
import jp.co.axio.masterMentsetSystem.model.MPassword;
import jp.co.axio.masterMentsetSystem.model.MUser;
import jp.co.axio.masterMentsetSystem.model.MUserCompany;
import jp.co.axio.masterMentsetSystem.model.MUserCompanyKey;
import jp.co.axio.masterMentsetSystem.model.MUserExample;
import jp.co.axio.masterMentsetSystem.model.MUserExpansion;
import jp.co.axio.masterMentsetSystem.model.MUserOrganization;
import jp.co.axio.masterMentsetSystem.model.MUserSystem;
import jp.co.axio.masterMentsetSystem.model.TPasswordHist;
import jp.co.axio.masterMentsetSystem.model.TUserSubEntity;
import jp.co.axio.masterMentsetSystem.model.TUserSystemSubEntity;
import jp.co.axio.masterMentsetSystem.model.VAdminMaintenanceEntity;
import jp.co.axio.masterMentsetSystem.model.VAdminMaintenanceEntityExample;
import jp.co.axio.masterMentsetSystem.model.WNewUser;
import jp.co.axio.masterMentsetSystem.repository.MPasswordMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserCompanyMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserExpansionMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserOrganizationMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserSystemMapper;
import jp.co.axio.masterMentsetSystem.repository.TAuthHistMapper;
import jp.co.axio.masterMentsetSystem.repository.TPasswordHistMapper;
import jp.co.axio.masterMentsetSystem.repository.TUserSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.TUserSystemSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.VAdminMaintenanceEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.WNewUserMapper;

/**
 * ユーザーサービスクラス
 *
 * @author AXIO
 * @version 1.0
 */
@Service
public class UserRegistService {

	
	@Autowired
	CommonService commonService;
	
	@Autowired
	VAdminMaintenanceEntityMapper vAdminMaintenanceEntityMapper;
	
	@Autowired
	TUserSubEntityMapper tUserSubEntityMapper;
	
	@Autowired
	TUserSystemSubEntityMapper tUserSystemSubEntityMapper;

	@Autowired
	MUserMapper mUserMapper;
	
	@Autowired
	MUserExpansionMapper mUserExpansionMapper;
	
	@Autowired
	MUserCompanyMapper mUserCompanyMapper;
	
	@Autowired
	MUserOrganizationMapper mUserOrganizationMapper;
	
	@Autowired
	MUserSystemMapper mUserSystemMapper;
	
	@Autowired
	MPasswordMapper mPasswordMapper;
	
	@Autowired
	TPasswordHistMapper tPasswordHistMapper;
	
	@Autowired
	TAuthHistMapper tAuthHistMapperMapper;
	
	@Autowired
	WNewUserMapper wNewUserMapper;

    private static boolean warn_flag = false;
    
	
	
	/** システム日付 */
	protected Date startDateTime;
	

    /** 自画面のタイトル */
    public static final String OWN_TITLE = "利用者管理機能：利用者登録";
	
	/**
	 * セッション
	 */
	@Autowired
	HttpSession session;

    private final DatabaseService databaseService;
    
    @Autowired
    public UserRegistService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
    
    public void setUpdateTs() {
    	this.startDateTime = commonService.getDbSysDt();
    }
	
	/**
	 * ユーザ予約を保存
	 * @param tuse
	 */
	public void saveTUserSubEntity(TUserSubEntity tuse) {
		//既存ものがあったら削除
		int recCnt = databaseService.count("select count(user_id) cn from t_user_sub where user_id='" + tuse.getUserId() + "'");
		if(recCnt == 0) {
			tUserSubEntityMapper.insert(tuse);
		}else {
			tUserSubEntityMapper.updateByPrimaryKey(tuse);
		}
		
	}



	/**
	 * ユーザシステム利用予約　データ保存
	 * @param tusse
	 */
	public void saveTUserSystemSubEntity(TUserSystemSubEntity tusse) {
		//既存ものがあったら削除
		int recCnt = databaseService.count("select count(user_id) cn from t_user_system_sub where user_id='" + tusse.getUserId() + "'");
		if(recCnt == 0) {
			tUserSystemSubEntityMapper.insert(tusse);
		}else {
			tUserSystemSubEntityMapper.updateByPrimaryKey(tusse);
		}
			
		
	}


	/**
	 * 反映日＝システム基準日の場合、実行契機ファイルを出力する
	 * @param form
	 * @throws ParseException 
	 * @throws IOException 
	 */
	public void crtTriggerFile(UserRegistForm form) throws ParseException, IOException {

//        Date criterion_dt = commonService.getSysCriterionDt();
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		if(criterion_dt.compareTo(dateFormat.parse(form.getHanEiDt())) == 0) {
			//実効契機ファイルパスを取得
			List<PulldownItemDto> fPath = commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01002);
			if(fPath.size() > 1) {
				Path filePath = Paths.get(fPath.get(1).getValue());
				if(!Files.exists(filePath)) {
					Files.createFile(filePath);
				}
			}
//        }
		
	}


	/**
	 * 操作ログへ登録を行う
	 * @param form
	 */
	public void regOpLog(UserRegistForm form) {
		//操作ログを登録
		commonService.insOpelog(MmsConstants.FUNC_ID_1000, MmsConstants.FUNC_ID_1000_LABEL, form.getRiYouShaId(), "ユーザを新規作成しました。");

	}
	
	/**
	 * 操作ログへ登録を行う
	 * @param form
	 */
	public void regOpLogUserCancel(UserRegistForm form) {

		//操作ログを登録
		commonService.insOpelog(MmsConstants.FUNC_ID_1000, MmsConstants.FUNC_ID_1000_LABEL, form.getRiYouShaId(), "ユーザの反映待ち情報を取り消しました。");
		
	}


	/**
	 * 
		// 反映日＝システム基準日の場合、
		//3)	SQL「SQL-xx-I-03　ユーザマスタ登録」にて、ユーザマスタに登録する
		//4)	SQL「SQL-xx-I-04　ユーザ所属会社登録」にて、ユーザ所属会社に登録する
		//5)	SQL「SQL-xx-I-05　ユーザ所属組織登録」にて、ユーザ所属組織に登録する
		//6)	SQL「SQL-xx-I-06　ユーザ拡張登録」にて、ユーザ拡張に登録する
		//7)	SQL「SQL-xx-I-07　ユーザシステム利用マスタ登録」にて、ユーザシステム利用マスタに登録する
		//8)	SQL「SQL-xx-I-08　ユーザパスワード登録」にて、ユーザパスワードに登録する
		//9)	SQL「SQL-xx-I-09　パスワード履歴登録」にて、パスワード履歴に登録する
	 * @param tuse
	 * @param tusse
	 * @throws ParseException 
	 */
	public void saveToMaster(UserRegistForm form, TUserSubEntity tuse, TUserSystemSubEntity tusse) throws ParseException {

        Date criterion_dt = commonService.getSysCriterionDt();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		if(form != null && criterion_dt.compareTo(dateFormat.parse(form.getHanEiDt())) != 0) {
			//反映日がシステム基準日と一致しないため、処理終了
			return;
		}
		
		int recCnt = databaseService.count("select count(user_id) cn from m_user where user_id='" + tusse.getUserId() + "' and delete_flag ='0'");

		boolean newFlag = (recCnt==0? true:false);
		// 新規リストに追加
		// ①　ユーザマスタ
		// ② ユーザ所属会社
		// ③ ユーザ所属組織
		// ④ ユーザ拡張
		// ⑤ ユーザシステム利用
		// ⑥ パスワードマスタ
		// ⑦ パスワード履歴
		// ⑧　認証履歴
		// ⑨ ユーザシステム利用予約(反映済み更新)
		// ワーク・新規ユーザー
		// ①　ユーザマスタ
		
		// ユーザマスタにレコード追加 / 更新
		dealUsrMst(tuse, newFlag, tusse);

		// ④ ユーザ拡張
		// ユーザ拡張にレコード追加（入れ替え）
		dealUsrExpansion(tuse, tusse);

		// ② ユーザ所属会社
		// ユーザ所属会社にレコード追加（入れ替え）
		dealUsrCompany(tuse, tusse);

		// ③ ユーザ所属組織
		// ユーザ所属組織にレコード追加（入れ替え）
		dealUsrOrganization(tuse, tusse);

		// ⑤ ユーザシステム利用
		// ユーザシステム利用にレコード追加 / 更新
		dealUsrSystemMst(tuse, newFlag, tusse);


		if(newFlag) {
			// 新規リストに追加
			//パスワード生成パターン
			List<PulldownItemDto> codeList = commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01009);
			String initPasswordPlainPtn = (String)codeList.get(1).getValue();
			String initPasswordPlain = commonService.generatePwd(initPasswordPlainPtn);
			
			//パスワード生成パターン(ロック用)
			codeList = commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01010);
			String lockPasswordPlainPtn = (String)codeList.get(1).getValue();
			String lockPasswordPlain = commonService.generatePwd(lockPasswordPlainPtn);
			
			//パスワードポリシー：変更前後の共通文字列長(最大)
			codeList = commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01011);
			int pwdPolicyCommonSubstingLenMax = Integer.valueOf(codeList.get(1).getValue());
			
			boolean like = commonService.checkLike(initPasswordPlain, lockPasswordPlain, pwdPolicyCommonSubstingLenMax + 1);
			while(like) {
				// 適切な設定を行うことで、ここには来ません。
				LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理", "自動生成したパスワードとロック用パスワードが、N文字以上一致しました。汎用コードマスタの、パスワード生成パターン(LOCK用)またはチェック文字数を検討してください。" );
				initPasswordPlain = commonService.generatePwd(initPasswordPlainPtn);
				lockPasswordPlain = commonService.generatePwd(lockPasswordPlainPtn);
				like = commonService.checkLike(initPasswordPlain, lockPasswordPlain, pwdPolicyCommonSubstingLenMax + 1);
			}

			//パスワード暗号用共通鍵
			codeList = commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01008);
			String encKey = (String)codeList.get(1).getValue();
			
			// select f_encrypt( 'aa', 'P@ssword' )
			String sql = "select f_encrypt( '%s', '%s' )".formatted(initPasswordPlain, encKey);
			
			String initPassword = databaseService.getString(sql);
			
			sql = "select f_encrypt( '%s', '%s' )".formatted(lockPasswordPlain, encKey);
			String lockPassword = databaseService.getString(sql);

			// ⑥ パスワードマスタ
			// パスワードマスタにレコードを追加 / （更新時処理）
			dealPwdMst(tuse, newFlag, tusse, initPassword, lockPassword);

			// ⑦ パスワード履歴
			// パスワード履歴にレコードを追加 / （更新時処理）
			dealPwdHst(tuse, newFlag, tusse, initPassword, lockPassword);

			// ⑧　認証履歴
			// 認証履歴を初期化 / （更新時処理）
			dealAuthHst(tuse, newFlag, tusse);

		}


		// ⑨ ユーザシステム利用予約(反映済み更新)
		// ユーザシステム利用予約(反映済み更新)
		dealUsrSystemSub(tuse, newFlag, tusse);

		// ワーク・新規ユーザー
		if(newFlag) {
			dealWNewUsr(tuse, newFlag, tusse);
		}
		
	}


	/**
	 * ユーザーマスタに新規登録、或いは更新
	 *
	 * @param session
	 * @param record
	 * @param newFlag
	 * @param tUserSystemSub
	 * @return
	 */
	private int dealUsrMst(TUserSubEntity record, boolean newFlag, TUserSystemSubEntity tUserSystemSub) {

		// ユーザーマスタに新規レコードを追加する
		MUser userInfo = new MUser();
		// ユーザーID	user_id
		userInfo.setUserId(record.getUserId());

		// String emploeeId = record.getEmployeeId();
		// if (emploeeId == null || emploeeId.isEmpty()) {
		// 	emploeeId = record.getUserId();		// 雇用者IDがない場合、ユーザーIDで補完
		// }
		// userInfo.setEmployeeId(record.getUserId());

		// 雇用者ID	employee_id
		userInfo.setEmployeeId(record.getEmployeeId());
		// 開始日	start_date
		userInfo.setStartDate(record.getStartDate());
		// 終了日	end_date
		userInfo.setEndDate(record.getEndDate());

		// 初期パスワード	init_password
		// userInfo.setInitPassword(RandomStringUtils.randomAlphanumeric(6));	// 数字英数6桁のランダム値
		userInfo.setInitPassword(record.getInitPassword());	// 数字英数6桁のランダム値

		// 削除フラグ	delete_flag
		userInfo.setDeleteFlag(record.getDeleteFlag());
		// 無効フラグ	invalid_flag
		userInfo.setInvalidFlag(record.getInvalidFlag());
		// 言語コード	lang_code
		userInfo.setLangCode(record.getLangCode());
		// 在籍区分	enrollment_kbn
		userInfo.setEnrollmentKbn(record.getEnrollmentKbn());
		// 雇用区分	employment_kbn
		userInfo.setEmploymentKbn(record.getEmploymentKbn());
		// プライマリメールアドレス	mailaddr
		userInfo.setMailaddr(record.getMailaddr());
		// セカンダリメールアドレス	mailaddr_secound
		userInfo.setMailaddrSecound(record.getMailaddrSecound());
		// 通知先メールアドレス	mailaddr_notification
		userInfo.setMailaddrNotification(record.getMailaddrNotification());
		// 外線番号	tel
		userInfo.setTel(record.getTel());
		// 内線番号	tel_ex
		userInfo.setTelEx(record.getTelEx());
		// 姓（英語）	surname_en
		userInfo.setSurnameEn(record.getSurnameEn());
		// 姓（日本語）	surname_jp
		userInfo.setSurnameJp(record.getSurnameJp());
		// 姓（カタカナ）	surname_kana
		userInfo.setSurnameKana(record.getSurnameKana());
		// ミドルネーム（英語）	middlename_en
		userInfo.setMiddlenameEn(record.getMiddlenameEn());
		// ミドルネーム（日本語）	middlename_jp
		userInfo.setMiddlenameJp(record.getMiddlenameJp());
		// ミドルネーム（カタカナ）	middlename_kana
		userInfo.setMiddlenameKana(record.getMiddlenameKana());
		// 名（英語）	givenname_en
		userInfo.setGivennameEn(record.getGivennameEn());
		// 名 (日本語)	givenname_jp
		userInfo.setGivennameJp(record.getGivennameJp());
		// 名 (カタカナ)	givenname_kana
		userInfo.setGivennameKana(record.getGivennameKana());
		// 通称 姓（英語）	surname_nick_en
		userInfo.setSurnameNickEn(record.getSurnameNickEn());
		// 通称 姓（日本語）	surname_nick_jp
		userInfo.setSurnameNickJp(record.getSurnameNickJp());
		// 通称 姓（カタカナ）	surname_nick_kana
		userInfo.setSurnameNickKana(record.getSurnameNickKana());
		// 通称 ミドルネーム（英語）	middlename_nick_en
		userInfo.setMiddlenameNickEn(record.getMiddlenameNickEn());
		// 通称 ミドルネーム（日本語）	middlename_nick_jp
		userInfo.setMiddlenameNickJp(record.getMiddlenameNickJp());
		// 通称 ミドルネーム（カタカナ）	middlename_nick_kana
		userInfo.setMiddlenameNickKana(record.getMiddlenameNickKana());
		// 通称 名（英語）	givenname_nuck_en
		userInfo.setGivennameNuckEn(record.getGivennameNuckEn());
		// 通称 名 (日本語)	givenname_nuck_jp
		userInfo.setGivennameNuckJp(record.getGivennameNuckJp());
		// 通称 名 (カタカナ)	givenname_nuck_kana
		userInfo.setGivennameNuckKana(record.getGivennameNuckKana());
		// 更新区分	update_kbn
		if (newFlag) {
			userInfo.setUpdateKbn("2");		// 新規
		} else {
			userInfo.setUpdateKbn("1");		// 更新
		}
		// 登録者ID	register_id
		userInfo.setRegisterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		// 登録日時	regist_ts
		userInfo.setRegistTs(this.startDateTime);
		// 更新者ID	updater_id
		userInfo.setUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		// 更新日時	update_ts
		userInfo.setUpdateTs(this.startDateTime);

		int count = 0;
		MUser resultRec = mUserMapper.selectByPrimaryKey(record.getUserId());
		if (newFlag) {
			// 論理上、ユーザーマスタに新規ユーザーは存在しないけど、ゴミデータがあることを考慮する
			if (resultRec == null) {
				// DBにインサート
				count = mUserMapper.insert(userInfo);
			} else {
				// DBに更新（全項目）
				count = mUserMapper.updateByPrimaryKey(userInfo);
				LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理", "ユーザーマスタに新規ユーザーと同じIDのレコードがあり、更新しました。userId：" + record.getUserId());
			}
		} else {
			// 論理上、ユーザーマスタに該当ユーザーはあるはず、データ不整合を考慮する
			if (resultRec == null) {
				// DBにインサート
				count = mUserMapper.insert(userInfo);
				LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理", "ユーザーマスタに新規ではないユーザーは存在しない、追加しました。userId：" + record.getUserId());
			} else {
				// DBに更新
				// 初期パスワード	init_password	→更新不要
				// 登録者ID	register_id	→更新不要
				// 登録日時	regist_ts	→更新不要
				count = mUserMapper.updateByPrimaryKey(userInfo);
			}

		}

		return count;
	}


	/**
	 * ユーザー拡張属性情報の入れ替え
	 *
	 * @param record
	 * @param tUserSystemSub
	 * @return
	 */
	private int dealUsrExpansion(TUserSubEntity record, TUserSystemSubEntity tUserSystemSub) {

		MUserExpansion usrExpansion = new MUserExpansion();
		// ユーザーID	user_id
		usrExpansion.setUserId(record.getUserId());
		// 拡張属性１	expansion_attr1
		usrExpansion.setExpansionAttr1(record.getExpansionAttr1());
		// 拡張属性２	expansion_attr2
		usrExpansion.setExpansionAttr2(record.getExpansionAttr2());
		// 拡張属性３	expansion_attr3
		usrExpansion.setExpansionAttr3(record.getExpansionAttr3());
		// 拡張属性４	expansion_attr4
		usrExpansion.setExpansionAttr4(record.getExpansionAttr4());
		// 拡張属性５	expansion_attr5
		usrExpansion.setExpansionAttr5(record.getExpansionAttr5());
		// 拡張属性６	expansion_attr6
		usrExpansion.setExpansionAttr6(record.getExpansionAttr6());
		// 拡張属性７	expansion_attr7
		usrExpansion.setExpansionAttr7(record.getExpansionAttr7());
		// 拡張属性８	expansion_attr8
		usrExpansion.setExpansionAttr8(record.getExpansionAttr8());
		// 拡張属性９	expansion_attr9
		usrExpansion.setExpansionAttr9(record.getExpansionAttr9());
		// 拡張属性１０	expansion_attr10
		usrExpansion.setExpansionAttr10(record.getExpansionAttr10());
		// 拡張属性１１	expansion_attr11
		usrExpansion.setExpansionAttr11(record.getExpansionAttr11());
		// 拡張属性１２	expansion_attr12
		usrExpansion.setExpansionAttr12(record.getExpansionAttr12());
		// 拡張属性１３	expansion_attr13
		usrExpansion.setExpansionAttr13(record.getExpansionAttr13());
		// 拡張属性１４	expansion_attr14
		usrExpansion.setExpansionAttr14(record.getExpansionAttr14());
		// 拡張属性１５	expansion_attr15
		usrExpansion.setExpansionAttr15(record.getExpansionAttr15());
		// 拡張属性１６	expansion_attr16
		usrExpansion.setExpansionAttr16(record.getExpansionAttr16());
		// 拡張属性１７	expansion_attr17
		usrExpansion.setExpansionAttr17(record.getExpansionAttr17());
		// 拡張属性１８	expansion_attr18
		usrExpansion.setExpansionAttr18(record.getExpansionAttr18());
		// 拡張属性１９	expansion_attr19
		usrExpansion.setExpansionAttr19(record.getExpansionAttr19());
		// 拡張属性２０	expansion_attr20
		usrExpansion.setExpansionAttr20(record.getExpansionAttr20());
		// 拡張属性２１	expansion_attr21
		usrExpansion.setExpansionAttr21(record.getExpansionAttr21());
		// 拡張属性２２	expansion_attr22
		usrExpansion.setExpansionAttr22(record.getExpansionAttr22());
		// 拡張属性２３	expansion_attr23
		usrExpansion.setExpansionAttr23(record.getExpansionAttr23());
		// 拡張属性２４	expansion_attr24
		usrExpansion.setExpansionAttr24(record.getExpansionAttr24());
		// 拡張属性２５	expansion_attr25
		usrExpansion.setExpansionAttr25(record.getExpansionAttr25());
		// 拡張属性２６	expansion_attr26
		usrExpansion.setExpansionAttr26(record.getExpansionAttr26());
		// 拡張属性２７	expansion_attr27
		usrExpansion.setExpansionAttr27(record.getExpansionAttr27());
		// 拡張属性２８	expansion_attr28
		usrExpansion.setExpansionAttr28(record.getExpansionAttr28());
		// 拡張属性２９	expansion_attr29
		usrExpansion.setExpansionAttr29(record.getExpansionAttr29());
		// 拡張属性３０	expansion_attr30
		usrExpansion.setExpansionAttr30(record.getExpansionAttr30());
		// 拡張属性３１	expansion_attr31
		usrExpansion.setExpansionAttr31(record.getExpansionAttr31());
		// 拡張属性３２	expansion_attr32
		usrExpansion.setExpansionAttr32(record.getExpansionAttr32());
		// 拡張属性３３	expansion_attr33
		usrExpansion.setExpansionAttr33(record.getExpansionAttr33());
		// 拡張属性３４	expansion_attr34
		usrExpansion.setExpansionAttr34(record.getExpansionAttr34());
		// 拡張属性３５	expansion_attr35
		usrExpansion.setExpansionAttr35(record.getExpansionAttr35());
		// 拡張属性３６	expansion_attr36
		usrExpansion.setExpansionAttr36(record.getExpansionAttr36());
		// 拡張属性３７	expansion_attr37
		usrExpansion.setExpansionAttr37(record.getExpansionAttr37());
		// 拡張属性３８	expansion_attr38
		usrExpansion.setExpansionAttr38(record.getExpansionAttr38());
		// 拡張属性３９	expansion_attr39
		usrExpansion.setExpansionAttr39(record.getExpansionAttr39());
		// 拡張属性４０	expansion_attr40
		usrExpansion.setExpansionAttr40(record.getExpansionAttr40());

		// 該当ユーザの拡張属性情報を入れ替え
		// １、該当ユーザの拡張属性情報を全件削除する
		int count = mUserExpansionMapper.deleteByPrimaryKey(record.getUserId());
		// ２、追加
		count = mUserExpansionMapper.insert(usrExpansion);

		return count;
	}


	/**
	 * ユーザー所属会社情報の入れ替え
	 *
	 * @param session
	 * @param record
	 * @param tUserSystemSub
	 * @return
	 */
	private void dealUsrCompany(TUserSubEntity record, TUserSystemSubEntity tUserSystemSub) {
		String regUserId = ((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId();

		// ◆本務
		MUserCompany usrCompany = new MUserCompany();
		// ユーザーID	user_id
		usrCompany.setUserId(record.getUserId());
		// 所属会社コード	company_code
		usrCompany.setCompanyCode(record.getCompanyCode());
		// 開始日	start_date
		usrCompany.setStartDate(record.getStartDate());
		// 終了日	end_date
		usrCompany.setEndDate(record.getEndDate());
		// 無効フラグ	invalid_flag
		usrCompany.setInvalidFlag(record.getInvalidFlag());
		// 本務フラグ	honmu_flag
		usrCompany.setHonmuFlag("1");	// 固定値、"1"本務
		// 等級コード	grade_code
		usrCompany.setGradeCode(record.getGradeCode());
		// 登録者ID	register_id
		usrCompany.setRegisterId(regUserId);
		// 登録日時	regist_ts
		usrCompany.setRegistTs(this.startDateTime);
		// 更新者ID	updater_id
		usrCompany.setUpdaterId(regUserId);
		// 更新日時	update_ts
		usrCompany.setUpdateTs(this.startDateTime);

		// 該当ユーザの所属会社情報を入れ替え
		// １、該当ユーザの所属会社情報を全件削除する
		databaseService.execute("delete from m_user_company where user_id='%s'".formatted(record.getUserId()));
		
		// ２、追加（本務）
		 mUserCompanyMapper.insert(usrCompany);

		// ◆兼務
		String kenmuInfo = record.getKenmuInfo();
		if (kenmuInfo != null && !kenmuInfo.isEmpty()) {
			// 複数兼務間は「;」区切り
			String[] kenmuList = kenmuInfo.split(";");
			for (int i = 0; i < kenmuList.length; i++) {
				// 兼務情報間は"|"パイプ区切り
				String[] columnList = kenmuList[i].split("\\|");
				// ★項目順★
				// 0:兼務会社コード
				// 1:兼務会社名称
				// 2:兼務所属組織コード
				// 3:兼務所属組織名称　⇒組織マスタ.組織名称（日本語）
				// 4:兼務役職コード
				// 5:兼務役職名称
				// 6:兼務等級コード
				// 7:兼務等級名称
				// 8:兼務勤務地コード　⇒組織マスタ.勤務地コード
				// 9:兼務勤務地名称　⇒組織マスタ.勤務地名称（日本語）
				// フォーマットチェック
				if (columnList.length < 9) {
					// フォーマット不正の場合、警告メッセージを出力した上、該当部分をスキップする
					warn_flag = true;
					LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理", "兼務情報不正あり、下記の一部ユーザー所属会社情報をスキップしました。");
					LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理", "　[ユーザーID：" + record.getUserId()
						+ "　雇用者ID：" + record.getEmployeeId()
						+ "　LM内部ID：" + record.getLmId()
						+ "　兼務情報：" + kenmuInfo + "]"
						);
					continue;
				}

				MUserCompany usrCompany2 = new MUserCompany();
				// ユーザーID	user_id
				usrCompany2.setUserId(record.getUserId());
				// 所属会社コード	company_code
				usrCompany2.setCompanyCode(columnList[0]);
				// 開始日	start_date
				usrCompany2.setStartDate(record.getStartDate());
				// 終了日	end_date
				usrCompany2.setEndDate(record.getEndDate());
				// 無効フラグ	invalid_flag
				usrCompany2.setInvalidFlag(record.getInvalidFlag());
				// 本務フラグ	honmu_flag
				usrCompany2.setHonmuFlag("0");	// 固定値、"0"兼務
				// 等級コード	grade_code
				usrCompany2.setGradeCode(columnList[6]);
				// 登録者ID	register_id
				usrCompany2.setRegisterId(regUserId);
				// 登録日時	regist_ts
				usrCompany2.setRegistTs(this.startDateTime);
				// 更新者ID	updater_id
				usrCompany2.setUpdaterId(regUserId);
				// 更新日時	update_ts
				usrCompany2.setUpdateTs(this.startDateTime);

				// ユーザー所属会社に重複データがある場合、追加しない
				MUserCompanyKey keyData = new MUserCompanyKey();
				keyData.setUserId(usrCompany2.getUserId());
				keyData.setCompanyCode(usrCompany2.getCompanyCode());
				MUserCompany testDate = mUserCompanyMapper.selectByPrimaryKey(keyData);
				if (testDate == null) {
					// DBにインサート
					mUserCompanyMapper.insert(usrCompany2);
				}
			}
		}

	}

	/**
	 * ユーザー所属組織情報の入れ替え
	 *
	 * @param session
	 * @param record
	 * @param tUserSystemSub
	 * @return
	 */
	private void dealUsrOrganization(TUserSubEntity record, TUserSystemSubEntity tUserSystemSub) {
		String regUserId = ((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId();
		// 本務
		MUserOrganization usrOrg = new MUserOrganization();
		// ユーザーID	user_id
		usrOrg.setUserId(record.getUserId());
		// 所属会社コード	company_code
		usrOrg.setCompanyCode(record.getCompanyCode());
		// 所属組織コード	organization_code
		usrOrg.setOrganizationCode(record.getOrganizationCode());
		// 開始日	start_date
		usrOrg.setStartDate(record.getStartDate());
		// 終了日	end_date
		usrOrg.setEndDate(record.getEndDate());
		// 無効フラグ	invalid_flag
		usrOrg.setInvalidFlag(record.getInvalidFlag());
		// 本務フラグ	honmu_flag
		usrOrg.setHonmuFlag("1");	// 固定値、"1"本務
		// 勤務地コード	location_code
		usrOrg.setLocationCode(record.getLocationCode());
		// 役職コード	position_code
		usrOrg.setPositionCode(record.getPositionCode());
		// 登録者ID	register_id
		usrOrg.setRegisterId(regUserId);
		// 登録日時	regist_ts
		usrOrg.setRegistTs(this.startDateTime);
		// 更新者ID	updater_id
		usrOrg.setUpdaterId(regUserId);
		// 更新日時	update_ts
		usrOrg.setUpdateTs(this.startDateTime);
		// 該当ユーザの所属組織情報を入れ替え
		// １、該当ユーザの所属組織情報を全件削除する
		
		databaseService.execute("delete from m_user_organization where user_id ='%s'".formatted(record.getUserId()));
		
		// ２、追加（本務）
		mUserOrganizationMapper.insert(usrOrg);

		// 兼務
		String kenmuInfo = record.getKenmuInfo();
		if (kenmuInfo != null && !kenmuInfo.isEmpty()) {
			// 複数兼務間は「;」区切り
			String[] kenmuList = kenmuInfo.split(";");
			for (int i = 0; i < kenmuList.length; i++) {
				// 兼務情報間は"|"パイプ区切り
				String[] columnList = kenmuList[i].split("\\|");
				// ★項目順★
				// 0:兼務会社コード
				// 1:兼務会社名称
				// 2:兼務所属組織コード
				// 3:兼務所属組織名称　⇒組織マスタ.組織名称（日本語）
				// 4:兼務役職コード
				// 5:兼務役職名称
				// 6:兼務等級コード
				// 7:兼務等級名称
				// 8:兼務勤務地コード　⇒組織マスタ.勤務地コード
				// 9:兼務勤務地名称　⇒組織マスタ.勤務地名称（日本語）

				// フォーマットチェック
				if (columnList.length < 9) {
					// フォーマット不正の場合、警告メッセージを出力した上、該当部分をスキップする
					warn_flag = true;
					LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理",  "兼務情報不正あり、下記の一部ユーザー所属組織情報をスキップしました。");
					LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理",  "　[ユーザーID：" + record.getUserId()
						+ "　雇用者ID：" + record.getEmployeeId()
						+ "　LM内部ID：" + record.getLmId()
						+ "　兼務情報：" + kenmuInfo + "]"
						);
					continue;
				}

				MUserOrganization usrOrg2 = new MUserOrganization();
				// ユーザーID	user_id
				usrOrg2.setUserId(record.getUserId());
				// 所属会社コード	company_code
				usrOrg2.setCompanyCode(columnList[0]);
				// 所属組織コード	organization_code
				usrOrg2.setOrganizationCode(columnList[2]);
				// 開始日	start_date
				usrOrg2.setStartDate(record.getStartDate());
				// 終了日	end_date
				usrOrg2.setEndDate(record.getEndDate());
				// 無効フラグ	invalid_flag
				usrOrg2.setInvalidFlag(record.getInvalidFlag());
				// 本務フラグ	honmu_flag
				usrOrg2.setHonmuFlag("0");	// 固定値、"0"兼務
				// 勤務地コード	location_code
				usrOrg2.setLocationCode(columnList[8]);
				// 役職コード	position_code
				usrOrg2.setPositionCode(columnList[4]);
				// 登録者ID	register_id
				usrOrg2.setRegisterId(regUserId);
				// 登録日時	regist_ts
				usrOrg2.setRegistTs(this.startDateTime);
				// 更新者ID	updater_id
				usrOrg2.setUpdaterId(regUserId);
				// 更新日時	update_ts
				usrOrg2.setUpdateTs(this.startDateTime);
				// DBにインサート
				mUserOrganizationMapper.insert(usrOrg2);
			}
		}

	}

	/**
	 * @param session
	 * @param record
	 * @param newFlag
	 * @param tUserSystemSub
	 * @return
	 */
	private int dealUsrSystemMst(TUserSubEntity record, boolean newFlag, TUserSystemSubEntity tUserSystemSub) {
		String regUserId = ((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId();
		MUserSystem useSystemInfo = new MUserSystem();

		// ユーザーID	user_id
		useSystemInfo.setUserId(tUserSystemSub.getUserId());

		// アプリケーション利用フラグ01 application_use_flag_01
		useSystemInfo.setApplicationUseFlag01( tUserSystemSub.getApplicationUseFlag01() );
		useSystemInfo.setApplicationUseFlag02( tUserSystemSub.getApplicationUseFlag02() );
		useSystemInfo.setApplicationUseFlag03( tUserSystemSub.getApplicationUseFlag03() );
		useSystemInfo.setApplicationUseFlag04( tUserSystemSub.getApplicationUseFlag04() );
		useSystemInfo.setApplicationUseFlag05( tUserSystemSub.getApplicationUseFlag05() );
		useSystemInfo.setApplicationUseFlag06( tUserSystemSub.getApplicationUseFlag06() );
		useSystemInfo.setApplicationUseFlag07( tUserSystemSub.getApplicationUseFlag07() );
		useSystemInfo.setApplicationUseFlag08( tUserSystemSub.getApplicationUseFlag08() );
		useSystemInfo.setApplicationUseFlag09( tUserSystemSub.getApplicationUseFlag09() );
		useSystemInfo.setApplicationUseFlag10( tUserSystemSub.getApplicationUseFlag10() );
		useSystemInfo.setApplicationUseFlag11( tUserSystemSub.getApplicationUseFlag11() );
		useSystemInfo.setApplicationUseFlag12( tUserSystemSub.getApplicationUseFlag12() );
		useSystemInfo.setApplicationUseFlag13( tUserSystemSub.getApplicationUseFlag13() );
		useSystemInfo.setApplicationUseFlag14( tUserSystemSub.getApplicationUseFlag14() );
		useSystemInfo.setApplicationUseFlag15( tUserSystemSub.getApplicationUseFlag15() );
		useSystemInfo.setApplicationUseFlag16( tUserSystemSub.getApplicationUseFlag16() );
		useSystemInfo.setApplicationUseFlag17( tUserSystemSub.getApplicationUseFlag17() );
		useSystemInfo.setApplicationUseFlag18( tUserSystemSub.getApplicationUseFlag18() );
		useSystemInfo.setApplicationUseFlag19( tUserSystemSub.getApplicationUseFlag19() );
		useSystemInfo.setApplicationUseFlag20( tUserSystemSub.getApplicationUseFlag20() );

		// システム有効フラグ01 system_valid_flag_01
		useSystemInfo.setSystemValidFlag01( tUserSystemSub.getSystemValidFlag01() );
		useSystemInfo.setSystemValidFlag02( tUserSystemSub.getSystemValidFlag02() );
		useSystemInfo.setSystemValidFlag03( tUserSystemSub.getSystemValidFlag03() );
		useSystemInfo.setSystemValidFlag04( tUserSystemSub.getSystemValidFlag04() );
		useSystemInfo.setSystemValidFlag05( tUserSystemSub.getSystemValidFlag05() );
		useSystemInfo.setSystemValidFlag06( tUserSystemSub.getSystemValidFlag06() );
		useSystemInfo.setSystemValidFlag07( tUserSystemSub.getSystemValidFlag07() );
		useSystemInfo.setSystemValidFlag08( tUserSystemSub.getSystemValidFlag08() );
		useSystemInfo.setSystemValidFlag09( tUserSystemSub.getSystemValidFlag09() );
		useSystemInfo.setSystemValidFlag10( tUserSystemSub.getSystemValidFlag10() );
		useSystemInfo.setSystemValidFlag11( tUserSystemSub.getSystemValidFlag11() );
		useSystemInfo.setSystemValidFlag12( tUserSystemSub.getSystemValidFlag12() );
		useSystemInfo.setSystemValidFlag13( tUserSystemSub.getSystemValidFlag13() );
		useSystemInfo.setSystemValidFlag14( tUserSystemSub.getSystemValidFlag14() );
		useSystemInfo.setSystemValidFlag15( tUserSystemSub.getSystemValidFlag15() );
		useSystemInfo.setSystemValidFlag16( tUserSystemSub.getSystemValidFlag16() );
		useSystemInfo.setSystemValidFlag17( tUserSystemSub.getSystemValidFlag17() );
		useSystemInfo.setSystemValidFlag18( tUserSystemSub.getSystemValidFlag18() );
		useSystemInfo.setSystemValidFlag19( tUserSystemSub.getSystemValidFlag19() );
		useSystemInfo.setSystemValidFlag20( tUserSystemSub.getSystemValidFlag20() );

		// 登録者ID	register_id
		useSystemInfo.setRegisterId(regUserId);
		// 登録日時	regist_ts
		useSystemInfo.setRegistTs(this.startDateTime);
		// 更新者ID	updater_id
		useSystemInfo.setUpdaterId(regUserId);
		// 更新日時	update_ts
		useSystemInfo.setUpdateTs(this.startDateTime);

		int count = 0;
		MUserSystem resultRec = mUserSystemMapper.selectByPrimaryKey(tUserSystemSub.getUserId());

		if (newFlag) {
			// 論理上、ユーザーマスタに新規ユーザーは存在しないけど、ゴミデータがあることを考慮する
			if (resultRec == null) {
				// DBにインサート
				count = mUserSystemMapper.insert(useSystemInfo);
			} else {
				// DBに更新（全項目）
				count = mUserSystemMapper.updateByPrimaryKey(useSystemInfo);
				LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理", "ユーザーシステム利用マスタに新規ユーザーと同じIDのレコードがあり、更新しました。userId：" + tUserSystemSub.getUserId());
			}
		} else {
			// 論理上、ユーザーマスタに該当ユーザーはあるはず、データ不整合を考慮する
			if (resultRec == null) {
				// DBにインサート
				count = mUserSystemMapper.insert(useSystemInfo);
				LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理", "ユーザーシステム利用に新規ではないユーザーは存在しない、追加しました。userId：" + tUserSystemSub.getUserId());
			} else {
				// DBに更新
				// 初期パスワード	init_password	→更新不要
				// 登録者ID	register_id	→更新不要
				// 登録日時	regist_ts	→更新不要
				count = mUserSystemMapper.updateByPrimaryKey(useSystemInfo);
			}
		}
		return count;
	}

	/**
	 * @param session
	 * @param record
	 * @param newFlag
	 * @param tUserSystemSub
	 * @param initPassword
	 * @param lockPassword
	 * @return
	 */
	private int dealPwdMst(TUserSubEntity record, boolean newFlag, TUserSystemSubEntity tUserSystemSub, String initPassword, String lockPassword) {
		if ( ! newFlag ) return 0;
		int count = 0;
		String regUserId = ((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId();
		MPassword mPassword = new MPassword();

		// ユーザーID	user_id
		mPassword.setUserId(record.getUserId());
		// パスワード curr_password
		mPassword.setCurrPassword(initPassword);
		// 初期パスワード init_password
		mPassword.setInitPassword(initPassword);
		// ユーザパスワード user_password
		mPassword.setUserPassword(null);
		// ロックパスワード lock_passwod
		mPassword.setLockPasswod(lockPassword);
		// 登録者ID	register_id
		mPassword.setRegisterId(regUserId);
		// 登録日時	regist_ts
		mPassword.setRegistTs(this.startDateTime);
		// 更新者ID	updater_id
		mPassword.setUpdaterId(regUserId);
		// 更新日時	update_ts
		mPassword.setUpdateTs(this.startDateTime);

		MPassword resultRec = mPasswordMapper.selectByPrimaryKey(mPassword.getUserId());

		if (resultRec == null) {
			// DBにインサート
			count = mPasswordMapper.insert(mPassword);
		} else {
			// DBに更新（全項目）
			count = mPasswordMapper.updateByPrimaryKey(mPassword);
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理", "パスワードマスタに新規ユーザーと同じIDのレコードがあり、更新しました。userId：" + mPassword.getUserId());
		}

		return count;
	}

	/**
	 * @param session
	 * @param record
	 * @param newFlag
	 * @param tUserSystemSub
	 * @param initPassword
	 * @param lockPassword
	 * @return
	 */
	private int dealPwdHst(TUserSubEntity record, boolean newFlag, TUserSystemSubEntity tUserSystemSub,
			String initPassword, String lockPassword) {
		if (!newFlag)
			return 0;
		int count = 0;
		String regUserId = ((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId();
		TPasswordHist tPasswordHist = new TPasswordHist();

		// ユーザーID user_id
		tPasswordHist.setUserId(record.getUserId());

		// パスワード更新者ID password_updater_id
		tPasswordHist.setPasswordUpdaterId(regUserId);
		// パスワード更新日時 password_update_ts
		tPasswordHist.setPasswordUpdateTs(this.startDateTime);
		// パスワード curr_password
		tPasswordHist.setCurrPassword(initPassword);
		// 反映フラグ reflection_flag
		tPasswordHist.setReflectionFlag("1");
		// 操作ID 
		tPasswordHist.setOpeId(MmsConstants.PWD_OP_CODE_1000);

		// 登録者ID register_id
		tPasswordHist.setRegisterId(regUserId);
		// 登録日時 regist_ts
		tPasswordHist.setRegistTs(this.startDateTime);
		// 更新者ID updater_id
		tPasswordHist.setUpdaterId(regUserId);
		// 更新日時 update_ts
		tPasswordHist.setUpdateTs(this.startDateTime);

		int cnt = databaseService.count("select count(user_id) cn from t_password_hist where user_id ='%s'".formatted(tPasswordHist.getUserId()));

		if (cnt > 0) {
			// 該当ユーザのパスワード履歴を入れ替え
			// １、該当ユーザのパスワード履歴を全件削除する
			
			databaseService.execute("delete from t_password_hist where user_id ='%s'".formatted(tPasswordHist.getUserId()));
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理", 
					"パスワード履歴に新規ユーザーと同じIDのレコードがあり、削除しました。userId：" + tPasswordHist.getUserId());
		}

		count += tPasswordHistMapper.insert(tPasswordHist);
		return count;
	}


	/**
	 * @param session
	 * @param record
	 * @param newFlag
	 * @param tUserSystemSub
	 * @return
	 */
	private int dealAuthHst(TUserSubEntity record, boolean newFlag, TUserSystemSubEntity tUserSystemSub) {
		if ( ! newFlag ) return 0;
		int count = 0;

		String userId = record.getUserId();

		int cnt = databaseService.count("select count(user_id) cn from t_auth_hist where user_id ='%s'".formatted(record.getUserId()));

		if (cnt > 0) {
			// 該当ユーザの認証履歴を入れ替え
			// １、該当ユーザの認証履歴を全件削除する

			databaseService.execute("delete from t_auth_hist where user_id ='%s'".formatted(record.getUserId()));
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理", 
					"認証履歴に新規ユーザーと同じIDのレコードがあり、削除しました。userId：" + userId);
		}

		return count;
	}

	/**
	 * @param session
	 * @param record
	 * @param newFlag
	 * @param tUserSystemSub
	 * @return
	 */
	private int dealUsrSystemSub(TUserSubEntity record, boolean newFlag, TUserSystemSubEntity tUserSystemSub) {
		int count = 0;
		String userId = record.getUserId();
		String regUserId = ((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId();
		TUserSystemSubEntity resultRec = tUserSystemSubEntityMapper.selectByPrimaryKey(userId);

		if (resultRec != null) {
			// ユーザシステム利用予約のレコードを反映済みとする。

			// 反映フラグ	reflection_flag  0:反映済み（反映不要）
			resultRec.setReflectionFlag("0");
			// 更新者ID	updater_id
			resultRec.setUpdaterId(regUserId);
			// 更新日時	update_ts
			resultRec.setUpdateTs(this.startDateTime);

			count = tUserSystemSubEntityMapper.updateByPrimaryKey(resultRec);

			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理", 
					"ユーザシステム利用予約のレコードを反映済みとしました。userId：" + userId);
		}
		return count;
	}

	private int dealWNewUsr(TUserSubEntity record, boolean newFlag, TUserSystemSubEntity tUserSystemSub) {
		if ( ! newFlag ) return 0;
		int count = 0;
		String regUserId = ((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId();
		String userId = record.getUserId();

		//◆新規ユーザーリスト情報をワーク・新規ユーザーに追加する

		// 追加	★論理上、ユーザーIDの重複採番は発生しないが、念のため、ワーク・新規ユーザーのPKは定義しない
		WNewUser newUsr = new WNewUser();
		// ユーザーID
		newUsr.setUserId(userId);
		// 登録者ID	register_id
		newUsr.setRegisterId(regUserId);
		// 登録日時	regist_ts
		newUsr.setRegistTs(this.startDateTime);
		// 追加
		count += wNewUserMapper.insert(newUsr);

		return count;
	}


	/**
	 * ユーザ取り消し処理
	 * @param form
	 */
	public void userCancel(UserRegistForm form) {
		
		MUserExample mUserCondi = new MUserExample();
		mUserCondi.createCriteria().andUserIdEqualTo(form.getRiYouShaId());
		
		List<MUser> mUserList = mUserMapper.selectByExample(mUserCondi);
		String regUserId = ((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId();
		if(mUserList.size() == 0) {
			//マスタが存在しない、未来ユーザの予約、物理削除
			tUserSubEntityMapper.deleteByPrimaryKey(form.getRiYouShaId());
			tUserSystemSubEntityMapper.deleteByPrimaryKey(form.getRiYouShaId());
			return ;
		}
		
		//ビューよりデータ取得
		VAdminMaintenanceEntityExample vCondi = new VAdminMaintenanceEntityExample();
		vCondi.createCriteria().andUserIdEqualTo(form.getRiYouShaId());
		
		List<VAdminMaintenanceEntity> vList =vAdminMaintenanceEntityMapper.selectByExample(vCondi);

		if(vList.size() == 0) {
			//ビューに存在しない
			return ;
		}
		Date updDate = new Date();
		
		//ユーザマスタデータを予約にコピー
		TUserSubEntity tUserSub = tUserSubEntityMapper.selectByPrimaryKey(form.getRiYouShaId());

//        Date criterion_dt = commonService.getSysCriterionDt();
		// 反映日
//		tUserSub.setReflectionDate(criterion_dt);

		// ユーザーID
		tUserSub.setUserId(vList.get(0).getUserId());

		// 雇用者ID
		tUserSub.setEmployeeId(vList.get(0).getEmployeeId());

		// LM内部ID
		tUserSub.setLmId(vList.get(0).getEmployeeId());

		// 開始日
		tUserSub.setStartDate(vList.get(0).getStartDate());

		// 終了日
		tUserSub.setEndDate(vList.get(0).getEndDate());

		// 初期パスワード
		tUserSub.setInitPassword(vList.get(0).getInitPassword());

		// 削除フラグ
		tUserSub.setDeleteFlag(vList.get(0).getDeleteFlag());

		// 無効フラグ
		tUserSub.setInvalidFlag(vList.get(0).getInvalidFlag());

		// 言語コード
		tUserSub.setLangCode(vList.get(0).getLangCode());

		// 在籍区分
		tUserSub.setEnrollmentKbn(vList.get(0).getEnrollmentKbn());

		// 雇用区分
		tUserSub.setEmploymentKbn(vList.get(0).getEmploymentKbn());

		// プライマリメールアドレス
		tUserSub.setMailaddr(vList.get(0).getMailaddr());

		// セカンダリメールアドレス
		tUserSub.setMailaddrSecound(vList.get(0).getMailaddrSecound());

		// 通知先メールアドレス
		tUserSub.setMailaddrNotification(vList.get(0).getMailaddrNotification());

		// 外線番号
		tUserSub.setTel(vList.get(0).getTel());

		// 内線番号
		tUserSub.setTelEx(vList.get(0).getTelEx());

		// 姓（英語）
		tUserSub.setSurnameEn(vList.get(0).getSurnameEn());

		// 姓（日本語）
		tUserSub.setSurnameJp(vList.get(0).getSurnameJp());

		// 姓（カタカナ）
		tUserSub.setSurnameKana(vList.get(0).getSurnameKana());

		// ミドルネーム（英語）
		tUserSub.setMiddlenameEn(vList.get(0).getMiddlenameEn());

		// ミドルネーム（日本語）
		tUserSub.setMiddlenameJp(vList.get(0).getMiddlenameJp());

		// ミドルネーム（カタカナ）
		tUserSub.setMiddlenameKana(vList.get(0).getMiddlenameKana());

		// 名（英語）
		tUserSub.setGivennameEn(vList.get(0).getGivennameEn());

		// 名 (日本語)
		tUserSub.setGivennameJp(vList.get(0).getGivennameJp());

		// 名 (カタカナ)
		tUserSub.setGivennameKana(vList.get(0).getGivennameKana());

		// 通称 姓（英語）
		tUserSub.setSurnameNickEn(vList.get(0).getSurnameNickEn());

		// 通称 姓（日本語）
		tUserSub.setSurnameNickJp(vList.get(0).getSurnameNickJp());

		// 通称 姓（カタカナ）
		tUserSub.setSurnameNickKana(vList.get(0).getSurnameNickKana());

		// 通称 ミドルネーム（英語）
		tUserSub.setMiddlenameNickEn(vList.get(0).getMiddlenameNickEn());

		// 通称 ミドルネーム（日本語）
		tUserSub.setMiddlenameNickJp(vList.get(0).getMiddlenameNickJp());

		// 通称 ミドルネーム（カタカナ）
		tUserSub.setMiddlenameNickKana(vList.get(0).getMiddlenameNickKana());

		// 通称 名（英語）
		tUserSub.setGivennameNuckEn(vList.get(0).getGivennameNuckEn());

		// 通称 名 (日本語)
		tUserSub.setGivennameNuckJp(vList.get(0).getGivennameNuckJp());

		// 通称 名 (カタカナ)
		tUserSub.setGivennameNuckKana(vList.get(0).getGivennameNuckKana());

		// 所属会社コード
		tUserSub.setCompanyCode(vList.get(0).getCompanyCode());

		// 所属会社名称
		tUserSub.setCompanyName(vList.get(0).getCompanyNameJp());

		// 役職コード
		tUserSub.setPositionCode(vList.get(0).getPositionCode());

		// 役職名称
		tUserSub.setPositionName(vList.get(0).getPositionNameJp());

		// 等級コード
		tUserSub.setGradeCode(vList.get(0).getGradeCode());

		// 等級名称
		tUserSub.setGradeName(vList.get(0).getGradeNameJp());

		// 所属組織コード
		tUserSub.setOrganizationCode(vList.get(0).getOrganizationCode());

		// 勤務地コード
		tUserSub.setLocationCode(vList.get(0).getLocationCode());

		// 兼務情報
		tUserSub.setKenmuInfo(vList.get(0).getKenmuInfo());


		// 更新者ID
		tUserSub.setUpdaterId(regUserId);

		// 更新日時
		tUserSub.setUpdateTs(updDate);

		// 拡張属性１
		tUserSub.setExpansionAttr1(vList.get(0).getExpansionAttr1());

		// 拡張属性２
		tUserSub.setExpansionAttr2(vList.get(0).getExpansionAttr2());

		// 拡張属性３
		tUserSub.setExpansionAttr3(vList.get(0).getExpansionAttr3());

		// 拡張属性４
		tUserSub.setExpansionAttr4(vList.get(0).getExpansionAttr4());

		// 拡張属性５
		tUserSub.setExpansionAttr5(vList.get(0).getExpansionAttr5());

		// 拡張属性６
		tUserSub.setExpansionAttr6(vList.get(0).getExpansionAttr6());

		// 拡張属性７
		tUserSub.setExpansionAttr7(vList.get(0).getExpansionAttr7());

		// 拡張属性８
		tUserSub.setExpansionAttr8(vList.get(0).getExpansionAttr8());

		// 拡張属性９
		tUserSub.setExpansionAttr9(vList.get(0).getExpansionAttr9());

		// 拡張属性１０
		tUserSub.setExpansionAttr10(vList.get(0).getExpansionAttr10());

		// 拡張属性１１
		tUserSub.setExpansionAttr11(vList.get(0).getExpansionAttr11());

		// 拡張属性１２
		tUserSub.setExpansionAttr12(vList.get(0).getExpansionAttr12());

		// 拡張属性１３
		tUserSub.setExpansionAttr13(vList.get(0).getExpansionAttr13());

		// 拡張属性１４
		tUserSub.setExpansionAttr14(vList.get(0).getExpansionAttr14());

		// 拡張属性１５
		tUserSub.setExpansionAttr15(vList.get(0).getExpansionAttr15());

		// 拡張属性１６
		tUserSub.setExpansionAttr16(vList.get(0).getExpansionAttr16());

		// 拡張属性１７
		tUserSub.setExpansionAttr17(vList.get(0).getExpansionAttr17());

		// 拡張属性１８
		tUserSub.setExpansionAttr18(vList.get(0).getExpansionAttr18());

		// 拡張属性１９
		tUserSub.setExpansionAttr19(vList.get(0).getExpansionAttr19());

		// 拡張属性２０
		tUserSub.setExpansionAttr20(vList.get(0).getExpansionAttr20());

		// 拡張属性２１
		tUserSub.setExpansionAttr21(vList.get(0).getExpansionAttr21());

		// 拡張属性２２
		tUserSub.setExpansionAttr22(vList.get(0).getExpansionAttr22());

		// 拡張属性２３
		tUserSub.setExpansionAttr23(vList.get(0).getExpansionAttr23());

		// 拡張属性２４
		tUserSub.setExpansionAttr24(vList.get(0).getExpansionAttr24());

		// 拡張属性２５
		tUserSub.setExpansionAttr25(vList.get(0).getExpansionAttr25());

		// 拡張属性２６
		tUserSub.setExpansionAttr26(vList.get(0).getExpansionAttr26());

		// 拡張属性２７
		tUserSub.setExpansionAttr27(vList.get(0).getExpansionAttr27());

		// 拡張属性２８
		tUserSub.setExpansionAttr28(vList.get(0).getExpansionAttr28());

		// 拡張属性２９
		tUserSub.setExpansionAttr29(vList.get(0).getExpansionAttr29());

		// 拡張属性３０
		tUserSub.setExpansionAttr30(vList.get(0).getExpansionAttr30());

		// 拡張属性３１
		tUserSub.setExpansionAttr31(vList.get(0).getExpansionAttr31());

		// 拡張属性３２
		tUserSub.setExpansionAttr32(vList.get(0).getExpansionAttr32());

		// 拡張属性３３
		tUserSub.setExpansionAttr33(vList.get(0).getExpansionAttr33());

		// 拡張属性３４
		tUserSub.setExpansionAttr34(vList.get(0).getExpansionAttr34());

		// 拡張属性３５
		tUserSub.setExpansionAttr35(vList.get(0).getExpansionAttr35());

		// 拡張属性３６
		tUserSub.setExpansionAttr36(vList.get(0).getExpansionAttr36());

		// 拡張属性３７
		tUserSub.setExpansionAttr37(vList.get(0).getExpansionAttr37());

		// 拡張属性３８
		tUserSub.setExpansionAttr38(vList.get(0).getExpansionAttr38());

		// 拡張属性３９
		tUserSub.setExpansionAttr39(vList.get(0).getExpansionAttr39());

		// 拡張属性４０
		tUserSub.setExpansionAttr40(vList.get(0).getExpansionAttr40());

		
		tUserSubEntityMapper.updateByPrimaryKey(tUserSub);
		
		TUserSystemSubEntity tUserSysSub = tUserSystemSubEntityMapper.selectByPrimaryKey(form.getRiYouShaId());
		
		
		// 反映日
//		tUserSysSub.setReflectionDate(criterion_dt);

		// 反映フラグ 2:キャンセル
		tUserSysSub.setReflectionFlag("2");

		// ユーザーID
		tUserSysSub.setUserId(vList.get(0).getUserId());

		// アプリケーション利用フラグ01
		tUserSysSub.setApplicationUseFlag01(vList.get(0).getApplicationUseFlag01());

		// アプリケーション利用フラグ02
		tUserSysSub.setApplicationUseFlag02(vList.get(0).getApplicationUseFlag02());

		// アプリケーション利用フラグ03
		tUserSysSub.setApplicationUseFlag03(vList.get(0).getApplicationUseFlag03());

		// アプリケーション利用フラグ04
		tUserSysSub.setApplicationUseFlag04(vList.get(0).getApplicationUseFlag04());

		// アプリケーション利用フラグ05
		tUserSysSub.setApplicationUseFlag05(vList.get(0).getApplicationUseFlag05());

		// アプリケーション利用フラグ06
		tUserSysSub.setApplicationUseFlag06(vList.get(0).getApplicationUseFlag06());

		// アプリケーション利用フラグ07
		tUserSysSub.setApplicationUseFlag07(vList.get(0).getApplicationUseFlag07());

		// アプリケーション利用フラグ08
		tUserSysSub.setApplicationUseFlag08(vList.get(0).getApplicationUseFlag08());

		// アプリケーション利用フラグ09
		tUserSysSub.setApplicationUseFlag09(vList.get(0).getApplicationUseFlag09());

		// アプリケーション利用フラグ10
		tUserSysSub.setApplicationUseFlag10(vList.get(0).getApplicationUseFlag10());

		// アプリケーション利用フラグ11
		tUserSysSub.setApplicationUseFlag11(vList.get(0).getApplicationUseFlag11());

		// アプリケーション利用フラグ12
		tUserSysSub.setApplicationUseFlag12(vList.get(0).getApplicationUseFlag12());

		// アプリケーション利用フラグ13
		tUserSysSub.setApplicationUseFlag13(vList.get(0).getApplicationUseFlag13());

		// アプリケーション利用フラグ14
		tUserSysSub.setApplicationUseFlag14(vList.get(0).getApplicationUseFlag14());

		// アプリケーション利用フラグ15
		tUserSysSub.setApplicationUseFlag15(vList.get(0).getApplicationUseFlag15());

		// アプリケーション利用フラグ16
		tUserSysSub.setApplicationUseFlag16(vList.get(0).getApplicationUseFlag16());

		// アプリケーション利用フラグ17
		tUserSysSub.setApplicationUseFlag17(vList.get(0).getApplicationUseFlag17());

		// アプリケーション利用フラグ18
		tUserSysSub.setApplicationUseFlag18(vList.get(0).getApplicationUseFlag18());

		// アプリケーション利用フラグ19
		tUserSysSub.setApplicationUseFlag19(vList.get(0).getApplicationUseFlag19());

		// アプリケーション利用フラグ20
		tUserSysSub.setApplicationUseFlag20(vList.get(0).getApplicationUseFlag20());

		// システム有効フラグ01
		tUserSysSub.setSystemValidFlag01(vList.get(0).getSystemValidFlag01());

		// システム有効フラグ02
		tUserSysSub.setSystemValidFlag02(vList.get(0).getSystemValidFlag02());

		// システム有効フラグ03
		tUserSysSub.setSystemValidFlag03(vList.get(0).getSystemValidFlag03());

		// システム有効フラグ04
		tUserSysSub.setSystemValidFlag04(vList.get(0).getSystemValidFlag04());

		// システム有効フラグ05
		tUserSysSub.setSystemValidFlag05(vList.get(0).getSystemValidFlag05());

		// システム有効フラグ06
		tUserSysSub.setSystemValidFlag06(vList.get(0).getSystemValidFlag06());

		// システム有効フラグ07
		tUserSysSub.setSystemValidFlag07(vList.get(0).getSystemValidFlag07());

		// システム有効フラグ08
		tUserSysSub.setSystemValidFlag08(vList.get(0).getSystemValidFlag08());

		// システム有効フラグ09
		tUserSysSub.setSystemValidFlag09(vList.get(0).getSystemValidFlag09());

		// システム有効フラグ10
		tUserSysSub.setSystemValidFlag10(vList.get(0).getSystemValidFlag10());

		// システム有効フラグ11
		tUserSysSub.setSystemValidFlag11(vList.get(0).getSystemValidFlag11());

		// システム有効フラグ12
		tUserSysSub.setSystemValidFlag12(vList.get(0).getSystemValidFlag12());

		// システム有効フラグ13
		tUserSysSub.setSystemValidFlag13(vList.get(0).getSystemValidFlag13());

		// システム有効フラグ14
		tUserSysSub.setSystemValidFlag14(vList.get(0).getSystemValidFlag14());

		// システム有効フラグ15
		tUserSysSub.setSystemValidFlag15(vList.get(0).getSystemValidFlag15());

		// システム有効フラグ16
		tUserSysSub.setSystemValidFlag16(vList.get(0).getSystemValidFlag16());

		// システム有効フラグ17
		tUserSysSub.setSystemValidFlag17(vList.get(0).getSystemValidFlag17());

		// システム有効フラグ18
		tUserSysSub.setSystemValidFlag18(vList.get(0).getSystemValidFlag18());

		// システム有効フラグ19
		tUserSysSub.setSystemValidFlag19(vList.get(0).getSystemValidFlag19());

		// システム有効フラグ20
		tUserSysSub.setSystemValidFlag20(vList.get(0).getSystemValidFlag20());

		// 更新者ID
		tUserSysSub.setUpdaterId(regUserId);

		//tUserSysSub 更新日時
		tUserSysSub.setUpdateTs(updDate);
		
		tUserSystemSubEntityMapper.updateByPrimaryKey(tUserSysSub);

		
	}
	

}
