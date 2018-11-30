package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.GovMediator;
import com.cn.interfacedocument.entity.GovMediatorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GovMediatorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOV_MEDIATOR
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int countByExample(GovMediatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOV_MEDIATOR
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByExample(GovMediatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOV_MEDIATOR
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOV_MEDIATOR
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insert(GovMediator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOV_MEDIATOR
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insertSelective(GovMediator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOV_MEDIATOR
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    List<GovMediator> selectByExample(GovMediatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOV_MEDIATOR
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    GovMediator selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOV_MEDIATOR
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") GovMediator record, @Param("example") GovMediatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOV_MEDIATOR
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExample(@Param("record") GovMediator record, @Param("example") GovMediatorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOV_MEDIATOR
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKeySelective(GovMediator record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table GOV_MEDIATOR
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKey(GovMediator record);
}