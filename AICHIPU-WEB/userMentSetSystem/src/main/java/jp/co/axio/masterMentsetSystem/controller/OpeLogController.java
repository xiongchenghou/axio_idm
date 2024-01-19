package jp.co.axio.masterMentsetSystem.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.service.CommonService;
import jp.co.axio.masterMentsetSystem.service.DatabaseService;
import jp.co.axio.masterMentsetSystem.service.OpelogService;
import jp.co.axio.masterMentsetSystem.service.AddOnService;
import jp.co.axio.masterMentsetSystem.service.UserViewService;

/**
 * 操作ログ画面
 *
 * @author axio
 * @version 1.0
 */
@Controller
@RestController
public class OpeLogController extends accessController {

    /** 自画面のHTMLテンプレート */
    private static final String OWN_PAGE = "OpeLog/OpeLogList.html";

    /** リダイレクトページ */
    private static final String REDIRECT_PAGE = "redirect:./log";

    /** 自画面のタイトル */
    public static final String OWN_TITLE = "操作ログ機能：一覧画面";

	/** 検索画面URL */
	private static final String SEARCH_PAGE = "redirect:./search";

	/** ログインコントローラ */
	@Autowired
	LoginController loginController;

	@Autowired
	CommonService commonService;
	
	@Autowired
	OpelogService opelogService;
	
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
    public OpeLogController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
    
	/**
	 * 初期処理
	 *
	 * @param form フォーム情報
	 * @return ModelAndView
	 */
//    @RequestMapping(value = "/log", method = RequestMethod.GET)
	public ModelAndView init(RedirectAttributes redirectAttributes) {
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "操作ログ画面 初期表示処理", "開始");

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

		OpelogForm form = opelogService.initOpelogForm();
		modelAndView.addObject(form.getClass().getSimpleName(), form);

		modelAndView.setViewName(OWN_PAGE);
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "操作ログ画面 初期表示処理", "正常終了");

		return modelAndView;
	}
    /**
     * 検索処理
     *
     * @param form フォーム情報
     * @return ModelAndView
     * @throws ParseException 
     */
//    @RequestMapping(value = "/logSearch", method = RequestMethod.POST)
    public List<Map<String,String>> logSearch(@RequestBody OpelogForm form, RedirectAttributes redirectAttributes) throws ParseException {
    	LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "操作ログ画面 検索処理", "開始");
    		
    	ModelAndView modelAndView = loginController.checkLogin(OWN_TITLE, redirectAttributes);
    	
    	if (modelAndView != null) {
    		return null;// ログイン画面へ遷移
    	} else {
    		// 2022/06/22　権限チェック追加
    		modelAndView = loginController.checkAdmin(OWN_TITLE, redirectAttributes);
    		if (modelAndView != null) {
    			return null;// ログイン画面へ遷移
    		} else {
    			modelAndView = new ModelAndView();
    		}
    	}
    	
    	List<Map<String,String>> result = opelogService.searchOpelog(form);
    	
    	
    	LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "操作ログ画面 検索処理", "正常終了");
    	
    	return result;
    }
    
	
}
