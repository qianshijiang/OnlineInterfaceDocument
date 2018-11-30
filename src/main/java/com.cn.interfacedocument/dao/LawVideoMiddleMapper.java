package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawVideoMiddle;
import com.cn.interfacedocument.entity.LawVideoMiddleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LawVideoMiddleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_VIDEO_MIDDLE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int countByExample(LawVideoMiddleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_VIDEO_MIDDLE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int deleteByExample(LawVideoMiddleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_VIDEO_MIDDLE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_VIDEO_MIDDLE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int insert(LawVideoMiddle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_VIDEO_MIDDLE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int insertSelective(LawVideoMiddle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_VIDEO_MIDDLE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    List<LawVideoMiddle> selectByExample(LawVideoMiddleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_VIDEO_MIDDLE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    LawVideoMiddle selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_VIDEO_MIDDLE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByExampleSelective(@Param("record") LawVideoMiddle record, @Param("example") LawVideoMiddleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_VIDEO_MIDDLE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByExample(@Param("record") LawVideoMiddle record, @Param("example") LawVideoMiddleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_VIDEO_MIDDLE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByPrimaryKeySelective(LawVideoMiddle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_VIDEO_MIDDLE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByPrimaryKey(LawVideoMiddle record);
}