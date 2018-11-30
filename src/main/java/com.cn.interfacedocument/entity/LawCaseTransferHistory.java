package com.cn.interfacedocument.entity;

import java.util.Date;

public class LawCaseTransferHistory {
    private Long id;

    private Long lawCaseId;

    private String reason;

    private Long fromOrdId;

    private String fromOrdName;

    private Long toOrdId;

    private String toOrdName;

    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLawCaseId() {
        return lawCaseId;
    }

    public void setLawCaseId(Long lawCaseId) {
        this.lawCaseId = lawCaseId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Long getFromOrdId() {
        return fromOrdId;
    }

    public void setFromOrdId(Long fromOrdId) {
        this.fromOrdId = fromOrdId;
    }

    public String getFromOrdName() {
        return fromOrdName;
    }

    public void setFromOrdName(String fromOrdName) {
        this.fromOrdName = fromOrdName == null ? null : fromOrdName.trim();
    }

    public Long getToOrdId() {
        return toOrdId;
    }

    public void setToOrdId(Long toOrdId) {
        this.toOrdId = toOrdId;
    }

    public String getToOrdName() {
        return toOrdName;
    }

    public void setToOrdName(String toOrdName) {
        this.toOrdName = toOrdName == null ? null : toOrdName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}