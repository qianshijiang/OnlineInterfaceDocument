package com.cn.interfacedocument.entity;

public class LawCaseDossierAttachment {
    private Long id;

    private String name;

    private String category;

    private String categoryName;

    private String type;

    private String url;

    private String content;

    private Long lawCaseDossierId;

    private Long lawCaseId;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getLawCaseDossierId() {
        return lawCaseDossierId;
    }

    public void setLawCaseDossierId(Long lawCaseDossierId) {
        this.lawCaseDossierId = lawCaseDossierId;
    }

    public Long getLawCaseId() {
        return lawCaseId;
    }

    public void setLawCaseId(Long lawCaseId) {
        this.lawCaseId = lawCaseId;
    }
}