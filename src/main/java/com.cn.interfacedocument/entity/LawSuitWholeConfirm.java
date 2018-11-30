package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawSuitWholeConfirm {
    private Long id;

    private String personId;

    private String lawsuitId;

    private String meettingId;

    private Date createTime;

    private Date confirmTime;

    private Boolean isConfirm;

    private String signature;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId == null ? null : personId.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Boolean getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(Boolean isConfirm) {
        this.isConfirm = isConfirm;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}