package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawSuitProgress {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_SUIT_PROGRESS.ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_SUIT_PROGRESS.NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_SUIT_PROGRESS.CREATE_DATE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_SUIT_PROGRESS.DESCRIBES
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String describes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_SUIT_PROGRESS.MEETING_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String meetingId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_SUIT_PROGRESS.PERSONNELS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String personnels;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_SUIT_PROGRESS.SHOW_TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Integer showType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_SUIT_PROGRESS.STATUS_CODE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String statusCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_SUIT_PROGRESS.STATUS_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String statusName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_SUIT_PROGRESS.USER_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_SUIT_PROGRESS.USER_TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_SUIT_PROGRESS.LAWSUIT_DETAIL_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Long lawsuitDetailId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_SUIT_PROGRESS.ID
     *
     * @return the value of LAW_SUIT_PROGRESS.ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_SUIT_PROGRESS.ID
     *
     * @param id the value for LAW_SUIT_PROGRESS.ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_SUIT_PROGRESS.NAME
     *
     * @return the value of LAW_SUIT_PROGRESS.NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_SUIT_PROGRESS.NAME
     *
     * @param name the value for LAW_SUIT_PROGRESS.NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_SUIT_PROGRESS.CREATE_DATE
     *
     * @return the value of LAW_SUIT_PROGRESS.CREATE_DATE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_SUIT_PROGRESS.CREATE_DATE
     *
     * @param createDate the value for LAW_SUIT_PROGRESS.CREATE_DATE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_SUIT_PROGRESS.DESCRIBES
     *
     * @return the value of LAW_SUIT_PROGRESS.DESCRIBES
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getDescribes() {
        return describes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_SUIT_PROGRESS.DESCRIBES
     *
     * @param describes the value for LAW_SUIT_PROGRESS.DESCRIBES
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setDescribes(String describes) {
        this.describes = describes == null ? null : describes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_SUIT_PROGRESS.MEETING_ID
     *
     * @return the value of LAW_SUIT_PROGRESS.MEETING_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_SUIT_PROGRESS.MEETING_ID
     *
     * @param meetingId the value for LAW_SUIT_PROGRESS.MEETING_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId == null ? null : meetingId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_SUIT_PROGRESS.PERSONNELS
     *
     * @return the value of LAW_SUIT_PROGRESS.PERSONNELS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getPersonnels() {
        return personnels;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_SUIT_PROGRESS.PERSONNELS
     *
     * @param personnels the value for LAW_SUIT_PROGRESS.PERSONNELS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setPersonnels(String personnels) {
        this.personnels = personnels == null ? null : personnels.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_SUIT_PROGRESS.SHOW_TYPE
     *
     * @return the value of LAW_SUIT_PROGRESS.SHOW_TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Integer getShowType() {
        return showType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_SUIT_PROGRESS.SHOW_TYPE
     *
     * @param showType the value for LAW_SUIT_PROGRESS.SHOW_TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setShowType(Integer showType) {
        this.showType = showType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_SUIT_PROGRESS.STATUS_CODE
     *
     * @return the value of LAW_SUIT_PROGRESS.STATUS_CODE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_SUIT_PROGRESS.STATUS_CODE
     *
     * @param statusCode the value for LAW_SUIT_PROGRESS.STATUS_CODE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_SUIT_PROGRESS.STATUS_NAME
     *
     * @return the value of LAW_SUIT_PROGRESS.STATUS_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_SUIT_PROGRESS.STATUS_NAME
     *
     * @param statusName the value for LAW_SUIT_PROGRESS.STATUS_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_SUIT_PROGRESS.USER_ID
     *
     * @return the value of LAW_SUIT_PROGRESS.USER_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_SUIT_PROGRESS.USER_ID
     *
     * @param userId the value for LAW_SUIT_PROGRESS.USER_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_SUIT_PROGRESS.USER_TYPE
     *
     * @return the value of LAW_SUIT_PROGRESS.USER_TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_SUIT_PROGRESS.USER_TYPE
     *
     * @param userType the value for LAW_SUIT_PROGRESS.USER_TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_SUIT_PROGRESS.LAWSUIT_DETAIL_ID
     *
     * @return the value of LAW_SUIT_PROGRESS.LAWSUIT_DETAIL_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Long getLawsuitDetailId() {
        return lawsuitDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_SUIT_PROGRESS.LAWSUIT_DETAIL_ID
     *
     * @param lawsuitDetailId the value for LAW_SUIT_PROGRESS.LAWSUIT_DETAIL_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setLawsuitDetailId(Long lawsuitDetailId) {
        this.lawsuitDetailId = lawsuitDetailId;
    }
}