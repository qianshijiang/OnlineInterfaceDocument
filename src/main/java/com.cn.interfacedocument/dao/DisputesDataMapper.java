package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.DisputesData;
import com.cn.interfacedocument.entity.DisputesDataWithBLOBs;

public interface DisputesDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DisputesDataWithBLOBs record);

    int insertSelective(DisputesDataWithBLOBs record);

    DisputesDataWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DisputesDataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DisputesDataWithBLOBs record);

    int updateByPrimaryKey(DisputesData record);
}