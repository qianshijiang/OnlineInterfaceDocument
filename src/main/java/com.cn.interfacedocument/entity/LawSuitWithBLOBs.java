package com.cn.interfacedocument.entity;

public class LawSuitWithBLOBs extends LawSuit {
    private String appeal;

    private String cause;

    public String getAppeal() {
        return appeal;
    }

    public void setAppeal(String appeal) {
        this.appeal = appeal == null ? null : appeal.trim();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }
}