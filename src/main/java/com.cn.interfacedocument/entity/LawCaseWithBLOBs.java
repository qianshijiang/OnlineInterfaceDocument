package com.cn.interfacedocument.entity;

public class LawCaseWithBLOBs extends LawCase {
    private String appeal;

    private String remarks;

    private String record;

    private String tabDetail;

    public String getAppeal() {
        return appeal;
    }

    public void setAppeal(String appeal) {
        this.appeal = appeal == null ? null : appeal.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public String getTabDetail() {
        return tabDetail;
    }

    public void setTabDetail(String tabDetail) {
        this.tabDetail = tabDetail == null ? null : tabDetail.trim();
    }
}