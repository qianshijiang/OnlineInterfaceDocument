package com.cn.interfacedocument.entity;

public class LawJudgleBookWithBLOBs extends LawJudgleBook {
    private String content;

    private String quest;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest == null ? null : quest.trim();
    }
}