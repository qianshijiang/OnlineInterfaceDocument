package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.CommonProblem;

public interface CommonProblemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommonProblem record);

    int insertSelective(CommonProblem record);

    CommonProblem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CommonProblem record);

    int updateByPrimaryKey(CommonProblem record);
}