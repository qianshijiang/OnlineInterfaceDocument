package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Cause;

public interface CauseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cause record);

    int insertSelective(Cause record);

    Cause selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cause record);

    int updateByPrimaryKey(Cause record);
}