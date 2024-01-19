package jp.co.axio.masterMentsetSystem.model;

import java.util.Date;

public class VSearchUserEntity {
    private String userId;

    private String status;

    private String userReserve;

    private String employmentKbn;

    private String employmentName;

    private String fullnameJp;

    private String fullnameEn;

    private String locationCode;

    private String cmapus;

    private String organizationCode;

    private String department;

    private String entranceYear;

    private String vpn;

    private String adminFlag;

    private Date startDate;

    private Date endDate;

    private String invalidFlag;

    private String deleteFlag;

    private Date criterionDt;

    private Date userStartDate;

    private Date userEndDate;

    private String userInvalidFlag;

    private String userDeleteFlag;

    private String userPassword;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getUserReserve() {
        return userReserve;
    }

    public void setUserReserve(String userReserve) {
        this.userReserve = userReserve == null ? null : userReserve.trim();
    }

    public String getEmploymentKbn() {
        return employmentKbn;
    }

    public void setEmploymentKbn(String employmentKbn) {
        this.employmentKbn = employmentKbn == null ? null : employmentKbn.trim();
    }

    public String getEmploymentName() {
        return employmentName;
    }

    public void setEmploymentName(String employmentName) {
        this.employmentName = employmentName == null ? null : employmentName.trim();
    }

    public String getFullnameJp() {
        return fullnameJp;
    }

    public void setFullnameJp(String fullnameJp) {
        this.fullnameJp = fullnameJp == null ? null : fullnameJp.trim();
    }

    public String getFullnameEn() {
        return fullnameEn;
    }

    public void setFullnameEn(String fullnameEn) {
        this.fullnameEn = fullnameEn == null ? null : fullnameEn.trim();
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode == null ? null : locationCode.trim();
    }

    public String getCmapus() {
        return cmapus;
    }

    public void setCmapus(String cmapus) {
        this.cmapus = cmapus == null ? null : cmapus.trim();
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getEntranceYear() {
        return entranceYear;
    }

    public void setEntranceYear(String entranceYear) {
        this.entranceYear = entranceYear == null ? null : entranceYear.trim();
    }

    public String getVpn() {
        return vpn;
    }

    public void setVpn(String vpn) {
        this.vpn = vpn == null ? null : vpn.trim();
    }

    public String getAdminFlag() {
        return adminFlag;
    }

    public void setAdminFlag(String adminFlag) {
        this.adminFlag = adminFlag == null ? null : adminFlag.trim();
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

    public String getInvalidFlag() {
        return invalidFlag;
    }

    public void setInvalidFlag(String invalidFlag) {
        this.invalidFlag = invalidFlag == null ? null : invalidFlag.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public Date getCriterionDt() {
        return criterionDt;
    }

    public void setCriterionDt(Date criterionDt) {
        this.criterionDt = criterionDt;
    }

    public Date getUserStartDate() {
        return userStartDate;
    }

    public void setUserStartDate(Date userStartDate) {
        this.userStartDate = userStartDate;
    }

    public Date getUserEndDate() {
        return userEndDate;
    }

    public void setUserEndDate(Date userEndDate) {
        this.userEndDate = userEndDate;
    }

    public String getUserInvalidFlag() {
        return userInvalidFlag;
    }

    public void setUserInvalidFlag(String userInvalidFlag) {
        this.userInvalidFlag = userInvalidFlag == null ? null : userInvalidFlag.trim();
    }

    public String getUserDeleteFlag() {
        return userDeleteFlag;
    }

    public void setUserDeleteFlag(String userDeleteFlag) {
        this.userDeleteFlag = userDeleteFlag == null ? null : userDeleteFlag.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }
}