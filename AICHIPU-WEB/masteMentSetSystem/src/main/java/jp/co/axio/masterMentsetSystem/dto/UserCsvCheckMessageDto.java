package jp.co.axio.masterMentsetSystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 利用者CSV管理チェックメッセージDTO
 *
 * @author a004811
 */
@Setter
@Getter
public class UserCsvCheckMessageDto {


    /**
     * 処理区分
     */
    private String processKbn;

    /**
     * ユーザID
     */
    private String userId;

    /**
     * 反映日
     */
    private String reflectionDate;
    /**
     * 利用者区分
     */
    private String userDiv;
    /**
     * 氏名(英字)
     */
    private String fullNameEn;
    /**
     * 氏名(漢字)
     */
    private String fullNameJp;
    /**
     * 学籍番号
     */
    private String stuNo;
    /**
     * VPN利用
     */
    private String vpn;



}
