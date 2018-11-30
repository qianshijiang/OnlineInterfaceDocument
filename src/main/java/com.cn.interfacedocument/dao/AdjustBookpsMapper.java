package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.AdjustBookps;

public interface AdjustBookpsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdjustBookps record);

    int insertSelective(AdjustBookps record);

    AdjustBookps selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdjustBookps record);

    int updateByPrimaryKey(AdjustBookps record);
}