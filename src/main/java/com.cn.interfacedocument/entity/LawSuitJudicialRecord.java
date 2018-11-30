package com.cn.interfacedocument.entity;

public class LawSuitJudicialRecord {
    private Long id;

    private String caseNo;

    private String time;

    private String problem;

    private String location;

    private String lawsuitId;

    private String meettingId;

    private String orderb;

    private String delFlag;

    private String name;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem == null ? null : problem.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getLawsuitId() {
        return lawsuitId;
    }

    public void setLawsuitId(String lawsuitId) {
        this.lawsuitId = lawsuitId == null ? null : lawsuitId.trim();
    }

    public String getMeettingId() {
        return meettingId;
    }

    public void setMeettingId(String meettingId) {
        this.meettingId = meettingId == null ? null : meettingId.trim();
    }

    public String getOrderb() {
        return orderb;
    }

    public void setOrderb(String orderb) {
        this.orderb = orderb == null ? null : orderb.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}