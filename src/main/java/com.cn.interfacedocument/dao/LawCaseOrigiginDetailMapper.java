package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawCaseOrigiginDetail;

public interface LawCaseOrigiginDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawCaseOrigiginDetail record);

    int insertSelective(LawCaseOrigiginDetail record);

    LawCaseOrigiginDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawCaseOrigiginDetail record);

    int updateByPrimaryKey(LawCaseOrigiginDetail record);
}