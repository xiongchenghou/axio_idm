package jp.co.axio.masterMentsetSystem.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ユーザシステム利用一時
 * @TableName w_user_system_sub
 */
@TableName(value ="w_user_system_sub")
@Data
public class WUserSystemSub implements Serializable {
    /**
     * ユーザーID
     */
    private String userId;

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
     * 反映日
     */
    private Date reflectionDate;

    /**
     * アプリケーション利用フラグ01
     */
    @TableField("application_use_flag_01")
    private String applicationUseFlag01;

    /**
     * アプリケーション利用フラグ02
     */
    @TableField("application_use_flag_02")
    private String applicationUseFlag02;

    /**
     * アプリケーション利用フラグ03
     */
    @TableField("application_use_flag_03")
    private String applicationUseFlag03;

    /**
     * アプリケーション利用フラグ04
     */
    @TableField("application_use_flag_04")
    private String applicationUseFlag04;

    /**
     * アプリケーション利用フラグ05
     */
    @TableField("application_use_flag_05")
    private String applicationUseFlag05;

    /**
     * アプリケーション利用フラグ06
     */
    @TableField("application_use_flag_06")
    private String applicationUseFlag06;

    /**
     * アプリケーション利用フラグ07
     */
    @TableField("application_use_flag_07")
    private String applicationUseFlag07;

    /**
     * アプリケーション利用フラグ08
     */
    @TableField("application_use_flag_08")
    private String applicationUseFlag08;

    /**
     * アプリケーション利用フラグ09
     */
    @TableField("application_use_flag_09")
    private String applicationUseFlag09;

    /**
     * アプリケーション利用フラグ10
     */
    @TableField("application_use_flag_10")
    private String applicationUseFlag10;

    /**
     * アプリケーション利用フラグ11
     */
    @TableField("application_use_flag_11")
    private String applicationUseFlag11;

    /**
     * アプリケーション利用フラグ12
     */
    @TableField("application_use_flag_12")
    private String applicationUseFlag12;

    /**
     * アプリケーション利用フラグ13
     */
    @TableField("application_use_flag_13")
    private String applicationUseFlag13;

    /**
     * アプリケーション利用フラグ14
     */
    @TableField("application_use_flag_14")
    private String applicationUseFlag14;

    /**
     * アプリケーション利用フラグ15
     */
    @TableField("application_use_flag_15")
    private String applicationUseFlag15;

    /**
     * アプリケーション利用フラグ16
     */
    @TableField("application_use_flag_16")
    private String applicationUseFlag16;

    /**
     * アプリケーション利用フラグ17
     */
    @TableField("application_use_flag_17")
    private String applicationUseFlag17;

    /**
     * アプリケーション利用フラグ18
     */
    @TableField("application_use_flag_18")
    private String applicationUseFlag18;

    /**
     * アプリケーション利用フラグ19
     */
    @TableField("application_use_flag_19")
    private String applicationUseFlag19;

    /**
     * アプリケーション利用フラグ20
     */
    @TableField("application_use_flag_20")
    private String applicationUseFlag20;

    /**
     * システム有効フラグ01
     */
    @TableField("system_valid_flag_01")
    private String systemValidFlag01;

    /**
     * システム有効フラグ02
     */
    @TableField("system_valid_flag_02")
    private String systemValidFlag02;

    /**
     * システム有効フラグ03
     */
    @TableField("system_valid_flag_03")
    private String systemValidFlag03;

    /**
     * システム有効フラグ04
     */
    @TableField("system_valid_flag_04")
    private String systemValidFlag04;

    /**
     * システム有効フラグ05
     */
    @TableField("system_valid_flag_05")
    private String systemValidFlag05;

    /**
     * システム有効フラグ06
     */
    @TableField("system_valid_flag_06")
    private String systemValidFlag06;

    /**
     * システム有効フラグ07
     */
    @TableField("system_valid_flag_07")
    private String systemValidFlag07;

    /**
     * システム有効フラグ08
     */
    @TableField("system_valid_flag_08")
    private String systemValidFlag08;

    /**
     * システム有効フラグ09
     */
    @TableField("system_valid_flag_09")
    private String systemValidFlag09;

    /**
     * システム有効フラグ10
     */
    @TableField("system_valid_flag_10")
    private String systemValidFlag10;

    /**
     * システム有効フラグ11
     */
    @TableField("system_valid_flag_11")
    private String systemValidFlag11;

    /**
     * システム有効フラグ12
     */
    @TableField("system_valid_flag_12")
    private String systemValidFlag12;

    /**
     * システム有効フラグ13
     */
    @TableField("system_valid_flag_13")
    private String systemValidFlag13;

    /**
     * システム有効フラグ14
     */
    @TableField("system_valid_flag_14")
    private String systemValidFlag14;

    /**
     * システム有効フラグ15
     */
    @TableField("system_valid_flag_15")
    private String systemValidFlag15;

    /**
     * システム有効フラグ16
     */
    @TableField("system_valid_flag_16")
    private String systemValidFlag16;

    /**
     * システム有効フラグ17
     */
    @TableField("system_valid_flag_17")
    private String systemValidFlag17;

    /**
     * システム有効フラグ18
     */
    @TableField("system_valid_flag_18")
    private String systemValidFlag18;

    /**
     * システム有効フラグ19
     */
    @TableField("system_valid_flag_19")
    private String systemValidFlag19;

    /**
     * システム有効フラグ20
     */
    @TableField("system_valid_flag_20")
    private String systemValidFlag20;

    /**
     * 管理者権限フラグ
     */
    private String adminFlag;

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