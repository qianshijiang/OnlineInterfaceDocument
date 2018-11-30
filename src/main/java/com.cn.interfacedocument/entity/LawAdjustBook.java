package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawAdjustBook {
    private Long id;

    private String type;

    private String caseNo;

    private String proAdb;

    private String repAdb;

    private String isConfirm;

    private String extend;

    private String name;

    private Date createDate;

    private String performanceTimeLimit;

    private String court;

    private String templateType;

    private String dissension;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getProAdb() {
        return proAdb;
    }

    public void setProAdb(String proAdb) {
        this.proAdb = proAdb == null ? null : proAdb.trim();
    }

    public String getRepAdb() {
        return repAdb;
    }

    public void setRepAdb(String repAdb) {
        this.repAdb = repAdb == null ? null : repAdb.trim();
    }

    public String getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(String isConfirm) {
        this.isConfirm = isConfirm == null ? null : isConfirm.trim();
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getPerformanceTimeLimit() {
        return performanceTimeLimit;
    }

    public void setPerformanceTimeLimit(String performanceTimeLimit) {
        this.performanceTimeLimit = performanceTimeLimit == null ? null : performanceTimeLimit.trim();
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court == null ? null : court.trim();
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType == null ? null : templateType.trim();
    }

    public String getDissension() {
        return dissension;
    }

    public void setDissension(String dissension) {
        this.dissension = dissension == null ? null : dissension.trim();
    }
}