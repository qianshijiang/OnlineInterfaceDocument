package com.cn.interfacedocument.entity;

public class LawMschemeWithBLOBs extends LawMscheme {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_MSCHEME.M_SOLVE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String mSolve;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LAW_MSCHEME.M_KNOW
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String mKnow;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_MSCHEME.M_SOLVE
     *
     * @return the value of LAW_MSCHEME.M_SOLVE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getmSolve() {
        return mSolve;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_MSCHEME.M_SOLVE
     *
     * @param mSolve the value for LAW_MSCHEME.M_SOLVE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setmSolve(String mSolve) {
        this.mSolve = mSolve == null ? null : mSolve.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LAW_MSCHEME.M_KNOW
     *
     * @return the value of LAW_MSCHEME.M_KNOW
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getmKnow() {
        return mKnow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LAW_MSCHEME.M_KNOW
     *
     * @param mKnow the value for LAW_MSCHEME.M_KNOW
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setmKnow(String mKnow) {
        this.mKnow = mKnow == null ? null : mKnow.trim();
    }
}