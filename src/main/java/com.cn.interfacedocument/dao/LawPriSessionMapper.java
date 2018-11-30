package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawPriSession;

public interface LawPriSessionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawPriSession record);

    int insertSelective(LawPriSession record);

    LawPriSession selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawPriSession record);

    int updateByPrimaryKey(LawPriSession record);
}