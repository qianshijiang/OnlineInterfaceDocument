package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.MediationType;

public interface MediationTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(MediationType record);

    int insertSelective(MediationType record);

    MediationType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MediationType record);

    int updateByPrimaryKey(MediationType record);
}