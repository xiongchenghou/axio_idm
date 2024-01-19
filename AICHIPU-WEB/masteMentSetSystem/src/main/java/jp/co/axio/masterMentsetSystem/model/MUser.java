package jp.co.axio.masterMentsetSystem.model;

import java.util.Date;

public class MUser {
    private String userId;

    private String employeeId;

    private Date startDate;

    private Date endDate;

    private String initPassword;

    private String deleteFlag;

    private String invalidFlag;

    private String langCode;

    private String enrollmentKbn;

    private String employmentKbn;

    private String mailaddr;

    private String mailaddrSecound;

    private String mailaddrNotification;

    private String tel;

    private String telEx;

    private String surnameEn;

    private String surnameJp;

    private String surnameKana;

    private String middlenameEn;

    private String middlenameJp;

    private String middlenameKana;

    private String givennameEn;

    private String givennameJp;

    private String givennameKana;

    private String surnameNickEn;

    private String surnameNickJp;

    private String surnameNickKana;

    private String middlenameNickEn;

    private String middlenameNickJp;

    private String middlenameNickKana;

    private String givennameNuckEn;

    private String givennameNuckJp;

    private String givennameNuckKana;

    private String updateKbn;

    private String registerId;

    private Date registTs;

    private String updaterId;

    private Date updateTs;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getInitPassword() {
        return initPassword;
    }

    public void setInitPassword(String initPassword) {
        this.initPassword = initPassword == null ? null : initPassword.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public String getInvalidFlag() {
        return invalidFlag;
    }

    public void setInvalidFlag(String invalidFlag) {
        this.invalidFlag = invalidFlag == null ? null : invalidFlag.trim();
    }

    public String getLangCode() {
        return langCode;
    }

    public void setLangCode(String langCode) {
        this.langCode = langCode == null ? null : langCode.trim();
    }

    public String getEnrollmentKbn() {
        return enrollmentKbn;
    }

    public void setEnrollmentKbn(String enrollmentKbn) {
        this.enrollmentKbn = enrollmentKbn == null ? null : enrollmentKbn.trim();
    }

    public String getEmploymentKbn() {
        return employmentKbn;
    }

    public void setEmploymentKbn(String employmentKbn) {
        this.employmentKbn = employmentKbn == null ? null : employmentKbn.trim();
    }

    public String getMailaddr() {
        return mailaddr;
    }

    public void setMailaddr(String mailaddr) {
        this.mailaddr = mailaddr == null ? null : mailaddr.trim();
    }

    public String getMailaddrSecound() {
        return mailaddrSecound;
    }

    public void setMailaddrSecound(String mailaddrSecound) {
        this.mailaddrSecound = mailaddrSecound == null ? null : mailaddrSecound.trim();
    }

    public String getMailaddrNotification() {
        return mailaddrNotification;
    }

    public void setMailaddrNotification(String mailaddrNotification) {
        this.mailaddrNotification = mailaddrNotification == null ? null : mailaddrNotification.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getTelEx() {
        return telEx;
    }

    public void setTelEx(String telEx) {
        this.telEx = telEx == null ? null : telEx.trim();
    }

    public String getSurnameEn() {
        return surnameEn;
    }

    public void setSurnameEn(String surnameEn) {
        this.surnameEn = surnameEn == null ? null : surnameEn.trim();
    }

    public String getSurnameJp() {
        return surnameJp;
    }

    public void setSurnameJp(String surnameJp) {
        this.surnameJp = surnameJp == null ? null : surnameJp.trim();
    }

    public String getSurnameKana() {
        return surnameKana;
    }

    public void setSurnameKana(String surnameKana) {
        this.surnameKana = surnameKana == null ? null : surnameKana.trim();
    }

    public String getMiddlenameEn() {
        return middlenameEn;
    }

    public void setMiddlenameEn(String middlenameEn) {
        this.middlenameEn = middlenameEn == null ? null : middlenameEn.trim();
    }

    public String getMiddlenameJp() {
        return middlenameJp;
    }

    public void setMiddlenameJp(String middlenameJp) {
        this.middlenameJp = middlenameJp == null ? null : middlenameJp.trim();
    }

    public String getMiddlenameKana() {
        return middlenameKana;
    }

    public void setMiddlenameKana(String middlenameKana) {
        this.middlenameKana = middlenameKana == null ? null : middlenameKana.trim();
    }

    public String getGivennameEn() {
        return givennameEn;
    }

    public void setGivennameEn(String givennameEn) {
        this.givennameEn = givennameEn == null ? null : givennameEn.trim();
    }

    public String getGivennameJp() {
        return givennameJp;
    }

    public void setGivennameJp(String givennameJp) {
        this.givennameJp = givennameJp == null ? null : givennameJp.trim();
    }

    public String getGivennameKana() {
        return givennameKana;
    }

    public void setGivennameKana(String givennameKana) {
        this.givennameKana = givennameKana == null ? null : givennameKana.trim();
    }

    public String getSurnameNickEn() {
        return surnameNickEn;
    }

    public void setSurnameNickEn(String surnameNickEn) {
        this.surnameNickEn = surnameNickEn == null ? null : surnameNickEn.trim();
    }

    public String getSurnameNickJp() {
        return surnameNickJp;
    }

    public void setSurnameNickJp(String surnameNickJp) {
        this.surnameNickJp = surnameNickJp == null ? null : surnameNickJp.trim();
    }

    public String getSurnameNickKana() {
        return surnameNickKana;
    }

    public void setSurnameNickKana(String surnameNickKana) {
        this.surnameNickKana = surnameNickKana == null ? null : surnameNickKana.trim();
    }

    public String getMiddlenameNickEn() {
        return middlenameNickEn;
    }

    public void setMiddlenameNickEn(String middlenameNickEn) {
        this.middlenameNickEn = middlenameNickEn == null ? null : middlenameNickEn.trim();
    }

    public String getMiddlenameNickJp() {
        return middlenameNickJp;
    }

    public void setMiddlenameNickJp(String middlenameNickJp) {
        this.middlenameNickJp = middlenameNickJp == null ? null : middlenameNickJp.trim();
    }

    public String getMiddlenameNickKana() {
        return middlenameNickKana;
    }

    public void setMiddlenameNickKana(String middlenameNickKana) {
        this.middlenameNickKana = middlenameNickKana == null ? null : middlenameNickKana.trim();
    }

    public String getGivennameNuckEn() {
        return givennameNuckEn;
    }

    public void setGivennameNuckEn(String givennameNuckEn) {
        this.givennameNuckEn = givennameNuckEn == null ? null : givennameNuckEn.trim();
    }

    public String getGivennameNuckJp() {
        return givennameNuckJp;
    }

    public void setGivennameNuckJp(String givennameNuckJp) {
        this.givennameNuckJp = givennameNuckJp == null ? null : givennameNuckJp.trim();
    }

    public String getGivennameNuckKana() {
        return givennameNuckKana;
    }

    public void setGivennameNuckKana(String givennameNuckKana) {
        this.givennameNuckKana = givennameNuckKana == null ? null : givennameNuckKana.trim();
    }

    public String getUpdateKbn() {
        return updateKbn;
    }

    public void setUpdateKbn(String updateKbn) {
        this.updateKbn = updateKbn == null ? null : updateKbn.trim();
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId == null ? null : registerId.trim();
    }

    public Date getRegistTs() {
        return registTs;
    }

    public void setRegistTs(Date registTs) {
        this.registTs = registTs;
    }

    public String getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId == null ? null : updaterId.trim();
    }

    public Date getUpdateTs() {
        return updateTs;
    }

    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }
}