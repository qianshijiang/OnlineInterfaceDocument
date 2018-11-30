package com.cn.interfacedocument.entity;

public class LawPromise {
    private Long id;

    private String name;

    private String type;

    private String orgName;

    private Boolean proPromise;

    private Boolean repPromise;

    private String isConfirm;

    private String content;

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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Boolean getProPromise() {
        return proPromise;
    }

    public void setProPromise(Boolean proPromise) {
        this.proPromise = proPromise;
    }

    public Boolean getRepPromise() {
        return repPromise;
    }

    public void setRepPromise(Boolean repPromise) {
        this.repPromise = repPromise;
    }

    public String getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(String isConfirm) {
        this.isConfirm = isConfirm == null ? null : isConfirm.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}