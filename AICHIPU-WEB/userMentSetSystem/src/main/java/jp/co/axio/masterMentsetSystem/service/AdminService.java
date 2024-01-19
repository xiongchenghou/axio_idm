package jp.co.axio.masterMentsetSystem.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;
import jp.co.axio.masterMentsetSystem.common.MmsConstants;
import jp.co.axio.masterMentsetSystem.controller.AdminForm;
import jp.co.axio.masterMentsetSystem.model.MUserSystem;
import jp.co.axio.masterMentsetSystem.model.VSearchUserEntity;
import jp.co.axio.masterMentsetSystem.model.VSearchUserEntityExample;
import jp.co.axio.masterMentsetSystem.model.VSearchUserEntityExample.Criteria;
import jp.co.axio.masterMentsetSystem.repository.MPasswordMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserExpansionMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserMapper;
import jp.co.axio.masterMentsetSystem.repository.MUserSystemMapper;
import jp.co.axio.masterMentsetSystem.repository.MgpCodeMstMapper;
import jp.co.axio.masterMentsetSystem.repository.OOpeLogMapper;
import jp.co.axio.masterMentsetSystem.repository.TPasswordHistMapper;
import jp.co.axio.masterMentsetSystem.repository.TUserSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.TUserSystemSubEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.VAdminMaintenanceEntityMapper;
import jp.co.axio.masterMentsetSystem.repository.VSearchUserEntityMapper;

/**
 * ユーザーサービスクラス
 *
 * @author AXIO
 * @version 1.0
 */
@Service
public class AdminService {

	
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
	VSearchUserEntityMapper vSearchUserEntityMapper;

	@Autowired
	MPasswordMapper mPasswordMapper;
	
	@Autowired
	MUserMapper mUserMapper;
	
	@Autowired
	MUserSystemMapper mUserSystemMapper;
	
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
    public static final String OWN_TITLE = "管理者権限画面 Service";
    
    private final DatabaseService databaseService;
    
    @Autowired
    public AdminService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

	/**
	 * 初期表示のFormを初期化
	 * @return
	 */
	public AdminForm initAdminForm() {
		AdminForm form = new AdminForm();

        // 利用者区分プルダウン
        form.setUserDivList(commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_00003));
        // キャンパスプルダウン
        form.setCampusList(commonService.getGpCodeMstList(MmsConstants.MST_CODE_CATEGORY_01007));
        // 所属プルダウン
        form.setDepartmentList(commonService.getOrgList(MmsConstants.COMPANY_CODE_COLLEGE));

		return form;
	}

	/**
	 * ユーザを検索
	 * @param form
	 * @return
	 * @throws ParseException 
	 */
	public List<Map<String, String>> searchUser(AdminForm form) throws ParseException {


    	List<Map<String,String>> result = new ArrayList<Map<String,String>>();
    	VSearchUserEntityExample condi = from2Dto(form);

    	List<VSearchUserEntity> recList = vSearchUserEntityMapper.selectByExample(condi);
    	
    	result = convertToMapList(recList);
    	
		
		return result;
	}

	/**
	 * @param form
	 * @return
	 */
	private VSearchUserEntityExample from2Dto(AdminForm form) {
		VSearchUserEntityExample exp = new VSearchUserEntityExample();

		Criteria criteria = exp.createCriteria();
		
		if(form.getUserId() != null && !"".equals(form.getUserId())) {
			criteria.andUserIdLike("%" + form.getUserId() + "%");
		}
		if(form.getUserDiv() != null && !"".equals(form.getUserDiv())) {
			criteria.andEmploymentKbnEqualTo(form.getUserDiv());
		}
		if(form.getFullNameJp() != null && !"".equals(form.getFullNameJp())) {
			criteria.andFullnameJpLike("%" + form.getFullNameJp() + "%");
		}
		
		if(form.getFullNameEn() != null && !"".equals(form.getFullNameEn())) {
			criteria.andFullnameEnLike("%" + form.getFullNameEn() + "%");
		}
		if(form.getCampus() != null && !"".equals(form.getCampus())) {
			criteria.andCmapusEqualTo(form.getCampus());
		}
		if(form.getDepartment() != null && !"".equals(form.getDepartment())) {
			String depCode = form.getDepartment();
			if(depCode.indexOf("-") >=0) {
				depCode = depCode.substring(depCode.indexOf("-") + 1);
			}
			criteria.andOrganizationCodeEqualTo(depCode);
		}
		if(form.getEntranceYear() != null && !"".equals(form.getEntranceYear())) {
			criteria.andEntranceYearLike("%" + form.getEntranceYear() + "%");
		}
		if(form.getVpnFlg() != null && !"".equals(form.getVpnFlg())) {
			if("1".equals(form.getVpnFlg())) {
				criteria.andVpnEqualTo(form.getVpnFlg());
			}else {
				criteria.andVpnNotEqualTo(form.getVpnFlg());
				exp.or(exp.createCriteria().andVpnIsNull());
			}
			
		}
		if(form.getAdminFlg() != null && !"".equals(form.getAdminFlg())) {
			if("1".equals(form.getAdminFlg())) {
				criteria.andAdminFlagEqualTo(form.getAdminFlg());
			}else {
				criteria.andAdminFlagNotEqualTo("1");
				exp.or(exp.createCriteria().andAdminFlagIsNull());
			}
		}
		
        List<String> status = new ArrayList<>();

        if (form.isValidUserChecked()){
            status.add("valid");
        }
        if (form.isDeleteUserChecked()){
            status.add("invalid");
        }
        if (form.isLockUserChecked()){
            status.add("lock");
        }
        if (form.isFutureUserChecked()){
            status.add("reserve");
        }
        if(status.size()>0) {
        	criteria.andStatusIn(status);
        }
		
		return exp;
	}

	/**
	 * 検索結果を画面に表示するJSONに変換
	 * @param recList
	 * @return
	 */
	private List<Map<String, String>> convertToMapList(List<VSearchUserEntity> recList) {
        List<Map<String, String>> mapList = new ArrayList<>();

        for (VSearchUserEntity vSearchUser : recList) {
            Map<String, String> map = new HashMap<>();
            map.put("adminFlg", vSearchUser.getAdminFlag());
            map.put("status", vSearchUser.getStatus());
            map.put("userId", vSearchUser.getUserId());
            map.put("riyoushaDiv", vSearchUser.getEmploymentName());
            map.put("nameJp", vSearchUser.getFullnameJp());
            map.put("nameEn", vSearchUser.getFullnameEn());
            map.put("orgNm", vSearchUser.getDepartment());
            map.put("vpnFlg", vSearchUser.getVpn());

            mapList.add(map);
        }

        return mapList;
	}

	/**
	 * 管理者権限を設定
	 * @param form
	 */
	public void setAdminFlg(AdminForm form) {
		MUserSystem mUserSys = mUserSystemMapper.selectByPrimaryKey(form.getUserId());
		mUserSys.setAdminFlag(form.getSetAdminFlg());
		
		mUserSystemMapper.updateByPrimaryKey(mUserSys);
		
		//操作ログを登録
		if("1".equals(form.getSetAdminFlg())) {
			commonService.insOpelog(MmsConstants.FUNC_ID_3000, MmsConstants.FUNC_ID_3000_LABEL, form.getUserId(), "管理者権限を付与しました");
		}else {
			commonService.insOpelog(MmsConstants.FUNC_ID_3000, MmsConstants.FUNC_ID_3000_LABEL, form.getUserId(), "管理者権限を剥奪しました");
		}
		
		
	}

}
