package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqTriggerRegistry;
import com.cn.interfacedocument.entity.XjqTriggerRegistryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XjqTriggerRegistryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table XJQ_TRIGGER_REGISTRY
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int countByExample(XjqTriggerRegistryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table XJQ_TRIGGER_REGISTRY
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByExample(XjqTriggerRegistryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table XJQ_TRIGGER_REGISTRY
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table XJQ_TRIGGER_REGISTRY
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insert(XjqTriggerRegistry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table XJQ_TRIGGER_REGISTRY
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insertSelective(XjqTriggerRegistry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table XJQ_TRIGGER_REGISTRY
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    List<XjqTriggerRegistry> selectByExample(XjqTriggerRegistryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table XJQ_TRIGGER_REGISTRY
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    XjqTriggerRegistry selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table XJQ_TRIGGER_REGISTRY
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") XjqTriggerRegistry record, @Param("example") XjqTriggerRegistryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table XJQ_TRIGGER_REGISTRY
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExample(@Param("record") XjqTriggerRegistry record, @Param("example") XjqTriggerRegistryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table XJQ_TRIGGER_REGISTRY
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKeySelective(XjqTriggerRegistry record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table XJQ_TRIGGER_REGISTRY
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKey(XjqTriggerRegistry record);
}