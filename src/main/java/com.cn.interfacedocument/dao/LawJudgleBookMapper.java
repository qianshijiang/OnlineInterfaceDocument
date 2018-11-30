package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawJudgleBook;
import com.cn.interfacedocument.entity.LawJudgleBookExample;
import com.cn.interfacedocument.entity.LawJudgleBookWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LawJudgleBookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_JUDGLE_BOOK
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int countByExample(LawJudgleBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_JUDGLE_BOOK
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int deleteByExample(LawJudgleBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_JUDGLE_BOOK
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_JUDGLE_BOOK
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int insert(LawJudgleBookWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_JUDGLE_BOOK
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int insertSelective(LawJudgleBookWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_JUDGLE_BOOK
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    List<LawJudgleBookWithBLOBs> selectByExampleWithBLOBs(LawJudgleBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_JUDGLE_BOOK
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    List<LawJudgleBook> selectByExample(LawJudgleBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_JUDGLE_BOOK
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    LawJudgleBookWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_JUDGLE_BOOK
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByExampleSelective(@Param("record") LawJudgleBookWithBLOBs record, @Param("example") LawJudgleBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_JUDGLE_BOOK
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") LawJudgleBookWithBLOBs record, @Param("example") LawJudgleBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_JUDGLE_BOOK
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByExample(@Param("record") LawJudgleBook record, @Param("example") LawJudgleBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_JUDGLE_BOOK
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByPrimaryKeySelective(LawJudgleBookWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_JUDGLE_BOOK
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(LawJudgleBookWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_JUDGLE_BOOK
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByPrimaryKey(LawJudgleBook record);
}