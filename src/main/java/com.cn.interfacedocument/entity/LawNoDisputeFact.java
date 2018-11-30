package com.cn.interfacedocument.entity;

public class LawNoDisputeFact {
    private Long id;

    private String name;

    private String type;

    private String caseNo;

    private String orgName;

    private Boolean proNoDf;

    private Boolean repNoDf;

    private String isConfirm;

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

    public Boolean getProNoDf() {
        return proNoDf;
    }

    public void setProNoDf(Boolean proNoDf) {
        this.proNoDf = proNoDf;
    }

    public Boolean getRepNoDf() {
        return repNoDf;
    }

    public void setRepNoDf(Boolean repNoDf) {
        this.repNoDf = repNoDf;
    }

    public String getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(String isConfirm) {
        this.isConfirm = isConfirm == null ? null : isConfirm.trim();
    }
}