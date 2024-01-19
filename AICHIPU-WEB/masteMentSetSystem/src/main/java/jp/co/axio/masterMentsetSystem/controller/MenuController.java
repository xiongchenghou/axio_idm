package jp.co.axio.masterMentsetSystem.controller;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import jakarta.servlet.http.HttpSession;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.service.DatabaseService;

/**
 * 利用者テスト検索画面処理
 *
 * @author sa
 *
 */
@Controller
public class MenuController {

	/**
	 * 自処理名
	 */
	private static final String OWN_NAME = "MenuController";
	/**
	 * 自画面のHTMLテンプレート
	 */
	private static final String OWN_PAGE = "menu";
	/**
	 * 自処理対象画面名
	 */
	private static final String OWN_TITLE = "メニュー画面";
	/**
	 * メッセージソース
	 */
	@Autowired
	MessageSource ms;
	/**
	 * セッション
	 */
	@Autowired
	HttpSession session;
	/**
	 * ログインコントローラ
	 */
	@Autowired
	LoginController loginController;

    @Autowired
    DatabaseService databaseService;

	/**
	 * 初期表示
	 * @param redirectAttributes リダイレクト先に値を引き渡すためのModel
	 * @return ModelAndView
	 */
	@GetMapping("/menu")
	public ModelAndView index(RedirectAttributes redirectAttributes) {
		LogService.info(OWN_TITLE, OWN_NAME, "初期処理", "開始");
		// ログインチェックここから
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
		// ログインチェックここまで
		try {
			// ログイン情報以外のsession削除
			Collections.list(session.getAttributeNames()).stream().forEach(e -> {
				if (!"LoginController.loginInfo".equals(e)) {// ログイン情報以外
					session.removeAttribute(e);// 削除
				}
			});
			LogService.info(OWN_TITLE, OWN_NAME, "初期処理", "正常終了");
		} catch (Exception e) {
			LogService.system(OWN_TITLE, OWN_NAME, "初期処理", "失敗した");
			LogService.system(ExceptionUtils.getStackTrace(e));
			String msg = ms.getMessage("ERR001", null, null);
			modelAndView.addObject("errMessage", msg);
			LogService.info(OWN_TITLE, OWN_NAME, "初期処理", "··異常終了");
		}

		// Hinemos 及び、SIME のURLは、汎用コードマスタより取得したURLを設定する。
		{
			//modelAndView.addObject("urlHinemos", "http://172.31.160.63:60000/");
			//modelAndView.addObject("urlIdm", "https://172.31.160.61/sesiossadmin");

			{
		    	List<Map<String, Object>> mstCodeJob = databaseService.executeSqlQuery("select * from m_gp_code_mst where class_code = '01023' and code_value='00001'");
		    	if(mstCodeJob.size() == 0) {
		    		LogService.system(OWN_TITLE, this.getClass().getSimpleName(), "管理者メニュー", "汎用コードマスタに、ジョブ管理のURL情報がありません。" );
		    	}
		    	String urlJob = mstCodeJob.get(0).get("value_1").toString();
				modelAndView.addObject("urlHinemos", urlJob);
			}
			{
		    	List<Map<String, Object>> mstCodeIdm = databaseService.executeSqlQuery("select * from m_gp_code_mst where class_code = '01023' and code_value='00002'");
		    	if(mstCodeIdm.size() == 0) {
		    		LogService.system(OWN_TITLE, this.getClass().getSimpleName(), "管理者メニュー", "汎用コードマスタに、IDM管理のURL情報がありません。" );
		    	}
		    	String urlIdm = mstCodeIdm.get(0).get("value_1").toString();
				modelAndView.addObject("urlIdm", urlIdm);
			}
		}
		// Hinemos 及び、SIME のURLは、汎用コードマスタより取得したURLを設定する。

		modelAndView.setViewName(OWN_PAGE);
		return modelAndView;
	}
}
