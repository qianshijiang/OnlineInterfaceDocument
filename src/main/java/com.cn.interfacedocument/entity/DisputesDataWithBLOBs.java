package com.cn.interfacedocument.entity;

public class DisputesDataWithBLOBs extends DisputesData {
    private String content;

    private String title;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
}