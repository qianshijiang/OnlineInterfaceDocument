package com.cn.interfacedocument.entity;

public class LawDissent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_DISSENT.ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_DISSENT.CONTENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_DISSENT.NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_DISSENT.SEND_PER_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Long sendPerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_DISSENT.LAW_MSCHEME_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private Long lawMschemeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_DISSENT.ID
     *
     * @return the value of LAW_DISSENT.ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_DISSENT.ID
     *
     * @param id the value for LAW_DISSENT.ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_DISSENT.CONTENT
     *
     * @return the value of LAW_DISSENT.CONTENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_DISSENT.CONTENT
     *
     * @param content the value for LAW_DISSENT.CONTENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_DISSENT.NAME
     *
     * @return the value of LAW_DISSENT.NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_DISSENT.NAME
     *
     * @param name the value for LAW_DISSENT.NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_DISSENT.SEND_PER_ID
     *
     * @return the value of LAW_DISSENT.SEND_PER_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Long getSendPerId() {
        return sendPerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_DISSENT.SEND_PER_ID
     *
     * @param sendPerId the value for LAW_DISSENT.SEND_PER_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setSendPerId(Long sendPerId) {
        this.sendPerId = sendPerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_DISSENT.LAW_MSCHEME_ID
     *
     * @return the value of LAW_DISSENT.LAW_MSCHEME_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public Long getLawMschemeId() {
        return lawMschemeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_DISSENT.LAW_MSCHEME_ID
     *
     * @param lawMschemeId the value for LAW_DISSENT.LAW_MSCHEME_ID
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setLawMschemeId(Long lawMschemeId) {
        this.lawMschemeId = lawMschemeId;
    }
}