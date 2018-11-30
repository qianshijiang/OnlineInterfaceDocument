package com.cn.interfacedocument.entity;

import java.util.Date;

public class History {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HISTORY.ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HISTORY.USER_DETAIL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Long userDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HISTORY.KEYWORD
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String keyword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HISTORY.TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column HISTORY.CREATE_DATE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Date createDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HISTORY.ID
     *
     * @return the value of HISTORY.ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HISTORY.ID
     *
     * @param id the value for HISTORY.ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HISTORY.USER_DETAIL
     *
     * @return the value of HISTORY.USER_DETAIL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Long getUserDetail() {
        return userDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HISTORY.USER_DETAIL
     *
     * @param userDetail the value for HISTORY.USER_DETAIL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setUserDetail(Long userDetail) {
        this.userDetail = userDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HISTORY.KEYWORD
     *
     * @return the value of HISTORY.KEYWORD
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HISTORY.KEYWORD
     *
     * @param keyword the value for HISTORY.KEYWORD
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HISTORY.TYPE
     *
     * @return the value of HISTORY.TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HISTORY.TYPE
     *
     * @param type the value for HISTORY.TYPE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column HISTORY.CREATE_DATE
     *
     * @return the value of HISTORY.CREATE_DATE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column HISTORY.CREATE_DATE
     *
     * @param createDate the value for HISTORY.CREATE_DATE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}