package jp.co.axio.masterMentsetSystem.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ReserveUserDetail {
    private String userId;
    //利用者区分
    private String employmentKbn;
    private Date reflectionDate;
    private String reflectionFlag;
    private String fullnameJp;
    private String fullnameEn;
    private String employeeId;
    private String cybozu;
    private String parallelComputing;
    private String vpnUsage;
    private String educationSystem;
    private String exerciseRoom;

}
