package com.cn.interfacedocument.entity;

public class LawJudgleBook {
    private Long id;

    private String name;

    private String type;

    private String caseNo;

    private String orgName;

    private Boolean proJdb;

    private Boolean repJdb;

    private String isConfirm;

    private String court;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Boolean getProJdb() {
        return proJdb;
    }

    public void setProJdb(Boolean proJdb) {
        this.proJdb = proJdb;
    }

    public Boolean getRepJdb() {
        return repJdb;
    }

    public void setRepJdb(Boolean repJdb) {
        this.repJdb = repJdb;
    }

    public String getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(String isConfirm) {
        this.isConfirm = isConfirm == null ? null : isConfirm.trim();
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court == null ? null : court.trim();
    }
}