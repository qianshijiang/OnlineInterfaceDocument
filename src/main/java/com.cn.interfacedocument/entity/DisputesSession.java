package com.cn.interfacedocument.entity;

import java.util.Date;

public class DisputesSession {
    private Long id;

    private String name;

    private Date claimTime;

    private String isswitch;

    private Date latestTime;

    private Long report;

    private String status;

    private Date validTime;

    private Long clientId;

    private Long counselorId;

    private Long disputesId;

    private Date createTime;

    private Date updateTime;

    private String opin;

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

    public Date getClaimTime() {
        return claimTime;
    }

    public void setClaimTime(Date claimTime) {
        this.claimTime = claimTime;
    }

    public String getIsswitch() {
        return isswitch;
    }

    public void setIsswitch(String isswitch) {
        this.isswitch = isswitch == null ? null : isswitch.trim();
    }

    public Date getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(Date latestTime) {
        this.latestTime = latestTime;
    }

    public Long getReport() {
        return report;
    }

    public void setReport(Long report) {
        this.report = report;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getValidTime() {
        return validTime;
    }

    public void setValidTime(Date validTime) {
        this.validTime = validTime;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getCounselorId() {
        return counselorId;
    }

    public void setCounselorId(Long counselorId) {
        this.counselorId = counselorId;
    }

    public Long getDisputesId() {
        return disputesId;
    }

    public void setDisputesId(Long disputesId) {
        this.disputesId = disputesId;
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

    public String getOpin() {
        return opin;
    }

    public void setOpin(String opin) {
        this.opin = opin == null ? null : opin.trim();
    }
}