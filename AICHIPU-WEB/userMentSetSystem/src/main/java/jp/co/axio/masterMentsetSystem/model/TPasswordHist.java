package jp.co.axio.masterMentsetSystem.model;

import java.util.Date;

public class TPasswordHist extends TPasswordHistKey {
    private String passwordUpdaterId;

    private String currPassword;

    private String reflectionFlag;

    private String opeId;

    private String registerId;

    private Date registTs;

    private String updaterId;

    private Date updateTs;

    public String getPasswordUpdaterId() {
        return passwordUpdaterId;
    }

    public void setPasswordUpdaterId(String passwordUpdaterId) {
        this.passwordUpdaterId = passwordUpdaterId == null ? null : passwordUpdaterId.trim();
    }

    public String getCurrPassword() {
        return currPassword;
    }

    public void setCurrPassword(String currPassword) {
        this.currPassword = currPassword == null ? null : currPassword.trim();
    }

    public String getReflectionFlag() {
        return reflectionFlag;
    }

    public void setReflectionFlag(String reflectionFlag) {
        this.reflectionFlag = reflectionFlag == null ? null : reflectionFlag.trim();
    }

    public String getOpeId() {
        return opeId;
    }

    public void setOpeId(String opeId) {
        this.opeId = opeId == null ? null : opeId.trim();
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