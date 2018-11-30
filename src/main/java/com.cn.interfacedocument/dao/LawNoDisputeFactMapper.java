package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawNoDisputeFact;
import com.cn.interfacedocument.entity.LawNoDisputeFactWithBLOBs;

public interface LawNoDisputeFactMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawNoDisputeFactWithBLOBs record);

    int insertSelective(LawNoDisputeFactWithBLOBs record);

    LawNoDisputeFactWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawNoDisputeFactWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LawNoDisputeFactWithBLOBs record);

    int updateByPrimaryKey(LawNoDisputeFact record);
}