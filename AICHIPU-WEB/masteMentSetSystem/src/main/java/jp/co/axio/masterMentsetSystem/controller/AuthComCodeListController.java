package jp.co.axio.masterMentsetSystem.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import jakarta.servlet.http.HttpSession;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.controller.AuthComCodeListForm.SearchGroup;
import jp.co.axio.masterMentsetSystem.dto.AuthComCodeListDto;
import jp.co.axio.masterMentsetSystem.service.AuthComCodeListService;

/**
 * 会社コード一覧画面
 *
 * @author axio
 * @version 1.0
 */
@Controller
public class AuthComCodeListController extends accessController {

    /** 自画面のHTMLテンプレート */
    private static final String OWN_PAGE = "AuthCodeList/authComCodeList";

    /** 自画面のタイトル */
    public static final String OWN_TITLE = "会社コード一覧画面";

    /** パラメータcallParameterに格納されているデータのキー（会社コード） */
    public static final String CALL_PARAMETER_DATA_KEY = "companyCode";

	@Autowired
	AuthComCodeListService authComCodeListService;

    @Autowired
    MessageSource ms;

    @Autowired
    HttpSession session;

	/**
	 * 初期処理。
	 *
	 * @param requestParams - リクエストパラメータ（Map <String, String>）
	 * @return ModelAndView
	 */
	@RequestMapping("/authComCodeList")
    public ModelAndView index(@RequestParam Map <String, String> requestParams) {
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "初期処理", "開始");
		ModelAndView modelAndView = new ModelAndView();

		AuthComCodeListForm form = new AuthComCodeListForm();
		resetValue(form);
		if (requestParams != null) {
			if (requestParams.containsKey("callForm")) {
				if (requestParams.get("callForm") != null) form.setCallForm(requestParams.get("callForm"));
			}
			if (requestParams.containsKey("callParameter")) {
				if (requestParams.get("callParameter") != null) form.setCallParameter(requestParams.get("callParameter"));
			}
			if (requestParams.containsKey("callReturn")) {
				if (requestParams.get("callReturn") != null) form.setCallReturn(requestParams.get("callReturn"));
			}
		}

		// セッションのクリア
		session.removeAttribute(this.getClass().getSimpleName() + ".searchResultList");

		// 検索
	    try {
			List<Map<String, String>> selectedCodeMapList = decodeJson(form.getCallParameter());
	    	List<AuthComCodeListDto> list = authComCodeListService.selectMgpCodeMst(selectedCodeMapList
	    																			, selectedCodeMapList
	    																			, false
	    																			, form.getSearchCompanyCode()
	    																			, form.getSearchCompanyName());
			session.setAttribute(this.getClass().getSimpleName() + ".searchResultList", list);
	    	form.setSearchResultList(list);
		} catch (Exception e) {
			LogService.system(OWN_TITLE, this.getClass().getSimpleName(), "会社情報検索処理", "失敗した");
			LogService.system(ExceptionUtils.getStackTrace(e));
			form.setErrMessage(ms.getMessage("ERR001", null, null));
			modelAndView.addObject(form.getClass().getSimpleName(), form);
			modelAndView.setViewName(OWN_PAGE);
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "初期処理", "異常終了");
			return modelAndView;
		}

	    modelAndView.addObject(form.getClass().getSimpleName(), form);
		modelAndView.setViewName(OWN_PAGE);
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "初期処理", "正常終了");

		return modelAndView;
	}

	/**
	 * 検索処理。
	 *
	 * @param form - フォーム情報（AuthComCodeListForm）
	 * @param requestParams - リクエストパラメータ（Map <String, String>）
	 * @param result - バインド結果（BindingResult）
	 * @return 遷移先（String）
	 */
	@RequestMapping(path = "/authComCodeListSearch", method = RequestMethod.POST)
	public String search(@ModelAttribute("AuthComCodeListForm")  @Validated(SearchGroup.class) AuthComCodeListForm form,@RequestParam Map <String, String> requestParams, BindingResult result) {
		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "検索処理", "開始");
    	form.setSearchResultList(extractedSearchResultList());
		form.setErrMessage(null);

		// 検索
	    try {
			List<Map<String, String>> selectedCodeMapList = decodeJson(form.getCallParameter());
			List<Map<String, String>> checkedCodeMapList = decodeJson(form.getCheckedCodes());
	    	List<AuthComCodeListDto> list = authComCodeListService.selectMgpCodeMst(selectedCodeMapList
	    																			, checkedCodeMapList
	    																			, true
	    																			, form.getSearchCompanyCode()
	    																			, form.getSearchCompanyName());
	    	int ocnt = selectedCodeMapList==null?0:selectedCodeMapList.size();
	    	int scnt = list==null?0:list.size();
	    	if (scnt<=0) {
	    		//Data not found
	    		form.setErrMessage(ms.getMessage("MSTO0008M0001", null, null));
	    	} else if (scnt <= ocnt) {
	    		form.setErrMessage(ms.getMessage("MSTO0008M0002", null, null));
	    	}
			session.setAttribute(this.getClass().getSimpleName() + ".searchResultList", list);
	    	form.setSearchResultList(list);
		} catch (Exception e) {
			LogService.system(OWN_TITLE, this.getClass().getSimpleName(), "会社情報検索処理", "失敗した");
			LogService.system(ExceptionUtils.getStackTrace(e));
			form.setErrMessage(ms.getMessage("ERR001", null, null));
			LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "検索処理", "異常終了");
			return OWN_PAGE;
		}

		LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "検索処理", "正常終了");
		return OWN_PAGE;

	}

	/**
	 * セッション情報に保持した検索結果一覧を抽出する。
	 *
	 * @return 検索結果一覧（List<AuthComCodeListDto>）
	 */
	@SuppressWarnings("unchecked")
	private List<AuthComCodeListDto> extractedSearchResultList() {
		List<AuthComCodeListDto> list = null;
		try {
			if (session != null) {
				list = (List<AuthComCodeListDto>) session.getAttribute(this.getClass().getSimpleName() + ".searchResultList");
			}

		} catch (ClassCastException e) {
		}
		if (list == null) list = new ArrayList<AuthComCodeListDto>();

		return list;
	}

	/**
	 * フォーム情報を初期化する。
	 *
	 * @param form - フォーム情報（AuthPosCodeListForm）
	 */
	private void resetValue(AuthComCodeListForm form) {
		form.setCallForm("");
		form.setCallParameter("");
		form.setCallReturn("");
		form.setCheckedCodes("");
		form.setSearchCompanyCode("");
		form.setSearchCompanyName("");
		form.setSearchResultList(new ArrayList<AuthComCodeListDto>());
		form.setErrMessage(null);
	}

	/**
	 * JSON文字列をList<Map<String, String>>に変換する。
	 *
	 * @param jsonString - JSON文字列（String）
	 * @return List<Map<String, String>>
	 * @throws JsonMappingException
	 * @throws JsonProcessingException
	 */
	private List<Map<String, String>> decodeJson(String jsonString) throws JsonMappingException, JsonProcessingException {
		List<Map<String, String>> result = new ArrayList<Map<String, String>>();

		if (jsonString != null && jsonString.length() > 0) {
			try {
				ObjectMapper mapper = new ObjectMapper();
				result = mapper.readValue(jsonString, new TypeReference<List<Map<String, String>>>(){});
			} catch (JsonMappingException e) {
				throw e;
			} catch (JsonProcessingException e) {
				throw e;
			}
		}

		return result;
	}
}
