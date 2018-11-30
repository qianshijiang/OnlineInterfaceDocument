package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.TypicalCase;

public interface TypicalCaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TypicalCase record);

    int insertSelective(TypicalCase record);

    TypicalCase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TypicalCase record);

    int updateByPrimaryKeyWithBLOBs(TypicalCase record);

    int updateByPrimaryKey(TypicalCase record);
}