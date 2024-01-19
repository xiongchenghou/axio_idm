package jp.co.axio.masterMentsetSystem.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;
@TableName(value ="v_admin_maintenance")
public class VAdminMaintenanceEntity {
    private String userId;

    private String futureUserFlag;

    private String reflectionFlag;

    private String employeeId;

    private String initPassword;

    private String enrollmentKbn;

    private Date startDate;

    private Date endDate;

    private String employmentKbn;

    private String employmentName;

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

    private String countryCode;

    private String regionCode;

    private String companyCode;

    private String companyNameEn;

    private String companyNameJp;

    private String organizationCode;

    private String organizationNameEn;

    private String organizationNameJp;

    private String positionCode;

    private String positionNameEn;

    private String positionNameJp;

    private String gradeCode;

    private String gradeNameEn;

    private String gradeNameJp;

    private String locationCode;

    private String locationNameEn;

    private String locationNameJp;

    private String kenmuInfo;

    private String deleteFlag;

    private String invalidFlag;

    private String langCode;

    private String registerId;

    private Date registTs;

    private String updaterId;

    private Date updateTs;

    private String expansionAttr1;

    private String expansionAttr2;

    private String expansionAttr3;

    private String expansionAttr4;

    private String expansionAttr5;

    private String expansionAttr6;

    private String expansionAttr7;

    private String expansionAttr8;

    private String expansionAttr9;

    private String expansionAttr10;

    private String expansionAttr11;

    private String expansionAttr12;

    private String expansionAttr13;

    private String expansionAttr14;

    private String expansionAttr15;

    private String expansionAttr16;

    private String expansionAttr17;

    private String expansionAttr18;

    private String expansionAttr19;

    private String expansionAttr20;

    private String expansionAttr21;

    private String expansionAttr22;

    private String expansionAttr23;

    private String expansionAttr24;

    private String expansionAttr25;

    private String expansionAttr26;

    private String expansionAttr27;

    private String expansionAttr28;

    private String expansionAttr29;

    private String expansionAttr30;

    private String expansionAttr31;

    private String expansionAttr32;

    private String expansionAttr33;

    private String expansionAttr34;

    private String expansionAttr35;

    private String expansionAttr36;

    private String expansionAttr37;

    private String expansionAttr38;

    private String expansionAttr39;

    private String expansionAttr40;
    @TableField("application_use_flag_01")
    private String applicationUseFlag01;
    @TableField("02")
    private String applicationUseFlag02;
    @TableField("application_use_flag_03")
    private String applicationUseFlag03;
    @TableField("application_use_flag_04")
    private String applicationUseFlag04;
    @TableField("application_use_flag_05")
    private String applicationUseFlag05;
    @TableField("application_use_flag_06")
    private String applicationUseFlag06;
    @TableField("application_use_flag_07")
    private String applicationUseFlag07;
    @TableField("application_use_flag_08")
    private String applicationUseFlag08;
    @TableField("application_use_flag_09")
    private String applicationUseFlag09;
    @TableField("application_use_flag_10")
    private String applicationUseFlag10;
    @TableField("application_use_flag_11")
    private String applicationUseFlag11;
    @TableField("application_use_flag_12")
    private String applicationUseFlag12;
    @TableField("application_use_flag_13")
    private String applicationUseFlag13;
    @TableField("application_use_flag_14")
    private String applicationUseFlag14;
    @TableField("application_use_flag_15")
    private String applicationUseFlag15;
    @TableField("application_use_flag_16")
    private String applicationUseFlag16;
    @TableField("application_use_flag_17")
    private String applicationUseFlag17;
    @TableField("application_use_flag_18")
    private String applicationUseFlag18;
    @TableField("application_use_flag_19")
    private String applicationUseFlag19;
    @TableField("application_use_flag_20")
    private String applicationUseFlag20;
    @TableField("system_valid_flag_01")
    private String systemValidFlag01;
    @TableField("system_valid_flag_02")
    private String systemValidFlag02;
    @TableField("system_valid_flag_03")
    private String systemValidFlag03;
    @TableField("system_valid_flag_04")
    private String systemValidFlag04;
    @TableField("system_valid_flag_05")
    private String systemValidFlag05;
    @TableField("system_valid_flag_06")
    private String systemValidFlag06;
    @TableField("system_valid_flag_07")
    private String systemValidFlag07;
    @TableField("system_valid_flag_08")
    private String systemValidFlag08;
    @TableField("system_valid_flag_09")
    private String systemValidFlag09;
    @TableField("system_valid_flag_10")
    private String systemValidFlag10;
    @TableField("system_valid_flag_11")
    private String systemValidFlag11;
    @TableField("system_valid_flag_12")
    private String systemValidFlag12;
    @TableField("system_valid_flag_13")
    private String systemValidFlag13;
    @TableField("system_valid_flag_14")
    private String systemValidFlag14;
    @TableField("system_valid_flag_15")
    private String systemValidFlag15;
    @TableField("system_valid_flag_16")
    private String systemValidFlag16;
    @TableField("system_valid_flag_17")
    private String systemValidFlag17;
    @TableField("system_valid_flag_18")
    private String systemValidFlag18;
    @TableField("system_valid_flag_19")
    private String systemValidFlag19;
    @TableField("system_valid_flag_20")
    private String systemValidFlag20;
    private String adminFlag;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getFutureUserFlag() {
        return futureUserFlag;
    }

    public void setFutureUserFlag(String futureUserFlag) {
        this.futureUserFlag = futureUserFlag == null ? null : futureUserFlag.trim();
    }

    public String getReflectionFlag() {
        return reflectionFlag;
    }

    public void setReflectionFlag(String reflectionFlag) {
        this.reflectionFlag = reflectionFlag == null ? null : reflectionFlag.trim();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getInitPassword() {
        return initPassword;
    }

    public void setInitPassword(String initPassword) {
        this.initPassword = initPassword == null ? null : initPassword.trim();
    }

    public String getEnrollmentKbn() {
        return enrollmentKbn;
    }

    public void setEnrollmentKbn(String enrollmentKbn) {
        this.enrollmentKbn = enrollmentKbn == null ? null : enrollmentKbn.trim();
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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode == null ? null : regionCode.trim();
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public String getCompanyNameEn() {
        return companyNameEn;
    }

    public void setCompanyNameEn(String companyNameEn) {
        this.companyNameEn = companyNameEn == null ? null : companyNameEn.trim();
    }

    public String getCompanyNameJp() {
        return companyNameJp;
    }

    public void setCompanyNameJp(String companyNameJp) {
        this.companyNameJp = companyNameJp == null ? null : companyNameJp.trim();
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getOrganizationNameEn() {
        return organizationNameEn;
    }

    public void setOrganizationNameEn(String organizationNameEn) {
        this.organizationNameEn = organizationNameEn == null ? null : organizationNameEn.trim();
    }

    public String getOrganizationNameJp() {
        return organizationNameJp;
    }

    public void setOrganizationNameJp(String organizationNameJp) {
        this.organizationNameJp = organizationNameJp == null ? null : organizationNameJp.trim();
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode == null ? null : positionCode.trim();
    }

    public String getPositionNameEn() {
        return positionNameEn;
    }

    public void setPositionNameEn(String positionNameEn) {
        this.positionNameEn = positionNameEn == null ? null : positionNameEn.trim();
    }

    public String getPositionNameJp() {
        return positionNameJp;
    }

    public void setPositionNameJp(String positionNameJp) {
        this.positionNameJp = positionNameJp == null ? null : positionNameJp.trim();
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode == null ? null : gradeCode.trim();
    }

    public String getGradeNameEn() {
        return gradeNameEn;
    }

    public void setGradeNameEn(String gradeNameEn) {
        this.gradeNameEn = gradeNameEn == null ? null : gradeNameEn.trim();
    }

    public String getGradeNameJp() {
        return gradeNameJp;
    }

    public void setGradeNameJp(String gradeNameJp) {
        this.gradeNameJp = gradeNameJp == null ? null : gradeNameJp.trim();
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode == null ? null : locationCode.trim();
    }

    public String getLocationNameEn() {
        return locationNameEn;
    }

    public void setLocationNameEn(String locationNameEn) {
        this.locationNameEn = locationNameEn == null ? null : locationNameEn.trim();
    }

    public String getLocationNameJp() {
        return locationNameJp;
    }

    public void setLocationNameJp(String locationNameJp) {
        this.locationNameJp = locationNameJp == null ? null : locationNameJp.trim();
    }

    public String getKenmuInfo() {
        return kenmuInfo;
    }

    public void setKenmuInfo(String kenmuInfo) {
        this.kenmuInfo = kenmuInfo == null ? null : kenmuInfo.trim();
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

    public String getExpansionAttr1() {
        return expansionAttr1;
    }

    public void setExpansionAttr1(String expansionAttr1) {
        this.expansionAttr1 = expansionAttr1 == null ? null : expansionAttr1.trim();
    }

    public String getExpansionAttr2() {
        return expansionAttr2;
    }

    public void setExpansionAttr2(String expansionAttr2) {
        this.expansionAttr2 = expansionAttr2 == null ? null : expansionAttr2.trim();
    }

    public String getExpansionAttr3() {
        return expansionAttr3;
    }

    public void setExpansionAttr3(String expansionAttr3) {
        this.expansionAttr3 = expansionAttr3 == null ? null : expansionAttr3.trim();
    }

    public String getExpansionAttr4() {
        return expansionAttr4;
    }

    public void setExpansionAttr4(String expansionAttr4) {
        this.expansionAttr4 = expansionAttr4 == null ? null : expansionAttr4.trim();
    }

    public String getExpansionAttr5() {
        return expansionAttr5;
    }

    public void setExpansionAttr5(String expansionAttr5) {
        this.expansionAttr5 = expansionAttr5 == null ? null : expansionAttr5.trim();
    }

    public String getExpansionAttr6() {
        return expansionAttr6;
    }

    public void setExpansionAttr6(String expansionAttr6) {
        this.expansionAttr6 = expansionAttr6 == null ? null : expansionAttr6.trim();
    }

    public String getExpansionAttr7() {
        return expansionAttr7;
    }

    public void setExpansionAttr7(String expansionAttr7) {
        this.expansionAttr7 = expansionAttr7 == null ? null : expansionAttr7.trim();
    }

    public String getExpansionAttr8() {
        return expansionAttr8;
    }

    public void setExpansionAttr8(String expansionAttr8) {
        this.expansionAttr8 = expansionAttr8 == null ? null : expansionAttr8.trim();
    }

    public String getExpansionAttr9() {
        return expansionAttr9;
    }

    public void setExpansionAttr9(String expansionAttr9) {
        this.expansionAttr9 = expansionAttr9 == null ? null : expansionAttr9.trim();
    }

    public String getExpansionAttr10() {
        return expansionAttr10;
    }

    public void setExpansionAttr10(String expansionAttr10) {
        this.expansionAttr10 = expansionAttr10 == null ? null : expansionAttr10.trim();
    }

    public String getExpansionAttr11() {
        return expansionAttr11;
    }

    public void setExpansionAttr11(String expansionAttr11) {
        this.expansionAttr11 = expansionAttr11 == null ? null : expansionAttr11.trim();
    }

    public String getExpansionAttr12() {
        return expansionAttr12;
    }

    public void setExpansionAttr12(String expansionAttr12) {
        this.expansionAttr12 = expansionAttr12 == null ? null : expansionAttr12.trim();
    }

    public String getExpansionAttr13() {
        return expansionAttr13;
    }

    public void setExpansionAttr13(String expansionAttr13) {
        this.expansionAttr13 = expansionAttr13 == null ? null : expansionAttr13.trim();
    }

    public String getExpansionAttr14() {
        return expansionAttr14;
    }

    public void setExpansionAttr14(String expansionAttr14) {
        this.expansionAttr14 = expansionAttr14 == null ? null : expansionAttr14.trim();
    }

    public String getExpansionAttr15() {
        return expansionAttr15;
    }

    public void setExpansionAttr15(String expansionAttr15) {
        this.expansionAttr15 = expansionAttr15 == null ? null : expansionAttr15.trim();
    }

    public String getExpansionAttr16() {
        return expansionAttr16;
    }

    public void setExpansionAttr16(String expansionAttr16) {
        this.expansionAttr16 = expansionAttr16 == null ? null : expansionAttr16.trim();
    }

    public String getExpansionAttr17() {
        return expansionAttr17;
    }

    public void setExpansionAttr17(String expansionAttr17) {
        this.expansionAttr17 = expansionAttr17 == null ? null : expansionAttr17.trim();
    }

    public String getExpansionAttr18() {
        return expansionAttr18;
    }

    public void setExpansionAttr18(String expansionAttr18) {
        this.expansionAttr18 = expansionAttr18 == null ? null : expansionAttr18.trim();
    }

    public String getExpansionAttr19() {
        return expansionAttr19;
    }

    public void setExpansionAttr19(String expansionAttr19) {
        this.expansionAttr19 = expansionAttr19 == null ? null : expansionAttr19.trim();
    }

    public String getExpansionAttr20() {
        return expansionAttr20;
    }

    public void setExpansionAttr20(String expansionAttr20) {
        this.expansionAttr20 = expansionAttr20 == null ? null : expansionAttr20.trim();
    }

    public String getExpansionAttr21() {
        return expansionAttr21;
    }

    public void setExpansionAttr21(String expansionAttr21) {
        this.expansionAttr21 = expansionAttr21 == null ? null : expansionAttr21.trim();
    }

    public String getExpansionAttr22() {
        return expansionAttr22;
    }

    public void setExpansionAttr22(String expansionAttr22) {
        this.expansionAttr22 = expansionAttr22 == null ? null : expansionAttr22.trim();
    }

    public String getExpansionAttr23() {
        return expansionAttr23;
    }

    public void setExpansionAttr23(String expansionAttr23) {
        this.expansionAttr23 = expansionAttr23 == null ? null : expansionAttr23.trim();
    }

    public String getExpansionAttr24() {
        return expansionAttr24;
    }

    public void setExpansionAttr24(String expansionAttr24) {
        this.expansionAttr24 = expansionAttr24 == null ? null : expansionAttr24.trim();
    }

    public String getExpansionAttr25() {
        return expansionAttr25;
    }

    public void setExpansionAttr25(String expansionAttr25) {
        this.expansionAttr25 = expansionAttr25 == null ? null : expansionAttr25.trim();
    }

    public String getExpansionAttr26() {
        return expansionAttr26;
    }

    public void setExpansionAttr26(String expansionAttr26) {
        this.expansionAttr26 = expansionAttr26 == null ? null : expansionAttr26.trim();
    }

    public String getExpansionAttr27() {
        return expansionAttr27;
    }

    public void setExpansionAttr27(String expansionAttr27) {
        this.expansionAttr27 = expansionAttr27 == null ? null : expansionAttr27.trim();
    }

    public String getExpansionAttr28() {
        return expansionAttr28;
    }

    public void setExpansionAttr28(String expansionAttr28) {
        this.expansionAttr28 = expansionAttr28 == null ? null : expansionAttr28.trim();
    }

    public String getExpansionAttr29() {
        return expansionAttr29;
    }

    public void setExpansionAttr29(String expansionAttr29) {
        this.expansionAttr29 = expansionAttr29 == null ? null : expansionAttr29.trim();
    }

    public String getExpansionAttr30() {
        return expansionAttr30;
    }

    public void setExpansionAttr30(String expansionAttr30) {
        this.expansionAttr30 = expansionAttr30 == null ? null : expansionAttr30.trim();
    }

    public String getExpansionAttr31() {
        return expansionAttr31;
    }

    public void setExpansionAttr31(String expansionAttr31) {
        this.expansionAttr31 = expansionAttr31 == null ? null : expansionAttr31.trim();
    }

    public String getExpansionAttr32() {
        return expansionAttr32;
    }

    public void setExpansionAttr32(String expansionAttr32) {
        this.expansionAttr32 = expansionAttr32 == null ? null : expansionAttr32.trim();
    }

    public String getExpansionAttr33() {
        return expansionAttr33;
    }

    public void setExpansionAttr33(String expansionAttr33) {
        this.expansionAttr33 = expansionAttr33 == null ? null : expansionAttr33.trim();
    }

    public String getExpansionAttr34() {
        return expansionAttr34;
    }

    public void setExpansionAttr34(String expansionAttr34) {
        this.expansionAttr34 = expansionAttr34 == null ? null : expansionAttr34.trim();
    }

    public String getExpansionAttr35() {
        return expansionAttr35;
    }

    public void setExpansionAttr35(String expansionAttr35) {
        this.expansionAttr35 = expansionAttr35 == null ? null : expansionAttr35.trim();
    }

    public String getExpansionAttr36() {
        return expansionAttr36;
    }

    public void setExpansionAttr36(String expansionAttr36) {
        this.expansionAttr36 = expansionAttr36 == null ? null : expansionAttr36.trim();
    }

    public String getExpansionAttr37() {
        return expansionAttr37;
    }
    public void setExpansionAttr37(String expansionAttr37) {
        this.expansionAttr37 = expansionAttr37 == null ? null : expansionAttr37.trim();
    }

    public String getExpansionAttr38() {
        return expansionAttr38;
    }

    public void setExpansionAttr38(String expansionAttr38) {
        this.expansionAttr38 = expansionAttr38 == null ? null : expansionAttr38.trim();
    }

    public String getExpansionAttr39() {
        return expansionAttr39;
    }

    public void setExpansionAttr39(String expansionAttr39) {
        this.expansionAttr39 = expansionAttr39 == null ? null : expansionAttr39.trim();
    }

    public String getExpansionAttr40() {
        return expansionAttr40;
    }

    public void setExpansionAttr40(String expansionAttr40) {
        this.expansionAttr40 = expansionAttr40 == null ? null : expansionAttr40.trim();
    }

    public String getApplicationUseFlag01() {
        return applicationUseFlag01;
    }

    public void setApplicationUseFlag01(String applicationUseFlag01) {
        this.applicationUseFlag01 = applicationUseFlag01 == null ? null : applicationUseFlag01.trim();
    }

    public String getApplicationUseFlag02() {
        return applicationUseFlag02;
    }

    public void setApplicationUseFlag02(String applicationUseFlag02) {
        this.applicationUseFlag02 = applicationUseFlag02 == null ? null : applicationUseFlag02.trim();
    }

    public String getApplicationUseFlag03() {
        return applicationUseFlag03;
    }

    public void setApplicationUseFlag03(String applicationUseFlag03) {
        this.applicationUseFlag03 = applicationUseFlag03 == null ? null : applicationUseFlag03.trim();
    }

    public String getApplicationUseFlag04() {
        return applicationUseFlag04;
    }

    public void setApplicationUseFlag04(String applicationUseFlag04) {
        this.applicationUseFlag04 = applicationUseFlag04 == null ? null : applicationUseFlag04.trim();
    }

    public String getApplicationUseFlag05() {
        return applicationUseFlag05;
    }

    public void setApplicationUseFlag05(String applicationUseFlag05) {
        this.applicationUseFlag05 = applicationUseFlag05 == null ? null : applicationUseFlag05.trim();
    }

    public String getApplicationUseFlag06() {
        return applicationUseFlag06;
    }

    public void setApplicationUseFlag06(String applicationUseFlag06) {
        this.applicationUseFlag06 = applicationUseFlag06 == null ? null : applicationUseFlag06.trim();
    }

    public String getApplicationUseFlag07() {
        return applicationUseFlag07;
    }

    public void setApplicationUseFlag07(String applicationUseFlag07) {
        this.applicationUseFlag07 = applicationUseFlag07 == null ? null : applicationUseFlag07.trim();
    }

    public String getApplicationUseFlag08() {
        return applicationUseFlag08;
    }

    public void setApplicationUseFlag08(String applicationUseFlag08) {
        this.applicationUseFlag08 = applicationUseFlag08 == null ? null : applicationUseFlag08.trim();
    }

    public String getApplicationUseFlag09() {
        return applicationUseFlag09;
    }

    public void setApplicationUseFlag09(String applicationUseFlag09) {
        this.applicationUseFlag09 = applicationUseFlag09 == null ? null : applicationUseFlag09.trim();
    }

    public String getApplicationUseFlag10() {
        return applicationUseFlag10;
    }

    public void setApplicationUseFlag10(String applicationUseFlag10) {
        this.applicationUseFlag10 = applicationUseFlag10 == null ? null : applicationUseFlag10.trim();
    }

    public String getApplicationUseFlag11() {
        return applicationUseFlag11;
    }

    public void setApplicationUseFlag11(String applicationUseFlag11) {
        this.applicationUseFlag11 = applicationUseFlag11 == null ? null : applicationUseFlag11.trim();
    }

    public String getApplicationUseFlag12() {
        return applicationUseFlag12;
    }

    public void setApplicationUseFlag12(String applicationUseFlag12) {
        this.applicationUseFlag12 = applicationUseFlag12 == null ? null : applicationUseFlag12.trim();
    }

    public String getApplicationUseFlag13() {
        return applicationUseFlag13;
    }

    public void setApplicationUseFlag13(String applicationUseFlag13) {
        this.applicationUseFlag13 = applicationUseFlag13 == null ? null : applicationUseFlag13.trim();
    }

    public String getApplicationUseFlag14() {
        return applicationUseFlag14;
    }

    public void setApplicationUseFlag14(String applicationUseFlag14) {
        this.applicationUseFlag14 = applicationUseFlag14 == null ? null : applicationUseFlag14.trim();
    }

    public String getApplicationUseFlag15() {
        return applicationUseFlag15;
    }

    public void setApplicationUseFlag15(String applicationUseFlag15) {
        this.applicationUseFlag15 = applicationUseFlag15 == null ? null : applicationUseFlag15.trim();
    }

    public String getApplicationUseFlag16() {
        return applicationUseFlag16;
    }

    public void setApplicationUseFlag16(String applicationUseFlag16) {
        this.applicationUseFlag16 = applicationUseFlag16 == null ? null : applicationUseFlag16.trim();
    }

    public String getApplicationUseFlag17() {
        return applicationUseFlag17;
    }

    public void setApplicationUseFlag17(String applicationUseFlag17) {
        this.applicationUseFlag17 = applicationUseFlag17 == null ? null : applicationUseFlag17.trim();
    }

    public String getApplicationUseFlag18() {
        return applicationUseFlag18;
    }

    public void setApplicationUseFlag18(String applicationUseFlag18) {
        this.applicationUseFlag18 = applicationUseFlag18 == null ? null : applicationUseFlag18.trim();
    }

    public String getApplicationUseFlag19() {
        return applicationUseFlag19;
    }

    public void setApplicationUseFlag19(String applicationUseFlag19) {
        this.applicationUseFlag19 = applicationUseFlag19 == null ? null : applicationUseFlag19.trim();
    }

    public String getApplicationUseFlag20() {
        return applicationUseFlag20;
    }

    public void setApplicationUseFlag20(String applicationUseFlag20) {
        this.applicationUseFlag20 = applicationUseFlag20 == null ? null : applicationUseFlag20.trim();
    }

    public String getSystemValidFlag01() {
        return systemValidFlag01;
    }

    public void setSystemValidFlag01(String systemValidFlag01) {
        this.systemValidFlag01 = systemValidFlag01 == null ? null : systemValidFlag01.trim();
    }

    public String getSystemValidFlag02() {
        return systemValidFlag02;
    }

    public void setSystemValidFlag02(String systemValidFlag02) {
        this.systemValidFlag02 = systemValidFlag02 == null ? null : systemValidFlag02.trim();
    }

    public String getSystemValidFlag03() {
        return systemValidFlag03;
    }

    public void setSystemValidFlag03(String systemValidFlag03) {
        this.systemValidFlag03 = systemValidFlag03 == null ? null : systemValidFlag03.trim();
    }

    public String getSystemValidFlag04() {
        return systemValidFlag04;
    }

    public void setSystemValidFlag04(String systemValidFlag04) {
        this.systemValidFlag04 = systemValidFlag04 == null ? null : systemValidFlag04.trim();
    }

    public String getSystemValidFlag05() {
        return systemValidFlag05;
    }

    public void setSystemValidFlag05(String systemValidFlag05) {
        this.systemValidFlag05 = systemValidFlag05 == null ? null : systemValidFlag05.trim();
    }

    public String getSystemValidFlag06() {
        return systemValidFlag06;
    }

    public void setSystemValidFlag06(String systemValidFlag06) {
        this.systemValidFlag06 = systemValidFlag06 == null ? null : systemValidFlag06.trim();
    }

    public String getSystemValidFlag07() {
        return systemValidFlag07;
    }

    public void setSystemValidFlag07(String systemValidFlag07) {
        this.systemValidFlag07 = systemValidFlag07 == null ? null : systemValidFlag07.trim();
    }

    public String getSystemValidFlag08() {
        return systemValidFlag08;
    }

    public void setSystemValidFlag08(String systemValidFlag08) {
        this.systemValidFlag08 = systemValidFlag08 == null ? null : systemValidFlag08.trim();
    }

    public String getSystemValidFlag09() {
        return systemValidFlag09;
    }

    public void setSystemValidFlag09(String systemValidFlag09) {
        this.systemValidFlag09 = systemValidFlag09 == null ? null : systemValidFlag09.trim();
    }

    public String getSystemValidFlag10() {
        return systemValidFlag10;
    }

    public void setSystemValidFlag10(String systemValidFlag10) {
        this.systemValidFlag10 = systemValidFlag10 == null ? null : systemValidFlag10.trim();
    }

    public String getSystemValidFlag11() {
        return systemValidFlag11;
    }

    public void setSystemValidFlag11(String systemValidFlag11) {
        this.systemValidFlag11 = systemValidFlag11 == null ? null : systemValidFlag11.trim();
    }

    public String getSystemValidFlag12() {
        return systemValidFlag12;
    }

    public void setSystemValidFlag12(String systemValidFlag12) {
        this.systemValidFlag12 = systemValidFlag12 == null ? null : systemValidFlag12.trim();
    }

    public String getSystemValidFlag13() {
        return systemValidFlag13;
    }

    public void setSystemValidFlag13(String systemValidFlag13) {
        this.systemValidFlag13 = systemValidFlag13 == null ? null : systemValidFlag13.trim();
    }

    public String getSystemValidFlag14() {
        return systemValidFlag14;
    }

    public void setSystemValidFlag14(String systemValidFlag14) {
        this.systemValidFlag14 = systemValidFlag14 == null ? null : systemValidFlag14.trim();
    }

    public String getSystemValidFlag15() {
        return systemValidFlag15;
    }

    public void setSystemValidFlag15(String systemValidFlag15) {
        this.systemValidFlag15 = systemValidFlag15 == null ? null : systemValidFlag15.trim();
    }

    public String getSystemValidFlag16() {
        return systemValidFlag16;
    }

    public void setSystemValidFlag16(String systemValidFlag16) {
        this.systemValidFlag16 = systemValidFlag16 == null ? null : systemValidFlag16.trim();
    }

    public String getSystemValidFlag17() {
        return systemValidFlag17;
    }

    public void setSystemValidFlag17(String systemValidFlag17) {
        this.systemValidFlag17 = systemValidFlag17 == null ? null : systemValidFlag17.trim();
    }

    public String getSystemValidFlag18() {
        return systemValidFlag18;
    }

    public void setSystemValidFlag18(String systemValidFlag18) {
        this.systemValidFlag18 = systemValidFlag18 == null ? null : systemValidFlag18.trim();
    }

    public String getSystemValidFlag19() {
        return systemValidFlag19;
    }

    public void setSystemValidFlag19(String systemValidFlag19) {
        this.systemValidFlag19 = systemValidFlag19 == null ? null : systemValidFlag19.trim();
    }

    public String getSystemValidFlag20() {
        return systemValidFlag20;
    }

    public void setSystemValidFlag20(String systemValidFlag20) {
        this.systemValidFlag20 = systemValidFlag20 == null ? null : systemValidFlag20.trim();
    }

    public String getAdminFlag() {
        return adminFlag;
    }

    public void setAdminFlag(String adminFlag) {
        this.adminFlag = adminFlag == null ? null : adminFlag.trim();
    }
}