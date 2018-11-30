package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawCaseProgress;

public interface LawCaseProgressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawCaseProgress record);

    int insertSelective(LawCaseProgress record);

    LawCaseProgress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawCaseProgress record);

    int updateByPrimaryKeyWithBLOBs(LawCaseProgress record);

    int updateByPrimaryKey(LawCaseProgress record);
}