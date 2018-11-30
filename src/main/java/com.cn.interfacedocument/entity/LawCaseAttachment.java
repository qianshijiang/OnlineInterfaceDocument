package com.cn.interfacedocument.entity;

import java.math.BigDecimal;
import java.util.Date;

public class LawCaseAttachment {
    private Long id;

    private String name;

    private String categoryb;

    private String categorym;

    private String categorys;

    private String content;

    private String delFlag;

    private String type;

    private String url;

    private Long caseId;

    private Long userId;

    private String owner;

    private Date createTime;

    private Date updateTime;

    private Long counselorAndMediatorsId;

    private String role;

    private String personnelIds;

    private Integer sign;

    private String meettingId;

    private Long personnelId;

    private String source;

    private Date performanceTimeLimit;

    private String wayOfFulfillment;

    private BigDecimal amountInvolved;

    private String placeOfPerformance;

    private String contentAgreement;

    private String hashcode;

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

    public String getCategoryb() {
        return categoryb;
    }

    public void setCategoryb(String categoryb) {
        this.categoryb = categoryb == null ? null : categoryb.trim();
    }

    public String getCategorym() {
        return categorym;
    }

    public void setCategorym(String categorym) {
        this.categorym = categorym == null ? null : categorym.trim();
    }

    public String getCategorys() {
        return categorys;
    }

    public void setCategorys(String categorys) {
        this.categorys = categorys == null ? null : categorys.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
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

    public Long getCounselorAndMediatorsId() {
        return counselorAndMediatorsId;
    }

    public void setCounselorAndMediatorsId(Long counselorAndMediatorsId) {
        this.counselorAndMediatorsId = counselorAndMediatorsId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getPersonnelIds() {
        return personnelIds;
    }

    public void setPersonnelIds(String personnelIds) {
        this.personnelIds = personnelIds == null ? null : personnelIds.trim();
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public String getMeettingId() {
        return meettingId;
    }

    public void setMeettingId(String meettingId) {
        this.meettingId = meettingId == null ? null : meettingId.trim();
    }

    public Long getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(Long personnelId) {
        this.personnelId = personnelId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Date getPerformanceTimeLimit() {
        return performanceTimeLimit;
    }

    public void setPerformanceTimeLimit(Date performanceTimeLimit) {
        this.performanceTimeLimit = performanceTimeLimit;
    }

    public String getWayOfFulfillment() {
        return wayOfFulfillment;
    }

    public void setWayOfFulfillment(String wayOfFulfillment) {
        this.wayOfFulfillment = wayOfFulfillment == null ? null : wayOfFulfillment.trim();
    }

    public BigDecimal getAmountInvolved() {
        return amountInvolved;
    }

    public void setAmountInvolved(BigDecimal amountInvolved) {
        this.amountInvolved = amountInvolved;
    }

    public String getPlaceOfPerformance() {
        return placeOfPerformance;
    }

    public void setPlaceOfPerformance(String placeOfPerformance) {
        this.placeOfPerformance = placeOfPerformance == null ? null : placeOfPerformance.trim();
    }

    public String getContentAgreement() {
        return contentAgreement;
    }

    public void setContentAgreement(String contentAgreement) {
        this.contentAgreement = contentAgreement == null ? null : contentAgreement.trim();
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode == null ? null : hashcode.trim();
    }
}