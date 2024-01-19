package jp.co.axio.masterMentsetSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.common.MmsConstants;
import jp.co.axio.masterMentsetSystem.dto.AjaxResultDto;
import jp.co.axio.masterMentsetSystem.service.AddOnService;
import jp.co.axio.masterMentsetSystem.service.ChgPwdService;
import jp.co.axio.masterMentsetSystem.service.CommonService;
import jp.co.axio.masterMentsetSystem.service.DatabaseService;

/**
 * パスワード変更画面
 *
 * @author axio
 * @version 1.0
 */
@Controller
public class ChgPwdController extends accessController {

    /** 自画面のHTMLテンプレート */
    private static final String OWN_PAGE = "UserSet/chgPwd";

    /** リダイレクトページ */
    private static final String REDIRECT_PAGE = "redirect:./menu";

    /** 自画面のタイトル */
    public static final String OWN_TITLE = "パスワード変更";

	/** 検索画面URL */
	private static final String SEARCH_PAGE = "redirect:./search";

	/** ログインコントローラ */
	@Autowired
	LoginController loginController;

	@Autowired
	CommonService commonService;

	@Autowired
	ChgPwdService chgPwdService;

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
    public ChgPwdController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

	/**
	 * 初期処理
	 *
	 * @param form フォーム情報
	 * @return ModelAndView
	 */
    @RequestMapping(value = "/chgPwd", method = RequestMethod.GET)
	public ModelAndView init(RedirectAttributes redirectAttributes) {
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "初期表示処理", "開始");

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
		ChgPwdForm form = new ChgPwdForm();

		form.setUserId(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId() );
		form.setLangDiv(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getSelLang() );

		modelAndView.addObject(form.getClass().getSimpleName(), form);

		modelAndView.setViewName(OWN_PAGE + ((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getSelLang());
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "初期表示処理", "正常終了");

		return modelAndView;
	}

	/**
 	 * 保存有効性チェック
	 *
	 * @param form フォーム情報
	 * @return ModelAndView
	 */
	@PostMapping("/chgPwdPreCheck")
	@ResponseBody
	public AjaxResultDto userRegitSavePreCheck(@RequestBody ChgPwdForm form, RedirectAttributes redirectAttributes) {
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "パスワード変更前の有効性チェック処理", "開始");

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
		form.setLangDiv(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getSelLang() );
		resultDto.setChkResult(chgPwdService.checkPwdValidate(form));

		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "パスワード変更前の有効性チェック処理", "正常終了");

		return resultDto;
	}

	/**
 	 * 保存
	 *
	 * @param form フォーム情報
	 * @return ModelAndView
	 */
	@PostMapping("/chgPwd")
	@ResponseBody
	public AjaxResultDto userRegitSave(@RequestBody ChgPwdForm form, RedirectAttributes redirectAttributes) {
		//LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "パスワード変更前の有効性チェック処理", "開始");
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "パスワード変更処理", "開始");

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
		form.setLangDiv(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getSelLang() );
		//resultDto.setChkResult(chgPwdService.checkPwdValidate(form));
		resultDto.setChkResult(chgPwdService.changePwd(form));

		//LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "パスワード変更前の有効性チェック処理", "正常終了");
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "パスワード変更処理", "正常終了");

		return resultDto;
	}


}
