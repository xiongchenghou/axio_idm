package jp.co.axio.masterMentsetSystem.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * アップロード一時
 */
@Data
public class WUploadSub implements Serializable {
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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}