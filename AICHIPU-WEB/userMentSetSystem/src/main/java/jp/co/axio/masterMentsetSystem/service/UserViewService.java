package jp.co.axio.masterMentsetSystem.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.common.MmsConstants;
import jp.co.axio.masterMentsetSystem.controller.LoginInfo;
import jp.co.axio.masterMentsetSystem.controller.UserRegistForm;
import jp.co.axio.masterMentsetSystem.dto.PasswordHisDto;
import jp.co.axio.masterMentsetSystem.dto.PulldownItemDto;
import jp.co.axio.masterMentsetSystem.model.MPassword;
import jp.co.axio.masterMentsetSystem.model.MUser;
import jp.co.axio.masterMentsetSystem.model.MUserExpansion;
import jp.co.axio.masterMentsetSystem.model.MgpCodeMst;
import jp.co.axio.masterMentsetSystem.model.MgpCodeMstExample;
import jp.co.axio.masterMentsetSystem.model.MgpCodeMstKey;
import jp.co.axio.masterMentsetSystem.model.TPasswordHist;
import jp.co.axio.masterMentsetSystem.model.TPasswordHistExample;
import jp.co.axio.masterMentsetSystem.model.TUserSubEntity;
import jp.co.axio.masterMentsetSystem.model.TUserSubEntityExample;
import jp.co.axio.masterMentsetSystem.model.TUserSystemSubEntity;
import jp.co.axio.masterMentsetSystem.model.TUserSystemSubEntityExample;
import jp.co.axio.masterMentsetSystem.model.VAdminMaintenanceEntity;
import jp.co.axio.masterMentsetSystem.model.VAdminMaintenanceEntityExample;
import jp.co.axio.masterMentsetSystem.repository.MPasswordMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserExpansionMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserMapper;
import jp.co.axio.masterMentsetSystem.repository.MgpCodeMstMapper;
import jp.co.axio.masterMentsetSystem.repository.TPasswordHistMapper;
import jp.co.axio.masterMentsetSystem.repository.TUserSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.TUserSystemSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.VAdminMaintenanceEntityMapper;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRPrintPage;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;

/**
 * ユーザーサービスクラス
 *
 * @author AXIO
 * @version 1.0
 */
@Service
public class UserViewService {

	
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
    public UserViewService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
    


	/**ユーザ情報を取得
	 * @param userId
	 * @param subFlag 
	 * @return
	 */
	public UserRegistForm getUserDetail(String userId, String subFlag) {
		UserRegistForm result = new UserRegistForm();
		
		
		if("1".equals(subFlag)) {
			crtFromSub(result, userId);
		}else {
			crtFormView(result, userId);
		}
		
		return result;
	}



	/**
	 * 予定テーブルより値を取得
	 * @param result
	 * @param userId
	 */
	private void crtFromSub(UserRegistForm result, String userId) {
		TUserSubEntityExample subCondi = new TUserSubEntityExample();
		subCondi.createCriteria().andUserIdEqualTo(userId);
		
		List<TUserSubEntity> subList = tUserSubEntityMapper.selectByExample(subCondi);
		
		TUserSystemSubEntityExample sysCondi = new TUserSystemSubEntityExample();
		sysCondi.createCriteria().andUserIdEqualTo(userId);
		List<TUserSystemSubEntity> sysList = tUserSystemSubEntityMapper.selectByExample(sysCondi);
		
		if(subList.size() == 0 || sysList.size() == 0) {
			//予約テーブルの検索に失敗した
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 初期処理",
					"予約テーブルに利用者情報が存在しません。user_id='%s'".formatted(userId));
			return;
		}

		//在籍区分
		result.setZaiSeki(subList.get(0).getEnrollmentKbn());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// 反映日
		result.setHanEiDt(dateFormat.format( subList.get(0).getReflectionDate()));

		// 利用者区分
		result.setRiYouShaDiv(subList.get(0).getEmploymentKbn());

		// 利用者区分プルダウン
		result.setRiYouShaDivList(commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_00003));

		// 利用者ID
		result.setRiYouShaId(subList.get(0).getUserId());

		// 学籍番号・教職員番号
		result.setGakuSekiBn(subList.get(0).getEmployeeId());

		// 姓（漢字）
		result.setSeiJp(subList.get(0).getSurnameJp());

		// 名（漢字）
		result.setMeiJp(subList.get(0).getGivennameJp());

		// 姓（英字）
		result.setSeiEn(subList.get(0).getSurnameEn());

		// 名（英字）
		result.setMeiEn(subList.get(0).getGivennameEn());

		// キャンパス
		result.setCampus(subList.get(0).getLocationCode());

		// キャンパスプルダウン
		// キャンパスプルダウン
		result.setCampusList(commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01007));

		// 所属
		result.setShoZoku(subList.get(0).getCompanyCode() + "-" + subList.get(0).getOrganizationCode());

		// 所属プルダウン
		result.setShoZokuList(commonService.getOrgList(MmsConstants.COMPANY_CODE_COLLEGE));

		// メールアドレス
		result.setMailAddr(subList.get(0).getMailaddr());

		// 入学年度
		result.setNyuGakuNendo(subList.get(0).getExpansionAttr33());

		// 開始日
		result.setValidateStartDt(dateFormat.format(subList.get(0).getStartDate()));

		// 終了日
		result.setValidateEndDt(dateFormat.format(subList.get(0).getEndDate()));

		// 利用アプリケーション１
		result.setUseApp01(sysList.get(0).getApplicationUseFlag01().equals("1") ? true : false);

		// 利用アプリケーション２
		result.setUseApp02(sysList.get(0).getApplicationUseFlag02().equals("1") ? true : false);

		// 利用アプリケーション３
		result.setUseApp03(sysList.get(0).getApplicationUseFlag03().equals("1") ? true : false);

		// 利用アプリケーション４
		result.setUseApp04(sysList.get(0).getApplicationUseFlag04().equals("1") ? true : false);

		// 利用アプリケーション５
		result.setUseApp05(sysList.get(0).getApplicationUseFlag05().equals("1") ? true : false);

		// 利用アプリケーション６
		result.setUseApp06(sysList.get(0).getApplicationUseFlag06().equals("1") ? true : false);

		// 利用アプリケーション７
		result.setUseApp07(sysList.get(0).getApplicationUseFlag07().equals("1") ? true : false);

		// 利用アプリケーション８
		result.setUseApp08(sysList.get(0).getApplicationUseFlag08().equals("1") ? true : false);

		// 利用アプリケーション９
		result.setUseApp09(sysList.get(0).getApplicationUseFlag09().equals("1") ? true : false);

		// 利用アプリケーション１０
		result.setUseApp10(sysList.get(0).getApplicationUseFlag10().equals("1") ? true : false);

		// 利用アプリケーション１１
		result.setUseApp11(sysList.get(0).getApplicationUseFlag11().equals("1") ? true : false);

		// 利用アプリケーション１２
		result.setUseApp12(sysList.get(0).getApplicationUseFlag12().equals("1") ? true : false);

		// 利用アプリケーション１３
		result.setUseApp13(sysList.get(0).getApplicationUseFlag13().equals("1") ? true : false);

		// 利用アプリケーション１４
		result.setUseApp14(sysList.get(0).getApplicationUseFlag14().equals("1") ? true : false);

		// 利用アプリケーション１５
		result.setUseApp15(sysList.get(0).getApplicationUseFlag15().equals("1") ? true : false);

		// 利用アプリケーション１６
		result.setUseApp16(sysList.get(0).getApplicationUseFlag16().equals("1") ? true : false);

		// 利用アプリケーション１７
		result.setUseApp17(sysList.get(0).getApplicationUseFlag17().equals("1") ? true : false);

		// 利用アプリケーション１８
		result.setUseApp18(sysList.get(0).getApplicationUseFlag18().equals("1") ? true : false);

		// 利用アプリケーション１９
		result.setUseApp19(sysList.get(0).getApplicationUseFlag19().equals("1") ? true : false);

		// 利用アプリケーション２０
		result.setUseApp20(sysList.get(0).getApplicationUseFlag20().equals("1") ? true : false);

		// その他項目１
		result.setOtherItem01(subList.get(0).getExpansionAttr1());

		// その他項目２
		result.setOtherItem02(subList.get(0).getExpansionAttr2());

		// その他項目３
		result.setOtherItem03(subList.get(0).getExpansionAttr3());

		// その他項目４
		result.setOtherItem04(subList.get(0).getExpansionAttr4());

		// その他項目５
		result.setOtherItem05(subList.get(0).getExpansionAttr5());

		// その他項目６
		result.setOtherItem06(subList.get(0).getExpansionAttr6());

		// その他項目７
		result.setOtherItem07(subList.get(0).getExpansionAttr7());

		// その他項目８
		result.setOtherItem08(subList.get(0).getExpansionAttr8());

		// その他項目９
		result.setOtherItem09(subList.get(0).getExpansionAttr9());

		// その他項目１０
		result.setOtherItem10(subList.get(0).getExpansionAttr10());

		// その他項目１１
		result.setOtherItem11(subList.get(0).getExpansionAttr11());

		// その他項目１２
		result.setOtherItem12(subList.get(0).getExpansionAttr12());

		// その他項目１３
		result.setOtherItem13(subList.get(0).getExpansionAttr13());

		// その他項目１４
		result.setOtherItem14(subList.get(0).getExpansionAttr14());

		// その他項目１５
		result.setOtherItem15(subList.get(0).getExpansionAttr15());

		// その他項目１６
		result.setOtherItem16(subList.get(0).getExpansionAttr16());

		// その他項目１７
		result.setOtherItem17(subList.get(0).getExpansionAttr17());

		// その他項目１８
		result.setOtherItem18(subList.get(0).getExpansionAttr18());

		// その他項目１９
		result.setOtherItem19(subList.get(0).getExpansionAttr19());

		// その他項目２０
		result.setOtherItem20(subList.get(0).getExpansionAttr20());

		// その他項目２１
		result.setOtherItem21(subList.get(0).getExpansionAttr21());

		// その他項目２２
		result.setOtherItem22(subList.get(0).getExpansionAttr22());

		// その他項目２３
		result.setOtherItem23(subList.get(0).getExpansionAttr23());

		// その他項目２４
		result.setOtherItem24(subList.get(0).getExpansionAttr24());

		// その他項目２５
		result.setOtherItem25(subList.get(0).getExpansionAttr25());

		// その他項目２６
		result.setOtherItem26(subList.get(0).getExpansionAttr26());

		// その他項目２７
		result.setOtherItem27(subList.get(0).getExpansionAttr27());

		// その他項目２８
		result.setOtherItem28(subList.get(0).getExpansionAttr28());

		// その他項目２９
		result.setOtherItem29(subList.get(0).getExpansionAttr29());

		// その他項目３０
		result.setOtherItem30(subList.get(0).getExpansionAttr30());

		// その他項目３１
		result.setOtherItem31(subList.get(0).getExpansionAttr31());

		// その他項目３２
		result.setOtherItem32(subList.get(0).getExpansionAttr32());

		// その他項目３３
		result.setOtherItem33(subList.get(0).getExpansionAttr33());

		// その他項目３４
		result.setOtherItem34(subList.get(0).getExpansionAttr34());

		// その他項目３５
		result.setOtherItem35(subList.get(0).getExpansionAttr35());

		// その他項目３６
		result.setOtherItem36(subList.get(0).getExpansionAttr36());

		// その他項目３７
		result.setOtherItem37(subList.get(0).getExpansionAttr37());

		// その他項目３８
		result.setOtherItem38(subList.get(0).getExpansionAttr38());

		// その他項目３９
		result.setOtherItem39(subList.get(0).getExpansionAttr39());

		// その他項目４０
		result.setOtherItem40(subList.get(0).getExpansionAttr40());
		
		
	}



	/**
	 * ビューより値を取得
	 * @param result
	 * @param userId
	 */
	private void crtFormView(UserRegistForm result, String userId) {
		// Viewより値を取得
		VAdminMaintenanceEntityExample condi = new VAdminMaintenanceEntityExample();
		condi.createCriteria().andUserIdEqualTo(userId);

		List<VAdminMaintenanceEntity> record = vAdminMaintenanceEntityMapper.selectByExample(condi);

		if (record.size() == 0) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 初期処理",
					"利用者情報が存在しません。user_id='%s'".formatted(userId));
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dateFormatView = new SimpleDateFormat("yyyy/MM/dd");
		Date criterion_dt = commonService.getSysCriterionDt();

		//在籍区分
		result.setZaiSeki(record.get(0).getEnrollmentKbn());
		
		//削除フラグ
		result.setDeleteFlag(record.get(0).getDeleteFlag());
		
		//無効フラグ
		result.setInvalidFlag(record.get(0).getInvalidFlag());
		
		
		/** 未来ユーザフラグ */
		result.setFutureUserFlag(record.get(0).getFutureUserFlag());
		
		/** 反映フラグ */
		result.setReflectionFlag(record.get(0).getReflectionFlag());
		
		// 反映日
		result.setHanEiDt(dateFormat.format(criterion_dt));

		// 利用者区分
		result.setRiYouShaDiv(record.get(0).getEmploymentKbn());

		// 利用者区分プルダウン
		result.setRiYouShaDivList(commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_00003));

		// 利用者ID
		result.setRiYouShaId(record.get(0).getUserId());

		// 学籍番号・教職員番号
		result.setGakuSekiBn(record.get(0).getEmployeeId());

		// 姓（漢字）
		result.setSeiJp(record.get(0).getSurnameJp());

		// 名（漢字）
		result.setMeiJp(record.get(0).getGivennameJp());

		// 姓（英字）
		result.setSeiEn(record.get(0).getSurnameEn());

		// 名（英字）
		result.setMeiEn(record.get(0).getGivennameEn());

		// キャンパス
		result.setCampus(record.get(0).getLocationCode());

		// キャンパスプルダウン
		// キャンパスプルダウン
		result.setCampusList(commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01007));

		// 所属
		result.setShoZoku(record.get(0).getCompanyCode() + "-" + record.get(0).getOrganizationCode());

		// 所属プルダウン
		result.setShoZokuList(commonService.getOrgList(MmsConstants.COMPANY_CODE_COLLEGE));

		// メールアドレス
		result.setMailAddr(record.get(0).getMailaddr());

		// 入学年度
		result.setNyuGakuNendo(record.get(0).getExpansionAttr33());

		// 開始日
		result.setValidateStartDt(dateFormat.format(record.get(0).getStartDate()));

		// 開始日
		result.setValidateStartDtView(dateFormatView.format(record.get(0).getStartDate()));

		// 終了日
		result.setValidateEndDt(dateFormat.format(record.get(0).getEndDate()));

		// 終了日
		result.setValidateEndDtView(dateFormatView.format(record.get(0).getEndDate()));

		// 利用アプリケーション１
		result.setUseApp01(record.get(0).getApplicationUseFlag01().equals("1") ? true : false);

		// 利用アプリケーション２
		result.setUseApp02(record.get(0).getApplicationUseFlag02().equals("1") ? true : false);

		// 利用アプリケーション３
		result.setUseApp03(record.get(0).getApplicationUseFlag03().equals("1") ? true : false);

		// 利用アプリケーション４
		result.setUseApp04(record.get(0).getApplicationUseFlag04().equals("1") ? true : false);

		// 利用アプリケーション５
		result.setUseApp05(record.get(0).getApplicationUseFlag05().equals("1") ? true : false);

		// 利用アプリケーション６
		result.setUseApp06(record.get(0).getApplicationUseFlag06().equals("1") ? true : false);

		// 利用アプリケーション７
		result.setUseApp07(record.get(0).getApplicationUseFlag07().equals("1") ? true : false);

		// 利用アプリケーション８
		result.setUseApp08(record.get(0).getApplicationUseFlag08().equals("1") ? true : false);

		// 利用アプリケーション９
		result.setUseApp09(record.get(0).getApplicationUseFlag09().equals("1") ? true : false);

		// 利用アプリケーション１０
		result.setUseApp10(record.get(0).getApplicationUseFlag10().equals("1") ? true : false);

		// 利用アプリケーション１１
		result.setUseApp11(record.get(0).getApplicationUseFlag11().equals("1") ? true : false);

		// 利用アプリケーション１２
		result.setUseApp12(record.get(0).getApplicationUseFlag12().equals("1") ? true : false);

		// 利用アプリケーション１３
		result.setUseApp13(record.get(0).getApplicationUseFlag13().equals("1") ? true : false);

		// 利用アプリケーション１４
		result.setUseApp14(record.get(0).getApplicationUseFlag14().equals("1") ? true : false);

		// 利用アプリケーション１５
		result.setUseApp15(record.get(0).getApplicationUseFlag15().equals("1") ? true : false);

		// 利用アプリケーション１６
		result.setUseApp16(record.get(0).getApplicationUseFlag16().equals("1") ? true : false);

		// 利用アプリケーション１７
		result.setUseApp17(record.get(0).getApplicationUseFlag17().equals("1") ? true : false);

		// 利用アプリケーション１８
		result.setUseApp18(record.get(0).getApplicationUseFlag18().equals("1") ? true : false);

		// 利用アプリケーション１９
		result.setUseApp19(record.get(0).getApplicationUseFlag19().equals("1") ? true : false);

		// 利用アプリケーション２０
		result.setUseApp20(record.get(0).getApplicationUseFlag20().equals("1") ? true : false);

		// その他項目１
		result.setOtherItem01(record.get(0).getExpansionAttr1());

		// その他項目２
		result.setOtherItem02(record.get(0).getExpansionAttr2());

		// その他項目３
		result.setOtherItem03(record.get(0).getExpansionAttr3());

		// その他項目４
		result.setOtherItem04(record.get(0).getExpansionAttr4());

		// その他項目５
		result.setOtherItem05(record.get(0).getExpansionAttr5());

		// その他項目６
		result.setOtherItem06(record.get(0).getExpansionAttr6());

		// その他項目７
		result.setOtherItem07(record.get(0).getExpansionAttr7());

		// その他項目８
		result.setOtherItem08(record.get(0).getExpansionAttr8());

		// その他項目９
		result.setOtherItem09(record.get(0).getExpansionAttr9());

		// その他項目１０
		result.setOtherItem10(record.get(0).getExpansionAttr10());

		// その他項目１１
		result.setOtherItem11(record.get(0).getExpansionAttr11());

		// その他項目１２
		result.setOtherItem12(record.get(0).getExpansionAttr12());

		// その他項目１３
		result.setOtherItem13(record.get(0).getExpansionAttr13());

		// その他項目１４
		result.setOtherItem14(record.get(0).getExpansionAttr14());

		// その他項目１５
		result.setOtherItem15(record.get(0).getExpansionAttr15());

		// その他項目１６
		result.setOtherItem16(record.get(0).getExpansionAttr16());

		// その他項目１７
		result.setOtherItem17(record.get(0).getExpansionAttr17());

		// その他項目１８
		result.setOtherItem18(record.get(0).getExpansionAttr18());

		// その他項目１９
		result.setOtherItem19(record.get(0).getExpansionAttr19());

		// その他項目２０
		result.setOtherItem20(record.get(0).getExpansionAttr20());

		// その他項目２１
		result.setOtherItem21(record.get(0).getExpansionAttr21());

		// その他項目２２
		result.setOtherItem22(record.get(0).getExpansionAttr22());

		// その他項目２３
		result.setOtherItem23(record.get(0).getExpansionAttr23());

		// その他項目２４
		result.setOtherItem24(record.get(0).getExpansionAttr24());

		// その他項目２５
		result.setOtherItem25(record.get(0).getExpansionAttr25());

		// その他項目２６
		result.setOtherItem26(record.get(0).getExpansionAttr26());

		// その他項目２７
		result.setOtherItem27(record.get(0).getExpansionAttr27());

		// その他項目２８
		result.setOtherItem28(record.get(0).getExpansionAttr28());

		// その他項目２９
		result.setOtherItem29(record.get(0).getExpansionAttr29());

		// その他項目３０
		result.setOtherItem30(record.get(0).getExpansionAttr30());

		// その他項目３１
		result.setOtherItem31(record.get(0).getExpansionAttr31());

		// その他項目３２
		result.setOtherItem32(record.get(0).getExpansionAttr32());

		// その他項目３３
		result.setOtherItem33(record.get(0).getExpansionAttr33());

		// その他項目３４
		result.setOtherItem34(record.get(0).getExpansionAttr34());

		// その他項目３５
		result.setOtherItem35(record.get(0).getExpansionAttr35());

		// その他項目３６
		result.setOtherItem36(record.get(0).getExpansionAttr36());

		// その他項目３７
		result.setOtherItem37(record.get(0).getExpansionAttr37());

		// その他項目３８
		result.setOtherItem38(record.get(0).getExpansionAttr38());

		// その他項目３９
		result.setOtherItem39(record.get(0).getExpansionAttr39());

		// その他項目４０
		result.setOtherItem40(record.get(0).getExpansionAttr40());

	}

	/**
	 * 利用者予約データが存在するかをチェック
	 * @param userId
	 * @return
	 */
	public boolean chkSubUserExists(String userId) {
		
		return databaseService.count("select count(user_id) from t_user_system_sub where user_id='%s' and reflection_flag='1'".formatted(userId)) > 0;
	}

	/**
	 * 利用者情報を削除
	 * @param userId
	 */
	public void deleteUser(String userId) {
		
		MUser mUser = mUserMapper.selectByPrimaryKey(userId);
		
		if(mUser == null) {
			//ユーザマスタに存在しない
			//ユーザ予約、ユーザシステム予約データを削除
			tUserSubEntityMapper.deleteByPrimaryKey(userId);
			tUserSystemSubEntityMapper.deleteByPrimaryKey(userId);
			
		}else {
			Date criterion_dt = commonService.getSysCriterionDt();
			if(!("0".equals(mUser.getDeleteFlag()) 
					|| criterion_dt.compareTo(mUser.getEndDate()) > 0)) {
				//既に削除された場合、何にもしない
				return;
			}
			//削除フラグ、無効フラグを「1」に更新する
			//終了日をシステム基準日－1に更新する
	
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(criterion_dt);
	        calendar.add(Calendar.DAY_OF_MONTH, -1);
	
			mUser.setDeleteFlag("1");
			mUser.setInvalidFlag("1");
			mUser.setEndDate(calendar.getTime());
			
			mUser.setUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
			mUser.setUpdateTs(new Date());
			
			mUserMapper.updateByPrimaryKey(mUser);
		}
		
		//操作ログを登録
		commonService.insOpelog(MmsConstants.FUNC_ID_1000, MmsConstants.FUNC_ID_1000_LABEL, userId, "ユーザを削除しました。");
		
	}
	/**
	 * 利用者情報を有効
	 * @param userId
	 */
	public void undoDeleteUser(String userId) {

		Date criterion_dt = commonService.getSysCriterionDt();
		MUser mUser = mUserMapper.selectByPrimaryKey(userId);
		if("0".equals(mUser.getDeleteFlag()) 
				&& criterion_dt.compareTo(mUser.getEndDate()) < 0) {
			//既に有効の場合、何にもしない
			return;
		}
		//削除フラグ、無効フラグを「0」に更新する
		//終了日をシステム「2999/12/31」に更新する
        // java.time.LocalDateを作成
        LocalDate localDate = LocalDate.of(2023, 12, 31);

        // java.time.LocalDateからjava.util.Dateに変換
        Date utilDate = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		
		mUser.setDeleteFlag("0");
		mUser.setInvalidFlag("0");
		mUser.setEndDate(utilDate);
		
		mUser.setUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		mUser.setUpdateTs(new Date());
		
		mUserMapper.updateByPrimaryKey(mUser);
		
		//操作ログを登録
		commonService.insOpelog(MmsConstants.FUNC_ID_1000, MmsConstants.FUNC_ID_1000_LABEL, userId, "ユーザを有効化しました。");
		
		
	}

	/**
	 * ロック解除処理
	 * @param userId
	 * @throws IOException 
	 */
	public void userUnLock(String userId) throws IOException {
		
		MUser mUser = mUserMapper.selectByPrimaryKey(userId);
		
		//ロック中だと
		if("1".equals(mUser.getDeleteFlag()) || 
				"0".equals(mUser.getInvalidFlag())) {
			//有効、または削除されたため、ロック処理できない
			errorMsg = messageSource.getMessage(MmsConstants.MSG_MSTO0016M0103, null,null);
			return;
		}
		
		MPassword mPassword = mPasswordMapper.selectByPrimaryKey(userId);
		
		// change SIME パスワード
		changeSimePwd(userId, mPassword.getUserPassword());
		
		
		//curr_password に　lock_passwordの値を設定
		mPassword.setCurrPassword(mPassword.getUserPassword());
		mPassword.setUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		mPassword.setUpdateTs(new Date());
		
		mPasswordMapper.updateByPrimaryKey(mPassword);
		
		/*
		 * 終了日		2999/12/31									
		 */

		//終了日をシステム「2999/12/31」に更新する
        // java.time.LocalDateを作成
        LocalDate localDate = LocalDate.of(2023, 12, 31);

        // java.time.LocalDateからjava.util.Dateに変換
        Date utilDate = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
		

		
		//無効フラグを「0」に更新
		mUser.setInvalidFlag("0");
		mUser.setEndDate(utilDate);
		mUser.setUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		mUser.setUpdateTs(new Date());
		
		mUserMapper.updateByPrimaryKey(mUser);
		
		//ユーザ拡張UAC無効化処理
		MUserExpansion mUserExp = mUserExpansionMapper.selectByPrimaryKey(userId);
		mUserExp.setExpansionAttr31("66080");
		mUserExpansionMapper.updateByPrimaryKey(mUserExp);

		
		//パスワード変更履歴を作成
		Date tmpDate = new Date();
		TPasswordHist tpHist = new TPasswordHist();
		tpHist.setCurrPassword(mPassword.getCurrPassword());
		tpHist.setOpeId(MmsConstants.PWD_OP_CODE_5000);
		tpHist.setPasswordUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		tpHist.setPasswordUpdateTs(tmpDate);
		tpHist.setReflectionFlag("0");
		tpHist.setRegisterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		tpHist.setRegistTs(tmpDate);
		tpHist.setUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		tpHist.setUpdateTs(tmpDate);
		tpHist.setUserId(userId);
		
		tPasswordHistMapper.updateByPrimaryKey(tpHist);
		//操作ログを登録
		commonService.insOpelog(MmsConstants.FUNC_ID_1000, MmsConstants.FUNC_ID_1000_LABEL, userId, "ユーザをロック解除しました。");
		

		// SIMEの拡張項目の更新 バッチTriggerファイルを作成
		crtTriggerFile();
	}
	/**
	 * ロック処理
	 * @param userId
	 * @throws IOException 
	 */
	public void userLock(String userId) throws IOException {

		MUser mUser = mUserMapper.selectByPrimaryKey(userId);
		
		//ロック中だと
		if("1".equals(mUser.getDeleteFlag()) || 
				"1".equals(mUser.getInvalidFlag())) {
			//既に無効、または削除されたため、ロック処理できない
			errorMsg = messageSource.getMessage(MmsConstants.MSG_MSTO0016M0102, null,null);
			return;
		}
		
		MPassword mPassword = mPasswordMapper.selectByPrimaryKey(userId);
		
		// change SIME パスワード
		changeSimePwd(userId, mPassword.getLockPasswod());
		
		
		//curr_password に　lock_passwordの値を設定
		mPassword.setCurrPassword(mPassword.getLockPasswod());
		mPassword.setUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		mPassword.setUpdateTs(new Date());
		
		mPasswordMapper.updateByPrimaryKey(mPassword);

		Date criterion_dt = commonService.getSysCriterionDt();
		
		/*
		 * 終了日						-									基準日 + 削除猶予期間											"削除猶予期間を汎用コードマスタから取得
			期間は利用者区分により異なる"									
			更新者統一ID						-									[操作者ユーザID]																				
			更新日時						CURRENT_TIMESTAMP																													
			バージョンNO															１											固定値「１」									
		 */
		
		String strVal = databaseService.getString("select value_2 from m_gp_code_mst where class_code = '%s' and value_1='%s'".formatted(
				MmsConstants.MST_CODE_CATEGORY_01015, mUser.getEmploymentKbn()));
        // Calendarを使用して10日後にセット
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(criterion_dt);
        calendar.add(Calendar.DAY_OF_MONTH, Integer.valueOf(strVal));
		
		//無効フラグを「1」に更新
		mUser.setInvalidFlag("1");
		mUser.setEndDate(calendar.getTime());
		mUser.setUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		mUser.setUpdateTs(new Date());
		
		mUserMapper.updateByPrimaryKey(mUser);
	
		//ユーザ拡張UAC無効化処理
		MUserExpansion mUserExp = mUserExpansionMapper.selectByPrimaryKey(userId);
		mUserExp.setExpansionAttr31("66082");
		mUserExpansionMapper.updateByPrimaryKey(mUserExp);
		
		//パスワード変更履歴を作成
		Date tmpDate = new Date();
		TPasswordHist tpHist = new TPasswordHist();
		tpHist.setCurrPassword(mPassword.getCurrPassword());
		tpHist.setOpeId(MmsConstants.PWD_OP_CODE_4000);
		tpHist.setPasswordUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		tpHist.setPasswordUpdateTs(tmpDate);
		tpHist.setReflectionFlag("0");
		tpHist.setRegisterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		tpHist.setRegistTs(tmpDate);
		tpHist.setUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		tpHist.setUpdateTs(tmpDate);
		tpHist.setUserId(userId);
		
		tPasswordHistMapper.updateByPrimaryKey(tpHist);
		//操作ログを登録
		commonService.insOpelog(MmsConstants.FUNC_ID_1000, MmsConstants.FUNC_ID_1000_LABEL, userId, "ユーザをロックしました。");

		// SIMEの拡張項目の更新 バッチTriggerファイルを作成
		crtTriggerFile();
		
	}
	/**
	 * パスワード初期化処理
	 * @param userId
	 * @throws IOException 
	 */
	public void userInitPassword(String userId) throws IOException {
		
		MPassword mPassword = mPasswordMapper.selectByPrimaryKey(userId);
		
		// change SIME パスワード
		changeSimePwd(userId, mPassword.getInitPassword());
		
		//curr_password に　init_passwordの値を設定
		mPassword.setCurrPassword(mPassword.getInitPassword());
		mPassword.setUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		mPassword.setUpdateTs(new Date());
		
		mPasswordMapper.updateByPrimaryKey(mPassword);
		
		//パスワード変更履歴を作成
		Date tmpDate = new Date();
		TPasswordHist tpHist = new TPasswordHist();
		tpHist.setCurrPassword(mPassword.getCurrPassword());
		tpHist.setOpeId(MmsConstants.PWD_OP_CODE_3000);
		tpHist.setPasswordUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		tpHist.setPasswordUpdateTs(tmpDate);
		tpHist.setReflectionFlag("0");
		tpHist.setRegisterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		tpHist.setRegistTs(tmpDate);
		tpHist.setUpdaterId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		tpHist.setUpdateTs(tmpDate);
		tpHist.setUserId(userId);
		
		tPasswordHistMapper.updateByPrimaryKey(tpHist);
		//操作ログを登録
		commonService.insOpelog(MmsConstants.FUNC_ID_1000, MmsConstants.FUNC_ID_1000_LABEL, userId, "ユーザを初期化しました。");

		
	}

    /**
     * SIMEのパスワードを変更
     * @param initPassword
     * @param userId 
     * @throws IOException 
     */
    private void changeSimePwd(String userId, String initPassword) throws IOException {
    	
    	List<Map<String, Object>> mstCode = databaseService.executeSqlQuery("select * from m_gp_code_mst where class_code = '01014' and code_value='00001'");
    	
    	if(mstCode.size() == 0) {
    		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 パスワード初期化処理", "汎用コードマスタにSIMEログイン情報がありません。" );
    		return;
    	}
    	
        // フォームデータを作成
        String formData = "action_login=true&id=" + mstCode.get(0).get("value_2").toString() +
        		"&password=" + mstCode.get(0).get("value_3").toString() ;

        // HTTP POSTリクエストを送信
        String url = mstCode.get(0).get("value_1").toString(); //"http://138.3.214.9/admin/api/";
        String responseXml = sendPostRequest(url, formData);

        // 受信したXMLを解析してsessidを取得
        String sessid = parseXmlResponse(responseXml);

		//パスワード暗号用共通鍵
        List<PulldownItemDto> codeList = commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01008);
		String encKey = (String)codeList.get(1).getValue();
		
        initPassword = databaseService.getString("select f_decrypt('%s','%s')".formatted(initPassword, encKey));
        formData = "action_user_setPasswd=true&sessid=" + sessid +
        		"&id=" + userId +
        		"&password=" + URLEncoder.encode(initPassword, StandardCharsets.UTF_8.toString()) ;
        LogService.debug(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 パスワード初期化処理 formData", formData );
        responseXml = sendPostRequest(url, formData);
        LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 パスワード初期化処理", responseXml );
		
	}



	/**
	 * SIMEにRequestを送信
	 * @param url
	 * @param formData
	 * @return
	 * @throws IOException
	 */
	private static String sendPostRequest(String url, String formData) throws IOException {
        HttpURLConnection connection = null;
        try {
            // URLを作成
            URL apiUrl = new URL(url);
            connection = (HttpURLConnection) apiUrl.openConnection();

            // HTTPメソッドをPOSTに設定
            connection.setRequestMethod("POST");

            // フォームデータをリクエストボディに書き込む
            connection.setDoOutput(true);
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = formData.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // レスポンスを取得
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                return response.toString();
            }
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    /**
     * ログインのResponseよりsessidを取得
     * @param xmlString
     * @return
     */
    private static String parseXmlResponse(String xmlString) {
        // XMLの解析処理を実装する
        // この例では簡易的な文字列検索を使用
        int startIndex = xmlString.indexOf("<sessid>") + "<sessid>".length();
        int endIndex = xmlString.indexOf("</sessid>");
        return xmlString.substring(startIndex, endIndex);
    }



	/**
	 * パスワード履歴を取得
	 * @param userId
	 * @return
	 */
	public List<PasswordHisDto> getPasswordHisList(String userId) {
		
		TPasswordHistExample tpHistCondi = new TPasswordHistExample();
		tpHistCondi.createCriteria().andUserIdEqualTo(userId);
		tpHistCondi.setOrderByClause(" password_update_ts desc");
		
		List<TPasswordHist> recList = tPasswordHistMapper.selectByExample(tpHistCondi);
		
        List<PasswordHisDto> result = recList.stream()
                .map(UserViewService::convertToPasswordHisDto)
                .collect(Collectors.toList());
		
        //List<MgpCodeMst> selectByExample(MgpCodeMstExample example);
        MgpCodeMstExample gpCodeCondi = new MgpCodeMstExample();
        gpCodeCondi.createCriteria().andClassCodeEqualTo(MmsConstants.MST_CODE_CATEGORY_01013);
        
        List<MgpCodeMst> codeList = mgpCodeMstMapper.selectByExample(gpCodeCondi);
        
        for (PasswordHisDto dto : result) {
            dto.setOpName(getOpName(codeList,dto.getOpName()));
        }
        
		return result;
	}
	

    /**
     * 操作名を取得
     * @param codeList
     * @param opName
     * @return
     */
    private String getOpName(List<MgpCodeMst> codeList, String opName) {
    	for (MgpCodeMst dto : codeList) {
    		if(opName.equals(dto.getValue1())) {
    			return dto.getValue2();
    		}
    	}
		return null;
	}


    /**
     * TPasswordHistをPasswordHisDtoに変換するメソッド
     * @param tPasswordHist
     * @return
     */
    private static PasswordHisDto convertToPasswordHisDto(TPasswordHist tPasswordHist) {
        // 適切な変換ロジックをここに実装
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        PasswordHisDto passwordHisDto = new PasswordHisDto();
        passwordHisDto.setChgDt(sdf.format(tPasswordHist.getPasswordUpdateTs()));
        passwordHisDto.setOpName(tPasswordHist.getOpeId());

        return passwordHisDto;
    }



	/**
	 * JasperReportを使用してPDFを生成するロジックを実装
	 * @param userIdList 
	 * @return
	 * @throws JRException 
	 * @throws IOException 
	 */
	public byte[] generateUserReportPdfBytes(List<String> userIdList) throws JRException, IOException {

		if(userIdList == null || userIdList.isEmpty()) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 パスワード初期化処理", "ユーザIDリストが設定されていないため、帳票を作成できません。" );
			return (new byte[0]);
		}
		//PDFテンプレート
		MgpCodeMstKey codeKey = new MgpCodeMstKey();
			
		codeKey.setClassCode(MmsConstants.MST_CODE_CATEGORY_01016);
		codeKey.setCodeValue(MmsConstants.MST_CODE_VLAUE_00001);
		
		MgpCodeMst codeMst = mgpCodeMstMapper.selectByPrimaryKey(codeKey);
		
		String pdfTemplatePath = codeMst.getValue1();
        // 現在の日付を取得
        Date currentDate = new Date();

        // SimpleDateFormatを使用してフォーマット指定
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        // フォーマット適用して文字列に変換
        String formattedDate = sdf.format(currentDate);
        
		JasperPrint jasperPrint = getJasperPrint(pdfTemplatePath, formattedDate, userIdList.get(0));

		//操作ログを登録
		commonService.insOpelog(MmsConstants.FUNC_ID_1000, MmsConstants.FUNC_ID_1000_LABEL, userIdList.get(0), "ユーザの帳票を出力しました。");
		for(int pos = 1; pos < userIdList.size(); pos ++) {
			JasperPrint jasperPrintAdd = getJasperPrint(pdfTemplatePath, formattedDate, userIdList.get(pos));
			// 追加する帳票をメイン帳票に追加
			List<JRPrintPage> maxpage_pages = jasperPrintAdd.getPages();
			for(JRPrintPage maxpage_page : maxpage_pages ){
				jasperPrint.addPage(maxpage_page);
			}
			commonService.insOpelog(MmsConstants.FUNC_ID_1000, MmsConstants.FUNC_ID_1000_LABEL, userIdList.get(pos), "ユーザの帳票を出力しました。");
		}
		// PDFに出力

//		OutputStream pdfOut = new FileOutputStream("C:\\work\\aaa.pdf");
//		JasperExportManager.exportReportToPdfStream(jasperPrint, pdfOut);
		//JasperExportManager.exportReportToPdfFile(jasperPrint);
		byte[] result = JasperExportManager.exportReportToPdf(jasperPrint);

		return result;
	}



	/**
	 * @param pdfTemplatePath
	 * @param sysDt 
	 * @param string
	 * @return
	 * @throws FileNotFoundException 
	 * @throws JRException 
	 */
	private JasperPrint getJasperPrint(String pdfTemplatePath, String sysDt, String userId) throws FileNotFoundException, JRException {

		Map<String, Object> data = new HashMap<String, Object>();
		Map<String, Object> parameters = new HashMap<>();
		List<Map<String, ? >> dataList = new ArrayList<Map<String, ? >>();

		data.put("ID", userId);
		data.put("年月日", sysDt);
		data.put("パスワード", getCurrentPassword(userId));
		dataList.add(data);

		JRMapCollectionDataSource dataSource = new JRMapCollectionDataSource(
				dataList);
		InputStream template = new FileInputStream(pdfTemplatePath);
		// テンプレートファイルをコンパイル
		JasperReport report = JasperCompileManager.compileReport(template);
		JasperPrint jasperPrint = JasperFillManager.fillReport(report,
			parameters, dataSource);

		return jasperPrint;
	}



	/**
	 * ユーザの現在パスワードを取得
	 * @param userId
	 * @return
	 */
	public String getCurrentPassword(String userId) {
		MPassword pass = mPasswordMapper.selectByPrimaryKey(userId);

		//パスワード暗号用共通鍵
        List<PulldownItemDto> codeList = commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01008);
		String encKey = (String)codeList.get(1).getValue();
		
		return databaseService.getString("select f_decrypt('%s','%s')".formatted(pass.getCurrPassword(), encKey));
	}



	/**
	 * 汎用コードマスタに定義したPDFファイル名を取得
	 * @return
	 */
	public String getPdfFileName() {

		//PDFテンプレート
		MgpCodeMstKey codeKey = new MgpCodeMstKey();
			
		codeKey.setClassCode(MmsConstants.MST_CODE_CATEGORY_01017);
		codeKey.setCodeValue(MmsConstants.MST_CODE_VLAUE_00001);
		
		MgpCodeMst codeMst = mgpCodeMstMapper.selectByPrimaryKey(codeKey);
		if(codeMst == null) {
			return "";
		}

		SimpleDateFormat dateFormat = new SimpleDateFormat(codeMst.getValue2());
		
		return codeMst.getValue1() + dateFormat.format( new Date()) + "." + codeMst.getValue3();
	}

	/**
	 * 反映日＝システム基準日の場合、実行契機ファイルを出力する
	 * @param form
	 * @throws IOException 
	 */
	private void crtTriggerFile() throws  IOException {

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

}
