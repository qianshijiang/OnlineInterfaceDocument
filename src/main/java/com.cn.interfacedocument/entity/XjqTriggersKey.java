package com.cn.interfacedocument.entity;

public class XjqTriggersKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XJQ_TRIGGERS.SCHED_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String schedName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XJQ_TRIGGERS.TRIGGER_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String triggerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XJQ_TRIGGERS.TRIGGER_GROUP
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String triggerGroup;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XJQ_TRIGGERS.SCHED_NAME
     *
     * @return the value of XJQ_TRIGGERS.SCHED_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getSchedName() {
        return schedName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XJQ_TRIGGERS.SCHED_NAME
     *
     * @param schedName the value for XJQ_TRIGGERS.SCHED_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setSchedName(String schedName) {
        this.schedName = schedName == null ? null : schedName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XJQ_TRIGGERS.TRIGGER_NAME
     *
     * @return the value of XJQ_TRIGGERS.TRIGGER_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getTriggerName() {
        return triggerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XJQ_TRIGGERS.TRIGGER_NAME
     *
     * @param triggerName the value for XJQ_TRIGGERS.TRIGGER_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName == null ? null : triggerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XJQ_TRIGGERS.TRIGGER_GROUP
     *
     * @return the value of XJQ_TRIGGERS.TRIGGER_GROUP
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getTriggerGroup() {
        return triggerGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XJQ_TRIGGERS.TRIGGER_GROUP
     *
     * @param triggerGroup the value for XJQ_TRIGGERS.TRIGGER_GROUP
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup == null ? null : triggerGroup.trim();
    }
}