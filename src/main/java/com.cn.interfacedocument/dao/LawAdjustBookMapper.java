package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawAdjustBook;
import com.cn.interfacedocument.entity.LawAdjustBookWithBLOBs;

public interface LawAdjustBookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawAdjustBookWithBLOBs record);

    int insertSelective(LawAdjustBookWithBLOBs record);

    LawAdjustBookWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawAdjustBookWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LawAdjustBookWithBLOBs record);

    int updateByPrimaryKey(LawAdjustBook record);
}