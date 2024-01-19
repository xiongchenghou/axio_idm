package jp.co.axio.masterMentsetSystem.model;

import java.util.Date;

public class TAuthHistKey {
    private String userId;

    private String webKbn;

    private Date authTs;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getWebKbn() {
        return webKbn;
    }

    public void setWebKbn(String webKbn) {
        this.webKbn = webKbn == null ? null : webKbn.trim();
    }

    public Date getAuthTs() {
        return authTs;
    }

    public void setAuthTs(Date authTs) {
        this.authTs = authTs;
    }
}