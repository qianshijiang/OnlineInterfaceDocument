package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawSuitProgress {
    private Long id;

    private String name;

    private Date createDate;

    private String describes;

    private String meetingId;

    private String personnels;

    private Integer showType;

    private String statusCode;

    private String statusName;

    private String userId;

    private String userType;

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes == null ? null : describes.trim();
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId == null ? null : meetingId.trim();
    }

    public String getPersonnels() {
        return personnels;
    }

    public void setPersonnels(String personnels) {
        this.personnels = personnels == null ? null : personnels.trim();
    }

    public Integer getShowType() {
        return showType;
    }

    public void setShowType(Integer showType) {
        this.showType = showType;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName == null ? null : statusName.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Long getLawsuitDetailId() {
        return lawsuitDetailId;
    }

    public void setLawsuitDetailId(Long lawsuitDetailId) {
        this.lawsuitDetailId = lawsuitDetailId;
    }
}