package com.itswcg.todo.model;

import java.io.Serializable;
import java.util.Date;

public class DjangoAdminLog implements Serializable {
    private Integer id;

    private Date actionTime;

    private String objectRepr;

    private Short actionFlag;

    private Integer contentTypeId;

    private Integer userId;

    private String objectId;

    private String changeMessage;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }

    public String getObjectRepr() {
        return objectRepr;
    }

    public void setObjectRepr(String objectRepr) {
        this.objectRepr = objectRepr;
    }

    public Short getActionFlag() {
        return actionFlag;
    }

    public void setActionFlag(Short actionFlag) {
        this.actionFlag = actionFlag;
    }

    public Integer getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(Integer contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getChangeMessage() {
        return changeMessage;
    }

    public void setChangeMessage(String changeMessage) {
        this.changeMessage = changeMessage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", actionTime=").append(actionTime);
        sb.append(", objectRepr=").append(objectRepr);
        sb.append(", actionFlag=").append(actionFlag);
        sb.append(", contentTypeId=").append(contentTypeId);
        sb.append(", userId=").append(userId);
        sb.append(", objectId=").append(objectId);
        sb.append(", changeMessage=").append(changeMessage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}