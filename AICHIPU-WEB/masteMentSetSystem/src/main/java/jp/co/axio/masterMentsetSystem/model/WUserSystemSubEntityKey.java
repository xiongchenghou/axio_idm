package jp.co.axio.masterMentsetSystem.model;

import java.util.Date;

public class WUserSystemSubEntityKey {
    private String userId;

    private String uploadUserId;

    private Date uploadUserTs;

    private String uploadSession;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUploadUserId() {
        return uploadUserId;
    }

    public void setUploadUserId(String uploadUserId) {
        this.uploadUserId = uploadUserId == null ? null : uploadUserId.trim();
    }

    public Date getUploadUserTs() {
        return uploadUserTs;
    }

    public void setUploadUserTs(Date uploadUserTs) {
        this.uploadUserTs = uploadUserTs;
    }

    public String getUploadSession() {
        return uploadSession;
    }

    public void setUploadSession(String uploadSession) {
        this.uploadSession = uploadSession == null ? null : uploadSession.trim();
    }
}