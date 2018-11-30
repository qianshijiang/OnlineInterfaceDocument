package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Disputes;

public interface DisputesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Disputes record);

    int insertSelective(Disputes record);

    Disputes selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Disputes record);

    int updateByPrimaryKey(Disputes record);
}