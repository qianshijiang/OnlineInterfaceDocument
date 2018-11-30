package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Areas;
import com.cn.interfacedocument.entity.AreasExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreasMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AREAS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int countByExample(AreasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AREAS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int deleteByExample(AreasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AREAS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int deleteByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AREAS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int insert(Areas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AREAS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int insertSelective(Areas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AREAS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    List<Areas> selectByExample(AreasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AREAS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    Areas selectByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AREAS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByExampleSelective(@Param("record") Areas record, @Param("example") AreasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AREAS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByExample(@Param("record") Areas record, @Param("example") AreasExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AREAS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByPrimaryKeySelective(Areas record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AREAS
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByPrimaryKey(Areas record);
}