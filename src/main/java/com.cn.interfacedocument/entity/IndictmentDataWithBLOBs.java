package com.cn.interfacedocument.entity;

public class IndictmentDataWithBLOBs extends IndictmentData {
    private String claim;

    private String evidenceInfo;

    private String factualReason;

    private String defendantInfo;

    private String plaintiffInfo;

    private String thirdPartyInfo;

    public String getClaim() {
        return claim;
    }

    public void setClaim(String claim) {
        this.claim = claim == null ? null : claim.trim();
    }

    public String getEvidenceInfo() {
        return evidenceInfo;
    }

    public void setEvidenceInfo(String evidenceInfo) {
        this.evidenceInfo = evidenceInfo == null ? null : evidenceInfo.trim();
    }

    public String getFactualReason() {
        return factualReason;
    }

    public void setFactualReason(String factualReason) {
        this.factualReason = factualReason == null ? null : factualReason.trim();
    }

    public String getDefendantInfo() {
        return defendantInfo;
    }

    public void setDefendantInfo(String defendantInfo) {
        this.defendantInfo = defendantInfo == null ? null : defendantInfo.trim();
    }

    public String getPlaintiffInfo() {
        return plaintiffInfo;
    }

    public void setPlaintiffInfo(String plaintiffInfo) {
        this.plaintiffInfo = plaintiffInfo == null ? null : plaintiffInfo.trim();
    }

    public String getThirdPartyInfo() {
        return thirdPartyInfo;
    }

    public void setThirdPartyInfo(String thirdPartyInfo) {
        this.thirdPartyInfo = thirdPartyInfo == null ? null : thirdPartyInfo.trim();
    }
}