package jp.co.axio.masterMentsetSystem.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.common.MmsConstants;
import jp.co.axio.masterMentsetSystem.dto.AjaxResultDto;
import jp.co.axio.masterMentsetSystem.service.AdminService;
import jp.co.axio.masterMentsetSystem.service.CommonService;
import jp.co.axio.masterMentsetSystem.service.UserViewService;
import jp.co.axio.masterMentsetSystem.service.VUserSearchService;
import net.sf.jasperreports.engine.JRException;


/**
 * 帳票出力画面処理
 *
 * @author AXIO
 */
@Controller
@RestController
public class ReportController {

    /**
     * 自処理名
     */
    private static final String OWN_NAME = "ReportController";
    /**
     * 自画面のHTMLテンプレート
     */
    private final String OWN_PAGE = "Report/Report";
    /**
     * 自処理対象画面名
     */
    private static final String OWN_TITLE = "帳票出力画面";

    /**
     * 空白
     */
    private static final String BLANK = "";
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
     * Service
     */
    @Autowired
    AdminService adminService;
    /**
     * ログインコントローラ
     */
    @Autowired
    LoginController loginController;

    @Autowired
    CommonService commonService;


    @Autowired
    VUserSearchService vSearchUserService;

    @Autowired
    UserViewService userViewService;;

	/**
	 * メッセージソース
	 */
	@Autowired
	MessageSource messageSource;
	
    /**
     * 初期表示
     *
     * @param redirectAttributes リダイレクト先に値を引き渡すためのModel
     * @return ModelAndView
     */
    @RequestMapping("/report")
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
            Collections.list(session.getAttributeNames()).forEach(e -> {
                if (!"LoginController.loginInfo".equals(e)) {// ログイン情報以外
                    session.removeAttribute(e);// 削除
                }
            });
            //画面の初期化
            AdminForm form = adminService.initAdminForm();
            form.setReportPageFlg("1");
    		modelAndView.addObject(form.getClass().getSimpleName(), form);

            LogService.info(OWN_TITLE, OWN_NAME, "初期処理", "正常終了");
        } catch (Exception e) {
            LogService.system(OWN_TITLE, OWN_NAME, "初期処理", "失敗した");
            LogService.system(ExceptionUtils.getStackTrace(e));
            String msg = ms.getMessage("ERR001", null, null);
            modelAndView.addObject("errMessage", msg);
            LogService.info(OWN_TITLE, OWN_NAME, "初期処理", "··異常終了");
        }

        modelAndView.setViewName(OWN_PAGE);

        LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "初期処理", "正常終了");
        return modelAndView;
    }


	/**
 	 * 帳票出力
	 *
	 * @param form フォーム情報
	 * @return ModelAndView
	 * @throws IOException 
	 * @throws JRException 
	 */
	@PostMapping("/reportList")
    public ResponseEntity<byte[]> setAdmin(@RequestBody ReportListForm form, RedirectAttributes redirectAttributes) throws JRException, IOException {
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "帳票出力処理", "開始");
		
		AjaxResultDto resultDto = new AjaxResultDto();

        // レスポンスとしてPDFデータを返す
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("inline", "report.pdf");
		ModelAndView modelAndView = loginController.checkLogin(OWN_TITLE, redirectAttributes);
		
		if (modelAndView != null) {
			resultDto.setChkResult(messageSource.getMessage(MmsConstants.MSG_CMN0012, null,null));
			return new ResponseEntity<>((new byte[0]), headers, HttpStatus.BAD_REQUEST);// ログイン画面へ遷移
		} else {
			modelAndView = loginController.checkAdmin(OWN_TITLE, redirectAttributes);
			if (modelAndView != null) {
				// 2022/06/22　権限チェック追加
				resultDto.setChkResult(messageSource.getMessage(MmsConstants.MSG_CMN0011, null,null));
				return new ResponseEntity<>((new byte[0]), headers, HttpStatus.BAD_REQUEST);// ログイン画面へ遷移
			}
		}
        // JasperReportを使用してPDFを生成するロジックを実装
		List<String> userIdList = new ArrayList<>(Arrays.asList(form.getUserIds().split("\\$\\|\\$")));
        byte[] pdfBytes = userViewService.generateUserReportPdfBytes(userIdList);
		
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "帳票出力処理", "正常終了");
		
		return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
	}
	
    
}
