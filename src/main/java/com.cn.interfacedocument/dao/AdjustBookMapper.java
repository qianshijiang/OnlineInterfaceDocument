package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.AdjustBook;
import com.cn.interfacedocument.entity.AdjustBookWithBLOBs;

public interface AdjustBookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdjustBookWithBLOBs record);

    int insertSelective(AdjustBookWithBLOBs record);

    AdjustBookWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdjustBookWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AdjustBookWithBLOBs record);

    int updateByPrimaryKey(AdjustBook record);
}