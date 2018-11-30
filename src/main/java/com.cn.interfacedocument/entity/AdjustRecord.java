package com.cn.interfacedocument.entity;

public class AdjustRecord {
    private Long id;

    private String name;

    private String caseNo;

    private String location;

    private String sgin;

    private String time;

    private String orderb;

    private Long lawMeettingId;

    private String extend;

    private Long lawCaseId;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getSgin() {
        return sgin;
    }

    public void setSgin(String sgin) {
        this.sgin = sgin == null ? null : sgin.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getOrderb() {
        return orderb;
    }

    public void setOrderb(String orderb) {
        this.orderb = orderb == null ? null : orderb.trim();
    }

    public Long getLawMeettingId() {
        return lawMeettingId;
    }

    public void setLawMeettingId(Long lawMeettingId) {
        this.lawMeettingId = lawMeettingId;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }

    public Long getLawCaseId() {
        return lawCaseId;
    }

    public void setLawCaseId(Long lawCaseId) {
        this.lawCaseId = lawCaseId;
    }
}