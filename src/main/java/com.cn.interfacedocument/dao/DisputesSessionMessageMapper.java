package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.DisputesSessionMessage;
import com.cn.interfacedocument.entity.DisputesSessionMessageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DisputesSessionMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES_SESSION_MESSAGE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int countByExample(DisputesSessionMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES_SESSION_MESSAGE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByExample(DisputesSessionMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES_SESSION_MESSAGE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES_SESSION_MESSAGE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insert(DisputesSessionMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES_SESSION_MESSAGE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insertSelective(DisputesSessionMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES_SESSION_MESSAGE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    List<DisputesSessionMessage> selectByExampleWithBLOBs(DisputesSessionMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES_SESSION_MESSAGE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    List<DisputesSessionMessage> selectByExample(DisputesSessionMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES_SESSION_MESSAGE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    DisputesSessionMessage selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES_SESSION_MESSAGE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") DisputesSessionMessage record, @Param("example") DisputesSessionMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES_SESSION_MESSAGE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") DisputesSessionMessage record, @Param("example") DisputesSessionMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES_SESSION_MESSAGE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExample(@Param("record") DisputesSessionMessage record, @Param("example") DisputesSessionMessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES_SESSION_MESSAGE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKeySelective(DisputesSessionMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES_SESSION_MESSAGE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(DisputesSessionMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES_SESSION_MESSAGE
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKey(DisputesSessionMessage record);
}