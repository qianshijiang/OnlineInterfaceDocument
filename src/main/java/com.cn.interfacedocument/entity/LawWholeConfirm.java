package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawWholeConfirm {
    private Long id;

    private String name;

    private Long personnelId;

    private Long adjustBookId;

    private Boolean isConfirm;

    private Long lawCaseId;

    private Long lawNoDisputeFactId;

    private Long lawJudgleBookId;

    private Long lawPromiseId;

    private Long lawMschemeId;

    private Date createTime;

    private Date confirmTime;

    private Long lawAdjustBookId;

    private Long lawMeettingId;

    private String signature;

    private Integer whoOrder;

    private Integer whoRole;

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

    public Long getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(Long personnelId) {
        this.personnelId = personnelId;
    }

    public Long getAdjustBookId() {
        return adjustBookId;
    }

    public void setAdjustBookId(Long adjustBookId) {
        this.adjustBookId = adjustBookId;
    }

    public Boolean getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(Boolean isConfirm) {
        this.isConfirm = isConfirm;
    }

    public Long getLawCaseId() {
        return lawCaseId;
    }

    public void setLawCaseId(Long lawCaseId) {
        this.lawCaseId = lawCaseId;
    }

    public Long getLawNoDisputeFactId() {
        return lawNoDisputeFactId;
    }

    public void setLawNoDisputeFactId(Long lawNoDisputeFactId) {
        this.lawNoDisputeFactId = lawNoDisputeFactId;
    }

    public Long getLawJudgleBookId() {
        return lawJudgleBookId;
    }

    public void setLawJudgleBookId(Long lawJudgleBookId) {
        this.lawJudgleBookId = lawJudgleBookId;
    }

    public Long getLawPromiseId() {
        return lawPromiseId;
    }

    public void setLawPromiseId(Long lawPromiseId) {
        this.lawPromiseId = lawPromiseId;
    }

    public Long getLawMschemeId() {
        return lawMschemeId;
    }

    public void setLawMschemeId(Long lawMschemeId) {
        this.lawMschemeId = lawMschemeId;
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

    public Long getLawAdjustBookId() {
        return lawAdjustBookId;
    }

    public void setLawAdjustBookId(Long lawAdjustBookId) {
        this.lawAdjustBookId = lawAdjustBookId;
    }

    public Long getLawMeettingId() {
        return lawMeettingId;
    }

    public void setLawMeettingId(Long lawMeettingId) {
        this.lawMeettingId = lawMeettingId;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Integer getWhoOrder() {
        return whoOrder;
    }

    public void setWhoOrder(Integer whoOrder) {
        this.whoOrder = whoOrder;
    }

    public Integer getWhoRole() {
        return whoRole;
    }

    public void setWhoRole(Integer whoRole) {
        this.whoRole = whoRole;
    }
}