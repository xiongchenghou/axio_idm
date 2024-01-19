package jp.co.axio.masterMentsetSystem.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jp.co.axio.masterMentsetSystem.dto.PulldownItemDto;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Setter
@Getter
public class UserCsvForm extends accessForm implements Serializable {


    /**
     * 利用者CSV管理-フォーム
     */
    @Serial
    private static final long serialVersionUID = 1L;


    /**
     * 複数利用者ID
     */
    public List<String> userId;

    /** 利用者ID */
    public List<String> riYouShaIds;

    /** 反映日 */
    public String reflectionDate;

}
