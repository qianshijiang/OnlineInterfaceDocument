package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawPromise;
import com.cn.interfacedocument.entity.LawPromiseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LawPromiseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_PROMISE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int countByExample(LawPromiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_PROMISE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int deleteByExample(LawPromiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_PROMISE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_PROMISE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int insert(LawPromise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_PROMISE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int insertSelective(LawPromise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_PROMISE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    List<LawPromise> selectByExampleWithBLOBs(LawPromiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_PROMISE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    List<LawPromise> selectByExample(LawPromiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_PROMISE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    LawPromise selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_PROMISE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByExampleSelective(@Param("record") LawPromise record, @Param("example") LawPromiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_PROMISE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") LawPromise record, @Param("example") LawPromiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_PROMISE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByExample(@Param("record") LawPromise record, @Param("example") LawPromiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_PROMISE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByPrimaryKeySelective(LawPromise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_PROMISE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(LawPromise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_PROMISE
     *
     * @mbggenerated Fri Nov 30 10:52:04 CST 2018
     */
    int updateByPrimaryKey(LawPromise record);
}