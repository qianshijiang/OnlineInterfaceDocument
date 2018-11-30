package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawSuit {
    private Long id;

    private String name;

    private String applyIdCard;

    private String applyName;

    private String applyPhone;

    private Integer applyType;

    private String caseType;

    private String causeCode;

    private String court;

    private String courtCod;

    private Date createDate;

    private String lasqid;

    private Long lawcaeId;

    private String number;

    private String source;

    private Integer status;

    private String statusName;

    private String tribunal;

    private String tribunalCode;

    private String areasCode;

    private String areasName;

    private String odrStatus;

    private Long organizationId;

    private String type;

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

    public String getApplyIdCard() {
        return applyIdCard;
    }

    public void setApplyIdCard(String applyIdCard) {
        this.applyIdCard = applyIdCard == null ? null : applyIdCard.trim();
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName == null ? null : applyName.trim();
    }

    public String getApplyPhone() {
        return applyPhone;
    }

    public void setApplyPhone(String applyPhone) {
        this.applyPhone = applyPhone == null ? null : applyPhone.trim();
    }

    public Integer getApplyType() {
        return applyType;
    }

    public void setApplyType(Integer applyType) {
        this.applyType = applyType;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType == null ? null : caseType.trim();
    }

    public String getCauseCode() {
        return causeCode;
    }

    public void setCauseCode(String causeCode) {
        this.causeCode = causeCode == null ? null : causeCode.trim();
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court == null ? null : court.trim();
    }

    public String getCourtCod() {
        return courtCod;
    }

    public void setCourtCod(String courtCod) {
        this.courtCod = courtCod == null ? null : courtCod.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getLasqid() {
        return lasqid;
    }

    public void setLasqid(String lasqid) {
        this.lasqid = lasqid == null ? null : lasqid.trim();
    }

    public Long getLawcaeId() {
        return lawcaeId;
    }

    public void setLawcaeId(Long lawcaeId) {
        this.lawcaeId = lawcaeId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    public String getTribunal() {
        return tribunal;
    }

    public void setTribunal(String tribunal) {
        this.tribunal = tribunal == null ? null : tribunal.trim();
    }

    public String getTribunalCode() {
        return tribunalCode;
    }

    public void setTribunalCode(String tribunalCode) {
        this.tribunalCode = tribunalCode == null ? null : tribunalCode.trim();
    }

    public String getAreasCode() {
        return areasCode;
    }

    public void setAreasCode(String areasCode) {
        this.areasCode = areasCode == null ? null : areasCode.trim();
    }

    public String getAreasName() {
        return areasName;
    }

    public void setAreasName(String areasName) {
        this.areasName = areasName == null ? null : areasName.trim();
    }

    public String getOdrStatus() {
        return odrStatus;
    }

    public void setOdrStatus(String odrStatus) {
        this.odrStatus = odrStatus == null ? null : odrStatus.trim();
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}