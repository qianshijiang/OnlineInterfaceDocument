package com.cn.interfacedocument.entity;

public class LawSuitDetailWithBLOBs extends LawSuitDetail {
    private String message;

    private String messageReply;

    private String trialMembers;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getMessageReply() {
        return messageReply;
    }

    public void setMessageReply(String messageReply) {
        this.messageReply = messageReply == null ? null : messageReply.trim();
    }

    public String getTrialMembers() {
        return trialMembers;
    }

    public void setTrialMembers(String trialMembers) {
        this.trialMembers = trialMembers == null ? null : trialMembers.trim();
    }
}