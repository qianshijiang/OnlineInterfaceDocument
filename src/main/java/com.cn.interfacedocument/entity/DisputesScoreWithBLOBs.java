package com.cn.interfacedocument.entity;

public class DisputesScoreWithBLOBs extends DisputesScore {
    private String content;

    private String satisfiedContent;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSatisfiedContent() {
        return satisfiedContent;
    }

    public void setSatisfiedContent(String satisfiedContent) {
        this.satisfiedContent = satisfiedContent == null ? null : satisfiedContent.trim();
    }
}