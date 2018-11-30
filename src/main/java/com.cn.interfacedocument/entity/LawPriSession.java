package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawPriSession {
    private Long id;

    private Long lawMeettingId;

    private Long personnelId;

    private Long mediatorId;

    private Date createTime;

    private String extend;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLawMeettingId() {
        return lawMeettingId;
    }

    public void setLawMeettingId(Long lawMeettingId) {
        this.lawMeettingId = lawMeettingId;
    }

    public Long getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(Long personnelId) {
        this.personnelId = personnelId;
    }

    public Long getMediatorId() {
        return mediatorId;
    }

    public void setMediatorId(Long mediatorId) {
        this.mediatorId = mediatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}