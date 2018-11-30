package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawCaseSignature {
    private Long id;

    private String name;

    private Date createDate;

    private String token;

    private Date updateDate;

    private String confirmDocument;

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getConfirmDocument() {
        return confirmDocument;
    }

    public void setConfirmDocument(String confirmDocument) {
        this.confirmDocument = confirmDocument == null ? null : confirmDocument.trim();
    }
}