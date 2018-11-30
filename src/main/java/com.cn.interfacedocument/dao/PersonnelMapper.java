package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Personnel;
import com.cn.interfacedocument.entity.PersonnelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonnelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSONNEL
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int countByExample(PersonnelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSONNEL
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int deleteByExample(PersonnelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSONNEL
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSONNEL
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int insert(Personnel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSONNEL
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int insertSelective(Personnel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSONNEL
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    List<Personnel> selectByExample(PersonnelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSONNEL
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    Personnel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSONNEL
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByExampleSelective(@Param("record") Personnel record, @Param("example") PersonnelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSONNEL
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByExample(@Param("record") Personnel record, @Param("example") PersonnelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSONNEL
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByPrimaryKeySelective(Personnel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PERSONNEL
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByPrimaryKey(Personnel record);
}