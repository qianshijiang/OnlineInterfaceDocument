package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawCaseAttachment;
import com.cn.interfacedocument.entity.LawCaseAttachmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LawCaseAttachmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_CASE_ATTACHMENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int countByExample(LawCaseAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_CASE_ATTACHMENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByExample(LawCaseAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_CASE_ATTACHMENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_CASE_ATTACHMENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insert(LawCaseAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_CASE_ATTACHMENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int insertSelective(LawCaseAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_CASE_ATTACHMENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    List<LawCaseAttachment> selectByExampleWithBLOBs(LawCaseAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_CASE_ATTACHMENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    List<LawCaseAttachment> selectByExample(LawCaseAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_CASE_ATTACHMENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    LawCaseAttachment selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_CASE_ATTACHMENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExampleSelective(@Param("record") LawCaseAttachment record, @Param("example") LawCaseAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_CASE_ATTACHMENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") LawCaseAttachment record, @Param("example") LawCaseAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_CASE_ATTACHMENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByExample(@Param("record") LawCaseAttachment record, @Param("example") LawCaseAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_CASE_ATTACHMENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKeySelective(LawCaseAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_CASE_ATTACHMENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(LawCaseAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAW_CASE_ATTACHMENT
     *
     * @mbggenerated Fri Nov 30 10:52:03 CST 2018
     */
    int updateByPrimaryKey(LawCaseAttachment record);
}