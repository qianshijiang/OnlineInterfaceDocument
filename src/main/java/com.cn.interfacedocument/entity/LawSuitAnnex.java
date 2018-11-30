package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawSuitAnnex {
    private Long id;

    private String name;

    private String type;

    private String url;

    private Long lawsuitDetailId;

    private Integer sign;

    private Long personId;

    private String categorym;

    private String delFlag;

    private Date createTime;

    private Date updateTime;

    private String meettingId;

    private String source;

    private String remark;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Long getLawsuitDetailId() {
        return lawsuitDetailId;
    }

    public void setLawsuitDetailId(Long lawsuitDetailId) {
        this.lawsuitDetailId = lawsuitDetailId;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getCategorym() {
        return categorym;
    }

    public void setCategorym(String categorym) {
        this.categorym = categorym == null ? null : categorym.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMeettingId() {
        return meettingId;
    }

    public void setMeettingId(String meettingId) {
        this.meettingId = meettingId == null ? null : meettingId.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}