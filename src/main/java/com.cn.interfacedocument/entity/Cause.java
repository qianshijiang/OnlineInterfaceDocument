package com.cn.interfacedocument.entity;

public class Cause {
    private Integer id;

    private String name;

    private Integer parentId;

    private String sycs;

    private String sfjy;

    private String ccbm;

    private String disputeTypeCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getSycs() {
        return sycs;
    }

    public void setSycs(String sycs) {
        this.sycs = sycs == null ? null : sycs.trim();
    }

    public String getSfjy() {
        return sfjy;
    }

    public void setSfjy(String sfjy) {
        this.sfjy = sfjy == null ? null : sfjy.trim();
    }

    public String getCcbm() {
        return ccbm;
    }

    public void setCcbm(String ccbm) {
        this.ccbm = ccbm == null ? null : ccbm.trim();
    }

    public String getDisputeTypeCode() {
        return disputeTypeCode;
    }

    public void setDisputeTypeCode(String disputeTypeCode) {
        this.disputeTypeCode = disputeTypeCode == null ? null : disputeTypeCode.trim();
    }
}