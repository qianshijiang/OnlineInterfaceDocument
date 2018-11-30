package com.cn.interfacedocument.entity;

public class Court {
    private String courtCode;

    private String areaName;

    private String courtName;

    private String odrCode;

    private String organizationName;

    public String getCourtCode() {
        return courtCode;
    }

    public void setCourtCode(String courtCode) {
        this.courtCode = courtCode == null ? null : courtCode.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName == null ? null : courtName.trim();
    }

    public String getOdrCode() {
        return odrCode;
    }

    public void setOdrCode(String odrCode) {
        this.odrCode = odrCode == null ? null : odrCode.trim();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }
}