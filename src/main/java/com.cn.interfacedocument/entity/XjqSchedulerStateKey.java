package com.cn.interfacedocument.entity;

public class XjqSchedulerStateKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XJQ_SCHEDULER_STATE.SCHED_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String schedName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column XJQ_SCHEDULER_STATE.INSTANCE_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    private String instanceName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XJQ_SCHEDULER_STATE.SCHED_NAME
     *
     * @return the value of XJQ_SCHEDULER_STATE.SCHED_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getSchedName() {
        return schedName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XJQ_SCHEDULER_STATE.SCHED_NAME
     *
     * @param schedName the value for XJQ_SCHEDULER_STATE.SCHED_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setSchedName(String schedName) {
        this.schedName = schedName == null ? null : schedName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column XJQ_SCHEDULER_STATE.INSTANCE_NAME
     *
     * @return the value of XJQ_SCHEDULER_STATE.INSTANCE_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column XJQ_SCHEDULER_STATE.INSTANCE_NAME
     *
     * @param instanceName the value for XJQ_SCHEDULER_STATE.INSTANCE_NAME
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName == null ? null : instanceName.trim();
    }
}