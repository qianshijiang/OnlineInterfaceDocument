package com.cn.interfacedocument.entity;

public class LawNoDisputeFactWithBLOBs extends LawNoDisputeFact {
    private String process;

    private String noDisputeFact;

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
    }

    public String getNoDisputeFact() {
        return noDisputeFact;
    }

    public void setNoDisputeFact(String noDisputeFact) {
        this.noDisputeFact = noDisputeFact == null ? null : noDisputeFact.trim();
    }
}