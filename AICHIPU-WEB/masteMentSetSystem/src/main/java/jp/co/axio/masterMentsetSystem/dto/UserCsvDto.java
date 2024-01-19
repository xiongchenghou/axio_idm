package jp.co.axio.masterMentsetSystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * 利用者CSV管理DTO
 *
 * @author a004811
 */
@Setter
@Getter
public class UserCsvDto {


    /**
     * アップロードユーザーID
     */
    private String uploadUserId;

    /**
     * アップロード日時
     */
    private Date uploadUserTs;

    /**
     * アップロードセッション
     */
    private String uploadSession;

    /**
     * 処理フラグ
     */
    private String processFlag;

    /**
     * 登録者ID
     */
    private String registerId;

    /**
     * 登録日時
     */
    private Date registTs;

    /**
     * 更新者ID
     */
    private String updaterId;

    /**
     * 更新日時
     */
    private Date updateTs;



}
