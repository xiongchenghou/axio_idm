package jp.co.axio.masterMentsetSystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 利用者一覧DTO
 *
 * @author a004811
 */
@Setter
@Getter
public class UserSearchDto {

    /**
     * 反映待ち情報
     */
    private String userReserve;
    /**
     * 状態リスト
     */
    private List<String> status;
    /**
     * 利用者ID
     */
    private String userId;
    /**
     * 利用者区分
     */
    private String employmentName;
    /**
     * 利用者区分値
     */
    private String employmentKbn;
    /**
     * 氏名(漢字)
     */
    private String fullNameJp;
    /**
     * 氏名(英字)
     */
    private String fullNameEn;
    /**
     * キャンパス
     */
    private String campus;
    /**
     * 所属
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
     * 初期パスワード
     */
    private Boolean initPassword;
    /**
     * 現在のページ番号
     */
    private long current = 1;
    /**
     * 1ページあたりのデータ件数
     */
    private long size = 3;

}
