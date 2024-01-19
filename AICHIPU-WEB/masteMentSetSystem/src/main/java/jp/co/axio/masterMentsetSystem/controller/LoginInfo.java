package jp.co.axio.masterMentsetSystem.controller;

import java.util.List;

import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.NotEmpty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import lombok.Getter;
import lombok.Setter;

/**
 * ログイン情報
 * @author sa
 *
 */
@Setter
@Getter
public class LoginInfo {

	/**
	 * serialVersionUID
	 */
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;

	/**
	 * ログインユーザーID
	 */
	@NotEmpty(message = "利用者IDは必須です")
	private String userId;

	/**
	 * パスワード
	 */
	@NotEmpty(message = "パスワードは必須です")
	private String pass;


	/**
	 * 管理者フラグ true:管理者権限,false：利用者権限
	 */
	@SuppressWarnings("unused")
	private Boolean isAdmin;

	/**
	 * パスワード一致フラグ
	 */
	@SuppressWarnings("unused")
	private Boolean isPasswordMatchFlag;


	/**
	 * 管理者フラグ
	 */
	@SuppressWarnings("unused")
	private String adminFlag;


	/**
	 * ユーザパスワード
	 */
	@SuppressWarnings("unused")
	private String currPassword;

	/**
	 * メッセージ
	 */
	private String errMessage;


	/**
	 * コンストラクタ
	 * @param userId ログインユーザーID(ldap.uid, m_user.user_id)
	 * @param isAdmin 管理者フラグ
	 */
	public LoginInfo(String userId, Boolean isAdmin) {
		this.userId = userId;
		this.isAdmin = isAdmin;
	}

	/**
	 * コンストラクタ
	 */
	public LoginInfo() {
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}
}
