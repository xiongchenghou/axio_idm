package jp.co.axio.masterMentsetSystem.model;

import java.util.Date;

public class WUploadSubEntityKey {
    private String uploadUserId;

    private Date uploadUserTs;

    private String uploadSession;

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