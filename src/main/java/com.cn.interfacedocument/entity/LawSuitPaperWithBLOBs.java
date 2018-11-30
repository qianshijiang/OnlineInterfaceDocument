package com.cn.interfacedocument.entity;

public class LawSuitPaperWithBLOBs extends LawSuitPaper {
    private String caseSummary;

    private String reviewResult;

    public String getCaseSummary() {
        return caseSummary;
    }

    public void setCaseSummary(String caseSummary) {
        this.caseSummary = caseSummary == null ? null : caseSummary.trim();
    }

    public String getReviewResult() {
        return reviewResult;
    }

    public void setReviewResult(String reviewResult) {
        this.reviewResult = reviewResult == null ? null : reviewResult.trim();
    }
}