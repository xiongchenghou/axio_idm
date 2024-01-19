package jp.co.axio.masterMentsetSystem.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PulldownItemDto {

	public PulldownItemDto(String _value, String _label) {
		this.label = _label;
		this.value = _value;
	}
	/** 項目値 */
	private String value;
	/** 項目ラベル */
	private String label;
}
