package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.SuitPerson;

public interface SuitPersonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SuitPerson record);

    int insertSelective(SuitPerson record);

    SuitPerson selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SuitPerson record);

    int updateByPrimaryKey(SuitPerson record);
}