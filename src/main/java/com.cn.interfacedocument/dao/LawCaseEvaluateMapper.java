package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawCaseEvaluate;

public interface LawCaseEvaluateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawCaseEvaluate record);

    int insertSelective(LawCaseEvaluate record);

    LawCaseEvaluate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawCaseEvaluate record);

    int updateByPrimaryKeyWithBLOBs(LawCaseEvaluate record);

    int updateByPrimaryKey(LawCaseEvaluate record);
}