package com.cn.interfacedocument.entity;

import java.util.Date;

public class Xihucase {
    private Integer id;

    private String caseNo;

    private Long ajbs;

    private String caseStyle;

    private String sqr;

    private Long sqrPhone;

    private String bsqr;

    private Long bsqrPhone;

    private String caseType;

    private String meditionName;

    private Long meditonPhone;

    private Date createTime;

    private String caseDetail;

    private String caseWay;

    private Date caseFinishTime;

    private String caseOverDetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    public Long getAjbs() {
        return ajbs;
    }

    public void setAjbs(Long ajbs) {
        this.ajbs = ajbs;
    }

    public String getCaseStyle() {
        return caseStyle;
    }

    public void setCaseStyle(String caseStyle) {
        this.caseStyle = caseStyle == null ? null : caseStyle.trim();
    }

    public String getSqr() {
        return sqr;
    }

    public void setSqr(String sqr) {
        this.sqr = sqr == null ? null : sqr.trim();
    }

    public Long getSqrPhone() {
        return sqrPhone;
    }

    public void setSqrPhone(Long sqrPhone) {
        this.sqrPhone = sqrPhone;
    }

    public String getBsqr() {
        return bsqr;
    }

    public void setBsqr(String bsqr) {
        this.bsqr = bsqr == null ? null : bsqr.trim();
    }

    public Long getBsqrPhone() {
        return bsqrPhone;
    }

    public void setBsqrPhone(Long bsqrPhone) {
        this.bsqrPhone = bsqrPhone;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType == null ? null : caseType.trim();
    }

    public String getMeditionName() {
        return meditionName;
    }

    public void setMeditionName(String meditionName) {
        this.meditionName = meditionName == null ? null : meditionName.trim();
    }

    public Long getMeditonPhone() {
        return meditonPhone;
    }

    public void setMeditonPhone(Long meditonPhone) {
        this.meditonPhone = meditonPhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCaseDetail() {
        return caseDetail;
    }

    public void setCaseDetail(String caseDetail) {
        this.caseDetail = caseDetail == null ? null : caseDetail.trim();
    }

    public String getCaseWay() {
        return caseWay;
    }

    public void setCaseWay(String caseWay) {
        this.caseWay = caseWay == null ? null : caseWay.trim();
    }

    public Date getCaseFinishTime() {
        return caseFinishTime;
    }

    public void setCaseFinishTime(Date caseFinishTime) {
        this.caseFinishTime = caseFinishTime;
    }

    public String getCaseOverDetail() {
        return caseOverDetail;
    }

    public void setCaseOverDetail(String caseOverDetail) {
        this.caseOverDetail = caseOverDetail == null ? null : caseOverDetail.trim();
    }
}