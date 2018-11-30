package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Disputes;
import com.cn.interfacedocument.entity.DisputesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DisputesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int countByExample(DisputesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByExample(DisputesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insert(Disputes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insertSelective(Disputes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    List<Disputes> selectByExample(DisputesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    Disputes selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") Disputes record, @Param("example") DisputesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExample(@Param("record") Disputes record, @Param("example") DisputesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKeySelective(Disputes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DISPUTES
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKey(Disputes record);
}