package jp.co.axio.masterMentsetSystem.controller;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.CsvHeaderProperties;
import jp.co.axio.masterMentsetSystem.util.CSVUtils;
import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.common.MmsConstants;
import jp.co.axio.masterMentsetSystem.dto.UserSearchDto;
import jp.co.axio.masterMentsetSystem.model.VAdminMaintenanceEntity;
import jp.co.axio.masterMentsetSystem.model.VSearchUser;
import jp.co.axio.masterMentsetSystem.service.CommonService;
import jp.co.axio.masterMentsetSystem.service.UserViewService;
import jp.co.axio.masterMentsetSystem.service.VUserSearchService;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * 利用者情報管理-検索画面処理
 *
 * @author a004811
 */
@Controller
public class UserSearchController {

    /**
     * 自処理名
     */
    private static final String OWN_NAME = "UserSearchController";
    /**
     * 自画面のHTMLテンプレート
     */
    private final String OWN_PAGE = "UserSet/userSearch";

    /**
     * Login対象画面Form用のセッションキー
     */
    private static final String OWN_FORM_SESSION_KEY = "LoginController.loginInfo";
    /**
     * 自処理対象画面名
     */
    private static final String OWN_TITLE = "検索画面";

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
     * ログインコントローラ
     */
    @Autowired
    LoginController loginController;

    @Autowired
    CommonService commonService;

    @Autowired
    VUserSearchService vSearchUserService;

    @Autowired
    UserViewService userViewService;

    @Autowired
    CsvHeaderProperties csvHeaderProperties;

    /**
     * 初期表示
     *
     * @param redirectAttributes リダイレクト先に値を引き渡すためのModel
     * @return ModelAndView
     */
    @RequestMapping("/search")
    public ModelAndView index(@ModelAttribute("UserSearchForm") UserSearchForm form, RedirectAttributes redirectAttributes) {
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
            resetValue(form);
            UserSearchDto dto = new UserSearchDto();
            this.form2Dto(form, dto);
            List<VSearchUser> searchList = new ArrayList<VSearchUser>();
            searchList = vSearchUserService.getAll();
            modelAndView.addObject("searchList", searchList);

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


    @PostMapping("/searchUserList")
    @ResponseBody
    public List<VSearchUser> searchList(@RequestBody UserSearchForm form, RedirectAttributes redirectAttributes) {
        LogService.info("検索ボタン押下後", OWN_NAME, "検索処理", "正常開始");

        UserSearchDto dto = new UserSearchDto();
        this.form2Dto(form, dto);

        LogService.info("検索ボタン押下後", OWN_NAME, "検索処理", "正常終了");

        return vSearchUserService.list(dto);
    }

    /**
     * ユーザーロックリクエストを処理します。
     *
     * @param form               ユーザー検索フォーム
     * @param redirectAttributes リダイレクト属性
     * @throws Exception
     */
    @PostMapping("/userLock")
    @ResponseBody
    public ResponseEntity<String> userLock(@RequestBody UserSearchForm form, RedirectAttributes redirectAttributes) throws Exception {
        LogService.info("ユーザーロックボタン押下後", OWN_NAME, "ロック処理", "正常開始");

        String[] userIds = form.getUserId(); // UserSearchFormからユーザーIDの配列を取得

        // ユーザーIDの配列を繰り返し処理し、userViewServiceのuserLockメソッドを呼び出します
        for (String userId : userIds) {
            try {
                userViewService.userLock(userId); // userLockメソッドを呼び出し、userIdを渡す
            } catch (IOException e) {
                // 例外処理
                LogService.system(OWN_TITLE, OWN_NAME, "ロック処理", "ロック失敗しました。");
                LogService.system(ExceptionUtils.getStackTrace(e));
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("ロック処理失敗した");
            }
        }
        LogService.info("ユーザーロックボタン押下後", OWN_NAME, "ロック処理", "正常終了");
        return ResponseEntity.ok("ユーザーロック処理完了");
    }

    /**
     * ユーザーロック解除リクエストを処理します。
     *
     * @param form               ユーザー検索フォーム
     * @param redirectAttributes リダイレクト属性
     * @throws Exception
     */
    @PostMapping("/userUnlock")
    @ResponseBody
    public ResponseEntity<String> userUnlock(@RequestBody UserSearchForm form, RedirectAttributes redirectAttributes) throws Exception {
        LogService.info("ユーザーロック解除ボタン押下後", OWN_NAME, "ロック解除処理", "正常開始");

        String[] userIds = form.getUserId(); // UserSearchFormからユーザーIDの配列を取得

        // ユーザーIDの配列を繰り返し処理し、userViewServiceのuserLockメソッドを呼び出します
        for (String userId : userIds) {
            try {
                userViewService.userUnLock(userId); // userLockメソッドを呼び出し、userIdを渡す
            } catch (IOException e) {
                // 例外処理
                LogService.system(OWN_TITLE, OWN_NAME, "ロック解除処理", "ロック解除処理失敗した");
                LogService.system(ExceptionUtils.getStackTrace(e));
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("ロック解除処理失敗した");
            }
        }
        LogService.info("ユーザーロック解除ボタン押下後", OWN_NAME, "ロック解除処理", "正常終了");
        return ResponseEntity.ok("ユーザーロック解除処理完了");
    }

    /**
     * ユーザー有効リクエストを処理します。
     *
     * @param form               ユーザー検索フォーム
     * @param redirectAttributes リダイレクト属性
     * @throws Exception
     */
    @PostMapping("/userValid")
    @ResponseBody
    public ResponseEntity<String> userValid(@RequestBody UserSearchForm form, RedirectAttributes redirectAttributes) throws Exception {
        LogService.info("ユーザー有効ボタン押下後", OWN_NAME, "有効処理", "正常開始");

        String[] userIds = form.getUserId(); // UserSearchFormからユーザーIDの配列を取得

        // ユーザーIDの配列を繰り返し処理し、userViewServiceのXXXXXメソッドを呼び出します
        for (String userId : userIds) {
            userViewService.undoDeleteUser(userId); // userValidメソッドを呼び出し、userIdを渡す
        }
        LogService.info("ユーザー有効ボタン押下後", OWN_NAME, "有効処理", "正常終了");
        return ResponseEntity.ok("ユーザー有効化処理完了");
    }

    /**
     * ユーザー削除リクエストを処理します。
     *
     * @param form               ユーザー検索フォーム
     * @param redirectAttributes リダイレクト属性
     */
    @PostMapping("/userDoDelete")
    @ResponseBody
    public ResponseEntity<String> userDoDelete(@RequestBody UserSearchForm form, RedirectAttributes redirectAttributes) {
        LogService.info("ユーザー削除ボタン押下後", OWN_NAME, "削除処理", "正常開始");

        String[] userIds = form.getUserId(); // UserSearchFormからユーザーIDの配列を取得

        // ユーザーIDの配列を繰り返し処理し
        for (String userId : userIds) {
            userViewService.deleteUser(userId); // userLockメソッドを呼び出し、userIdを渡す
        }

        LogService.info("ユーザー削除ボタン押下後", OWN_NAME, "削除処理", "正常終了");
        return ResponseEntity.ok("ユーザー削除処理完了");
    }

    @PostMapping("/userCsvDownload")
    public void userCsvDownload(@RequestBody UserSearchForm form, HttpServletResponse response) {
        LogService.info("ユーザーダウンロードボタン押下後", OWN_NAME, "ダウンロード処理", "正常開始");
        try {
            // レスポンスのエンコーディングとコンテンツタイプを設定
            response.setCharacterEncoding(String.valueOf(StandardCharsets.UTF_8));
            response.setContentType("text/csv; charset=UTF-8");
            //  CSVファイル名の定義
            String customFileName = ((LoginInfo) session.getAttribute(OWN_FORM_SESSION_KEY)).getUserId() + ".csv";
            response.setHeader("Content-Disposition", "attachment; filename=" + customFileName);
            // CSVデータを取得してレスポンスストリームに書き込む
            String csvHeader = csvHeaderProperties.getSearchCsvHeader();
            CSVFormat csvFormat = CSVFormat.DEFAULT.withHeader(csvHeader);
            String[] headers = csvHeader.split(",");
            try (CSVPrinter csvPrinter = new CSVPrinter(response.getWriter(), csvFormat)) {
                List<VAdminMaintenanceEntity> adminMaintenanceEntitiesList = vSearchUserService.queryEntitiesByUserIds(form.getUserId());
                CSVUtils.writeObjectsToCSV(csvPrinter, adminMaintenanceEntitiesList);
            } catch (IllegalAccessException e) {
                LogService.system(OWN_TITLE, OWN_NAME, "ダウンロード処理", "ダウンロード処理失敗した");
                LogService.system(ExceptionUtils.getStackTrace(e));
            }
        } catch (IOException e) {
            LogService.system(OWN_TITLE, OWN_NAME, "ダウンロード処理", "ダウンロード処理失敗した");
            LogService.system(ExceptionUtils.getStackTrace(e));
        }
        // ダウンロード成功時は "OK" を返す
        LogService.info("ユーザーダウンロードボタン押下後", OWN_NAME, "ダウンロード処理", "正常終了");
    }

    /**
     * フォーム情報初期化
     *
     * @param form フォーム情報
     */
    private void resetValue(UserSearchForm form) {
        // 利用者ID
        form.setClientId(BLANK);
        // 利用者区分
        form.setUserDiv(BLANK);
        // 利用者区分プルダウン
        form.setUserDivList(commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_00003));
        // 姓名（漢字）
        form.setFullNameJp(BLANK);
        // 姓名（英字）
        form.setFullNameEn(BLANK);
        //ャンパス）
        form.setCampus(BLANK);
        // キャンパスプルダウン
        form.setCampusList(commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01007));
        // 所属
        form.setDepartment(BLANK);
        // 所属プルダウン
        form.setDepartmentList(commonService.getOrgList(MmsConstants.COMPANY_CODE_COLLEGE));
        // 入学年度
        form.setEntranceYear(BLANK);

        // 検索区分 有効ユーザ
        // 「管理者画面」「利用者情報管理 - 検索」「検索」条件の、「検索区分」にて、初期状態で「有効ユーザ」がセットされているべきところ、セットされていない。 begin
        //form.setValidUserChecked(false);
        form.setValidUserChecked(true);
        // 「管理者画面」「利用者情報管理 - 検索」「検索」条件の、「検索区分」にて、初期状態で「有効ユーザ」がセットされているべきところ、セットされていない。end

        // 検索区分 削除ユーザ
        form.setInvalidUserChecked(false);
        // 検索区分 ロック状態ユーザ
        form.setLockUserChecked(false);
        // 検索区分 未来ユーザ
        form.setFutureUserChecked(false);
        // 初期パスワード未変更
        form.setInitPassword(false);
    }

    private void form2Dto(UserSearchForm form, UserSearchDto dto) {
        dto.setUserId(form.clientId);
        dto.setEmploymentKbn(form.getUserDiv());
        dto.setFullNameJp(form.getFullNameJp());
        dto.setFullNameEn(form.getFullNameEn());
        dto.setCampus(form.getCampus());
        dto.setDepartment(form.getDepartment());
        dto.setEntranceYear(form.getEntranceYear());
        dto.setVpn(form.getVpn());
        dto.setInitPassword(form.getInitPassword());
        List<String> status = new ArrayList<>();

        if (Boolean.TRUE.equals(form.getValidUserChecked())) {
            status.add("valid");
        }
        if (Boolean.TRUE.equals(form.getInvalidUserChecked())) {
            status.add("invalid");
        }
        if (Boolean.TRUE.equals(form.getLockUserChecked())) {
            status.add("lock");
        }
        if (Boolean.TRUE.equals(form.getFutureUserChecked())) {
            status.add("reserve");
        }
        dto.setStatus(status);

    }
}
