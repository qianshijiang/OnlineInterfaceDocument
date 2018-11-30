package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.IndictmentData;
import com.cn.interfacedocument.entity.IndictmentDataWithBLOBs;

public interface IndictmentDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IndictmentDataWithBLOBs record);

    int insertSelective(IndictmentDataWithBLOBs record);

    IndictmentDataWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IndictmentDataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(IndictmentDataWithBLOBs record);

    int updateByPrimaryKey(IndictmentData record);
}