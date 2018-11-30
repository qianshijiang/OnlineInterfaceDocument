package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.DelaySend;
import com.cn.interfacedocument.entity.DelaySendExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DelaySendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DELAY_SEND
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int countByExample(DelaySendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DELAY_SEND
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByExample(DelaySendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DELAY_SEND
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DELAY_SEND
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insert(DelaySend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DELAY_SEND
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insertSelective(DelaySend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DELAY_SEND
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    List<DelaySend> selectByExample(DelaySendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DELAY_SEND
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    DelaySend selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DELAY_SEND
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") DelaySend record, @Param("example") DelaySendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DELAY_SEND
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExample(@Param("record") DelaySend record, @Param("example") DelaySendExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DELAY_SEND
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKeySelective(DelaySend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DELAY_SEND
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKey(DelaySend record);
}