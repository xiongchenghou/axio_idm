package jp.co.axio.masterMentsetSystem.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName V_SEARCH_USER
 */
@Data
public class VSearchUser implements Serializable {
    /**
     * 
     */
    private String userId;

    /**
     * 
     */
    private String status;

    /**
     * 
     */
    private String userReserve;

    /**
     * 
     */
    private String employmentKbn;

    /**
     * 
     */
    private String employmentName;

    /**
     * 
     */
    private String fullnameJp;

    /**
     * 
     */
    private String fullnameEn;

    /**
     * 
     */
    private String locationCode;

    /**
     * 
     */
    private String cmapus;

    /**
     * 
     */
    private String organizationCode;

    /**
     * 
     */
    private String department;

    /**
     * 
     */
    private String entranceYear;

    /**
     * 
     */
    private String vpn;

    /**
     * 
     */
    private String adminFlag;

    /**
     * 
     */
    private Date startDate;

    /**
     * 
     */
    private String invalidFlag;

    /**
     * 
     */
    private String deleteFlag;

    /**
     * 
     */
    private Date criterionDt;

    /**
     * 
     */
    private Date userStartDate;

    /**
     * 
     */
    private Date userEndDate;

    /**
     * 
     */
    private String userInvalidFlag;

    /**
     * 
     */
    private String userDeleteFlag;

    /**
     * 
     */
    private String userPassword;

    @Serial
    private static final long serialVersionUID = 1L;
}