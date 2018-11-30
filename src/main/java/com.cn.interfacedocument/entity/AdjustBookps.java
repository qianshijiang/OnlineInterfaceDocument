package com.cn.interfacedocument.entity;

public class AdjustBookps {
    private Long id;

    private String name;

    private String content;

    private String extend;

    private String orderb;

    private String role;

    private String sign;

    private Long adjustBookId;

    private Long adjustRecordId;

    private String actualName;

    private String address;

    private String birth;

    private String idCard;

    private String sex;

    private Long userId;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }

    public String getOrderb() {
        return orderb;
    }

    public void setOrderb(String orderb) {
        this.orderb = orderb == null ? null : orderb.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public Long getAdjustBookId() {
        return adjustBookId;
    }

    public void setAdjustBookId(Long adjustBookId) {
        this.adjustBookId = adjustBookId;
    }

    public Long getAdjustRecordId() {
        return adjustRecordId;
    }

    public void setAdjustRecordId(Long adjustRecordId) {
        this.adjustRecordId = adjustRecordId;
    }

    public String getActualName() {
        return actualName;
    }

    public void setActualName(String actualName) {
        this.actualName = actualName == null ? null : actualName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}