package com.cn.interfacedocument.entity;

import java.util.Date;

public class OrganizationServiceSearch extends OrganizationServiceSearchKey {
    private String orgName;

    private String childOrgName;

    private Integer level;

    private Date createTime;

    private Date updateTime;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getChildOrgName() {
        return childOrgName;
    }

    public void setChildOrgName(String childOrgName) {
        this.childOrgName = childOrgName == null ? null : childOrgName.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
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