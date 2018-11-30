package com.cn.interfacedocument.entity;

public class LawCaseEvaluateAttachment {
    private Long id;

    private String name;

    private String type;

    private String url;

    private String delFlag;

    private String category;

    private Long lawcaseEvaluateId;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Long getLawcaseEvaluateId() {
        return lawcaseEvaluateId;
    }

    public void setLawcaseEvaluateId(Long lawcaseEvaluateId) {
        this.lawcaseEvaluateId = lawcaseEvaluateId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}