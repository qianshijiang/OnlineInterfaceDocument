package com.cn.interfacedocument.entity;

import java.util.Date;

public class DisputesScore {
    private Long id;

    private String name;

    private String level;

    private String satisfied;

    private Long disputesSessionId;

    private Date createTime;

    private Date updateTime;

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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getSatisfied() {
        return satisfied;
    }

    public void setSatisfied(String satisfied) {
        this.satisfied = satisfied == null ? null : satisfied.trim();
    }

    public Long getDisputesSessionId() {
        return disputesSessionId;
    }

    public void setDisputesSessionId(Long disputesSessionId) {
        this.disputesSessionId = disputesSessionId;
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
}