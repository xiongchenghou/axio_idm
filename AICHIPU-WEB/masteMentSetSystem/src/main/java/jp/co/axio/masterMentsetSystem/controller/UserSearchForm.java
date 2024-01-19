package jp.co.axio.masterMentsetSystem.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jp.co.axio.masterMentsetSystem.dto.PulldownItemDto;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
public class UserSearchForm extends accessForm implements Serializable {


    /**
     * 利用者情報管理-検索フォーム
     */
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 利用者ID
     */
    public String clientId;

    /**
     * 複数利用者ID
     */
    public String[] userId;
    /**
     * 利用者区分
     */
    public String userDiv;

    /**
     * 利用者区分プルダウン
     */
    @JsonIgnore
    public List<PulldownItemDto> userDivList;

    /**
     * 姓名（漢字）
     */
    public String fullNameJp;
    /**
     * 姓名（英字）
     */
    public String fullNameEn;
    /**
     * キャンパス
     */
    public String campus;
    /**
     * キャンパスプルダウン
     */
    @JsonIgnore
    public List<PulldownItemDto> campusList;

    /**
     * 所属
     */
    public String department;

    /**
     * 所属プルダウン
     */
    @JsonIgnore
    public List<PulldownItemDto> departmentList;

    /**
     * 入学年度
     */
    public String entranceYear;

    /**
     * 検索区分 有効
     */
    private Boolean validUserChecked;

    /**
     * 検索区分　無効
     */
    private Boolean invalidUserChecked;
    /**
     * 検索区分　ロック
     */
    private Boolean lockUserChecked;
    /**
     * 検索区分　未来
     */
    private Boolean futureUserChecked;
    /**
     * 初期パスワード未変更
     */
    private Boolean initPassword;
    /**
     * アプリ利用
     */
    public String vpn;

    /** 変更フラグ */
    public String changedDataFlg;

    /** エラーメッセージ */
    public String errMessage;

}
