package com.cn.interfacedocument.entity;

public class LawMschemeWithBLOBs extends LawMscheme {
    private String mSolve;

    private String mKnow;

    public String getmSolve() {
        return mSolve;
    }

    public void setmSolve(String mSolve) {
        this.mSolve = mSolve == null ? null : mSolve.trim();
    }

    public String getmKnow() {
        return mKnow;
    }

    public void setmKnow(String mKnow) {
        this.mKnow = mKnow == null ? null : mKnow.trim();
    }
}