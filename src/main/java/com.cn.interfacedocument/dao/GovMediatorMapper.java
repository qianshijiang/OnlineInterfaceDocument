package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.GovMediator;

public interface GovMediatorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GovMediator record);

    int insertSelective(GovMediator record);

    GovMediator selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovMediator record);

    int updateByPrimaryKey(GovMediator record);
}