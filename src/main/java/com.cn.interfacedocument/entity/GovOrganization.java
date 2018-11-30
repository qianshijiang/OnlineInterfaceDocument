package com.cn.interfacedocument.entity;

import java.util.Date;

public class GovOrganization {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOV_ORGANIZATION.ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOV_ORGANIZATION.ORG_ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private Long orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOV_ORGANIZATION.ORG_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private String orgName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOV_ORGANIZATION.ORG_PHONE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private String orgPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOV_ORGANIZATION.ORG_CONTACT_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private String orgContactName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOV_ORGANIZATION.ORG_ADDRESS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private String orgAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOV_ORGANIZATION.TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOV_ORGANIZATION.GOV_ORG_ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private String govOrgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOV_ORGANIZATION.GOV_COURT_CODE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private Integer govCourtCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOV_ORGANIZATION.STATUS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOV_ORGANIZATION.UPDATE_TIME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOV_ORGANIZATION.CREATE_TIME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOV_ORGANIZATION.ORG_LANDLINE_PHONE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private String orgLandlinePhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column GOV_ORGANIZATION.INTRODUCTION
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private String introduction;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOV_ORGANIZATION.ID
     *
     * @return the value of GOV_ORGANIZATION.ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOV_ORGANIZATION.ID
     *
     * @param id the value for GOV_ORGANIZATION.ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOV_ORGANIZATION.ORG_ID
     *
     * @return the value of GOV_ORGANIZATION.ORG_ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOV_ORGANIZATION.ORG_ID
     *
     * @param orgId the value for GOV_ORGANIZATION.ORG_ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOV_ORGANIZATION.ORG_NAME
     *
     * @return the value of GOV_ORGANIZATION.ORG_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOV_ORGANIZATION.ORG_NAME
     *
     * @param orgName the value for GOV_ORGANIZATION.ORG_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOV_ORGANIZATION.ORG_PHONE
     *
     * @return the value of GOV_ORGANIZATION.ORG_PHONE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public String getOrgPhone() {
        return orgPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOV_ORGANIZATION.ORG_PHONE
     *
     * @param orgPhone the value for GOV_ORGANIZATION.ORG_PHONE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setOrgPhone(String orgPhone) {
        this.orgPhone = orgPhone == null ? null : orgPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOV_ORGANIZATION.ORG_CONTACT_NAME
     *
     * @return the value of GOV_ORGANIZATION.ORG_CONTACT_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public String getOrgContactName() {
        return orgContactName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOV_ORGANIZATION.ORG_CONTACT_NAME
     *
     * @param orgContactName the value for GOV_ORGANIZATION.ORG_CONTACT_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setOrgContactName(String orgContactName) {
        this.orgContactName = orgContactName == null ? null : orgContactName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOV_ORGANIZATION.ORG_ADDRESS
     *
     * @return the value of GOV_ORGANIZATION.ORG_ADDRESS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public String getOrgAddress() {
        return orgAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOV_ORGANIZATION.ORG_ADDRESS
     *
     * @param orgAddress the value for GOV_ORGANIZATION.ORG_ADDRESS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress == null ? null : orgAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOV_ORGANIZATION.TYPE
     *
     * @return the value of GOV_ORGANIZATION.TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOV_ORGANIZATION.TYPE
     *
     * @param type the value for GOV_ORGANIZATION.TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOV_ORGANIZATION.GOV_ORG_ID
     *
     * @return the value of GOV_ORGANIZATION.GOV_ORG_ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public String getGovOrgId() {
        return govOrgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOV_ORGANIZATION.GOV_ORG_ID
     *
     * @param govOrgId the value for GOV_ORGANIZATION.GOV_ORG_ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setGovOrgId(String govOrgId) {
        this.govOrgId = govOrgId == null ? null : govOrgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOV_ORGANIZATION.GOV_COURT_CODE
     *
     * @return the value of GOV_ORGANIZATION.GOV_COURT_CODE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public Integer getGovCourtCode() {
        return govCourtCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOV_ORGANIZATION.GOV_COURT_CODE
     *
     * @param govCourtCode the value for GOV_ORGANIZATION.GOV_COURT_CODE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setGovCourtCode(Integer govCourtCode) {
        this.govCourtCode = govCourtCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOV_ORGANIZATION.STATUS
     *
     * @return the value of GOV_ORGANIZATION.STATUS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOV_ORGANIZATION.STATUS
     *
     * @param status the value for GOV_ORGANIZATION.STATUS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOV_ORGANIZATION.UPDATE_TIME
     *
     * @return the value of GOV_ORGANIZATION.UPDATE_TIME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOV_ORGANIZATION.UPDATE_TIME
     *
     * @param updateTime the value for GOV_ORGANIZATION.UPDATE_TIME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOV_ORGANIZATION.CREATE_TIME
     *
     * @return the value of GOV_ORGANIZATION.CREATE_TIME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOV_ORGANIZATION.CREATE_TIME
     *
     * @param createTime the value for GOV_ORGANIZATION.CREATE_TIME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOV_ORGANIZATION.ORG_LANDLINE_PHONE
     *
     * @return the value of GOV_ORGANIZATION.ORG_LANDLINE_PHONE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public String getOrgLandlinePhone() {
        return orgLandlinePhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOV_ORGANIZATION.ORG_LANDLINE_PHONE
     *
     * @param orgLandlinePhone the value for GOV_ORGANIZATION.ORG_LANDLINE_PHONE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setOrgLandlinePhone(String orgLandlinePhone) {
        this.orgLandlinePhone = orgLandlinePhone == null ? null : orgLandlinePhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column GOV_ORGANIZATION.INTRODUCTION
     *
     * @return the value of GOV_ORGANIZATION.INTRODUCTION
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column GOV_ORGANIZATION.INTRODUCTION
     *
     * @param introduction the value for GOV_ORGANIZATION.INTRODUCTION
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }
}