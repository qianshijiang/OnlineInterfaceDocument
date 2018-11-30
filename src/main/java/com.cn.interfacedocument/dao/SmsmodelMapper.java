package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Smsmodel;
import com.cn.interfacedocument.entity.SmsmodelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SmsmodelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SMSMODEL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int countByExample(SmsmodelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SMSMODEL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByExample(SmsmodelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SMSMODEL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SMSMODEL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insert(Smsmodel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SMSMODEL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insertSelective(Smsmodel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SMSMODEL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    List<Smsmodel> selectByExample(SmsmodelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SMSMODEL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    Smsmodel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SMSMODEL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") Smsmodel record, @Param("example") SmsmodelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SMSMODEL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExample(@Param("record") Smsmodel record, @Param("example") SmsmodelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SMSMODEL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKeySelective(Smsmodel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SMSMODEL
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKey(Smsmodel record);
}