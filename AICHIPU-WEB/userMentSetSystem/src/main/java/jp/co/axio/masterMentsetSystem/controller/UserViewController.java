package jp.co.axio.masterMentsetSystem.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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
import jp.co.axio.masterMentsetSystem.dto.PasswordHisDto;
import jp.co.axio.masterMentsetSystem.dto.AjaxResultDto;
import jp.co.axio.masterMentsetSystem.service.CommonService;
import jp.co.axio.masterMentsetSystem.service.DatabaseService;
import jp.co.axio.masterMentsetSystem.service.AddOnService;
import jp.co.axio.masterMentsetSystem.service.UserViewService;
import net.sf.jasperreports.engine.JRException;

/**
 * ユーザー詳細画面
 *
 * @author axio
 * @version 1.0
 */
@Controller
public class UserViewController extends accessController {

    /** 自画面のHTMLテンプレート */
    private static final String OWN_PAGE = "UserSet/userView";

    /** リダイレクトページ */
    private static final String REDIRECT_PAGE = "redirect:./userView";

    /** 自画面のタイトル */
    public static final String OWN_TITLE = "利用者管理機能：利用者詳細";

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
    public UserViewController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
    
	/**
	 * 初期処理
	 *
	 * @param form フォーム情報
	 * @return ModelAndView
	 */
//    @RequestMapping(value = "/userView", method = RequestMethod.POST)
	public ModelAndView init(@RequestParam("userId") String userId, RedirectAttributes redirectAttributes) {
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 初期表示処理", "開始");

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
		UserRegistForm form = userViewService.getUserDetail(userId, "0");

		if (form == null) {
			//利用者情報が存在しないため、検索画面へ戻る
			modelAndView.setViewName(SEARCH_PAGE);
			return modelAndView;
		}
		
		//パスワード履歴を取得
		List<PasswordHisDto> pwdHisList = userViewService.getPasswordHisList(userId);
		modelAndView.addObject(form.getClass().getSimpleName(), form);
		modelAndView.addObject("pwdHisList", pwdHisList);

		//アプリ表示定義
		modelAndView.addObject("mgpCodeAppList", commonService.getMgpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01006));
		//その他項目表示定義
		modelAndView.addObject("mgpCodeOtherItemList", commonService.getMgpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01020));
		modelAndView.setViewName(OWN_PAGE);
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 初期表示処理", "正常終了");

		return modelAndView;
	}
    /**
     * PDFファイル名を取得
     *
     * @param form フォーム情報
     * @return ModelAndView
     */
//    @RequestMapping(value = "/getPdfFileName", method = RequestMethod.POST)
	@ResponseBody
    public AjaxResultDto getPdfFileName() {
    	LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 PDFファイル名取得処理", "開始");
    	
    	AjaxResultDto result = new AjaxResultDto();
    	result.setChkResult(userViewService.getPdfFileName());
    	LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 PDFファイル名取得処理", "正常終了");
    	return result;
    }
    
    /**
     * 利用者情報削除、有効、パスワード初期化、ロック、ロック解除処理
     *
     * @param form フォーム情報
     * @return ModelAndView
     * @throws IOException 
     */
//	@PostMapping("/userDetailOp")
	@ResponseBody
	@Transactional
    public AjaxResultDto userDetailOp(@RequestBody UserRegistForm form, RedirectAttributes redirectAttributes) throws IOException {
		
		if(UserRegistForm.OPDIV_DEL.equals(form.getViewPageOpDiv())) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 利用者情報削除処理", "開始");
		}else if(UserRegistForm.OPDIV_UNDO_DEL.equals(form.getViewPageOpDiv())) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 利用者情報有効処理", "開始");
		}else if(UserRegistForm.OPDIV_INITPASSWORD.equals(form.getViewPageOpDiv())) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 パスワード初期化処理", "開始");
		}else if(UserRegistForm.OPDIV_LOCK.equals(form.getViewPageOpDiv())) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 ロック処理", "開始");
		}else if(UserRegistForm.OPDIV_UNLOCK.equals(form.getViewPageOpDiv())) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 ロック解除処理", "開始");
		}
    	
    	ModelAndView modelAndView = loginController.checkLogin(OWN_TITLE, redirectAttributes);

		AjaxResultDto resultDto = new AjaxResultDto();
    	if (modelAndView != null) {
			resultDto.setChkResult(messageSource.getMessage(MmsConstants.MSG_CMN0012, null,null));
    		return resultDto;// ログイン画面へ遷移
    	} else {
    		// 2022/06/22　権限チェック追加
    		modelAndView = loginController.checkAdmin(OWN_TITLE, redirectAttributes);
    		if (modelAndView != null) {
    			resultDto.setChkResult(messageSource.getMessage(MmsConstants.MSG_CMN0011, null,null));
    			return resultDto;// ログイン画面へ遷移
    		} else {
    			modelAndView = new ModelAndView();
    		}
    	}
    	
    	

    	if(UserRegistForm.OPDIV_DEL.equals(form.getViewPageOpDiv())) {
    		//利用者予約データが存在するかをチェック
    		if(userViewService.chkSubUserExists(form.getRiYouShaId())) {
    			//予約データが存在するため、削除できない
    			resultDto.setChkResult(messageSource.getMessage(MmsConstants.MSG_MSTO0016M0101, null,null));
    			return resultDto;// ログイン画面へ遷移
    		}
    		
    		//利用者情報を削除
    		userViewService.deleteUser(form.getRiYouShaId());
    	}else if(UserRegistForm.OPDIV_UNDO_DEL.equals(form.getViewPageOpDiv())) {
    		userViewService.undoDeleteUser(form.getRiYouShaId());
    	}else if(UserRegistForm.OPDIV_INITPASSWORD.equals(form.getViewPageOpDiv())) {
    		userViewService.userInitPassword(form.getRiYouShaId());
    	}else if(UserRegistForm.OPDIV_LOCK.equals(form.getViewPageOpDiv())) {
    		userViewService.userLock(form.getRiYouShaId());
    	}else if(UserRegistForm.OPDIV_UNLOCK.equals(form.getViewPageOpDiv())) {
    		userViewService.userUnLock(form.getRiYouShaId());
    	}
    	
		if(UserRegistForm.OPDIV_DEL.equals(form.getViewPageOpDiv())) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 利用者情報削除処理", "正常終了");
		}else if(UserRegistForm.OPDIV_UNDO_DEL.equals(form.getViewPageOpDiv())) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 利用者情報有効処理", "正常終了");
		}else if(UserRegistForm.OPDIV_INITPASSWORD.equals(form.getViewPageOpDiv())) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 パスワード初期化処理", "正常終了");
		}else if(UserRegistForm.OPDIV_LOCK.equals(form.getViewPageOpDiv())) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 ロック処理", "正常終了");
		}else if(UserRegistForm.OPDIV_UNLOCK.equals(form.getViewPageOpDiv())) {
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 ロック解除処理", "正常終了");
		}
    	return resultDto;
    }

//    @PostMapping("/userReportPdf")
    public ResponseEntity<byte[]> generatePdf(@RequestBody UserRegistForm form, RedirectAttributes redirectAttributes) throws JRException, IOException {
    	LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 帳票出力処理", "開始");

        // レスポンスとしてPDFデータを返す
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("inline", "report.pdf");
        
		ModelAndView modelAndView = loginController.checkLogin(OWN_TITLE, redirectAttributes);
		
		AjaxResultDto resultDto = new AjaxResultDto();
		if (modelAndView != null) {
			resultDto.setChkResult(messageSource.getMessage(MmsConstants.MSG_CMN0012, null,null));
			return new ResponseEntity<>((new byte[0]), headers, HttpStatus.BAD_REQUEST);// ログイン画面へ遷移
		} else {
			// 2022/06/22　権限チェック追加
			modelAndView = loginController.checkAdmin(OWN_TITLE, redirectAttributes);
			if (modelAndView != null) {
				resultDto.setChkResult(messageSource.getMessage(MmsConstants.MSG_CMN0011, null,null));
				return new ResponseEntity<>((new byte[0]), headers, HttpStatus.BAD_REQUEST);// ログイン画面へ遷移
			} else {
				modelAndView = new ModelAndView();
			}
		}
        // JasperReportを使用してPDFを生成するロジックを実装
		List<String> userIdList = new ArrayList<String>();
		userIdList.add(form.getRiYouShaId());
        byte[] pdfBytes = userViewService.generateUserReportPdfBytes(userIdList);


		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者詳細画面 帳票出力処理", "正常終了");
        return new ResponseEntity<>(pdfBytes, headers, HttpStatus.OK);
    }
	
}
