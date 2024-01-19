package jp.co.axio.masterMentsetSystem.model;

import java.util.Date;

public class TAuthHist extends TAuthHistKey {
    private String authFailFlag;

    private String registerId;

    private Date registTs;

    private String updaterId;

    private Date updateTs;

    public String getAuthFailFlag() {
        return authFailFlag;
    }

    public void setAuthFailFlag(String authFailFlag) {
        this.authFailFlag = authFailFlag == null ? null : authFailFlag.trim();
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