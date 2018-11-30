package com.cn.interfacedocument.entity;

public class OrganizationServiceSearchKey {
    private Long orgId;

    private Long childOrgId;

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getChildOrgId() {
        return childOrgId;
    }

    public void setChildOrgId(Long childOrgId) {
        this.childOrgId = childOrgId;
    }
}