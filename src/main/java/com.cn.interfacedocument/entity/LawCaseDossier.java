package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawCaseDossier {
    private Long id;

    private String name;

    private Long organizationId;

    private String organizationName;

    private String applicantNames;

    private String lawCaseType;

    private String lawCaseDossierName;

    private String caseNo;

    private Long mediatorsNameId;

    private String mediatorsName;

    private String agreementYear;

    private String agreementNumbe;

    private Date caseCreateDate;

    private Date caseCompleteDate;

    private Long creatorId;

    private String creatorName;

    private Date createdDate;

    private Integer storageTime;

    private Long auditorId;

    private String auditorName;

    private Date auditTime;

    private String remarks;

    private Long lawCaseId;

    private Integer status;

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

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }

    public String getApplicantNames() {
        return applicantNames;
    }

    public void setApplicantNames(String applicantNames) {
        this.applicantNames = applicantNames == null ? null : applicantNames.trim();
    }

    public String getLawCaseType() {
        return lawCaseType;
    }

    public void setLawCaseType(String lawCaseType) {
        this.lawCaseType = lawCaseType == null ? null : lawCaseType.trim();
    }

    public String getLawCaseDossierName() {
        return lawCaseDossierName;
    }

    public void setLawCaseDossierName(String lawCaseDossierName) {
        this.lawCaseDossierName = lawCaseDossierName == null ? null : lawCaseDossierName.trim();
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    public Long getMediatorsNameId() {
        return mediatorsNameId;
    }

    public void setMediatorsNameId(Long mediatorsNameId) {
        this.mediatorsNameId = mediatorsNameId;
    }

    public String getMediatorsName() {
        return mediatorsName;
    }

    public void setMediatorsName(String mediatorsName) {
        this.mediatorsName = mediatorsName == null ? null : mediatorsName.trim();
    }

    public String getAgreementYear() {
        return agreementYear;
    }

    public void setAgreementYear(String agreementYear) {
        this.agreementYear = agreementYear == null ? null : agreementYear.trim();
    }

    public String getAgreementNumbe() {
        return agreementNumbe;
    }

    public void setAgreementNumbe(String agreementNumbe) {
        this.agreementNumbe = agreementNumbe == null ? null : agreementNumbe.trim();
    }

    public Date getCaseCreateDate() {
        return caseCreateDate;
    }

    public void setCaseCreateDate(Date caseCreateDate) {
        this.caseCreateDate = caseCreateDate;
    }

    public Date getCaseCompleteDate() {
        return caseCompleteDate;
    }

    public void setCaseCompleteDate(Date caseCompleteDate) {
        this.caseCompleteDate = caseCompleteDate;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(Integer storageTime) {
        this.storageTime = storageTime;
    }

    public Long getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName == null ? null : auditorName.trim();
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
}