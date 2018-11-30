package com.cn.interfacedocument.entity;

import java.util.Date;

public class GovAccountmessage {
    private Long id;

    private Long orgId;

    private String codeinfo;

    private Integer courtcode;

    private String word;

    private String explaininfo;

    private Integer status;

    private Date createtime;

    private Date updatatime;

    private Date updatetime;

    private Long organizationId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getCodeinfo() {
        return codeinfo;
    }

    public void setCodeinfo(String codeinfo) {
        this.codeinfo = codeinfo == null ? null : codeinfo.trim();
    }

    public Integer getCourtcode() {
        return courtcode;
    }

    public void setCourtcode(Integer courtcode) {
        this.courtcode = courtcode;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    public String getExplaininfo() {
        return explaininfo;
    }

    public void setExplaininfo(String explaininfo) {
        this.explaininfo = explaininfo == null ? null : explaininfo.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatatime() {
        return updatatime;
    }

    public void setUpdatatime(Date updatatime) {
        this.updatatime = updatatime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }
}