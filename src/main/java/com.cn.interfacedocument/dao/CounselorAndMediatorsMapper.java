package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.CounselorAndMediators;
import com.cn.interfacedocument.entity.CounselorAndMediatorsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CounselorAndMediatorsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNSELOR_AND_MEDIATORS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int countByExample(CounselorAndMediatorsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNSELOR_AND_MEDIATORS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByExample(CounselorAndMediatorsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNSELOR_AND_MEDIATORS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNSELOR_AND_MEDIATORS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insert(CounselorAndMediators record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNSELOR_AND_MEDIATORS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insertSelective(CounselorAndMediators record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNSELOR_AND_MEDIATORS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    List<CounselorAndMediators> selectByExample(CounselorAndMediatorsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNSELOR_AND_MEDIATORS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    CounselorAndMediators selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNSELOR_AND_MEDIATORS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") CounselorAndMediators record, @Param("example") CounselorAndMediatorsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNSELOR_AND_MEDIATORS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExample(@Param("record") CounselorAndMediators record, @Param("example") CounselorAndMediatorsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNSELOR_AND_MEDIATORS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKeySelective(CounselorAndMediators record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COUNSELOR_AND_MEDIATORS
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKey(CounselorAndMediators record);
}