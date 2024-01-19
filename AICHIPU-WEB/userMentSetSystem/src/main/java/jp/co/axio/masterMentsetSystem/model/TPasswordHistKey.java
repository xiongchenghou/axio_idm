package jp.co.axio.masterMentsetSystem.model;

import java.util.Date;

public class TPasswordHistKey {
    private String userId;

    private Date passwordUpdateTs;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getPasswordUpdateTs() {
        return passwordUpdateTs;
    }

    public void setPasswordUpdateTs(Date passwordUpdateTs) {
        this.passwordUpdateTs = passwordUpdateTs;
    }
}