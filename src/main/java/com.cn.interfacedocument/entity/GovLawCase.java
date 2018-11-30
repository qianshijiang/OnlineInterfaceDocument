package com.cn.interfacedocument.entity;

import java.util.Date;

public class GovLawCase {
    private Long id;

    private Long lawCaseId;

    private Integer status;

    private String govLawCaseId;

    private Date updateTime;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLawCaseId() {
        return lawCaseId;
    }

    public void setLawCaseId(Long lawCaseId) {
        this.lawCaseId = lawCaseId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getGovLawCaseId() {
        return govLawCaseId;
    }

    public void setGovLawCaseId(String govLawCaseId) {
        this.govLawCaseId = govLawCaseId == null ? null : govLawCaseId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}