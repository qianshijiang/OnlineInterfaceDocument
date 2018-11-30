package com.cn.interfacedocument.entity;

import java.util.Date;

public class OrganizationStatus {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORGANIZATION_STATUS.ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORGANIZATION_STATUS.CONTENT
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORGANIZATION_STATUS.STATUS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORGANIZATION_STATUS.ORGANIZATION_ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private Long organizationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORGANIZATION_STATUS.CREATE_TIME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ORGANIZATION_STATUS.UPDATE_TIME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORGANIZATION_STATUS.ID
     *
     * @return the value of ORGANIZATION_STATUS.ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORGANIZATION_STATUS.ID
     *
     * @param id the value for ORGANIZATION_STATUS.ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORGANIZATION_STATUS.CONTENT
     *
     * @return the value of ORGANIZATION_STATUS.CONTENT
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORGANIZATION_STATUS.CONTENT
     *
     * @param content the value for ORGANIZATION_STATUS.CONTENT
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORGANIZATION_STATUS.STATUS
     *
     * @return the value of ORGANIZATION_STATUS.STATUS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORGANIZATION_STATUS.STATUS
     *
     * @param status the value for ORGANIZATION_STATUS.STATUS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORGANIZATION_STATUS.ORGANIZATION_ID
     *
     * @return the value of ORGANIZATION_STATUS.ORGANIZATION_ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORGANIZATION_STATUS.ORGANIZATION_ID
     *
     * @param organizationId the value for ORGANIZATION_STATUS.ORGANIZATION_ID
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORGANIZATION_STATUS.CREATE_TIME
     *
     * @return the value of ORGANIZATION_STATUS.CREATE_TIME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORGANIZATION_STATUS.CREATE_TIME
     *
     * @param createTime the value for ORGANIZATION_STATUS.CREATE_TIME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ORGANIZATION_STATUS.UPDATE_TIME
     *
     * @return the value of ORGANIZATION_STATUS.UPDATE_TIME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ORGANIZATION_STATUS.UPDATE_TIME
     *
     * @param updateTime the value for ORGANIZATION_STATUS.UPDATE_TIME
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}