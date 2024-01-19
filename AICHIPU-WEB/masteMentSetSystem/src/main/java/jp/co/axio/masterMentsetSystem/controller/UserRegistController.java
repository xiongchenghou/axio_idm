package jp.co.axio.masterMentsetSystem.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.common.MmsConstants;
import jp.co.axio.masterMentsetSystem.dto.AjaxResultDto;
import jp.co.axio.masterMentsetSystem.model.TUserSubEntity;
import jp.co.axio.masterMentsetSystem.model.TUserSystemSubEntity;
import jp.co.axio.masterMentsetSystem.service.CommonService;
import jp.co.axio.masterMentsetSystem.service.DatabaseService;
import jp.co.axio.masterMentsetSystem.service.AddOnService;
import jp.co.axio.masterMentsetSystem.service.UserRegistService;
import jp.co.axio.masterMentsetSystem.service.UserViewService;

/**
 * ユーザー登録画面
 *
 * @author axio
 * @version 1.0
 */
@Controller
public class UserRegistController extends accessController {

    /** 自画面のHTMLテンプレート */
    private static final String OWN_PAGE = "UserSet/userRegist";

    /** リダイレクトページ */
    private static final String REDIRECT_PAGE = "redirect:./userRegist";

    /** 自画面のタイトル */
    public static final String OWN_TITLE = "利用者管理機能：利用者登録";


	/** ログインコントローラ */
	@Autowired
	LoginController loginController;

	@Autowired
	CommonService commonService;
	
	@Autowired
	UserViewService userViewService;
	
	@Autowired
	UserRegistService userRegistService;
	
	@Autowired
	AddOnService userRegistAichiService;
	
    @Autowired
    MessageSource ms;

	// セッション
	@Autowired
	HttpSession session;
	
	/**
	 * メッセージソース
	 */
	@Autowired
	MessageSource messageSource;

    private final DatabaseService databaseService;
    
    @Autowired
    public UserRegistController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
    
	/**
	 * 初期処理(新規登録)
	 *
	 * @param form フォーム情報
	 * @return ModelAndView
	 */
	@RequestMapping("/userRegist")
	public ModelAndView init(@ModelAttribute("UserRegistForm") UserRegistForm form, RedirectAttributes redirectAttributes) {
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 初期表示処理", "開始");

		ModelAndView modelAndView = loginController.checkLogin(OWN_TITLE, redirectAttributes);

		if (modelAndView != null) {
			return modelAndView;// ログイン画面へ遷移
		} else {
			// 2022/06/22　権限チェック追加
			modelAndView = loginController.checkAdmin(OWN_TITLE, redirectAttributes);
			if (modelAndView != null) {
				return modelAndView;// ログイン画面へ遷移
			} else {
				modelAndView = new ModelAndView();
			}
		}

		resetValue(form);

		modelAndView.addObject(form.getClass().getSimpleName(), form);
		modelAndView.addObject("pageTitle", "利用者情報画面");
		modelAndView.addObject("pageTitle2", "　利用者情報管理 - 新規登録");
		modelAndView.addObject("showUserInitBtn", true);
		//画面区分、「new」の場合、ユーザIDのユニックチェックを実施する
		modelAndView.addObject("pageDiv", "new");
		//アプリ表示定義
		modelAndView.addObject("mgpCodeAppList", commonService.getMgpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01006));
		//その他項目表示定義
		modelAndView.addObject("mgpCodeOtherItemList", commonService.getMgpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01020));
		
		
		modelAndView.setViewName(OWN_PAGE);
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 初期表示処理", "正常終了");

		return modelAndView;
	}
	/**
	 * 初期処理(編集)
	 *
	 * @param form フォーム情報
	 * @return ModelAndView
	 */
    @RequestMapping(value = "/userEdit", method = RequestMethod.POST)
	public ModelAndView userEdit(@RequestParam("userId") String userId
			,@RequestParam("subFlag") String subFlag
			,@RequestParam("showReserveMsg") String showReserveMsg
			, RedirectAttributes redirectAttributes) {
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者編集画面 初期表示処理", "開始");
		
		ModelAndView modelAndView = loginController.checkLogin(OWN_TITLE, redirectAttributes);
		
		if (modelAndView != null) {
			return modelAndView;// ログイン画面へ遷移
		} else {
			// 2022/06/22　権限チェック追加
			modelAndView = loginController.checkAdmin(OWN_TITLE, redirectAttributes);
			if (modelAndView != null) {
				return modelAndView;// ログイン画面へ遷移
			} else {
				modelAndView = new ModelAndView();
			}
		}

		//ユーザ情報を取得
		UserRegistForm form = userViewService.getUserDetail(userId, subFlag);
		
		modelAndView.addObject(form.getClass().getSimpleName(), form);
		modelAndView.addObject("pageTitle", "利用者情報編集");
		modelAndView.addObject("pageTitle2", "　利用者情報管理 - 設定変更");
		modelAndView.addObject("showUserInitBtn", false);
		//設定画面にメッセージ「反映待ちの情報を編集しています。」の表示フラグ
		modelAndView.addObject("showReserveMsg", "1".equals(showReserveMsg));
		if("1".equals(showReserveMsg)) {
			modelAndView.addObject("pageTitle2", "　利用者情報管理 - 反映待ち情報編集");
		}
		//Subテーブルより検索するかのパラメータ、「取り消し」ボタンの表示フラグ、
		modelAndView.addObject("subFlag", "1".equals(subFlag));
		//画面区分、「edit」の場合、ユーザIDのユニックチェックを実施しない
		modelAndView.addObject("pageDiv", "edit");
		//アプリ表示定義
		modelAndView.addObject("mgpCodeAppList", commonService.getMgpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01006));
		//その他項目表示定義
		modelAndView.addObject("mgpCodeOtherItemList", commonService.getMgpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01020));
		
		
		modelAndView.setViewName(OWN_PAGE);
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者編集画面 初期表示処理", "正常終了");
		
		return modelAndView;
	}
	
	/**

 	 * 保存有効性チェック
	 *
	 * @param form フォーム情報
	 * @return ModelAndView
	 */
	@PostMapping("/userRegitSavePreCheck")
	@ResponseBody
	public AjaxResultDto userRegitSavePreCheck(@RequestBody UserRegistForm form, RedirectAttributes redirectAttributes) {
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存の有効性チェック処理", "開始");
		
		AjaxResultDto resultDto = new AjaxResultDto();
		
		ModelAndView modelAndView = loginController.checkLogin(OWN_TITLE, redirectAttributes);
		
		if (modelAndView != null) {
			resultDto.setChkResult(messageSource.getMessage(MmsConstants.MSG_CMN0012, null,null));
			return resultDto;// ログイン画面へ遷移
		} else {
			modelAndView = loginController.checkAdmin(OWN_TITLE, redirectAttributes);
			if (modelAndView != null) {
				// 2022/06/22　権限チェック追加
				resultDto.setChkResult(messageSource.getMessage(MmsConstants.MSG_CMN0011, null,null));
				return resultDto;// ログイン画面へ遷移
			}
		}
		
		//削除以外のユーザIDに存在したら、エラー
		List<Map<String, Object>> dbRes = databaseService.executeSqlQuery("select count(*) cn from v_user_id where user_id = '" + form.getRiYouShaId() + "'");
		if((Long)dbRes.get(0).get("cn") > 0) {
			resultDto.setChkResult(messageSource.getMessage(MmsConstants.MSG_MSTO00111001, null,null));
			return resultDto;// エラーメッセージを返す
			
		}
		
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存の有効性チェック処理", "正常終了");
		
		return resultDto;
	}
	
	/**
	 * 保存
	 *
	 * @param form フォーム情報
	 * @return ModelAndView
	 * @throws ParseException 
	 * @throws IOException 
	 */
	@PostMapping("/userRegitSave")
	@ResponseBody
	@Transactional
	public AjaxResultDto userRegitSave(@RequestBody UserRegistForm form, RedirectAttributes redirectAttributes) throws ParseException, IOException {
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理", "開始");
		
		AjaxResultDto resultDto = new AjaxResultDto();
		
		ModelAndView modelAndView = loginController.checkLogin(OWN_TITLE, redirectAttributes);
		
		if (modelAndView != null) {
			resultDto.setChkResult(messageSource.getMessage(MmsConstants.MSG_CMN0012, null,null));
			return resultDto;// ログイン画面へ遷移
		} else {
			modelAndView = loginController.checkAdmin(OWN_TITLE, redirectAttributes);
			if (modelAndView != null) {
				// 2022/06/22　権限チェック追加
				resultDto.setChkResult(messageSource.getMessage(MmsConstants.MSG_CMN0011, null,null));
				return resultDto;// ログイン画面へ遷移
			}
		}
		
		
		
		//ユーザ予約 データ作成
		TUserSubEntity tuse = userRegistAichiService.crtTUserSubEntity(form);
		
		//ユーザシステム利用予約　データ作成
		TUserSystemSubEntity tusse = userRegistAichiService.crtTUserSystemSubEntity(form);
		
		userRegistService.setUpdateTs();
		//ユーザ予約 データ保存
		userRegistService.saveTUserSubEntity(tuse);
		
		//ユーザシステム利用予約　データ保存
		userRegistService.saveTUserSystemSubEntity(tusse);
		
		
		// 反映日＝システム基準日の場合、
		//3)	SQL「SQL-xx-I-03　ユーザマスタ登録」にて、ユーザマスタに登録する
		//4)	SQL「SQL-xx-I-04　ユーザ所属会社登録」にて、ユーザ所属会社に登録する
		//5)	SQL「SQL-xx-I-05　ユーザ所属組織登録」にて、ユーザ所属組織に登録する
		//6)	SQL「SQL-xx-I-06　ユーザ拡張登録」にて、ユーザ拡張に登録する
		//7)	SQL「SQL-xx-I-07　ユーザシステム利用マスタ登録」にて、ユーザシステム利用マスタに登録する
		//8)	SQL「SQL-xx-I-08　ユーザパスワード登録」にて、ユーザパスワードに登録する
		//9)	SQL「SQL-xx-I-09　パスワード履歴登録」にて、パスワード履歴に登録する


		userRegistService.saveToMaster(form, tuse, tusse);
		
		//反映日＝システム基準日の場合、実行契機ファイルを出力する
		userRegistService.crtTriggerFile(form);
		
		//操作ログへ登録を行う
		userRegistService.regOpLog(form);
		
		
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者新規登録画面 保存処理", "正常終了");
		
		return resultDto;
	}
	/**
	 * 取り消し
	 *
	 * @param form フォーム情報
	 * @return ModelAndView
	 * @throws ParseException 
	 * @throws IOException 
	 */
	@PostMapping("/userCancel")
	@ResponseBody
	@Transactional
	public AjaxResultDto userCancel(@RequestBody UserRegistForm form, RedirectAttributes redirectAttributes) throws ParseException, IOException {
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者設定変更画面 取り消し処理", "開始");
		
		AjaxResultDto resultDto = new AjaxResultDto();
		
		ModelAndView modelAndView = loginController.checkLogin(OWN_TITLE, redirectAttributes);
		
		if (modelAndView != null) {
			resultDto.setChkResult(messageSource.getMessage(MmsConstants.MSG_CMN0012, null,null));
			return resultDto;// ログイン画面へ遷移
		} else {
			modelAndView = loginController.checkAdmin(OWN_TITLE, redirectAttributes);
			if (modelAndView != null) {
				// 2022/06/22　権限チェック追加
				resultDto.setChkResult(messageSource.getMessage(MmsConstants.MSG_CMN0011, null,null));
				return resultDto;// ログイン画面へ遷移
			}
		}

		userRegistService.setUpdateTs();
		//ユーザ取り消し処理
		userRegistService.userCancel(form);
		
		//操作ログへ登録を行う
		userRegistService.regOpLogUserCancel(form);
		
		
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者設定変更画面 取り消し処理", "正常終了");
		
		return resultDto;
	}


	/**
	 * フォーム情報初期化
	 *
	 * @param form フォーム情報
	 */
	private void resetValue(UserRegistForm form) {
		//form = new UserRegistForm();
		// 日付のフォーマットを指定
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date criterion_dt = commonService.getSysCriterionDt();
		// 反映日
		form.setHanEiDt(dateFormat.format(criterion_dt)); 
		// 利用者区分
		form.setRiYouShaDiv(""); 
		// 利用者区分プルダウン
		form.setRiYouShaDivList(commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_00003)); 
		// 利用者ID
		form.setRiYouShaId(""); 
		// 学籍番号・教職員番号
		form.setGakuSekiBn(""); 
		// 姓（漢字）
		form.setSeiJp(""); 
		// 名（漢字）
		form.setMeiJp(""); 
		// 姓（英字）
		form.setSeiEn(""); 
		// 名（英字）
		form.setMeiEn(""); 
		// キャンパス
		form.setCampus(""); 
		// キャンパスプルダウン
		form.setCampusList(commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01007)); 
		// 所属
		form.setShoZoku(""); 
		// 所属プルダウン
		form.setShoZokuList(commonService.getOrgList(MmsConstants.COMPANY_CODE_COLLEGE)); 
		// メールアドレス
		form.setMailAddr(""); 
		// 入学年度
		form.setNyuGakuNendo(""); 
		// 開始日
		form.setValidateStartDt(dateFormat.format(criterion_dt)); 
		// 終了日
		form.setValidateEndDt("2999-12-31"); 
		// 利用アプリケーション１
		form.setUseApp01(false); 
		// 利用アプリケーション２
		form.setUseApp02(false); 
		// 利用アプリケーション３
		form.setUseApp03(false); 
		// 利用アプリケーション４
		form.setUseApp04(false); 
		// 利用アプリケーション５
		form.setUseApp05(false); 
		// 利用アプリケーション６
		form.setUseApp06(false); 
		// 利用アプリケーション７
		form.setUseApp07(false); 
		// 利用アプリケーション８
		form.setUseApp08(false); 
		// 利用アプリケーション９
		form.setUseApp09(false); 
		// 利用アプリケーション１０
		form.setUseApp10(false); 
		// 利用アプリケーション１１
		form.setUseApp11(false); 
		// 利用アプリケーション１２
		form.setUseApp12(false); 
		// 利用アプリケーション１３
		form.setUseApp13(false); 
		// 利用アプリケーション１４
		form.setUseApp14(false); 
		// 利用アプリケーション１５
		form.setUseApp15(false); 
		// 利用アプリケーション１６
		form.setUseApp16(false); 
		// 利用アプリケーション１７
		form.setUseApp17(false); 
		// 利用アプリケーション１８
		form.setUseApp18(false); 
		// 利用アプリケーション１９
		form.setUseApp19(false); 
		// 利用アプリケーション２０
		form.setUseApp20(false); 
		// その他項目１
		form.setOtherItem01(""); 
		// その他項目２
		form.setOtherItem02(""); 
		// その他項目３
		form.setOtherItem03(""); 
		// その他項目４
		form.setOtherItem04(""); 
		// その他項目５
		form.setOtherItem05(""); 
		// その他項目６
		form.setOtherItem06(""); 
		// その他項目７
		form.setOtherItem07(""); 
		// その他項目８
		form.setOtherItem08(""); 
		// その他項目９
		form.setOtherItem09(""); 
		// その他項目１０
		form.setOtherItem10(""); 
		// その他項目１１
		form.setOtherItem11(""); 
		// その他項目１２
		form.setOtherItem12(""); 
		// その他項目１３
		form.setOtherItem13(""); 
		// その他項目１４
		form.setOtherItem14(""); 
		// その他項目１５
		form.setOtherItem15(""); 
		// その他項目１６
		form.setOtherItem16(""); 
		// その他項目１７
		form.setOtherItem17(""); 
		// その他項目１８
		form.setOtherItem18(""); 
		// その他項目１９
		form.setOtherItem19(""); 
		// その他項目２０
		form.setOtherItem20(""); 
		// その他項目２１
		form.setOtherItem21(""); 
		// その他項目２２
		form.setOtherItem22(""); 
		// その他項目２３
		form.setOtherItem23(""); 
		// その他項目２４
		form.setOtherItem24(""); 
		// その他項目２５
		form.setOtherItem25(""); 
		// その他項目２６
		form.setOtherItem26(""); 
		// その他項目２７
		form.setOtherItem27(""); 
		// その他項目２８
		form.setOtherItem28(""); 
		// その他項目２９
		form.setOtherItem29(""); 
		// その他項目３０
		form.setOtherItem30(""); 
		// その他項目３１
		form.setOtherItem31(""); 
		// その他項目３２
		form.setOtherItem32(""); 
		// その他項目３３
		form.setOtherItem33(""); 
		// その他項目３４
		form.setOtherItem34(""); 
		// その他項目３５
		form.setOtherItem35(""); 
		// その他項目３６
		form.setOtherItem36(""); 
		// その他項目３７
		form.setOtherItem37(""); 
		// その他項目３８
		form.setOtherItem38(""); 
		// その他項目３９
		form.setOtherItem39(""); 
		// その他項目４０
		form.setOtherItem40(""); 

	}
}
