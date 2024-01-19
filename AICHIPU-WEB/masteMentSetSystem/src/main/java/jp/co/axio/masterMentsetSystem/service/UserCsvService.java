package jp.co.axio.masterMentsetSystem.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.common.MmsConstants;
import jp.co.axio.masterMentsetSystem.controller.LoginInfo;
import jp.co.axio.masterMentsetSystem.model.MUserSystem;
import jp.co.axio.masterMentsetSystem.model.TUserSubEntity;
import jp.co.axio.masterMentsetSystem.model.TUserSystemSubEntity;
import jp.co.axio.masterMentsetSystem.model.WUploadFileSub;
import jp.co.axio.masterMentsetSystem.model.WUploadFileSubEntity;
import jp.co.axio.masterMentsetSystem.model.WUploadFileSubEntityExample;
import jp.co.axio.masterMentsetSystem.model.WUploadSub;
import jp.co.axio.masterMentsetSystem.model.WUploadSubEntity;
import jp.co.axio.masterMentsetSystem.model.WUploadSubEntityKey;
import jp.co.axio.masterMentsetSystem.model.WUserSub;
import jp.co.axio.masterMentsetSystem.model.WUserSubEntity;
import jp.co.axio.masterMentsetSystem.model.WUserSubEntityExample;
import jp.co.axio.masterMentsetSystem.model.WUserSystemSub;
import jp.co.axio.masterMentsetSystem.model.WUserSystemSubEntity;
import jp.co.axio.masterMentsetSystem.model.WUserSystemSubEntityKey;
import jp.co.axio.masterMentsetSystem.repository.MUserSystemMapper;
import jp.co.axio.masterMentsetSystem.repository.TUserSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.TUserSystemSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.WUploadFileSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.WUploadSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.WUserSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.WUserSystemSubEntityMapper;

/**
 * @author a004811
 * @description 【w_user_system_sub(ユーザシステム利用一時)】テーブルにに対してのデーターベースの操作サービス
 * @createDate 2024-01-06 12:57:55
 */
@Service
public class UserCsvService {
    /**
     * 自処理名
     */
    private static final String OWN_NAME = "UserCsvService";
    /**
     * 自処理対象画面名
     */
    private static final String OWN_TITLE = "利用者CSV管理画面Service";
	private String sessionId;
	private Date uploadDt;
	
    @Autowired
    WUploadSubService wUploadSubService;

    @Autowired
    WUploadFileSubService wUploadFileSubService;

    @Autowired
    WUserSubService wUserSubService;

    @Autowired
    WUserSystemSubService wuserSystemSubService;
    
	@Autowired
	WUserSubEntityMapper wUserSubEntityMapper;
	
	@Autowired
	WUserSystemSubEntityMapper wUserSystemSubEntityMapper;
	
	@Autowired
	WUploadFileSubEntityMapper wUploadFileSubEntityMapper;
	
	@Autowired
	TUserSubEntityMapper tUserSubEntityMapper;
	
	@Autowired
	TUserSystemSubEntityMapper tUserSystemSubEntityMapper;
	
	@Autowired
	CommonService commonService;
	
	@Autowired
	UserRegistService userRegistService;
	
	@Autowired
	UserViewService userViewService;
	
	@Autowired
	MUserSystemMapper mUserSystemMapper;

	@Autowired
	WUploadSubEntityMapper wUploadSubEntityMapper;
	
	
	private String userId;
	private Date updDt;

	/**
     * セッション
     */
    @Autowired
    HttpSession httpSession;

    private final DatabaseService databaseService;
    
    @Autowired
    public UserCsvService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
    
    @Transactional
    public boolean uploadProcess(WUploadSub wUploadSub, List<WUploadFileSub> list) {
               wUploadSubService.addWUploadSub(wUploadSub);
        return wUploadFileSubService.addWUploadFileSubList(list);
    }


    @Transactional
    public void process(WUserSub wUserSub, WUserSystemSub wUserSystemSub) throws Exception {
        wUserSubService.addWUserSub(wUserSub);
        wuserSystemSubService.addWUserSystemSub(wUserSystemSub);

    }

    @Transactional
    public void processBatch(List<WUserSub> wUserSubList, List<WUserSystemSub> wUserSystemSubList,WUploadSub wUploadSub,List<WUploadFileSub> errorList) throws Exception {
        for(WUserSub wUserSub : wUserSubList){
            wUserSubService.addWUserSub(wUserSub);
        }
        for(WUserSystemSub wUserSystemSub : wUserSystemSubList){
            wuserSystemSubService.addWUserSystemSub(wUserSystemSub);
        }
         wUploadSubService.addWUploadSub(wUploadSub);
         wUploadFileSubService.addWUploadFileSubList(errorList);
    }


	/**
	 * CSV確定処理
	 * @return
	 * @throws Exception 
	 */
	public String csvConfirm() throws Exception {
		
		this.updDt = commonService.getDbSysDt();
		this.userId = ((LoginInfo)httpSession.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId();
		userRegistService.setUpdateTs();
		//(4)	ユーザ一時から対象のデータを取得する
        List<WUserSubEntity> userList = getUserList();
        
        //(5)	ユーザ情報を登録する
        doCsvConfirm(userList);

		//(4)	「SQL-xx-U-01　アップロード一時処理済み更新」にて、処理済みに更新する
		updWUploadFileSub();
		
		//(5)	実行契機ファイルを出力する
		userRegistService.crtTriggerFile(null);
		
		return "";
	}

	/**
	 * (4)	「SQL-xx-U-01　アップロード一時処理済み更新」にて、処理済みに更新する
	 */
	private void updWUploadFileSub() {
		WUploadSubEntityKey key = new WUploadSubEntityKey();
		key.setUploadUserId(userId);
		key.setUploadSession(sessionId);
		key.setUploadUserTs(uploadDt);
		
		WUploadSubEntity wUpload = wUploadSubEntityMapper.selectByPrimaryKey(key);
		
		wUpload.setProcessFlag("0");
		wUpload.setUpdaterId(userId);
		wUpload.setUpdateTs(updDt);
		wUploadSubEntityMapper.updateByPrimaryKey(wUpload);
	
	}

	/**
	 * レコード単位で登録する
	 * @param userList
	 * @throws Exception 
	 */
	private void doCsvConfirm(List<WUserSubEntity> userList) throws Exception {
		String opDiv;
		LogService.info(OWN_TITLE, OWN_NAME, "doCsvConfirm", "開始");
		for (WUserSubEntity wUserSubEntity : userList) {
			opDiv = getOpDiv(wUserSubEntity);

			LogService.info(OWN_TITLE, OWN_NAME, opDiv + "処理", "userid :" + wUserSubEntity.getUserId());

			switch (opDiv) {
			case "ADD": {
				csvDoAdd(wUserSubEntity);
				break;
			}
			case "MOD": {
				csvDoMod(wUserSubEntity);
				break;
			}
			case "LCK": {
				csvDoLck(wUserSubEntity);
				break;
			}
			case "UNLCK": {
				csvDoUnLck(wUserSubEntity);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opDiv);
			}
		}


	}

	/**
	 * @param wUserSubEntity
	 * @throws Exception 
	 */
	private void csvDoUnLck(WUserSubEntity wUserSubEntity) throws Exception {
		userViewService.userUnLock(wUserSubEntity.getUserId());
		//操作ログを登録
		commonService.insOpelog(MmsConstants.FUNC_ID_2000, MmsConstants.FUNC_ID_2000_LABEL, wUserSubEntity.getUserId(), "ユーザをロック解除しました。");
	}

	/**
	 * ・処理区分がLCKの場合
	 * @param wUserSubEntity
	 * @throws Exception 
	 */
	private void csvDoLck(WUserSubEntity wUserSubEntity) throws Exception {
		userViewService.userLock(wUserSubEntity.getUserId());
		//操作ログを登録
		commonService.insOpelog(MmsConstants.FUNC_ID_2000, MmsConstants.FUNC_ID_2000_LABEL, wUserSubEntity.getUserId(), "ユーザをロックしました。");
		
	}

	/**
	 * ・処理区分がMODの場合
	 * @param wUserSubEntity
	 */
	private void csvDoMod(WUserSubEntity wUserSubEntity) {
		//5.1	ユーザシステム利用予約テーブルから値を取得する。
		TUserSubEntity tUser = tUserSubEntityMapper.selectByPrimaryKey(wUserSubEntity.getUserId());
		TUserSystemSubEntity tUserSys = tUserSystemSubEntityMapper.selectByPrimaryKey(wUserSubEntity.getUserId());
		MUserSystem mUserSys = mUserSystemMapper.selectByPrimaryKey(wUserSubEntity.getUserId());

		//ユーザシステム利用一時　を取得
		WUserSystemSubEntityKey key = new WUserSystemSubEntityKey();
		key.setUploadSession(wUserSubEntity.getUploadSession());
		key.setUploadUserId(wUserSubEntity.getUploadUserId());
		key.setUploadUserTs(wUserSubEntity.getUploadUserTs());
		key.setUserId(wUserSubEntity.getUserId());
		
		WUserSystemSubEntity wUserSys =  wUserSystemSubEntityMapper.selectByPrimaryKey(key);
		
		//1)	SQL「SQL-xx-U-01　ユーザ予約反映日更新」にて、ユーザ予約を更新する
		tUser.setReflectionDate(wUserSubEntity.getReflectionDate());
		tUser.setUpdaterId(userId);
		tUser.setUpdateTs(updDt);
		tUserSubEntityMapper.updateByPrimaryKey(tUser);
		
		//2)	SQL「SQL-xx-U-02　ユーザシステム利用予約更新」にて、ユーザシステム利用予約を更新する
		tUserSys.setReflectionDate(wUserSubEntity.getReflectionDate());
		tUserSys.setReflectionFlag("1");
		tUserSys.setApplicationUseFlag04(wUserSys.getApplicationUseFlag04());
		tUserSystemSubEntityMapper.updateByPrimaryKey(tUserSys);
		
		//5.3	反映日が基準日と比較して未来である場合、以下の処理を行う
		Date sysCriDt = commonService.getSysCriterionDt();
		if(sysCriDt.compareTo(wUserSubEntity.getReflectionDate()) == 0) {
			mUserSys.setApplicationUseFlag04(wUserSys.getApplicationUseFlag04());
			mUserSys.setUpdaterId(userId);
			mUserSys.setUpdateTs(updDt);
			mUserSystemMapper.updateByPrimaryKey(mUserSys);
		}
		
		//3)	SQL「SQL-xx-U-02　ユーザ設定変更ログ登録」にて、操作ログを登録する
		commonService.insOpelog(MmsConstants.FUNC_ID_2000, MmsConstants.FUNC_ID_2000_LABEL, wUserSubEntity.getUserId(), "ユーザの設定を変更しました。");
		
	}


	/**
	 * ・処理区分がADDの場合
	 * @param wUserSubEntity
	 * @throws ParseException 
	 */
	private void csvDoAdd(WUserSubEntity wUserSubEntity) throws ParseException {
		//5.1	反映日が基準日と比較して未来である場合、以下の処理を行う
		
		//1)	SQL「SQL-xx-I-01　ユーザ予約登録」にて、ユーザ予約に登録する
		TUserSubEntity tUser = csvDoAdd01(wUserSubEntity);
		//2)	SQL「SQL-xx-I-02　ユーザシステム利用予約登録」にて、ユーザシステム利用予約に登録する	
		TUserSystemSubEntity tUserSys = csvDoAdd02(wUserSubEntity);
		
		Date sysCriDt = commonService.getSysCriterionDt();
		
		if(sysCriDt.compareTo(wUserSubEntity.getReflectionDate()) == 0) {
			//当日のため、マスタテーブルも更新する。
			userRegistService.saveToMaster(null, tUser, tUserSys);
		}
		//操作ログを出力する
		commonService.insOpelog(MmsConstants.FUNC_ID_2000, MmsConstants.FUNC_ID_2000_LABEL, wUserSubEntity.getUserId(), "ユーザを新規作成しました。");
	}

	/**
	 * 2)	SQL「SQL-xx-I-02　ユーザシステム利用予約登録」にて、ユーザシステム利用予約に登録する
	 * @param wUserSubEntity
	 */
	private TUserSystemSubEntity csvDoAdd02(WUserSubEntity wUserSubEntity) {

		TUserSystemSubEntity record = tUserSystemSubEntityMapper.selectByPrimaryKey(wUserSubEntity.getUserId());
		boolean newFlg = false;
		
		if(record == null) {
			newFlg = true;
			record = new TUserSystemSubEntity();
		}
		//ユーザシステム利用一時　を取得
		WUserSystemSubEntityKey key = new WUserSystemSubEntityKey();
		key.setUploadSession(wUserSubEntity.getUploadSession());
		key.setUploadUserId(wUserSubEntity.getUploadUserId());
		key.setUploadUserTs(wUserSubEntity.getUploadUserTs());
		key.setUserId(wUserSubEntity.getUserId());
		
		WUserSystemSubEntity wUserSys =  wUserSystemSubEntityMapper.selectByPrimaryKey(key);

		// 反映日
		record.setReflectionDate(wUserSys.getReflectionDate());

		// 反映フラグ 
		record.setReflectionFlag("1");

		// ユーザーID
		record.setUserId(wUserSys.getUserId());

		// アプリケーション利用フラグ01
		record.setApplicationUseFlag01(wUserSys.getApplicationUseFlag01());

		// アプリケーション利用フラグ02
		record.setApplicationUseFlag02(wUserSys.getApplicationUseFlag02());

		// アプリケーション利用フラグ03
		record.setApplicationUseFlag03(wUserSys.getApplicationUseFlag03());

		// アプリケーション利用フラグ04
		record.setApplicationUseFlag04(wUserSys.getApplicationUseFlag04());

		// アプリケーション利用フラグ05
		record.setApplicationUseFlag05(wUserSys.getApplicationUseFlag05());

		// アプリケーション利用フラグ06
		record.setApplicationUseFlag06(wUserSys.getApplicationUseFlag06());

		// アプリケーション利用フラグ07
		record.setApplicationUseFlag07(wUserSys.getApplicationUseFlag07());

		// アプリケーション利用フラグ08
		record.setApplicationUseFlag08(wUserSys.getApplicationUseFlag08());

		// アプリケーション利用フラグ09
		record.setApplicationUseFlag09(wUserSys.getApplicationUseFlag09());

		// アプリケーション利用フラグ10
		record.setApplicationUseFlag10(wUserSys.getApplicationUseFlag10());

		// アプリケーション利用フラグ11
		record.setApplicationUseFlag11(wUserSys.getApplicationUseFlag11());

		// アプリケーション利用フラグ12
		record.setApplicationUseFlag12(wUserSys.getApplicationUseFlag12());

		// アプリケーション利用フラグ13
		record.setApplicationUseFlag13(wUserSys.getApplicationUseFlag13());

		// アプリケーション利用フラグ14
		record.setApplicationUseFlag14(wUserSys.getApplicationUseFlag14());

		// アプリケーション利用フラグ15
		record.setApplicationUseFlag15(wUserSys.getApplicationUseFlag15());

		// アプリケーション利用フラグ16
		record.setApplicationUseFlag16(wUserSys.getApplicationUseFlag16());

		// アプリケーション利用フラグ17
		record.setApplicationUseFlag17(wUserSys.getApplicationUseFlag17());

		// アプリケーション利用フラグ18
		record.setApplicationUseFlag18(wUserSys.getApplicationUseFlag18());

		// アプリケーション利用フラグ19
		record.setApplicationUseFlag19(wUserSys.getApplicationUseFlag19());

		// アプリケーション利用フラグ20
		record.setApplicationUseFlag20(wUserSys.getApplicationUseFlag20());

		// システム有効フラグ01
		record.setSystemValidFlag01(wUserSys.getSystemValidFlag01());

		// システム有効フラグ02
		record.setSystemValidFlag02(wUserSys.getSystemValidFlag02());

		// システム有効フラグ03
		record.setSystemValidFlag03(wUserSys.getSystemValidFlag03());

		// システム有効フラグ04
		record.setSystemValidFlag04(wUserSys.getSystemValidFlag04());

		// システム有効フラグ05
		record.setSystemValidFlag05(wUserSys.getSystemValidFlag05());

		// システム有効フラグ06
		record.setSystemValidFlag06(wUserSys.getSystemValidFlag06());

		// システム有効フラグ07
		record.setSystemValidFlag07(wUserSys.getSystemValidFlag07());

		// システム有効フラグ08
		record.setSystemValidFlag08(wUserSys.getSystemValidFlag08());

		// システム有効フラグ09
		record.setSystemValidFlag09(wUserSys.getSystemValidFlag09());

		// システム有効フラグ10
		record.setSystemValidFlag10(wUserSys.getSystemValidFlag10());

		// システム有効フラグ11
		record.setSystemValidFlag11(wUserSys.getSystemValidFlag11());

		// システム有効フラグ12
		record.setSystemValidFlag12(wUserSys.getSystemValidFlag12());

		// システム有効フラグ13
		record.setSystemValidFlag13(wUserSys.getSystemValidFlag13());

		// システム有効フラグ14
		record.setSystemValidFlag14(wUserSys.getSystemValidFlag14());

		// システム有効フラグ15
		record.setSystemValidFlag15(wUserSys.getSystemValidFlag15());

		// システム有効フラグ16
		record.setSystemValidFlag16(wUserSys.getSystemValidFlag16());

		// システム有効フラグ17
		record.setSystemValidFlag17(wUserSys.getSystemValidFlag17());

		// システム有効フラグ18
		record.setSystemValidFlag18(wUserSys.getSystemValidFlag18());

		// システム有効フラグ19
		record.setSystemValidFlag19(wUserSys.getSystemValidFlag19());

		// システム有効フラグ20
		record.setSystemValidFlag20(wUserSys.getSystemValidFlag20());

		if(newFlg) {
			// 登録者ID
			record.setRegisterId(userId);
			
			// 登録日時
			record.setRegistTs(updDt);
			
		}

		// 更新者ID
		record.setUpdaterId(userId);

		// 更新日時
		record.setUpdateTs(updDt);

		if(newFlg) {
			tUserSystemSubEntityMapper.insert(record);
		}else {
			tUserSystemSubEntityMapper.updateById(record);
		}
		return record;
	}

	/**
	 * 1)	SQL「SQL-xx-I-01　ユーザ予約登録」にて、ユーザ予約に登録する
	 * @param wUserSubEntity
	 */
	private TUserSubEntity csvDoAdd01(WUserSubEntity wUserSubEntity) {
		TUserSubEntity record = tUserSubEntityMapper.selectByPrimaryKey(wUserSubEntity.getUserId());
		boolean newFlg = false;
		
		if(record == null) {
			newFlg = true;
			record = new TUserSubEntity();
		}

		// 反映日
		record.setReflectionDate(wUserSubEntity.getReflectionDate());

		// ユーザーID
		record.setUserId(wUserSubEntity.getUserId());

		// 雇用者ID
		record.setEmployeeId(wUserSubEntity.getEmployeeId());

		// LM内部ID
		record.setLmId(wUserSubEntity.getLmId());

		// 開始日
		record.setStartDate(wUserSubEntity.getStartDate());

		// 終了日
		record.setEndDate(wUserSubEntity.getEndDate());

		// 初期パスワード
		record.setInitPassword(wUserSubEntity.getInitPassword());

		// 削除フラグ
		record.setDeleteFlag(wUserSubEntity.getDeleteFlag());

		// 無効フラグ
		record.setInvalidFlag(wUserSubEntity.getInvalidFlag());

		// 言語コード
		record.setLangCode(wUserSubEntity.getLangCode());

		// 在籍区分
		record.setEnrollmentKbn(wUserSubEntity.getEnrollmentKbn());

		// 雇用区分
		record.setEmploymentKbn(wUserSubEntity.getEmploymentKbn());

		// プライマリメールアドレス
		record.setMailaddr(wUserSubEntity.getMailaddr());

		// セカンダリメールアドレス
		record.setMailaddrSecound(wUserSubEntity.getMailaddrSecound());

		// 通知先メールアドレス
		record.setMailaddrNotification(wUserSubEntity.getMailaddrNotification());

		// 外線番号
		record.setTel(wUserSubEntity.getTel());

		// 内線番号
		record.setTelEx(wUserSubEntity.getTelEx());

		// 姓（英語）
		record.setSurnameEn(wUserSubEntity.getSurnameEn());

		// 姓（日本語）
		record.setSurnameJp(wUserSubEntity.getSurnameJp());

		// 姓（カタカナ）
		record.setSurnameKana(wUserSubEntity.getSurnameKana());

		// ミドルネーム（英語）
		record.setMiddlenameEn(wUserSubEntity.getMiddlenameEn());

		// ミドルネーム（日本語）
		record.setMiddlenameJp(wUserSubEntity.getMiddlenameJp());

		// ミドルネーム（カタカナ）
		record.setMiddlenameKana(wUserSubEntity.getMiddlenameKana());

		// 名（英語）
		record.setGivennameEn(wUserSubEntity.getGivennameEn());

		// 名 (日本語)
		record.setGivennameJp(wUserSubEntity.getGivennameJp());

		// 名 (カタカナ)
		record.setGivennameKana(wUserSubEntity.getGivennameKana());

		// 通称 姓（英語）
		record.setSurnameNickEn(wUserSubEntity.getSurnameNickEn());

		// 通称 姓（日本語）
		record.setSurnameNickJp(wUserSubEntity.getSurnameNickJp());

		// 通称 姓（カタカナ）
		record.setSurnameNickKana(wUserSubEntity.getSurnameNickKana());

		// 通称 ミドルネーム（英語）
		record.setMiddlenameNickEn(wUserSubEntity.getMiddlenameNickEn());

		// 通称 ミドルネーム（日本語）
		record.setMiddlenameNickJp(wUserSubEntity.getMiddlenameNickJp());

		// 通称 ミドルネーム（カタカナ）
		record.setMiddlenameNickKana(wUserSubEntity.getMiddlenameNickKana());

		// 通称 名（英語）
		record.setGivennameNuckEn(wUserSubEntity.getGivennameNuckEn());

		// 通称 名 (日本語)
		record.setGivennameNuckJp(wUserSubEntity.getGivennameNuckJp());

		// 通称 名 (カタカナ)
		record.setGivennameNuckKana(wUserSubEntity.getGivennameNuckKana());

		// 所属会社コード
		record.setCompanyCode(wUserSubEntity.getCompanyCode());

		// 所属会社名称
		record.setCompanyName(wUserSubEntity.getCompanyName());

		// 役職コード
		record.setPositionCode(wUserSubEntity.getPositionCode());

		// 役職名称
		record.setPositionName(wUserSubEntity.getPositionName());

		// 等級コード
		record.setGradeCode(wUserSubEntity.getGradeCode());

		// 等級名称
		record.setGradeName(wUserSubEntity.getGradeName());

		// 所属組織コード
		record.setOrganizationCode(wUserSubEntity.getOrganizationCode());

		// 勤務地コード
		record.setLocationCode(wUserSubEntity.getLocationCode());

		// 兼務情報
		record.setKenmuInfo(wUserSubEntity.getKenmuInfo());

		// 登録者ID
		record.setRegisterId(wUserSubEntity.getRegisterId());

		// 登録日時
		record.setRegistTs(wUserSubEntity.getRegistTs());

		// 更新者ID
		record.setUpdaterId(wUserSubEntity.getUpdaterId());

		// 更新日時
		record.setUpdateTs(wUserSubEntity.getUpdateTs());

		// 拡張属性１
		record.setExpansionAttr1(wUserSubEntity.getExpansionAttr1());

		// 拡張属性２
		record.setExpansionAttr2(wUserSubEntity.getExpansionAttr2());

		// 拡張属性３
		record.setExpansionAttr3(wUserSubEntity.getExpansionAttr3());

		// 拡張属性４
		record.setExpansionAttr4(wUserSubEntity.getExpansionAttr4());

		// 拡張属性５
		record.setExpansionAttr5(wUserSubEntity.getExpansionAttr5());

		// 拡張属性６
		record.setExpansionAttr6(wUserSubEntity.getExpansionAttr6());

		// 拡張属性７
		record.setExpansionAttr7(wUserSubEntity.getExpansionAttr7());

		// 拡張属性８
		record.setExpansionAttr8(wUserSubEntity.getExpansionAttr8());

		// 拡張属性９
		record.setExpansionAttr9(wUserSubEntity.getExpansionAttr9());

		// 拡張属性１０
		record.setExpansionAttr10(wUserSubEntity.getExpansionAttr10());

		// 拡張属性１１
		record.setExpansionAttr11(wUserSubEntity.getExpansionAttr11());

		// 拡張属性１２
		record.setExpansionAttr12(wUserSubEntity.getExpansionAttr12());

		// 拡張属性１３
		record.setExpansionAttr13(wUserSubEntity.getExpansionAttr13());

		// 拡張属性１４
		record.setExpansionAttr14(wUserSubEntity.getExpansionAttr14());

		// 拡張属性１５
		record.setExpansionAttr15(wUserSubEntity.getExpansionAttr15());

		// 拡張属性１６
		record.setExpansionAttr16(wUserSubEntity.getExpansionAttr16());

		// 拡張属性１７
		record.setExpansionAttr17(wUserSubEntity.getExpansionAttr17());

		// 拡張属性１８
		record.setExpansionAttr18(wUserSubEntity.getExpansionAttr18());

		// 拡張属性１９
		record.setExpansionAttr19(wUserSubEntity.getExpansionAttr19());

		// 拡張属性２０
		record.setExpansionAttr20(wUserSubEntity.getExpansionAttr20());

		// 拡張属性２１
		record.setExpansionAttr21(wUserSubEntity.getExpansionAttr21());

		// 拡張属性２２
		record.setExpansionAttr22(wUserSubEntity.getExpansionAttr22());

		// 拡張属性２３
		record.setExpansionAttr23(wUserSubEntity.getExpansionAttr23());

		// 拡張属性２４
		record.setExpansionAttr24(wUserSubEntity.getExpansionAttr24());

		// 拡張属性２５
		record.setExpansionAttr25(wUserSubEntity.getExpansionAttr25());

		// 拡張属性２６
		record.setExpansionAttr26(wUserSubEntity.getExpansionAttr26());

		// 拡張属性２７
		record.setExpansionAttr27(wUserSubEntity.getExpansionAttr27());

		// 拡張属性２８
		record.setExpansionAttr28(wUserSubEntity.getExpansionAttr28());

		// 拡張属性２９
		record.setExpansionAttr29(wUserSubEntity.getExpansionAttr29());

		// 拡張属性３０
		record.setExpansionAttr30(wUserSubEntity.getExpansionAttr30());

		// 拡張属性３１
		record.setExpansionAttr31(wUserSubEntity.getExpansionAttr31());

		// 拡張属性３２
		record.setExpansionAttr32(wUserSubEntity.getExpansionAttr32());

		// 拡張属性３３
		record.setExpansionAttr33(wUserSubEntity.getExpansionAttr33());

		// 拡張属性３４
		record.setExpansionAttr34(wUserSubEntity.getExpansionAttr34());

		// 拡張属性３５
		record.setExpansionAttr35(wUserSubEntity.getExpansionAttr35());

		// 拡張属性３６
		record.setExpansionAttr36(wUserSubEntity.getExpansionAttr36());

		// 拡張属性３７
		record.setExpansionAttr37(wUserSubEntity.getExpansionAttr37());

		// 拡張属性３８
		record.setExpansionAttr38(wUserSubEntity.getExpansionAttr38());

		// 拡張属性３９
		record.setExpansionAttr39(wUserSubEntity.getExpansionAttr39());

		// 拡張属性４０
		record.setExpansionAttr40(wUserSubEntity.getExpansionAttr40());

		if(newFlg) {
			tUserSubEntityMapper.insert(record);
		}else {
			tUserSubEntityMapper.updateById(record);
		}
		return record;
		
	}

	/**
	 * 操作区分を取得
	 * @param wUserSubEntity
	 * @return
	 */
	private String getOpDiv(WUserSubEntity wUserSubEntity) {

		WUploadFileSubEntityExample condi = new WUploadFileSubEntityExample();
		
		condi.createCriteria().andUploadUserIdEqualTo(userId)
		.andUploadUserTsEqualTo(uploadDt)
		.andUploadSessionEqualTo(sessionId)
		.andUserIdEqualTo(wUserSubEntity.getUserId());
		
		List<WUploadFileSubEntity> resultList = wUploadFileSubEntityMapper.selectByExample(condi);

		if(resultList != null && resultList.size() > 0) {
			return resultList.get(0).getProcessKbn();
		}
		return null;
	}

	/**
	 * //(4)	ユーザ一時から対象のデータを取得する
	 * @return
	 * @throws ParseException
	 */
	private List<WUserSubEntity> getUserList() throws ParseException {
		//(1)	ログインユーザのセッションIDを取得する
        sessionId = httpSession.getId();
        
        //(4)	ユーザ一時から対象のデータを取得する
        String uploadDtStr = databaseService.getString("select TO_CHAR(max(upload_user_ts), 'YYYY/MM/DD HH24:MI:SS.MS') from w_user_sub where upload_user_id='%s' and upload_session='%s'".formatted(userId, sessionId));
        String pattern = "yyyy/MM/dd HH:mm:ss.SSS";

        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        uploadDt = dateFormat.parse(uploadDtStr);
        
        WUserSubEntityExample condi = new WUserSubEntityExample();
        
        WUserSubEntityExample.Criteria cr= condi.createCriteria();
        cr.andUploadUserIdEqualTo(userId);
        cr.andUploadSessionEqualTo(sessionId);
        cr.andUploadUserTsEqualTo(uploadDt);
        List<WUserSubEntity> userList = wUserSubEntityMapper.selectByExample(condi);
        return userList;
	}
}
