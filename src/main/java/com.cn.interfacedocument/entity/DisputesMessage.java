package com.cn.interfacedocument.entity;

import java.util.Date;

public class DisputesMessage {
    private Long id;

    private String autoSessionId;

    private String caseCause;

    private Date createTime;

    private Date updateTime;

    private String messages;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutoSessionId() {
        return autoSessionId;
    }

    public void setAutoSessionId(String autoSessionId) {
        this.autoSessionId = autoSessionId == null ? null : autoSessionId.trim();
    }

    public String getCaseCause() {
        return caseCause;
    }

    public void setCaseCause(String caseCause) {
        this.caseCause = caseCause == null ? null : caseCause.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages == null ? null : messages.trim();
    }
}