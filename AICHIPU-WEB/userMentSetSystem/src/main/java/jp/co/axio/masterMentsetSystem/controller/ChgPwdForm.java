package jp.co.axio.masterMentsetSystem.controller;

import java.io.Serializable;
import java.util.List;

import jp.co.axio.masterMentsetSystem.dto.PasswordHisDto;
import jp.co.axio.masterMentsetSystem.dto.PulldownItemDto;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChgPwdForm extends accessForm implements Serializable {

	/**
	 * ユーザ新規作成フォーム
	 */
	private static final long serialVersionUID = 1L;
	
	public String userId;
	
	public String nowPassword;
	
	public String newPassword;
	
	public String newPasswordConfirm;
	
	public String langDiv;


}
