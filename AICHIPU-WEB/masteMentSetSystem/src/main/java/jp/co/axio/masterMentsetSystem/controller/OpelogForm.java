package jp.co.axio.masterMentsetSystem.controller;

import java.util.List;

import jp.co.axio.masterMentsetSystem.dto.PulldownItemDto;
import jp.co.axio.masterMentsetSystem.dto.UserAnnCmbOrgDto;
import jp.co.axio.masterMentsetSystem.dto.UserCareerInfoDto;
import jp.co.axio.masterMentsetSystem.dto.UserDetailDto;
import jp.co.axio.masterMentsetSystem.dto.UserGrpDto;
import jp.co.axio.masterMentsetSystem.dto.UserManCmbOrgDto;
import jp.co.axio.masterMentsetSystem.dto.UserOtherInfoDto;
import jp.co.axio.masterMentsetSystem.dto.UserPositionInfoDto;
import jp.co.axio.masterMentsetSystem.dto.UserSysDto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OpelogForm {
	
	//機能名
	public String opName;
	
	//機能名List
	public List<PulldownItemDto> opNameList;

	//操作者ID
	public String opUserId;

	//対象者ID
	public String targetUserId;

	//操作日時
	public String startDt;

	//操作日時
	public String endDt;


}
