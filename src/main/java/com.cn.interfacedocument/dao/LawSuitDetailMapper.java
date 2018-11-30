package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawSuitDetail;
import com.cn.interfacedocument.entity.LawSuitDetailWithBLOBs;

public interface LawSuitDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawSuitDetailWithBLOBs record);

    int insertSelective(LawSuitDetailWithBLOBs record);

    LawSuitDetailWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawSuitDetailWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LawSuitDetailWithBLOBs record);

    int updateByPrimaryKey(LawSuitDetail record);
}