package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawSuitPerson;

public interface LawSuitPersonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawSuitPerson record);

    int insertSelective(LawSuitPerson record);

    LawSuitPerson selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawSuitPerson record);

    int updateByPrimaryKey(LawSuitPerson record);
}