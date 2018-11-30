package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawSuitProgress;

public interface LawSuitProgressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawSuitProgress record);

    int insertSelective(LawSuitProgress record);

    LawSuitProgress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawSuitProgress record);

    int updateByPrimaryKey(LawSuitProgress record);
}