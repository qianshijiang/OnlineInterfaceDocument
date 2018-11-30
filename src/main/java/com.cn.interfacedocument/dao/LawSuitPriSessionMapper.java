package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawSuitPriSession;

public interface LawSuitPriSessionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawSuitPriSession record);

    int insertSelective(LawSuitPriSession record);

    LawSuitPriSession selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawSuitPriSession record);

    int updateByPrimaryKey(LawSuitPriSession record);
}