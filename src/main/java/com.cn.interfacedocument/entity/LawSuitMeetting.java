package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawSuitMeetting {
    private Long id;

    private String name;

    private Date createTime;

    private Date endTime;

    private String isSendRecord;

    private String meetingContent;

    private Integer meetingHour;

    private Integer meetingMin;

    private String orderAddress;

    private Date orderTime;

    private Integer orderType;

    private String seeMeetingId;

    private Date startTime;

    private String status;

    private Integer type;

    private String viewCode;

    private Long lawsuitDetailId;

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

    public String getIsSendRecord() {
        return isSendRecord;
    }

    public void setIsSendRecord(String isSendRecord) {
        this.isSendRecord = isSendRecord == null ? null : isSendRecord.trim();
    }

    public String getMeetingContent() {
        return meetingContent;
    }

    public void setMeetingContent(String meetingContent) {
        this.meetingContent = meetingContent == null ? null : meetingContent.trim();
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

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress == null ? null : orderAddress.trim();
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getSeeMeetingId() {
        return seeMeetingId;
    }

    public void setSeeMeetingId(String seeMeetingId) {
        this.seeMeetingId = seeMeetingId == null ? null : seeMeetingId.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getViewCode() {
        return viewCode;
    }

    public void setViewCode(String viewCode) {
        this.viewCode = viewCode == null ? null : viewCode.trim();
    }

    public Long getLawsuitDetailId() {
        return lawsuitDetailId;
    }

    public void setLawsuitDetailId(Long lawsuitDetailId) {
        this.lawsuitDetailId = lawsuitDetailId;
    }
}