package com.itswcg.todo.model;

import java.io.Serializable;
import java.util.Date;

public class DjangoSession implements Serializable {
    private String sessionKey;

    private Date expireDate;

    private String sessionData;

    private static final long serialVersionUID = 1L;

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getSessionData() {
        return sessionData;
    }

    public void setSessionData(String sessionData) {
        this.sessionData = sessionData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sessionKey=").append(sessionKey);
        sb.append(", expireDate=").append(expireDate);
        sb.append(", sessionData=").append(sessionData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}