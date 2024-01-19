package jp.co.axio.masterMentsetSystem.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ユーザ一時
 * @TableName w_user_sub
 */
@TableName(value ="w_user_sub")
@Data
public class WUserSub implements Serializable {
    /**
     * アップロードユーザーID
     */
    private String uploadUserId;

    /**
     * アップロード日時
     */
    private Date uploadUserTs;

    /**
     * ユーザーID
     */
    private String userId;

    /**
     * アップロードセッション
     */
    private String uploadSession;

    /**
     * 反映日
     */
    private Date reflectionDate;

    /**
     * 雇用者ID
     */
    private String employeeId;

    /**
     * LM内部ID
     */
    private String lmId;

    /**
     * 開始日
     */
    private Date startDate;

    /**
     * 終了日
     */
    private Date endDate;

    /**
     * 初期パスワード
     */
    private String initPassword;

    /**
     * 削除フラグ
     */
    private String deleteFlag;

    /**
     * 無効フラグ
     */
    private String invalidFlag;

    /**
     * 言語コード
     */
    private String langCode;

    /**
     * 在籍区分
     */
    private String enrollmentKbn;

    /**
     * 雇用区分
     */
    private String employmentKbn;

    /**
     * プライマリメールアドレス
     */
    private String mailaddr;

    /**
     * セカンダリメールアドレス
     */
    private String mailaddrSecound;

    /**
     * 通知先メールアドレス
     */
    private String mailaddrNotification;

    /**
     * 外線番号
     */
    private String tel;

    /**
     * 内線番号
     */
    private String telEx;

    /**
     * 姓（英語）
     */
    private String surnameEn;

    /**
     * 姓（日本語）
     */
    private String surnameJp;

    /**
     * 姓（カタカナ）
     */
    private String surnameKana;

    /**
     * ミドルネーム（英語）
     */
    private String middlenameEn;

    /**
     * ミドルネーム（日本語）
     */
    private String middlenameJp;

    /**
     * ミドルネーム（カタカナ）
     */
    private String middlenameKana;

    /**
     * 名（英語）
     */
    private String givennameEn;

    /**
     * 名 (日本語)
     */
    private String givennameJp;

    /**
     * 名 (カタカナ)
     */
    private String givennameKana;

    /**
     * 通称 姓（英語）
     */
    private String surnameNickEn;

    /**
     * 通称 姓（日本語）
     */
    private String surnameNickJp;

    /**
     * 通称 姓（カタカナ）
     */
    private String surnameNickKana;

    /**
     * 通称 ミドルネーム（英語）
     */
    private String middlenameNickEn;

    /**
     * 通称 ミドルネーム（日本語）
     */
    private String middlenameNickJp;

    /**
     * 通称 ミドルネーム（カタカナ）
     */
    private String middlenameNickKana;

    /**
     * 通称 名（英語）
     */
    private String givennameNuckEn;

    /**
     * 通称 名 (日本語)
     */
    private String givennameNuckJp;

    /**
     * 通称 名 (カタカナ)
     */
    private String givennameNuckKana;

    /**
     * 所属会社コード
     */
    private String companyCode;

    /**
     * 所属会社名称
     */
    private String companyName;

    /**
     * 役職コード
     */
    private String positionCode;

    /**
     * 役職名称
     */
    private String positionName;

    /**
     * 等級コード
     */
    private String gradeCode;

    /**
     * 等級名称
     */
    private String gradeName;

    /**
     * 所属組織コード
     */
    private String organizationCode;

    /**
     * 勤務地コード
     */
    private String locationCode;

    /**
     * 兼務情報
     */
    private String kenmuInfo;

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

    /**
     * 拡張属性１
     */
    private String expansionAttr1;

    /**
     * 拡張属性２
     */
    private String expansionAttr2;

    /**
     * 拡張属性３
     */
    private String expansionAttr3;

    /**
     * 拡張属性４
     */
    private String expansionAttr4;

    /**
     * 拡張属性５
     */
    private String expansionAttr5;

    /**
     * 拡張属性６
     */
    private String expansionAttr6;

    /**
     * 拡張属性７
     */
    private String expansionAttr7;

    /**
     * 拡張属性８
     */
    private String expansionAttr8;

    /**
     * 拡張属性９
     */
    private String expansionAttr9;

    /**
     * 拡張属性１０
     */
    private String expansionAttr10;

    /**
     * 拡張属性１１
     */
    private String expansionAttr11;

    /**
     * 拡張属性１２
     */
    private String expansionAttr12;

    /**
     * 拡張属性１３
     */
    private String expansionAttr13;

    /**
     * 拡張属性１４
     */
    private String expansionAttr14;

    /**
     * 拡張属性１５
     */
    private String expansionAttr15;

    /**
     * 拡張属性１６
     */
    private String expansionAttr16;

    /**
     * 拡張属性１７
     */
    private String expansionAttr17;

    /**
     * 拡張属性１８
     */
    private String expansionAttr18;

    /**
     * 拡張属性１９
     */
    private String expansionAttr19;

    /**
     * 拡張属性２０
     */
    private String expansionAttr20;

    /**
     * 拡張属性２１
     */
    private String expansionAttr21;

    /**
     * 拡張属性２２
     */
    private String expansionAttr22;

    /**
     * 拡張属性２３
     */
    private String expansionAttr23;

    /**
     * 拡張属性２４
     */
    private String expansionAttr24;

    /**
     * 拡張属性２５
     */
    private String expansionAttr25;

    /**
     * 拡張属性２６
     */
    private String expansionAttr26;

    /**
     * 拡張属性２７
     */
    private String expansionAttr27;

    /**
     * 拡張属性２８
     */
    private String expansionAttr28;

    /**
     * 拡張属性２９
     */
    private String expansionAttr29;

    /**
     * 拡張属性３０
     */
    private String expansionAttr30;

    /**
     * 拡張属性３１
     */
    private String expansionAttr31;

    /**
     * 拡張属性３２
     */
    private String expansionAttr32;

    /**
     * 拡張属性３３
     */
    private String expansionAttr33;

    /**
     * 拡張属性３４
     */
    private String expansionAttr34;

    /**
     * 拡張属性３５
     */
    private String expansionAttr35;

    /**
     * 拡張属性３６
     */
    private String expansionAttr36;

    /**
     * 拡張属性３７
     */
    private String expansionAttr37;

    /**
     * 拡張属性３８
     */
    private String expansionAttr38;

    /**
     * 拡張属性３９
     */
    private String expansionAttr39;

    /**
     * 拡張属性４０
     */
    private String expansionAttr40;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}