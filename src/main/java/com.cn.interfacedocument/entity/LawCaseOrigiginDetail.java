package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawCaseOrigiginDetail {
    private Long id;

    private String name;

    private String caseNo;

    private String courtName;

    private String uniqueNumber;

    private Long lawcaseId;

    private String cause;

    private String tribunalName;

    private String status;

    private String lasqid;

    private Date createTime;

    private Date updateTime;

    private String zzr;

    private String judgePhone;

    private String judgeName;

    private String failReason;

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

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName == null ? null : courtName.trim();
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(String uniqueNumber) {
        this.uniqueNumber = uniqueNumber == null ? null : uniqueNumber.trim();
    }

    public Long getLawcaseId() {
        return lawcaseId;
    }

    public void setLawcaseId(Long lawcaseId) {
        this.lawcaseId = lawcaseId;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getTribunalName() {
        return tribunalName;
    }

    public void setTribunalName(String tribunalName) {
        this.tribunalName = tribunalName == null ? null : tribunalName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getLasqid() {
        return lasqid;
    }

    public void setLasqid(String lasqid) {
        this.lasqid = lasqid == null ? null : lasqid.trim();
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

    public String getZzr() {
        return zzr;
    }

    public void setZzr(String zzr) {
        this.zzr = zzr == null ? null : zzr.trim();
    }

    public String getJudgePhone() {
        return judgePhone;
    }

    public void setJudgePhone(String judgePhone) {
        this.judgePhone = judgePhone == null ? null : judgePhone.trim();
    }

    public String getJudgeName() {
        return judgeName;
    }

    public void setJudgeName(String judgeName) {
        this.judgeName = judgeName == null ? null : judgeName.trim();
    }

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason == null ? null : failReason.trim();
    }
}