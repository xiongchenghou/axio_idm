package jp.co.axio.masterMentsetSystem.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * AJAXの実行結果を返すDTO
 *
 * @author axio
 */

@Setter
@Getter
public class AjaxResultDto {

	/** チェック結果メッセージ */
	private String chkResult;
	
}
