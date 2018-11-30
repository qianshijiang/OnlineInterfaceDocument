package com.cn.interfacedocument.entity;

public class LawSuitDetail {
    private Long id;

    private String name;

    private String acceptancePeriod;

    private String areasCode;

    private String areasName;

    private String beginDate;

    private String beginTime;

    private String caseId;

    private String caseNo;

    private String closedDate;

    private String court;

    private String filingDate;

    private String mediation;

    private String number;

    private String payableAmount;

    private String undertaker;

    private String undertakerPhone;

    private Long lawsuitId;

    private String effectDate;

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

    public String getAcceptancePeriod() {
        return acceptancePeriod;
    }

    public void setAcceptancePeriod(String acceptancePeriod) {
        this.acceptancePeriod = acceptancePeriod == null ? null : acceptancePeriod.trim();
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

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate == null ? null : beginDate.trim();
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime == null ? null : beginTime.trim();
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId == null ? null : caseId.trim();
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    public String getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(String closedDate) {
        this.closedDate = closedDate == null ? null : closedDate.trim();
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court == null ? null : court.trim();
    }

    public String getFilingDate() {
        return filingDate;
    }

    public void setFilingDate(String filingDate) {
        this.filingDate = filingDate == null ? null : filingDate.trim();
    }

    public String getMediation() {
        return mediation;
    }

    public void setMediation(String mediation) {
        this.mediation = mediation == null ? null : mediation.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(String payableAmount) {
        this.payableAmount = payableAmount == null ? null : payableAmount.trim();
    }

    public String getUndertaker() {
        return undertaker;
    }

    public void setUndertaker(String undertaker) {
        this.undertaker = undertaker == null ? null : undertaker.trim();
    }

    public String getUndertakerPhone() {
        return undertakerPhone;
    }

    public void setUndertakerPhone(String undertakerPhone) {
        this.undertakerPhone = undertakerPhone == null ? null : undertakerPhone.trim();
    }

    public Long getLawsuitId() {
        return lawsuitId;
    }

    public void setLawsuitId(Long lawsuitId) {
        this.lawsuitId = lawsuitId;
    }

    public String getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(String effectDate) {
        this.effectDate = effectDate == null ? null : effectDate.trim();
    }
}