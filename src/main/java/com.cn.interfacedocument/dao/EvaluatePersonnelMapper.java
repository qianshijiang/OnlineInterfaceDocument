package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.EvaluatePersonnel;

public interface EvaluatePersonnelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EvaluatePersonnel record);

    int insertSelective(EvaluatePersonnel record);

    EvaluatePersonnel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EvaluatePersonnel record);

    int updateByPrimaryKey(EvaluatePersonnel record);
}