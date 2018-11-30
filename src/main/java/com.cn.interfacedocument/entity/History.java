package com.cn.interfacedocument.entity;

import java.util.Date;

public class History {
    private Long id;

    private Long userDetail;

    private String keyword;

    private String type;

    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(Long userDetail) {
        this.userDetail = userDetail;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}