package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Visit;

public interface VisitMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Visit record);

    int insertSelective(Visit record);

    Visit selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Visit record);

    int updateByPrimaryKey(Visit record);
}