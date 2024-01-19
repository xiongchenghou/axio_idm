package jp.co.axio.masterMentsetSystem.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.axio.masterMentsetSystem.common.MmsConstants;
import jp.co.axio.masterMentsetSystem.dto.PulldownItemDto;
import jp.co.axio.masterMentsetSystem.model.MUser;
import jp.co.axio.masterMentsetSystem.repository.MPasswordMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserMapper;
import jp.co.axio.masterMentsetSystem.repository.VGpCodeMstMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.controller.LoginInfo;
import jp.co.axio.masterMentsetSystem.model.VLoginInfoEntity;
import jp.co.axio.masterMentsetSystem.repository.VLoginInfoEntityMapper;
import jp.co.axio.masterMentsetSystem.util.StringUtil;

/**
 * ログインサービス
 *
 * @author sa
 */
@Service
public class LoginService {

	/**
	 * 自処理名
	 */
	private static final String OWN_NAME = "LoginService";
	/**
	 * 自処理対象画面名
	 */
	private static final String OWN_TITLE = "ログイン処理";
	/**
	 * LDAP Protocol Version 3
	 */
	private static final int LDAP_V3 = 3; // LDAPv3
	/**
	 * ホスト名(application.propertiesより取得)
	 */
	@Value("${config.login.ldap.hostname}")
	private String propLdapHost;
	/**
	 * ポート(application.propertiesより取得)
	 */
	@Value("${config.login.ldap.port}")
	private int propPort;
	/**
	 * ベースDN(application.propertiesより取得)
	 */
	@Value("${config.login.ldap.dc}")
	private String propDc;
	/**
	 * 管理者DN(application.propertiesより取得)
	 */
	@Value("${config.login.ldap.managerDn}")
	private String propManagerDn;
	/**
	 * 管理者パスワード(application.propertiesより取得)
	 */
	@Value("${config.login.ldap.managerPass}")
	private String propManagerPass;
	/**
	 * ベースDN属性(application.propertiesより取得)
	 */
	@Value("${config.login.ldap.propDnAttr}")
	private String propDnAttr;
	/**
	 * 管理者フラグ:1
	 */
	private final String STRING_IS_ADMIN = "1";
	/**
	 * LDAPから取得する有効開始日・有効終了日の日付フォーマット
	 */
	private static final String DATE_PATTERN = "yyyy/MM/dd";

	@Autowired
	private CommonService commonService;
	/**
	 * ログイン情報取得用マッパー
	 */
	@Autowired
	private VLoginInfoEntityMapper vLoginInfoEntityMapper;
	/**
	 * メッセージソース
	 */
	@Autowired
	MessageSource ms;
	/**
     * ログイン情報取得用マッパー
     */
	@Autowired
	MUserMapper mUserMapper;


	@Autowired
	MPasswordMapper mPasswordMapper;
	/**
     * ログイン情報取得用マッパー
     */
	@Autowired
	VGpCodeMstMapper vGpCodeMstMapper;


	/**
	 * ログイン認証
	 * @param  form   画面Form
	 * @return LoginInfo ログイン成功の場合、ログイン情報(loginInfo)。取得できなかった場合、nullを返却。
	 * @throws Exception
	 */
	public LoginInfo authentication(LoginInfo form) throws Exception {
		// ログイン認証開始のログを出力
		LogService.info(OWN_TITLE, OWN_NAME, "ログイン認証", "開始");

		// ユーザーIDからユーザー情報を取得
		LoginInfo loginInfo = getUserById(form.getUserId());

		// ユーザーが存在しない場合、nullを返す
		if (loginInfo == null) {
			return null;
		}

		// ユーザーのパスワードを取得し、復号化する
		String decryptedPassword = getDecryptPassword(loginInfo.getCurrPassword(), getKey(), loginInfo.getUserId());

		// パスワードが一致しない場合、ログインフラグにfalseを設定
		if (!form.getPass().equals(decryptedPassword)) {
			loginInfo.setIsPasswordMatchFlag(false);
		}

		// ログインユーザーの管理者フラグを設定
		if (STRING_IS_ADMIN.equals(loginInfo.getAdminFlag())) {
			loginInfo.setIsAdmin(true);
		}

		// ログイン認証正常終了のログを出力
		LogService.info(OWN_TITLE, OWN_NAME, "ログイン認証", "正常終了");

		return loginInfo;
	}


	private LoginInfo getUserById(String userId) {
		return mUserMapper.selectLoginInfoByUserId(userId);
	}
	private String getKey() {
		// class_codeに基づいてパスワード暗号用共通鍵を検索する
		String classCode = MmsConstants.MST_CODE_CATEGORY_01008;
		return vGpCodeMstMapper.selectValue1ByClassCodeAndCodeValue(classCode);
	}

	private String getDecryptPassword(String encryptedPassword, String key,String userId) {
		return mPasswordMapper.decryptPassword(encryptedPassword, key, userId);
	}


	/**
	 * ユーザーID、管理者フラグ、DBの取得結果をもとにログイン情報クラスを生成
	 * @param  userId     ログインユーザーID(ldap.uid, m_user.user_id)
	 * @param  isAdmin    true:管理者権限,false:利用者権限
	 * @return LoginInfo  ログイン情報オブジェクト
	 * @throws Exception
	 */
	private LoginInfo createLoginInfo(String userId, Boolean isAdmin)
			throws Exception {
		// ログイン情報クラスに詰め替え
		LoginInfo loginInfo = new LoginInfo(userId, isAdmin);
		return loginInfo;
	}

	/**
	 * ログイン処理例外クラス
	 */
	public abstract class LoginServiceException extends Exception {
		/**
		 * コンストラクタ
		 * @param message メッセージ
		 */
		LoginServiceException(String message) {
			super(message);
		}
	}
	/**
	 * LDAP管理者認証失敗時(パスワード不正)
	 */
	private class LoginServiceManagerInvalidCredentialsException extends LoginServiceException {
		/**
		 * コンストラクタ
		 */
		LoginServiceManagerInvalidCredentialsException() {
			super(ms.getMessage("MSTO0009M0003", null, null));
		}
	}
	/**
	 * LDAP管理者認証失敗時(パスワード不正以外で認証できていない場合)
	 */
	private class LoginServiceManagerIsNotBoundException extends LoginServiceException {
		/**
		 * コンストラクタ
		 */
		LoginServiceManagerIsNotBoundException() {
			super(ms.getMessage("MSTO0009M0004", null, null));
		}
	}
	/**
	 * 画面ユーザーIDに紐づくLDAPエントリが0件の場合
	 */
	private class LoginServiceNoEntryException extends LoginServiceException {
		/**
		 * コンストラクタ
		 */
		LoginServiceNoEntryException() {
			super(ms.getMessage("MSTO0009M0005", null, null));
		}
	}
	/**
	 * 取得結果のうち有効期間内のエントリが0件の場合
	 */
	private class LoginServiceNoValidEntryException extends LoginServiceException {
		/**
		 * コンストラクタ
		 */
		LoginServiceNoValidEntryException() {
			super(ms.getMessage("MSTO0009M0006", null, null));
		}
	}
	/**
	 * 取得結果のうち有効期間内のエントリが2件以上の場合
	 */
	private class LoginServiceTooManyValidEntriesException extends LoginServiceException {
		/**
		 * コンストラクタ
		 */
		LoginServiceTooManyValidEntriesException() {
			super(ms.getMessage("MSTO0009M0007", null, null));
		}
	}
	/**
	 * LDAPユーザー認証失敗時(パスワード不正以外で認証できていない場合)
	 */
	private class LoginServiceUserIsNotBoundException extends LoginServiceException {
		/**
		 * コンストラクタ
		 */
		LoginServiceUserIsNotBoundException() {
			super(ms.getMessage("MSTO0009M0008", null, null));
		}
	}
	/**
	 * DBに該当のユーザーのログイン情報が存在しない場合
	 */
	private class LoginServiceNoUserDbRecordException extends LoginServiceException {
		/**
		 * コンストラクタ
		 */
		LoginServiceNoUserDbRecordException() {
			super(ms.getMessage("MSTO0009M0009", null, null));
		}
	}

}
