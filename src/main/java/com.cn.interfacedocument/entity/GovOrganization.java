package com.cn.interfacedocument.entity;

import java.util.Date;

public class GovOrganization {
    private Long id;

    private Long orgId;

    private String orgName;

    private String orgPhone;

    private String orgContactName;

    private String orgAddress;

    private String type;

    private String govOrgId;

    private Integer govCourtCode;

    private Integer status;

    private Date updateTime;

    private Date createTime;

    private String orgLandlinePhone;

    private String introduction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getOrgPhone() {
        return orgPhone;
    }

    public void setOrgPhone(String orgPhone) {
        this.orgPhone = orgPhone == null ? null : orgPhone.trim();
    }

    public String getOrgContactName() {
        return orgContactName;
    }

    public void setOrgContactName(String orgContactName) {
        this.orgContactName = orgContactName == null ? null : orgContactName.trim();
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress == null ? null : orgAddress.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getGovOrgId() {
        return govOrgId;
    }

    public void setGovOrgId(String govOrgId) {
        this.govOrgId = govOrgId == null ? null : govOrgId.trim();
    }

    public Integer getGovCourtCode() {
        return govCourtCode;
    }

    public void setGovCourtCode(Integer govCourtCode) {
        this.govCourtCode = govCourtCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public String getOrgLandlinePhone() {
        return orgLandlinePhone;
    }

    public void setOrgLandlinePhone(String orgLandlinePhone) {
        this.orgLandlinePhone = orgLandlinePhone == null ? null : orgLandlinePhone.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}