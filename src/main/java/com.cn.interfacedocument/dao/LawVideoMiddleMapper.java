package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawVideoMiddle;

public interface LawVideoMiddleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawVideoMiddle record);

    int insertSelective(LawVideoMiddle record);

    LawVideoMiddle selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawVideoMiddle record);

    int updateByPrimaryKey(LawVideoMiddle record);
}