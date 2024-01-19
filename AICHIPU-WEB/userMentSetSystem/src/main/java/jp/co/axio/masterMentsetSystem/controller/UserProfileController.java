package jp.co.axio.masterMentsetSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.common.MmsConstants;
import jp.co.axio.masterMentsetSystem.dto.PasswordHisDto;
import jp.co.axio.masterMentsetSystem.service.AddOnService;
import jp.co.axio.masterMentsetSystem.service.CommonService;
import jp.co.axio.masterMentsetSystem.service.DatabaseService;
import jp.co.axio.masterMentsetSystem.service.UserViewService;

/**
 * ユーザー詳細画面
 *
 * @author axio
 * @version 1.0
 */
@Controller
public class UserProfileController extends accessController {

    /** 自画面のHTMLテンプレート */
    private static final String OWN_PAGE = "UserSet/profile";

    /** リダイレクトページ */
    private static final String REDIRECT_PAGE = "redirect:./menu";

    /** 自画面のタイトル */
    public static final String OWN_TITLE = "プロフィール確認";

	/** 検索画面URL */
	private static final String SEARCH_PAGE = "redirect:./search";

	/** ログインコントローラ */
	@Autowired
	LoginController loginController;

	@Autowired
	CommonService commonService;
	
	@Autowired
	UserViewService userViewService;
	
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
    public UserProfileController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
    
	/**
	 * 初期処理
	 *
	 * @param form フォーム情報
	 * @return ModelAndView
	 */
    @RequestMapping(value = "/userProfile", method = RequestMethod.GET)
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
		UserRegistForm form = userViewService.getUserDetail(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId(), "0");

		if (form == null) {
			//利用者情報が存在しないため、検索画面へ戻る
			modelAndView.setViewName(SEARCH_PAGE);
			return modelAndView;
		}
		
		//パスワード履歴を取得
		List<PasswordHisDto> pwdHisList = userViewService.getPasswordHisList(((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getUserId());
		modelAndView.addObject(form.getClass().getSimpleName(), form);
		if(pwdHisList.size() > 0) {
			modelAndView.addObject("lastUpdPwdDt", pwdHisList.get(0).getChgDt().replace("-", "/"));
		}else {
			modelAndView.addObject("lastUpdPwdDt", "");
		}

		//アプリ表示定義
		modelAndView.addObject("mgpCodeAppList", commonService.getMgpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01006));
		//その他項目表示定義
		modelAndView.addObject("mgpCodeOtherItemList", commonService.getMgpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01020));
		modelAndView.setViewName(OWN_PAGE + ((LoginInfo)session.getAttribute(MmsConstants.SESSION_KEY_LOGIN_INFO)).getSelLang());
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "初期表示処理", "正常終了");

		return modelAndView;
	}
    
	
}
