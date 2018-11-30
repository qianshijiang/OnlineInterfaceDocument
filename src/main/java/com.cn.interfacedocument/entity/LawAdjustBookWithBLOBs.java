package com.cn.interfacedocument.entity;

public class LawAdjustBookWithBLOBs extends LawAdjustBook {
    private String problem;

    private String content;

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem == null ? null : problem.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}