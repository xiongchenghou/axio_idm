package jp.co.axio.masterMentsetSystem.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.MmsConstants;
import jp.co.axio.masterMentsetSystem.controller.OpelogForm;
import jp.co.axio.masterMentsetSystem.dto.PulldownItemDto;
import jp.co.axio.masterMentsetSystem.model.OOpeLog;
import jp.co.axio.masterMentsetSystem.model.OOpeLogExample;
import jp.co.axio.masterMentsetSystem.repository.MPasswordMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserExpansionMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserMapper;
import jp.co.axio.masterMentsetSystem.repository.MgpCodeMstMapper;
import jp.co.axio.masterMentsetSystem.repository.OOpeLogMapper;
import jp.co.axio.masterMentsetSystem.repository.TPasswordHistMapper;
import jp.co.axio.masterMentsetSystem.repository.TUserSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.TUserSystemSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.VAdminMaintenanceEntityMapper;

/**
 * ユーザーサービスクラス
 *
 * @author AXIO
 * @version 1.0
 */
@Service
public class OpelogService {

	
	@Autowired
	CommonService commonService;
	
	@Autowired
	TPasswordHistMapper tPasswordHistMapper;
	
	@Autowired
	TUserSubEntityMapper tUserSubEntityMapper;
	
	@Autowired
	TUserSystemSubEntityMapper tUserSystemSubEntityMapper;

	@Autowired
	VAdminMaintenanceEntityMapper vAdminMaintenanceEntityMapper;
	
	@Autowired
	MUserExpansionMapper mUserExpansionMapper;
	
	@Autowired
	MgpCodeMstMapper mgpCodeMstMapper;
	
	@Autowired
	OOpeLogMapper oOpeLogMapper;
	
	@Autowired
	MPasswordMapper mPasswordMapper;
	
	@Autowired
	MUserMapper mUserMapper;
	
	public String errorMsg;

	/**
	 * メッセージソース
	 */
	@Autowired
	MessageSource messageSource;
	/**
	 * セッション
	 */
	@Autowired
	HttpSession session;
	
    /** 自画面のタイトル */
    public static final String OWN_TITLE = "利用者管理機能：利用者詳細";
    
    private final DatabaseService databaseService;
    
    @Autowired
    public OpelogService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

	/**
	 * 初期表示のFormを初期化
	 * @return
	 */
	public OpelogForm initOpelogForm() {
		OpelogForm result = new OpelogForm();
		result.setOpNameList(commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01019));
		return result;
	}

	/**
	 * 操作ログ検索
	 * @param form
	 * @return
	 * @throws ParseException 
	 */
	public List<Map<String, String>> searchOpelog(OpelogForm form) throws ParseException {


    	List<Map<String,String>> result = new ArrayList<Map<String,String>>();
    	OOpeLogExample condi = new OOpeLogExample();
    	OOpeLogExample.Criteria criteria = condi.createCriteria();
    	
    	if(form.getOpName() != null && !"".equals(form.getOpName()) ) {
    		criteria.andFuncIdEqualTo(form.getOpName());
    	}
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    	if(form.getStartDt() != null && !"".equals(form.getStartDt()) ) {
    		criteria.andOperationTsGreaterThanOrEqualTo(sdf.parse(form.getStartDt().replace("T", " ")));
    	}
    	
    	if(form.getEndDt() != null && !"".equals(form.getEndDt()) ) {
    		criteria.andOperationTsLessThanOrEqualTo(sdf.parse(form.getEndDt().replace("T", " ")));
    	}
    	if(form.getOpUserId() != null && !"".equals(form.getOpUserId()) ) {
    		criteria.andOperationUserIdLike("%" + form.getOpUserId() + "%" );
    	}
    	if(form.getTargetUserId() != null && !"".equals(form.getTargetUserId()) ) {
    		criteria.andTargetUserIdLike("%" + form.getTargetUserId() + "%" );
    	}
    	condi.setOrderByClause(" operation_ts desc ");
    	List<OOpeLog> recList = oOpeLogMapper.selectByExample(condi);
    	
    	
    	result = convertToMapList(recList);
    	
		
		return result;
	}

	/**
	 * 検索結果を画面に表示するJSONに変換
	 * @param recList
	 * @return
	 */
	private List<Map<String, String>> convertToMapList(List<OOpeLog> recList) {
        List<Map<String, String>> mapList = new ArrayList<>();

        // フォーマットを指定してSimpleDateFormatを作成
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        for (OOpeLog ooepLog : recList) {
            Map<String, String> map = new HashMap<>();
            map.put("opName", ooepLog.getFuncName());
            map.put("opDt", sdf.format(ooepLog.getOperationTs()));
            map.put("opUserId", ooepLog.getOperationUserId());
            map.put("targetUserId", ooepLog.getTargetUserId());
            map.put("detail", ooepLog.getOperationDetail());

            mapList.add(map);
        }

        return mapList;
	}

	/**
	 * コードより名称を取得
	 * @param opName 
	 * @return
	 */
	private String getOpname(String opName) {
		List<PulldownItemDto>  opNameList = commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01019);
		for (PulldownItemDto pulldownItemDto : opNameList) {
			if(pulldownItemDto.getValue().equals(opName)) {
				return pulldownItemDto.getLabel();
			}
		}
		return null;
	}
    



}
