package com.cn.interfacedocument.entity;

public class LawSuitPaperWithBLOBs extends LawSuitPaper {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_SUIT_PAPER.CASE_SUMMARY
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private String caseSummary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_SUIT_PAPER.REVIEW_RESULT
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    private String reviewResult;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_SUIT_PAPER.CASE_SUMMARY
     *
     * @return the value of LAW_SUIT_PAPER.CASE_SUMMARY
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public String getCaseSummary() {
        return caseSummary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_SUIT_PAPER.CASE_SUMMARY
     *
     * @param caseSummary the value for LAW_SUIT_PAPER.CASE_SUMMARY
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setCaseSummary(String caseSummary) {
        this.caseSummary = caseSummary == null ? null : caseSummary.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_SUIT_PAPER.REVIEW_RESULT
     *
     * @return the value of LAW_SUIT_PAPER.REVIEW_RESULT
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public String getReviewResult() {
        return reviewResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_SUIT_PAPER.REVIEW_RESULT
     *
     * @param reviewResult the value for LAW_SUIT_PAPER.REVIEW_RESULT
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    public void setReviewResult(String reviewResult) {
        this.reviewResult = reviewResult == null ? null : reviewResult.trim();
    }
}