package jp.co.axio.masterMentsetSystem.controller;

import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.CsvHeaderProperties;
import jp.co.axio.masterMentsetSystem.common.LogService;
import jp.co.axio.masterMentsetSystem.dto.AjaxResultDto;
import jp.co.axio.masterMentsetSystem.dto.UserCsvCheckMessageDto;
import jp.co.axio.masterMentsetSystem.model.MUser;
import jp.co.axio.masterMentsetSystem.model.ReserveUserDetail;
import jp.co.axio.masterMentsetSystem.model.WUploadFileSub;
import jp.co.axio.masterMentsetSystem.model.WUploadSub;
import jp.co.axio.masterMentsetSystem.model.WUserSub;
import jp.co.axio.masterMentsetSystem.model.WUserSystemSub;
import jp.co.axio.masterMentsetSystem.repository.MUserMapper;
import jp.co.axio.masterMentsetSystem.service.CommonService;
import jp.co.axio.masterMentsetSystem.service.DatabaseService;
import jp.co.axio.masterMentsetSystem.service.TUserSubService;
import jp.co.axio.masterMentsetSystem.service.TUserSystemSubService;
import jp.co.axio.masterMentsetSystem.service.UserCsvService;
import jp.co.axio.masterMentsetSystem.service.UserRegistService;
import jp.co.axio.masterMentsetSystem.service.VUserSearchService;
import jp.co.axio.masterMentsetSystem.service.WUploadFileSubService;
import jp.co.axio.masterMentsetSystem.service.WUserSubService;
import jp.co.axio.masterMentsetSystem.service.WUserSystemSubService;
import jp.co.axio.masterMentsetSystem.util.CSVUtils;


/**
 * 利用者情報管理-検索画面処理
 *
 * @author a004811
 */
@Controller
public class UserCsvController {

    /**
     * 自処理名
     */
    private static final String OWN_NAME = "UserCsvController";
    /**
     * 自画面のHTMLテンプレート
     */
    private final String OWN_PAGE = "UserCsv/userCsv";

    /**
     * 自画面のHTMLテンプレート
     */
    private final String RESERVE_PAGE = "UserCsv/userCsvReserve";

    /**
     * Login対象画面Form用のセッションキー
     */
    private static final String OWN_FORM_SESSION_KEY = "LoginController.loginInfo";
    /**
     * 自処理対象画面名
     */
    private static final String OWN_TITLE = "利用者CSV管理画面";

    /**
     * 空白
     */
    private static final String BLANK = "";
    /**
     * 有効フラグ
     */
    private static final String VALID_FLAG = "1";

    /**
     * 無効フラグ
     */
    private static final String INVALID_FLAG = "0";

    //アップロードユーザID
    private String uploadUserId;
    private String sessionId;
    private Date currentTimestamp;
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
    WUserSubService wUserSubService;

    @Autowired
    WUserSystemSubService wUserSystemSubService;

    @Autowired
    WUploadFileSubService wUploadFileSubService;

    @Autowired
    TUserSubService tUserSubService;

    @Autowired
    TUserSystemSubService tUserSystemSubService;

    @Autowired
    UserCsvService userCsvService;

    @Autowired
    CsvHeaderProperties csvHeaderProperties;

    @Autowired
    DatabaseService databaseService;

    @Autowired
    UserRegistService userRegistService;
    
    @Autowired
    MUserMapper mUserMapper;


    /**
     * 確定ボタン押下
     *
     * @return ModelAndView
     * @throws Exception
     */
    @RequestMapping(value = "/csvConfirm", method = RequestMethod.POST)
    @ResponseBody
    @Transactional
    public AjaxResultDto csvConfirm() throws Exception {
        LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "確定処理", "開始");

        AjaxResultDto result = new AjaxResultDto();
        result.setChkResult(userCsvService.csvConfirm());
        LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "確定処理", "正常終了");
        return result;
    }

    /**
     * 利用者CSV管理画面初期表示
     *
     * @param redirectAttributes リダイレクト先に値を引き渡すためのModel
     * @return ModelAndView
     */
    @RequestMapping("/csv")
    public ModelAndView index(RedirectAttributes redirectAttributes) {
        LogService.info(OWN_TITLE, OWN_NAME, "利用者CSV管理初期処理", "開始");
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
            LogService.info(OWN_TITLE, OWN_NAME, "利用者CSV管理初期処理", "正常終了");
        } catch (Exception e) {
            LogService.system(OWN_TITLE, OWN_NAME, "利用者CSV管理初期処理", "失敗した");
            LogService.system(ExceptionUtils.getStackTrace(e));
            String msg = ms.getMessage("ERR001", null, null);
            modelAndView.addObject("errMessage", msg);
            LogService.info(OWN_TITLE, OWN_NAME, "利用者CSV管理初期処理", "··異常終了");
        }

        modelAndView.setViewName(OWN_PAGE);

        LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者CSV管理初期処理", "正常終了");
        return modelAndView;
    }


    /**
     * 利用者CSV反映待ち画面初期表示
     *
     * @param redirectAttributes リダイレクト先に値を引き渡すためのModel
     * @return ModelAndView
     */
    @RequestMapping("/reserve")
    public ModelAndView reserve(RedirectAttributes redirectAttributes) {
        LogService.info(OWN_TITLE, OWN_NAME, "利用者CSV初期処理", "開始");
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
            LogService.info(OWN_TITLE, OWN_NAME, "利用者CSV反映待ちユーザ取得処理", "正常終了");
        } catch (Exception e) {
            LogService.system(OWN_TITLE, OWN_NAME, "利用者CSV反映待ちユーザ取得処理", "失敗した");
            LogService.system(ExceptionUtils.getStackTrace(e));
            String msg = ms.getMessage("ERR001", null, null);
            modelAndView.addObject("errMessage", msg);
            LogService.info(OWN_TITLE, OWN_NAME, "利用者CSV反映待ちユーザ取得処理", "··異常終了");
        }
        //基準日取得
        Date criterion_dt = commonService.getSysCriterionDt();


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(criterion_dt);
        System.out.println("criterion_dt=" + formattedDate);
        modelAndView.addObject("criterionDate", formattedDate);

        modelAndView.setViewName(RESERVE_PAGE);

        LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者CSV反映待ちユーザ取得処理", "正常終了");
        return modelAndView;
    }

    @RequestMapping("/reserveList")
    public ResponseEntity<List<ReserveUserDetail>> getReseveList(@RequestBody Map<String, String> requestMap) {

        String reflectionDateStr = requestMap.get("reflectionDate");
        java.sql.Date reflectionDate = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date utilDate = sdf.parse(reflectionDateStr);
            reflectionDate = new java.sql.Date(utilDate.getTime());

        } catch (ParseException e) {
            // エラー処理
            e.printStackTrace();
        }
        System.out.println("reflectionDate=" + reflectionDate);
        LogService.info(OWN_TITLE, OWN_NAME, "利用者CSV反映待ちユーザ取得処理", "開始");

        // ログインチェックここまで
        try {
            // ログイン情報以外のsession削除
            Collections.list(session.getAttributeNames()).forEach(e -> {
                if (!"LoginController.loginInfo".equals(e)) {// ログイン情報以外
                    session.removeAttribute(e);// 削除
                }
            });
            LogService.info(OWN_TITLE, OWN_NAME, "利用者CSV反映待ちユーザ取得処理", "正常終了");
        } catch (Exception e) {
            LogService.system(OWN_TITLE, OWN_NAME, "利用者CSV反映待ちユーザ取得処理", "失敗した");
            LogService.system(ExceptionUtils.getStackTrace(e));
            String msg = ms.getMessage("ERR001", null, null);
            LogService.info(OWN_TITLE, OWN_NAME, "利用者CSV反映待ちユーザ取得処理", "··異常終了");
        }

        List<ReserveUserDetail> list = tUserSubService.getReserveUserDetail(reflectionDate);
        LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者CSV反映待ちユーザ取得処理", "正常終了");
        return ResponseEntity.ok(list);
    }

    /**
     * 取り消し
     *
     * @param form フォーム情報
     * @return ResponseEntity
     * @throws ParseException
     * @throws IOException
     */
    @PostMapping("/csvUserCancel")
    @ResponseBody
    @Transactional
    public ResponseEntity<List<ReserveUserDetail>> userCancel(@RequestBody UserRegistForm form) throws ParseException, IOException {
        LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者設定変更画面 取り消し処理", "開始");

        userRegistService.setUpdateTs();
        //ユーザ取り消し処理
        userRegistService.userCancel(form);

        //操作ログへ登録を行う
        userRegistService.regOpLogUserCancel(form);

        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("reflectionDate", form.getHanEiDt());
        ResponseEntity<List<ReserveUserDetail>> responseEntity = getReseveList(requestMap);

        List<ReserveUserDetail> reserveUserDetails = responseEntity.getBody();
        LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者設定変更画面 取り消し処理", "正常終了");
        return ResponseEntity.ok(reserveUserDetails);
    }

    /**
     * 取り消し
     *
     * @return ResponseEntity
     * @throws ParseException
     * @throws IOException
     */
    @PostMapping("/csvUserCancelList")
    @ResponseBody
    @Transactional
    public ResponseEntity<List<ReserveUserDetail>> userCancelList(@RequestBody UserCsvForm form) throws ParseException, IOException {
        LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者設定変更画面 取り消し処理", "開始");
        for (String riYouShaId : form.getRiYouShaIds()) {
            UserRegistForm userRegistForm = new UserRegistForm();
            userRegistForm.setRiYouShaId(riYouShaId);
            userRegistService.setUpdateTs();
            //ユーザ取り消し処理
            userRegistService.userCancel(userRegistForm);
            //操作ログへ登録を行う
            userRegistService.regOpLogUserCancel(userRegistForm);
        }
        Map<String, String> requestMap = new HashMap<>();
        requestMap.put("reflectionDate", form.getReflectionDate());
        ResponseEntity<List<ReserveUserDetail>> responseEntity = getReseveList(requestMap);

        List<ReserveUserDetail> reserveUserDetails = responseEntity.getBody();
        LogService.info(OWN_TITLE, this.getClass().getSimpleName(), "利用者設定変更画面 取り消し処理", "正常終了");
        return ResponseEntity.ok(reserveUserDetails);
    }


    /**
     * CSVアップロード機能
     *
     * @param csvFile CSVファイル
     * @return ResponseEntity
     */
    @PostMapping("/csvUpload")
    public ResponseEntity<UserCsvResponseObject> csvUploadAndInsert(@RequestParam("csvFile") MultipartFile csvFile) throws MissingServletRequestPartException {
        LogService.info(OWN_TITLE, OWN_NAME, "CSVアップロード処理", "開始");

        Date updDt = commonService.getDbSysDt();
        //メッセージの定義
        String message = "";
        try {
            // ファイルが空かどうかをチェック
            if (csvFile.isEmpty()) {
                LogService.info(OWN_TITLE, OWN_NAME, "CSVアップロード処理", "CSVファイルのデータなし");
//                return ResponseEntity.badRequest().body(ms.getMessage("MSTO0017M0002", null, null));
                return ResponseEntity.badRequest().body(null);
            }
            // セッションの存在チェック
            if (session != null) {
                if (session.getAttribute(OWN_FORM_SESSION_KEY) != null &&
                        !StringUtils.isEmpty(((LoginInfo) session.getAttribute(OWN_FORM_SESSION_KEY)).getUserId())) {
                    // 操作者ユーザID取得
                    uploadUserId = ((LoginInfo) session.getAttribute(OWN_FORM_SESSION_KEY)).getUserId();
                    //ユーザのセッションID取得
                    sessionId = session.getId();
                } else {
                    message = ms.getMessage("CMN0012", null, null);
                    UserCsvResponseObject responseObject = new UserCsvResponseObject(null, message);
                    LogService.info(OWN_TITLE, OWN_NAME, "CSVアップロード処理", message);
                    return ResponseEntity.badRequest().body(responseObject);
                }
            } else {
                message = ms.getMessage("MSTO0017M0005", null, null);
                UserCsvResponseObject responseObject = new UserCsvResponseObject(null, message);
                LogService.info(OWN_TITLE, OWN_NAME, "CSVアップロード処理", message);
                return ResponseEntity.badRequest().body(responseObject);
            }
            //アップロード情報を登録する

            //現在の時刻に設定します。
            currentTimestamp = updDt;

            WUploadSub wUploadSub = new WUploadSub();
            wUploadSub.setUploadUserId(uploadUserId);
            wUploadSub.setUploadUserTs(currentTimestamp);
            wUploadSub.setUploadSession(sessionId);
            wUploadSub.setProcessFlag(INVALID_FLAG);
            wUploadSub.setRegisterId(uploadUserId);
            wUploadSub.setRegistTs(currentTimestamp);
            wUploadSub.setUpdaterId(uploadUserId);
            wUploadSub.setUpdateTs(currentTimestamp);


            //CSVファイルの拡張子のチェック
            String filename = csvFile.getOriginalFilename();
            if (filename == null || !filename.endsWith(".csv")) {
                message = ms.getMessage("MSTO0017M0014", null, null);
                UserCsvResponseObject responseObject = new UserCsvResponseObject(null, message);
                return ResponseEntity.ok(responseObject);
            }

            // OpenCSVライブラリを使用してCSVファイルを解析
            LogService.info(OWN_TITLE, OWN_NAME, "CSVファイル読み込み", "開始");
            InputStreamReader reader = new InputStreamReader(csvFile.getInputStream(), CSVUtils.detectFileEncoding(csvFile.getInputStream()));
            CSVReader csvReader = new CSVReader(reader);

            String csvHeader = csvHeaderProperties.getCsvHeader();
            List<String[]> csvData = csvReader.readAll();


            String[] expectedColumns = csvHeader.split(",");
            String[] actualColumns = csvData.get(0);
            // プロジェクト名の数が一致するかどうかを確認する
            if (expectedColumns.length != actualColumns.length) {
                message = ms.getMessage("MSTO0017M0015", null, null);
                UserCsvResponseObject responseObject = new UserCsvResponseObject(null, message);
                return ResponseEntity.ok(responseObject);
            }
            // 項目名が一致するかどうかをチェック
            for (int i = 0; i < expectedColumns.length; i++) {
                if (!expectedColumns[i].equals(actualColumns[i])) {
                    message = ms.getMessage("MSTO0017M0016", null, null);
                    UserCsvResponseObject responseObject = new UserCsvResponseObject(null, message);
                    return ResponseEntity.ok(responseObject);
                }
            }

            LogService.info(OWN_TITLE, OWN_NAME, "CSVファイル読み込み", "正常終了");
            // ここでcsvDataにCSVファイルのすべての行のデータが含まれています。必要に応じて処理できます。
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            //行番号の初期化設定
            int count = 0;
            List<WUploadFileSub> entityList = new ArrayList<WUploadFileSub>();
            boolean skipFirstRow = true; // フラグ、最初の行をスキップするためのフラグ

            for (String[] row : csvData) {
                if (skipFirstRow) {
                    skipFirstRow = false; // フラグをfalseに設定し、次の行をスキップしないようにする
                    continue; // 最初の行をスキップ
                }
                // 空白行をスキップするためのチェック
                boolean isBlankRow = true;
                for (String cell : row) {
                    if (!cell.trim().isEmpty()) {
                        isBlankRow = false;
                        break; // 空白でないセルが見つかった場合、ループを終了
                    }
                }
                // 空白行でない場合のみデータを処理
                if (!isBlankRow) {
                    count++;
                    WUploadFileSub wUploadFileSub = new WUploadFileSub();
                    wUploadFileSub.setUploadUserId(uploadUserId);
                    wUploadFileSub.setUploadUserTs(updDt);
                    wUploadFileSub.setUploadSession(sessionId);
                    wUploadFileSub.setRowNo(count);
                    wUploadFileSub.setRowData(Arrays.toString(row));
                    wUploadFileSub.setCheckFlag(INVALID_FLAG);
                    wUploadFileSub.setProcessKbn(row[0]);
                    wUploadFileSub.setUserId(row[1]);

                    sdf.setLenient(false);
                    Date reflectionDate = null;

                    try {
                        if (row[2] != null && !row[2].isEmpty()) {
                            // Date型変換
                            reflectionDate = sdf.parse(row[2].toString());
                        }
                    } catch (Exception e) {
                        LogService.system(OWN_TITLE, OWN_NAME, "CSVアップロード処理", "失敗した");
                        LogService.system(ExceptionUtils.getStackTrace(e));
                        message = ms.getMessage("MSTO0015M0102", null, null);
                        UserCsvResponseObject responseObject = new UserCsvResponseObject(null, message);
                        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseObject);
                    }
                    wUploadFileSub.setReflectionDate(reflectionDate);
                    wUploadFileSub.setColumn1(row[3]);
                    wUploadFileSub.setColumn2(row[4]);
                    wUploadFileSub.setColumn3(row[5]);
                    wUploadFileSub.setColumn4(row[6]);
                    wUploadFileSub.setColumn5(row[7]);

                    wUploadFileSub.setRegisterId(uploadUserId);
                    wUploadFileSub.setRegistTs(updDt);
                    wUploadFileSub.setUpdaterId(uploadUserId);
                    wUploadFileSub.setUpdateTs(updDt);
                    entityList.add(wUploadFileSub);
                }
            }
//            boolean isOK = false;

//            if (isOK) {
            //ADD ON部分 START
            String checkFlag = "1";
            UserCsvCheckMessageDto errMsgDto = new UserCsvCheckMessageDto();
            // Gsonオブジェクトを作成
            Gson gson = new Gson();
            // 空のJSON配列を作成
            JsonArray jsonArray = new JsonArray();

            //ユーザ数分ループする（開始）↓
            //基準日取得
            Date criterion_dt = commonService.getSysCriterionDt();

            // 1：教員 2：職員 3：学生 4：ビジター
            String[] userTypes = {"1", "2", "3", "4"};
            // ADD MOD LCK UNLCK
            String[] processTypes = {"ADD", "MOD", "LCK", "UNLCK"};
            // リストオブジェクトを繰り返し処理し、各オブジェクトに対してJSONオブジェクトを作成し、配列に追加します
//            List<WUploadFileSub> errorList = new ArrayList<WUploadFileSub>();
            List<WUserSystemSub> wUserSystemSubList = new ArrayList<WUserSystemSub>();
            List<WUserSub> wUserSubList = new ArrayList<WUserSub>();
            for (WUploadFileSub entity : entityList) {
                JsonObject jsonObject = new JsonObject();
                //差分のチェック
                validateAndAddError("processKbn", entity.getProcessKbn(), ms, jsonObject, "MSTO0017M0006");


                //UserIdのチェック
                if (validate(entity.getUserId()) && validate(entity.getColumn1())) {
                    jsonObject.addProperty("userId", ms.getMessage("MSTO0017M0007", null, null));
                } else if (validate(entity.getUserId()) && !entity.getColumn1().equals("3")) {
                    jsonObject.addProperty("userId", ms.getMessage("MSTO0017M0007", null, null));
                } else if (validate(entity.getUserId())
                        && entity.getColumn1().equals("3")
                        && !validate(entity.getColumn4())
                        && !entity.getColumn4().matches("^\\d{4}(31|83|84)\\d{4}$")) {
                    System.out.println(entity.getColumn3());
                    jsonObject.addProperty("userId", ms.getMessage("MSTO0017M0012", null, null));
                } else if (validate(entity.getUserId()) && entity.getColumn1().equals("3") && validate(entity.getColumn4())) {
                    jsonObject.addProperty("userId", ms.getMessage("MSTO0017M0012", null, null));
                } else if (validate(entity.getUserId())
                        && entity.getColumn1().equals("3")
                        && !validate(entity.getColumn4())
                        && entity.getColumn4().matches("^\\d{4}(31|83|84)\\d{4}$")) {
                    String userId = generateUserId(entity.getColumn4());
                    entity.setUserId(userId);
                }

                String processValue = entity.getProcessKbn();
                //利用者区分typeチェック
                boolean isProcessed = Arrays.asList(processTypes).contains(processValue);
                if (!isProcessed) {
                    jsonObject.addProperty("processKbn", ms.getMessage("MSTO0017M0006", null, null));
                } else {
                    int userCount = 0;
                    boolean reflectionFlag = false;
                    MUser mUser = null;
                    if (!validate(entity.getUserId())) {
                        userCount = tUserSubService.getCount(entity.getUserId());
                        reflectionFlag = tUserSystemSubService.getReflectionFlag(entity.getUserId());
                        mUser = mUserMapper.selectByPrimaryKey(entity.getUserId());
                    }

                    //処理区分に応じてユーザの確認を行う
                    switch (entity.getProcessKbn()) {
                        //ADDの場合
                        case "ADD":
                            if (userCount > 0) {
                                jsonObject.addProperty("duplicateError", ms.getMessage("MSTO0017M0017", null, null));
                            }
                            break;
                        //ADDの場合
                        case "MOD":
                            //TODO 未反映は1ですか？0ですか？
                            if (userCount == 0) {
                                jsonObject.addProperty("notRegisterError", ms.getMessage("MSTO0017M0018", null, null));
                            } else if (userCount > 0 && reflectionFlag) {
                                jsonObject.addProperty("reserveError", ms.getMessage("MSTO0017M0019", null, null));
                            }
                            break;
                        //ADDの場合
                        case "LCK":
                            if (userCount == 0) {
                                jsonObject.addProperty("notRegisterError", ms.getMessage("MSTO0017M0018", null, null));
                            } else if (userCount > 0 && reflectionFlag) {
                                jsonObject.addProperty("reserveError", ms.getMessage("MSTO0017M0019", null, null));
                            }
                            //6.2	ロック済みであるか確認する
                            if(mUser != null && "1".equals(mUser.getInvalidFlag())) {
                            	jsonObject.addProperty("alreadyLockError", ms.getMessage("MSTO0017M0020", null, null));
                            }
                            //6.3	削除済みであるか確認する
                            if(mUser != null && "1".equals(mUser.getDeleteFlag())) {
                            	jsonObject.addProperty("alreadyDelError", ms.getMessage("MSTO0017M0021", null, null));
                            }

                            break;
                        //ADDの場合
                        case "UNLCK":
                            if (userCount == 0) {
                                jsonObject.addProperty("notRegisterError", ms.getMessage("MSTO0017M0018", null, null));
                            } else if (userCount > 0 && reflectionFlag) {
                                jsonObject.addProperty("reserveError", ms.getMessage("MSTO0017M0019", null, null));
                            }
                            //6.2	ロック解除済みであるか確認する
                            if(mUser != null && "0".equals(mUser.getInvalidFlag())) {
                            	jsonObject.addProperty("alreadyUnLockError", ms.getMessage("MSTO0017M0022", null, null));
                            }
                            //6.3	削除済みであるか確認する
                            if(mUser != null && "1".equals(mUser.getDeleteFlag())) {
                            	jsonObject.addProperty("alreadyDelError", ms.getMessage("MSTO0017M0021", null, null));
                            }
                            break;

                    }
                }

                //利用者区分のチェック
                if (validate(entity.getColumn1())) {
                    // errMsgDto.setUserDiv(ms.getMessage("MSTO0017M0009", null, null));
                } else {
                    //利用者区分
                    String column1Value = entity.getColumn1();
                    //利用者区分存在チェック
                    boolean isValid = Arrays.asList(userTypes).contains(column1Value);
                    if (!isValid) {
                        jsonObject.addProperty("column1", ms.getMessage("MSTO0017M0009", null, null));
                    }
                }
                //反映日のチェック
                validateAndAddError("reflectionDate", entity.getReflectionDate(), criterion_dt, ms, jsonObject, "MSTO0017M0008");
                //氏名（英字）のチェック
                validateAndAddError("column2", entity.getColumn2(), ms, jsonObject, "MSTO0017M0010");
                //氏名（漢字）のチェック
                validateAndAddError("column3", entity.getColumn3(), ms, jsonObject, "MSTO0017M0011");
                //学籍番号のチェック
                validateAndAddError("column4", entity.getColumn4(), ms, jsonObject, "MSTO0017M0012");


                //VPNのチェック
//                    validateAndAddError("column5", entity.getColumn5(), ms, jsonObject, "MSTO0017M0013");

                // アップロードファイル一時エラー情報更新
                boolean isEmpty = jsonObject.entrySet().isEmpty();
                if (!isEmpty) {
                    entity.setCheckFlag(checkFlag);
                    entity.setCheckMessage(gson.toJson(jsonObject));
//                    errorList.add(entity);
                }
                if (isEmpty) {
                    String squence = databaseService.getString("SELECT nextval('seq_uid_number') as uid_number");
                    //ユーザシステム利用一時
                    WUserSystemSub wUserSystemSub = new WUserSystemSub();
                    wUserSystemSub.setUploadUserId(entity.getUploadUserId());
                    wUserSystemSub.setUploadUserTs(entity.getUploadUserTs());
                    wUserSystemSub.setUploadSession(entity.getUploadSession());
                    wUserSystemSub.setReflectionDate(entity.getReflectionDate());
                    wUserSystemSub.setUserId(entity.getUserId());
                    wUserSystemSub.setSystemValidFlag11(INVALID_FLAG);
                    wUserSystemSub.setSystemValidFlag12(INVALID_FLAG);
                    wUserSystemSub.setSystemValidFlag13(INVALID_FLAG);
                    wUserSystemSub.setSystemValidFlag14(INVALID_FLAG);
                    wUserSystemSub.setSystemValidFlag15(INVALID_FLAG);
                    wUserSystemSub.setSystemValidFlag16(INVALID_FLAG);
                    wUserSystemSub.setSystemValidFlag17(INVALID_FLAG);
                    wUserSystemSub.setSystemValidFlag18(INVALID_FLAG);
                    wUserSystemSub.setSystemValidFlag19(INVALID_FLAG);
                    wUserSystemSub.setSystemValidFlag20(INVALID_FLAG);


                    //ユーザ一時
                    WUserSub wUserSub = new WUserSub();
                    wUserSub.setUploadUserId(entity.getUploadUserId());
                    wUserSub.setUploadUserTs(entity.getUploadUserTs());
                    wUserSub.setUploadSession(entity.getUploadSession());
                    wUserSub.setReflectionDate(entity.getReflectionDate());


                    wUserSub.setUserId(entity.getUserId());
                    wUserSub.setEmployeeId(entity.getColumn4());
                    wUserSub.setLmId(entity.getColumn4());
                    wUserSub.setStartDate(entity.getReflectionDate());
                    wUserSub.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse("2999-12-31"));
                    wUserSub.setDeleteFlag(INVALID_FLAG);
                    wUserSub.setInvalidFlag(INVALID_FLAG);
                    wUserSub.setLangCode("ja");
                    wUserSub.setEnrollmentKbn("9");

                    String[] fullNameEn = getLastNameAndFirstName(entity.getColumn2());
                    wUserSub.setSurnameEn(fullNameEn[1]);
                    wUserSub.setGivennameEn(fullNameEn[0]);
                    wUserSub.setSurnameNickEn("");
                    wUserSub.setSurnameNickJp("");
                    wUserSub.setGivennameNuckEn("");
                    wUserSub.setGivennameNuckJp("");
                    wUserSub.setInitPassword("");


                    String[] fullNameJp = getLastNameAndFirstName(entity.getColumn3());
                    wUserSub.setSurnameJp(fullNameJp[0]);
                    wUserSub.setGivennameJp(fullNameJp[1]);
                    wUserSub.setCompanyCode("100");
                    wUserSub.setOrganizationCode("1000");
                    wUserSub.setLocationCode("100");
                    wUserSub.setCompanyName("愛知県立大学");
                    wUserSub.setRegisterId(entity.getUploadUserId());
                    wUserSub.setRegistTs(updDt);
                    wUserSub.setUpdaterId(entity.getUploadUserId());
                    wUserSub.setUpdateTs(updDt);
                    //【利用アプリケーション、その他】「初期情報設定」シートに従って、値を生成する
                    //利用者区分
                    String userId = entity.getUserId();
                    boolean vpnStatus = false;
                    switch (entity.getColumn1()) {
                        //1：教員
                        case "1":
                            wUserSystemSub.setApplicationUseFlag02(VALID_FLAG);
                            wUserSystemSub.setApplicationUseFlag03(VALID_FLAG);
                            vpnStatus = checkVPNValue(entity.getColumn5());
                            wUserSystemSub.setApplicationUseFlag04(vpnStatus ? VALID_FLAG : INVALID_FLAG);
                            wUserSystemSub.setApplicationUseFlag05(VALID_FLAG);
                            wUserSystemSub.setApplicationUseFlag06(VALID_FLAG);


                            wUserSystemSub.setSystemValidFlag01(VALID_FLAG);
                            if (vpnStatus) {
                                wUserSystemSub.setSystemValidFlag02(VALID_FLAG);
                            } else {
                                wUserSystemSub.setSystemValidFlag02(INVALID_FLAG);
                            }
                            wUserSystemSub.setSystemValidFlag03(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag04(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag05(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag06(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag07(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag08(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag09(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag10(VALID_FLAG);


                            wUserSub.setExpansionAttr2(squence);
                            wUserSub.setExpansionAttr3(squence);
                            wUserSub.setExpansionAttr4("100");
                            wUserSub.setExpansionAttr5("100");
                            wUserSub.setExpansionAttr6("ist");
                            wUserSub.setExpansionAttr7("sensei");
                            wUserSub.setExpansionAttr8("sensei");
                            wUserSub.setExpansionAttr9("ou=ist");
                            wUserSub.setExpansionAttr10("ou=Teachers,ou=CISUsers");
                            wUserSub.setExpansionAttr11("OU=sensei");
                            wUserSub.setExpansionAttr12("ou=teachers,ou=cisusers");
                            wUserSub.setExpansionAttr13("ou=ist");
                            wUserSub.setExpansionAttr14("C:\\Users\\ist\\" + userId);
                            wUserSub.setExpansionAttr15("\\\\cs18\\sensei\\" + userId);
                            wUserSub.setExpansionAttr16("/ist/" + userId);
                            wUserSub.setExpansionAttr17("/cis/sensei/" + userId);
                            wUserSub.setExpansionAttr18("/cis/sensei/" + userId);
                            wUserSub.setExpansionAttr19("\\\\ia203\\home\\sensei\\" + userId);
                            wUserSub.setExpansionAttr20("/bin/csh");
                            wUserSub.setExpansionAttr21("/bin/bash");
                            wUserSub.setExpansionAttr22("C:\\WINDOWS\\fjsys\\userprof");
                            wUserSub.setExpansionAttr23("C:\\WINDOWS\\fjsys\\userprof");
                            wUserSub.setExpansionAttr24("logon.bat");
                            wUserSub.setExpansionAttr25("");
                            wUserSub.setExpansionAttr26("3832");
                            wUserSub.setExpansionAttr27("3832");
                            wUserSub.setExpansionAttr28("of_1_全教員（教授会）");

                            break;
                        //2：職員
                        case "2":
                            wUserSystemSub.setApplicationUseFlag02(VALID_FLAG);
                            wUserSystemSub.setApplicationUseFlag03(VALID_FLAG);
                            vpnStatus = checkVPNValue(entity.getColumn5());
                            wUserSystemSub.setApplicationUseFlag04(vpnStatus ? VALID_FLAG : INVALID_FLAG);
                            wUserSystemSub.setApplicationUseFlag05(VALID_FLAG);
                            wUserSystemSub.setApplicationUseFlag06(VALID_FLAG);


                            wUserSystemSub.setSystemValidFlag01(VALID_FLAG);
                            if (vpnStatus) {
                                wUserSystemSub.setSystemValidFlag02(VALID_FLAG);
                            } else {
                                wUserSystemSub.setSystemValidFlag02(INVALID_FLAG);
                            }
                            wUserSystemSub.setSystemValidFlag03(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag04(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag05(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag06(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag07(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag08(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag09(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag10(VALID_FLAG);


                            wUserSub.setExpansionAttr2(squence);
                            wUserSub.setExpansionAttr3(squence);
                            wUserSub.setExpansionAttr4("150");
                            wUserSub.setExpansionAttr5("150");
                            wUserSub.setExpansionAttr6("ist");
                            wUserSub.setExpansionAttr7("sensei");
                            wUserSub.setExpansionAttr8("sensei");
                            wUserSub.setExpansionAttr9("ou=ist");
                            wUserSub.setExpansionAttr10("ou=Teachers,ou=CISUsers");
                            wUserSub.setExpansionAttr11("OU=sensei");
                            wUserSub.setExpansionAttr12("ou=teachers,ou=cisusers");
                            wUserSub.setExpansionAttr13("ou=ist");
                            wUserSub.setExpansionAttr14("C:\\Users\\ist\\" + userId);
                            wUserSub.setExpansionAttr15("\\\\cs18\\sensei\\" + userId);
                            wUserSub.setExpansionAttr16("/ist/" + userId);
                            wUserSub.setExpansionAttr17("/cis/sensei/" + userId);
                            wUserSub.setExpansionAttr18("/cis/sensei/" + userId);
                            wUserSub.setExpansionAttr19("\\\\ia203\\home\\sensei\\" + userId);
                            wUserSub.setExpansionAttr20("/bin/csh");
                            wUserSub.setExpansionAttr21("/bin/bash");
                            wUserSub.setExpansionAttr22("C:\\WINDOWS\\fjsys\\userprof");
                            wUserSub.setExpansionAttr23("C:\\WINDOWS\\fjsys\\userprof");
                            wUserSub.setExpansionAttr24("logon.bat");
                            wUserSub.setExpansionAttr25("");
                            wUserSub.setExpansionAttr26("3832");
                            wUserSub.setExpansionAttr27("3832");
                            wUserSub.setExpansionAttr28("ist2000");
                            break;
                        //3：学生
                        case "3":

                            wUserSystemSub.setApplicationUseFlag02(INVALID_FLAG);
                            wUserSystemSub.setApplicationUseFlag03(INVALID_FLAG);
                            vpnStatus = checkVPNValue(entity.getColumn5());
                            wUserSystemSub.setApplicationUseFlag04(vpnStatus ? VALID_FLAG : INVALID_FLAG);
                            wUserSystemSub.setApplicationUseFlag05(VALID_FLAG);
                            wUserSystemSub.setApplicationUseFlag06(VALID_FLAG);

                            wUserSystemSub.setSystemValidFlag01(INVALID_FLAG);

                            if (vpnStatus) {
                                wUserSystemSub.setSystemValidFlag02(VALID_FLAG);
                            } else {
                                wUserSystemSub.setSystemValidFlag02(INVALID_FLAG);
                            }
                            wUserSystemSub.setSystemValidFlag03(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag04(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag05(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag06(INVALID_FLAG);
                            wUserSystemSub.setSystemValidFlag07(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag08(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag09(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag10(VALID_FLAG);

                            wUserSub.setExpansionAttr2(squence);
                            wUserSub.setExpansionAttr3(squence);
                            wUserSub.setExpansionAttr4("2000");
                            wUserSub.setExpansionAttr5("900");
                            wUserSub.setExpansionAttr6("res");
                            wUserSub.setExpansionAttr7("home");
                            wUserSub.setExpansionAttr8("");
                            wUserSub.setExpansionAttr9("ou=res");
                            wUserSub.setExpansionAttr10("ou=Students,ou=CISUsers");
                            wUserSub.setExpansionAttr11("OU=student");
                            wUserSub.setExpansionAttr12("ou=students,ou=cisusers");
                            wUserSub.setExpansionAttr13("ou=res");
                            wUserSub.setExpansionAttr14("C:\\Users\\res\\" + userId);
                            wUserSub.setExpansionAttr15("\\\\cs18\\home\\" + userId);
                            wUserSub.setExpansionAttr16("/res/" + userId);
                            wUserSub.setExpansionAttr17("/cis/home/" + userId);
                            wUserSub.setExpansionAttr18("/cis/home/" + userId);
                            wUserSub.setExpansionAttr19("\\\\ia203\\home\\student\\" + userId);
                            wUserSub.setExpansionAttr20("/bin/csh");
                            wUserSub.setExpansionAttr21("/bin/bash");
                            wUserSub.setExpansionAttr22("C:\\WINDOWS\\fjsys\\userprof");
                            wUserSub.setExpansionAttr23("C:\\WINDOWS\\fjsys\\userprof");
                            wUserSub.setExpansionAttr24("logon.bat");
                            wUserSub.setExpansionAttr25("");
                            wUserSub.setExpansionAttr26("3848");
                            wUserSub.setExpansionAttr27("3848");
                            wUserSub.setExpansionAttr28("ist3000");
                            break;
                        //4：ビジター"
                        case "4":

                            wUserSystemSub.setApplicationUseFlag02(INVALID_FLAG);
                            wUserSystemSub.setApplicationUseFlag03(INVALID_FLAG);
                            vpnStatus = checkVPNValue(entity.getColumn5());
                            wUserSystemSub.setApplicationUseFlag04(vpnStatus ? VALID_FLAG : INVALID_FLAG);
                            wUserSystemSub.setApplicationUseFlag05(VALID_FLAG);
                            wUserSystemSub.setApplicationUseFlag06(INVALID_FLAG);

                            wUserSystemSub.setSystemValidFlag01(INVALID_FLAG);
                            if (vpnStatus) {
                                wUserSystemSub.setSystemValidFlag02(VALID_FLAG);
                            } else {
                                wUserSystemSub.setSystemValidFlag02(INVALID_FLAG);
                            }
                            wUserSystemSub.setSystemValidFlag03(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag04(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag05(INVALID_FLAG);
                            wUserSystemSub.setSystemValidFlag06(INVALID_FLAG);
                            wUserSystemSub.setSystemValidFlag07(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag08(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag09(VALID_FLAG);
                            wUserSystemSub.setSystemValidFlag10(INVALID_FLAG);

                            wUserSub.setExpansionAttr2(squence);
                            wUserSub.setExpansionAttr3(squence);
                            wUserSub.setExpansionAttr4("2000");
                            wUserSub.setExpansionAttr5("900");
                            wUserSub.setExpansionAttr6("res");
                            wUserSub.setExpansionAttr7("home");
                            wUserSub.setExpansionAttr8("");
                            wUserSub.setExpansionAttr9("ou=res");
                            wUserSub.setExpansionAttr10("ou=Students,ou=CISUsers");
                            wUserSub.setExpansionAttr11("OU=student");
                            wUserSub.setExpansionAttr12("ou=students,ou=cisusers");
                            wUserSub.setExpansionAttr13("ou=res");
                            wUserSub.setExpansionAttr14("C:\\Users\\res\\" + userId);
                            wUserSub.setExpansionAttr15("\\\\cs18\\home\\" + userId);
                            wUserSub.setExpansionAttr16("/res/" + userId);
                            wUserSub.setExpansionAttr17("/cis/home/" + userId);
                            wUserSub.setExpansionAttr18("/cis/home/" + userId);
                            wUserSub.setExpansionAttr19("\\\\ia203\\home\\student\\" + userId);
                            wUserSub.setExpansionAttr20("/bin/csh");
                            wUserSub.setExpansionAttr21("/bin/bash");
                            wUserSub.setExpansionAttr22("C:\\WINDOWS\\fjsys\\userprof");
                            wUserSub.setExpansionAttr23("C:\\WINDOWS\\fjsys\\userprof");
                            wUserSub.setExpansionAttr24("logon.bat");
                            wUserSub.setExpansionAttr25("");
                            wUserSub.setExpansionAttr26("3832");
                            wUserSub.setExpansionAttr27("3832");
                            wUserSub.setExpansionAttr28("ist3000");

                            break;
                    }
                    wUserSub.setExpansionAttr29(entity.getColumn3());
                    wUserSub.setExpansionAttr30(entity.getColumn2());
                    wUserSub.setExpansionAttr31("66080");
                    //グループ情報の設定
                    String systemFlag02 = wUserSystemSub.getSystemValidFlag02();
                    String systemFlag04 = wUserSystemSub.getSystemValidFlag04();
                    String systemFlag05 = wUserSystemSub.getSystemValidFlag05();

                    wUserSub.setEmploymentKbn(entity.getColumn1());
                    StringBuilder stringBuilder = new StringBuilder();
                    //グループ情報設定
                    //教員、職員の場合
                    if (Arrays.asList(Arrays.copyOf(userTypes, 2)).contains(entity.getColumn1())) {
                        //教員、職員->利用者ID + @ist.aichi-pu.ac.jp
                        wUserSub.setMailaddr(entity.getUserId() + "@ist.aichi-pu.ac.jp");
                        if (VALID_FLAG.equals(systemFlag02)) {
                            stringBuilder.append("ist_ist");
                        }
                        if (VALID_FLAG.equals(systemFlag04)) {
                            if (stringBuilder.length() > 0) {
                                stringBuilder.append(",");
                            }
                            stringBuilder.append("cis_sensei");
                        }
                        if (VALID_FLAG.equals(systemFlag05)) {
                            if (stringBuilder.length() > 0) {
                                stringBuilder.append(",");
                            }
                            stringBuilder.append("cis1_sensei");
                        }
                    }//学生・ビジターの場合
                    else {
                        //学生、ビジター->利用者ID + @cis.aichi-pu.ac.jp
                        wUserSub.setMailaddr(entity.getUserId() + "@cis.aichi-pu.ac.jp");

                        if (VALID_FLAG.equals(systemFlag02)) {
                            stringBuilder.append("ist_res");
                        }
                        if (VALID_FLAG.equals(systemFlag04)) {
                            if (stringBuilder.length() > 0) {
                                stringBuilder.append(",");
                            }
                            stringBuilder.append("cis_home");
                        }
                    }
                    wUserSub.setExpansionAttr32(stringBuilder.toString());
                    //入学年度設定
                    wUserSub.setExpansionAttr33(entity.getColumn4().substring(0, 4));
                    
                    wUserSystemSubList.add(clearNull(wUserSystemSub));
                    wUserSubList.add(wUserSub);
                }
            }

            //ユーザ数分ループする（終了）↑
            //「アップロード一時登録」にて、アップロード情報を登録する
            //「アップロードファイル一時登録」にて、アップロードされたユーザ情報を登録する
            userCsvService.processBatch(wUserSubList, wUserSystemSubList, wUploadSub, entityList);
//                wUploadFileSubService.updateWUploadFileSubList(errorList);

            //ADD ON部分 END
//            }
            LogService.info(OWN_TITLE, OWN_NAME, "CSVアップロード処理", "アップロードファイル一時に" + entityList.size() + "件データ登録しました。");

            // ここでデータベースへの挿入などの操作を実行します
            LogService.info(OWN_TITLE, OWN_NAME, "CSVアップロード処理", "正常終了");
            // 成功した場合、成功メッセージを返します
            message = ms.getMessage("MSTO0017M0001", new String[]{entityList.size() + "件データ"}, null);
            UserCsvResponseObject responseObject = new UserCsvResponseObject(entityList, message);
            return ResponseEntity.ok(responseObject);
        } catch (IOException e) {
            LogService.system(OWN_TITLE, OWN_NAME, "CSVアップロード処理", "失敗した");
            LogService.system(ExceptionUtils.getStackTrace(e));
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ms.getMessage("MSTO0017M0003", null, null));
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        } catch (CsvException e) {
            message = ms.getMessage("MSTO0014M0001", null, null);
            LogService.system(OWN_TITLE, OWN_NAME, "CSVアップロード処理", message);
            LogService.system(ExceptionUtils.getStackTrace(e));
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ms.getMessage(msg, null, null));
            UserCsvResponseObject responseObject = new UserCsvResponseObject(null, message);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseObject);
        } catch (Exception e) {
            message = ms.getMessage("MSTO0014M0001", null, null);
            LogService.system(OWN_TITLE, OWN_NAME, "CSVアップロード処理", message);
            LogService.system(ExceptionUtils.getStackTrace(e));
            UserCsvResponseObject responseObject = new UserCsvResponseObject(null, message);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseObject);
        }

    }

    /**
     * Nullを0にする
     * @param wUserSystemSub
     * @return
     */
    private WUserSystemSub clearNull(WUserSystemSub wUserSystemSub) {
		wUserSystemSub.setApplicationUseFlag01(wUserSystemSub.getApplicationUseFlag01() == null || "".equals(wUserSystemSub.getApplicationUseFlag01()) ? "0" : wUserSystemSub.getApplicationUseFlag01());
		wUserSystemSub.setApplicationUseFlag02(wUserSystemSub.getApplicationUseFlag02() == null || "".equals(wUserSystemSub.getApplicationUseFlag02()) ? "0" : wUserSystemSub.getApplicationUseFlag02());
		wUserSystemSub.setApplicationUseFlag03(wUserSystemSub.getApplicationUseFlag03() == null || "".equals(wUserSystemSub.getApplicationUseFlag03()) ? "0" : wUserSystemSub.getApplicationUseFlag03());
		wUserSystemSub.setApplicationUseFlag04(wUserSystemSub.getApplicationUseFlag04() == null || "".equals(wUserSystemSub.getApplicationUseFlag04()) ? "0" : wUserSystemSub.getApplicationUseFlag04());
		wUserSystemSub.setApplicationUseFlag05(wUserSystemSub.getApplicationUseFlag05() == null || "".equals(wUserSystemSub.getApplicationUseFlag05()) ? "0" : wUserSystemSub.getApplicationUseFlag05());
		wUserSystemSub.setApplicationUseFlag06(wUserSystemSub.getApplicationUseFlag06() == null || "".equals(wUserSystemSub.getApplicationUseFlag06()) ? "0" : wUserSystemSub.getApplicationUseFlag06());
		wUserSystemSub.setApplicationUseFlag07(wUserSystemSub.getApplicationUseFlag07() == null || "".equals(wUserSystemSub.getApplicationUseFlag07()) ? "0" : wUserSystemSub.getApplicationUseFlag07());
		wUserSystemSub.setApplicationUseFlag08(wUserSystemSub.getApplicationUseFlag08() == null || "".equals(wUserSystemSub.getApplicationUseFlag08()) ? "0" : wUserSystemSub.getApplicationUseFlag08());
		wUserSystemSub.setApplicationUseFlag09(wUserSystemSub.getApplicationUseFlag09() == null || "".equals(wUserSystemSub.getApplicationUseFlag09()) ? "0" : wUserSystemSub.getApplicationUseFlag09());
		wUserSystemSub.setApplicationUseFlag10(wUserSystemSub.getApplicationUseFlag10() == null || "".equals(wUserSystemSub.getApplicationUseFlag10()) ? "0" : wUserSystemSub.getApplicationUseFlag10());
		wUserSystemSub.setApplicationUseFlag11(wUserSystemSub.getApplicationUseFlag11() == null || "".equals(wUserSystemSub.getApplicationUseFlag11()) ? "0" : wUserSystemSub.getApplicationUseFlag11());
		wUserSystemSub.setApplicationUseFlag12(wUserSystemSub.getApplicationUseFlag12() == null || "".equals(wUserSystemSub.getApplicationUseFlag12()) ? "0" : wUserSystemSub.getApplicationUseFlag12());
		wUserSystemSub.setApplicationUseFlag13(wUserSystemSub.getApplicationUseFlag13() == null || "".equals(wUserSystemSub.getApplicationUseFlag13()) ? "0" : wUserSystemSub.getApplicationUseFlag13());
		wUserSystemSub.setApplicationUseFlag14(wUserSystemSub.getApplicationUseFlag14() == null || "".equals(wUserSystemSub.getApplicationUseFlag14()) ? "0" : wUserSystemSub.getApplicationUseFlag14());
		wUserSystemSub.setApplicationUseFlag15(wUserSystemSub.getApplicationUseFlag15() == null || "".equals(wUserSystemSub.getApplicationUseFlag15()) ? "0" : wUserSystemSub.getApplicationUseFlag15());
		wUserSystemSub.setApplicationUseFlag16(wUserSystemSub.getApplicationUseFlag16() == null || "".equals(wUserSystemSub.getApplicationUseFlag16()) ? "0" : wUserSystemSub.getApplicationUseFlag16());
		wUserSystemSub.setApplicationUseFlag17(wUserSystemSub.getApplicationUseFlag17() == null || "".equals(wUserSystemSub.getApplicationUseFlag17()) ? "0" : wUserSystemSub.getApplicationUseFlag17());
		wUserSystemSub.setApplicationUseFlag18(wUserSystemSub.getApplicationUseFlag18() == null || "".equals(wUserSystemSub.getApplicationUseFlag18()) ? "0" : wUserSystemSub.getApplicationUseFlag18());
		wUserSystemSub.setApplicationUseFlag19(wUserSystemSub.getApplicationUseFlag19() == null || "".equals(wUserSystemSub.getApplicationUseFlag19()) ? "0" : wUserSystemSub.getApplicationUseFlag19());
		wUserSystemSub.setApplicationUseFlag20(wUserSystemSub.getApplicationUseFlag20() == null || "".equals(wUserSystemSub.getApplicationUseFlag20()) ? "0" : wUserSystemSub.getApplicationUseFlag20());
    	return wUserSystemSub;
	}

	private void validateAndAddError(String fieldName, String fieldValue, MessageSource ms, JsonObject jsonObject, String messageKey) {
        if (validate(fieldValue)) {
            jsonObject.addProperty(fieldName, ms.getMessage(messageKey, null, null));
        }
    }

    private void validateAndAddError(String fieldName, Date fieldValue, Date criterionDt, MessageSource ms, JsonObject jsonObject, String messageKey) {
        if (fieldValue != null && criterionDt.compareTo(fieldValue) > 0) {
            jsonObject.addProperty(fieldName, ms.getMessage(messageKey, null, null));
        }
    }

    private boolean validate(Object value) {
        return value == null;

    }

    private boolean validate(String obj) {
        return obj == null || obj.isEmpty();
    }

    private String generateUserId(String studentNumber) {
        String entryYear = studentNumber.substring(0, 4); // 入学年度を取得（4桁の数字）
        String lastTwoDigits = entryYear.substring(2); // 入学年度の最後の2桁を取得
        String userIdPrefix = studentNumber.substring(4, 6); // 学籍番号の5〜6位を取得
        String lastFourNumber = studentNumber.substring(6);  // 最後の4桁の数字

        String userId = "";
        if ("31".equals(userIdPrefix)) {
            userId = "is" + lastTwoDigits + lastFourNumber;
        } else if ("83".equals(userIdPrefix)) {
            userId = "im" + lastTwoDigits + lastFourNumber;
        } else if ("84".equals(userIdPrefix)) {
            userId = "id" + lastTwoDigits + lastFourNumber;
        }

        return userId;
    }

    private String[] getLastNameAndFirstName(String fullName) {
        String[] parts = fullName.split("[　\\s]+");
        if (parts.length == 2) {
            String lastName = parts[0];
            String firstName = parts[1];
            return new String[]{lastName, firstName};
        } else {
            return new String[]{"", ""};
        }
    }

    public boolean checkVPNValue(String vpn) {
        return "*".equals(vpn) || "1".equals(vpn);
    }

}
