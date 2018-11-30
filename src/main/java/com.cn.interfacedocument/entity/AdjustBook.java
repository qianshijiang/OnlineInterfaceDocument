package com.cn.interfacedocument.entity;

public class AdjustBook {
    private Long id;

    private String name;

    private String caseNo;

    private String conSign;

    private String day;

    private String extend;

    private String month;

    private String orgName;

    private String proSign;

    private String readp;

    private String repSign;

    private String year;

    private Long lawCaseId;

    private String sucOrFail;

    private Boolean pro;

    private Boolean rep;

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

    public String getConSign() {
        return conSign;
    }

    public void setConSign(String conSign) {
        this.conSign = conSign == null ? null : conSign.trim();
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day == null ? null : day.trim();
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public String getProSign() {
        return proSign;
    }

    public void setProSign(String proSign) {
        this.proSign = proSign == null ? null : proSign.trim();
    }

    public String getReadp() {
        return readp;
    }

    public void setReadp(String readp) {
        this.readp = readp == null ? null : readp.trim();
    }

    public String getRepSign() {
        return repSign;
    }

    public void setRepSign(String repSign) {
        this.repSign = repSign == null ? null : repSign.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Long getLawCaseId() {
        return lawCaseId;
    }

    public void setLawCaseId(Long lawCaseId) {
        this.lawCaseId = lawCaseId;
    }

    public String getSucOrFail() {
        return sucOrFail;
    }

    public void setSucOrFail(String sucOrFail) {
        this.sucOrFail = sucOrFail == null ? null : sucOrFail.trim();
    }

    public Boolean getPro() {
        return pro;
    }

    public void setPro(Boolean pro) {
        this.pro = pro;
    }

    public Boolean getRep() {
        return rep;
    }

    public void setRep(Boolean rep) {
        this.rep = rep;
    }
}