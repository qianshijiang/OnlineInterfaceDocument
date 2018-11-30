package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawMscheme {
    private Long id;

    private String name;

    private String type;

    private Boolean proLms;

    private Boolean repLms;

    private String isConfirm;

    private Date updateTime;

    private Date createTime;

    private String caseNo;

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

    public Boolean getProLms() {
        return proLms;
    }

    public void setProLms(Boolean proLms) {
        this.proLms = proLms;
    }

    public Boolean getRepLms() {
        return repLms;
    }

    public void setRepLms(Boolean repLms) {
        this.repLms = repLms;
    }

    public String getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(String isConfirm) {
        this.isConfirm = isConfirm == null ? null : isConfirm.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }
}