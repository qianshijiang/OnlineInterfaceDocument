package com.cn.interfacedocument.entity;

import java.util.Date;

public class Organization {
    private Long id;

    private Long parentId;

    private String areasCode;

    private String type;

    private String organizationName;

    private String organizationArea;

    private String organizationAddress;

    private String organizationCode;

    private String organizationImg;

    private String detailAddress;

    private String landlinePhone;

    private String logoImg;

    private String superName;

    private String contactName;

    private String title;

    private String contactPhone;

    private String contactMail;

    private String urlImg;

    private String grade;

    private Integer gradeLevel;

    private Integer status;

    private String areasScope;

    private String areasLevel;

    private String mediationTypeId;

    private String siteUrl;

    private String shuntLarge;

    private String shuntMiddle;

    private String shuntSmall;

    private Date createTime;

    private Date updateTime;

    private String introduction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getAreasCode() {
        return areasCode;
    }

    public void setAreasCode(String areasCode) {
        this.areasCode = areasCode == null ? null : areasCode.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }

    public String getOrganizationArea() {
        return organizationArea;
    }

    public void setOrganizationArea(String organizationArea) {
        this.organizationArea = organizationArea == null ? null : organizationArea.trim();
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }

    public void setOrganizationAddress(String organizationAddress) {
        this.organizationAddress = organizationAddress == null ? null : organizationAddress.trim();
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getOrganizationImg() {
        return organizationImg;
    }

    public void setOrganizationImg(String organizationImg) {
        this.organizationImg = organizationImg == null ? null : organizationImg.trim();
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    public String getLandlinePhone() {
        return landlinePhone;
    }

    public void setLandlinePhone(String landlinePhone) {
        this.landlinePhone = landlinePhone == null ? null : landlinePhone.trim();
    }

    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg == null ? null : logoImg.trim();
    }

    public String getSuperName() {
        return superName;
    }

    public void setSuperName(String superName) {
        this.superName = superName == null ? null : superName.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getContactMail() {
        return contactMail;
    }

    public void setContactMail(String contactMail) {
        this.contactMail = contactMail == null ? null : contactMail.trim();
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg == null ? null : urlImg.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Integer getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(Integer gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAreasScope() {
        return areasScope;
    }

    public void setAreasScope(String areasScope) {
        this.areasScope = areasScope == null ? null : areasScope.trim();
    }

    public String getAreasLevel() {
        return areasLevel;
    }

    public void setAreasLevel(String areasLevel) {
        this.areasLevel = areasLevel == null ? null : areasLevel.trim();
    }

    public String getMediationTypeId() {
        return mediationTypeId;
    }

    public void setMediationTypeId(String mediationTypeId) {
        this.mediationTypeId = mediationTypeId == null ? null : mediationTypeId.trim();
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl == null ? null : siteUrl.trim();
    }

    public String getShuntLarge() {
        return shuntLarge;
    }

    public void setShuntLarge(String shuntLarge) {
        this.shuntLarge = shuntLarge == null ? null : shuntLarge.trim();
    }

    public String getShuntMiddle() {
        return shuntMiddle;
    }

    public void setShuntMiddle(String shuntMiddle) {
        this.shuntMiddle = shuntMiddle == null ? null : shuntMiddle.trim();
    }

    public String getShuntSmall() {
        return shuntSmall;
    }

    public void setShuntSmall(String shuntSmall) {
        this.shuntSmall = shuntSmall == null ? null : shuntSmall.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}