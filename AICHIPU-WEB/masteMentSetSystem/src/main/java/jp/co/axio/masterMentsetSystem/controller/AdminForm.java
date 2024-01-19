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
public class AdminForm extends accessForm implements Serializable {

    /**
     * 利用者情報管理-検索フォーム
     */
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 利用者ID
     */
    public String userId;

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
    private boolean validUserChecked;

    /**
     * 検索区分　削除ユーザ
     */
    private boolean deleteUserChecked;
    
    /**
     * 検索区分　ロック
     */
    private boolean lockUserChecked;
    /**
     * 検索区分　未来
     */
    private boolean futureUserChecked;
    /**
     * アプリ利用
     */
    public String vpnFlg;
    /**
     * 管理者権限
     */
    public String adminFlg;
    /**
     * 管理者権限 設定
     */
    public String setAdminFlg;
    
    /**
     * 検索区分　初期パスワード未変更
     */
    public boolean initPwdChecked;
    
    /**
     * 帳票出力画面フラグ
     */
    public String reportPageFlg;
    

}
