package com.cn.interfacedocument.entity;

import java.util.Date;

public class Qrcode {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRCODE.ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRCODE.USER_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRCODE.USER_TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRCODE.URL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRCODE.CONFIRM
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String confirm;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRCODE.NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRCODE.COUNSELOR_AND_MEDIATORS_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Long counselorAndMediatorsId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRCODE.CREATE_DATE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QRCODE.UPDATE_DATE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Date updateDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRCODE.ID
     *
     * @return the value of QRCODE.ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRCODE.ID
     *
     * @param id the value for QRCODE.ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRCODE.USER_ID
     *
     * @return the value of QRCODE.USER_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRCODE.USER_ID
     *
     * @param userId the value for QRCODE.USER_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRCODE.USER_TYPE
     *
     * @return the value of QRCODE.USER_TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRCODE.USER_TYPE
     *
     * @param userType the value for QRCODE.USER_TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRCODE.URL
     *
     * @return the value of QRCODE.URL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRCODE.URL
     *
     * @param url the value for QRCODE.URL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRCODE.CONFIRM
     *
     * @return the value of QRCODE.CONFIRM
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getConfirm() {
        return confirm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRCODE.CONFIRM
     *
     * @param confirm the value for QRCODE.CONFIRM
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setConfirm(String confirm) {
        this.confirm = confirm == null ? null : confirm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRCODE.NAME
     *
     * @return the value of QRCODE.NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRCODE.NAME
     *
     * @param name the value for QRCODE.NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRCODE.COUNSELOR_AND_MEDIATORS_ID
     *
     * @return the value of QRCODE.COUNSELOR_AND_MEDIATORS_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Long getCounselorAndMediatorsId() {
        return counselorAndMediatorsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRCODE.COUNSELOR_AND_MEDIATORS_ID
     *
     * @param counselorAndMediatorsId the value for QRCODE.COUNSELOR_AND_MEDIATORS_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setCounselorAndMediatorsId(Long counselorAndMediatorsId) {
        this.counselorAndMediatorsId = counselorAndMediatorsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRCODE.CREATE_DATE
     *
     * @return the value of QRCODE.CREATE_DATE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRCODE.CREATE_DATE
     *
     * @param createDate the value for QRCODE.CREATE_DATE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QRCODE.UPDATE_DATE
     *
     * @return the value of QRCODE.UPDATE_DATE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QRCODE.UPDATE_DATE
     *
     * @param updateDate the value for QRCODE.UPDATE_DATE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}