package jp.co.axio.masterMentsetSystem.common;

public class MmsConstants {
	
	
	/**	PDFテンプレート */
	public static final String MST_CODE_CATEGORY_01016 = "01016";
	
	
	/**	CODE_VALUE 00001 */
	public static final String MST_CODE_VLAUE_00001 = "00001";
	
	/**	操作ログ機能ID */
	public static final String MST_CODE_CATEGORY_01019 = "01019";
	
	/**	PDFファイル定義 */
	public static final String MST_CODE_CATEGORY_01017 = "01017";
	
	/**	ロック後猶予期間 */
	public static final String MST_CODE_CATEGORY_01015 = "01015";
	
	/**	パスワード履歴操作マスタ */
	public static final String MST_CODE_CATEGORY_01013 = "01013";
	
	/**	雇用区分マスタ(利用者区分) */
	public static final String MST_CODE_CATEGORY_00003 = "00003";
	
	/**	勤務地マスタ */
	public static final String MST_CODE_CATEGORY_01007 = "01007";
	
	/**	実効契機ファイルパス */
	public static final String MST_CODE_CATEGORY_01002 = "01002";
	
	/**	会社マスタ（大学） */
	public static final String MST_CODE_CATEGORY_00001 = "00001";
	
	/**	アプリケーション利用フラグ  */
	public static final String MST_CODE_CATEGORY_01006 = "01006";
	
	/**	その他表示フラグ  */
	public static final String MST_CODE_CATEGORY_01020 = "01020";
	
	/**	パスワード暗号用共通鍵  */
	public static final String MST_CODE_CATEGORY_01008 = "01008";
	
	/**	パスワード生成パターン  */
	public static final String MST_CODE_CATEGORY_01009 = "01009";
	
	/**	パスワード生成パターン(ロック用)  */
	public static final String MST_CODE_CATEGORY_01010 = "01010";
	
	/**	パスワードポリシー：変更前後の共通文字列長(最大)  */
	public static final String MST_CODE_CATEGORY_01011 = "01011";
	
	/**	大学コード */
	public static final String COMPANY_CODE_COLLEGE = "100";
	
	/**	未選択のプルダウン Value */
	public static final String UNSELECT_PULLDOWN_ITEM_VAL = "--";
	
	/**	未選択のプルダウン Code */
	public static final String UNSELECT_PULLDOWN_ITEM_CODE = "";
	
	/**	メッセージ 利用者ID既に登録したため、処理中止しました。  */
	public static final String MSG_MSTO00111001 = "MSTO00111001";
	
	/**	メッセージ CMN0011=権限がありません。管理者で再度ログインしなおしてください。  */
	public static final String MSG_CMN0011 = "CMN0011";
	
	/**	メッセージ CMN0012=セッションの有効期限が切れています。再度ログインしなおしてください。  */
	public static final String MSG_CMN0012 = "CMN0012";
	
	/**	利用者の予約データ存在するため、利用者を削除できません。  */
	public static final String MSG_MSTO0016M0101 = "MSTO0016M0101";
	
	/**	ユーザは無効、または削除されたため、ロック処理できません。  */
	public static final String MSG_MSTO0016M0102 = "MSTO0016M0102";
	
	/**	ユーザは有効、または削除されたため、ロック解除処理できません。  */
	public static final String MSG_MSTO0016M0103 = "MSTO0016M0103";

	
	/**	現行コード：日本語  要確認 */
	public static final String LANG_CODE_JP = "ja";

	/** 自処理対象画面Form用のセッションキー  */
	public static final String SESSION_KEY_LOGIN_INFO = "LoginController.loginInfo";
	
	/** 利用者区分 1:教員  */
	public static final String MST_CODE_RIYOUSHADIV_1 = "1";
	
	/** 利用者区分 2:職員  */
	public static final String MST_CODE_RIYOUSHADIV_2 = "2";
	
	/** 利用者区分 3:学生  */
	public static final String MST_CODE_RIYOUSHADIV_3 = "3";
	
	/** 利用者区分 4:ビジター  */
	public static final String MST_CODE_RIYOUSHADIV_4 = "4";
	
	/** パスワード　機能名 1000:ユーザ新規登録  */
	public static final String PWD_OP_CODE_1000 = "1000";
	
	/** パスワード　機能名 2000:パスワード変更  */
	public static final String PWD_OP_CODE_2000 = "2000";
	
	/** パスワード　機能名 3000:パスワード初期化  */
	public static final String PWD_OP_CODE_3000 = "3000";
	
	/** パスワード　機能名 4000:ロック  */
	public static final String PWD_OP_CODE_4000 = "4000";
	
	/** パスワード　機能名 5000:ロック解除  */
	public static final String PWD_OP_CODE_5000 = "5000";
	
	/** 操作ログ機能ID 利用者情報管理  */
	public static final String FUNC_ID_1000 = "1000";
	
	/** 操作ログ機能ID 利用者情報管理  */
	public static final String FUNC_ID_1000_LABEL = "利用者情報管理";
	
	/** 操作ログ機能ID 利用者情報管理  */
	public static final String FUNC_ID_2000 = "2000";
	
	/** 操作ログ機能ID 利用者情報管理  */
	public static final String FUNC_ID_2000_LABEL = "利用者CSV管理";
	
	/** 操作ログ機能ID 利用者情報管理  */
	public static final String FUNC_ID_3000 = "3000";
	
	/** 操作ログ機能ID 利用者情報管理  */
	public static final String FUNC_ID_3000_LABEL = "管理者権限";
	
	/** 操作ログ機能ID 利用者情報管理  */
	public static final String FUNC_ID_4000 = "4000";
	
	/** 操作ログ機能ID 利用者情報管理  */
	public static final String FUNC_ID_4000_LABEL = "帳票出力";
	
	/** 操作ログ機能ID 利用者情報管理  */
	public static final String FUNC_ID_5000 = "5000";
	
	/** 操作ログ機能ID 利用者情報管理  */
	public static final String FUNC_ID_5000_LABEL = "パスワード変更";
	

	

}
