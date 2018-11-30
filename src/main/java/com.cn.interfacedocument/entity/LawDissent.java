package com.cn.interfacedocument.entity;

public class LawDissent {
    private Long id;

    private String content;

    private String name;

    private Long sendPerId;

    private Long lawMschemeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getSendPerId() {
        return sendPerId;
    }

    public void setSendPerId(Long sendPerId) {
        this.sendPerId = sendPerId;
    }

    public Long getLawMschemeId() {
        return lawMschemeId;
    }

    public void setLawMschemeId(Long lawMschemeId) {
        this.lawMschemeId = lawMschemeId;
    }
}