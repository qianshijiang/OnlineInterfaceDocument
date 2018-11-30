package com.cn.interfacedocument.entity;

import java.util.Date;

public class Nemessage {
    private Long id;

    private String name;

    private Date createTime;

    private Boolean isFile;

    private Boolean isRead;

    private String sender;

    private Long lawCaseId;

    private Long lawMeettingId;

    private Long personnelId;

    private String isVoice;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsFile() {
        return isFile;
    }

    public void setIsFile(Boolean isFile) {
        this.isFile = isFile;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public Long getLawCaseId() {
        return lawCaseId;
    }

    public void setLawCaseId(Long lawCaseId) {
        this.lawCaseId = lawCaseId;
    }

    public Long getLawMeettingId() {
        return lawMeettingId;
    }

    public void setLawMeettingId(Long lawMeettingId) {
        this.lawMeettingId = lawMeettingId;
    }

    public Long getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(Long personnelId) {
        this.personnelId = personnelId;
    }

    public String getIsVoice() {
        return isVoice;
    }

    public void setIsVoice(String isVoice) {
        this.isVoice = isVoice == null ? null : isVoice.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}