package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.AdjustRecord;
import com.cn.interfacedocument.entity.AdjustRecordWithBLOBs;

public interface AdjustRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdjustRecordWithBLOBs record);

    int insertSelective(AdjustRecordWithBLOBs record);

    AdjustRecordWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AdjustRecordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AdjustRecordWithBLOBs record);

    int updateByPrimaryKey(AdjustRecord record);
}