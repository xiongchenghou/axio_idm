package jp.co.axio.masterMentsetSystem.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * 
 * @TableName V_SEARCH_USER
 */
@Data
public class VSearchUser implements Serializable {
    /**
     * ユーザーID
     */
    private String userId;

    /**
     * ユーザー状態
     */
    private String status;

    /**
     *
     */
    private String futureUserFlag;

    /**
     * 反映待ち情報
     */
    private String userReserve;

    /**
     * 利用者区分コード
     */
    private String employmentKbn;

    /**
     * 利用者区分
     */
    private String employmentName;

    /**
     * 氏名(漢字)
     */
    private String fullnameJp;

    /**
     * 氏名(英字)
     */
    private String fullnameEn;

    /**
     * 勤務地コード
     */
    private String locationCode;

    /**
     * 勤務地
     */
    private String cmapus;

    /**
     * 所属組織コード
     */
    private String organizationCode;

    /**
     * 組織名称（日本語
     */
    private String department;

    /**
     * 入学年度
     */
    private String entranceYear;

    /**
     * VPN利用
     */
    private String vpn;

    /**
     * 管理者権限
     */
    private String adminFlag;

    /**
     * 開始日
     */
    private Date startDate;

    /**
     * 終了日
     */
    private Date endDate;

    /**
     * 無効フラグ
     */
    private String invalidFlag;

    /**
     * 削除フラグ
     */
    private String deleteFlag;

    /**
     * システム基準時間
     */
    private Date criterionDt;

    /**
     * ユーザー開始日
     */
    private Date userStartDate;

    /**
     * ユーザー終了日
     */
    private Date userEndDate;

    /**
     * ユーザー無効フラグ
     */
    private String userInvalidFlag;

    /**
     * ユーザー削除フラグ
     */
    private String userDeleteFlag;

    /**
     * ユーザーパスワード
     */
    private String userPassword;

    @Serial
    private static final long serialVersionUID = 1L;
}