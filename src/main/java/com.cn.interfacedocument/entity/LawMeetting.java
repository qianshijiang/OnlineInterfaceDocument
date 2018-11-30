package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawMeetting {
    private Long id;

    private String name;

    private Date createTime;

    private Date endTime;

    private Date orderTime;

    private String status;

    private Long lawCaseId;

    private String seeMeetingId;

    private String type;

    private Date startTime;

    private Integer meetingHour;

    private Integer meetingMin;

    private Integer orderType;

    private String orderAddress;

    private String viewCode;

    private Long isSendRecord;

    private String assistingMediatorCode;

    private String assistingMediatorPhone;

    private String assistingMediatorName;

    private String assistingMediatorLogin;

    private String meetingContent;

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getLawCaseId() {
        return lawCaseId;
    }

    public void setLawCaseId(Long lawCaseId) {
        this.lawCaseId = lawCaseId;
    }

    public String getSeeMeetingId() {
        return seeMeetingId;
    }

    public void setSeeMeetingId(String seeMeetingId) {
        this.seeMeetingId = seeMeetingId == null ? null : seeMeetingId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Integer getMeetingHour() {
        return meetingHour;
    }

    public void setMeetingHour(Integer meetingHour) {
        this.meetingHour = meetingHour;
    }

    public Integer getMeetingMin() {
        return meetingMin;
    }

    public void setMeetingMin(Integer meetingMin) {
        this.meetingMin = meetingMin;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress == null ? null : orderAddress.trim();
    }

    public String getViewCode() {
        return viewCode;
    }

    public void setViewCode(String viewCode) {
        this.viewCode = viewCode == null ? null : viewCode.trim();
    }

    public Long getIsSendRecord() {
        return isSendRecord;
    }

    public void setIsSendRecord(Long isSendRecord) {
        this.isSendRecord = isSendRecord;
    }

    public String getAssistingMediatorCode() {
        return assistingMediatorCode;
    }

    public void setAssistingMediatorCode(String assistingMediatorCode) {
        this.assistingMediatorCode = assistingMediatorCode == null ? null : assistingMediatorCode.trim();
    }

    public String getAssistingMediatorPhone() {
        return assistingMediatorPhone;
    }

    public void setAssistingMediatorPhone(String assistingMediatorPhone) {
        this.assistingMediatorPhone = assistingMediatorPhone == null ? null : assistingMediatorPhone.trim();
    }

    public String getAssistingMediatorName() {
        return assistingMediatorName;
    }

    public void setAssistingMediatorName(String assistingMediatorName) {
        this.assistingMediatorName = assistingMediatorName == null ? null : assistingMediatorName.trim();
    }

    public String getAssistingMediatorLogin() {
        return assistingMediatorLogin;
    }

    public void setAssistingMediatorLogin(String assistingMediatorLogin) {
        this.assistingMediatorLogin = assistingMediatorLogin == null ? null : assistingMediatorLogin.trim();
    }

    public String getMeetingContent() {
        return meetingContent;
    }

    public void setMeetingContent(String meetingContent) {
        this.meetingContent = meetingContent == null ? null : meetingContent.trim();
    }
}