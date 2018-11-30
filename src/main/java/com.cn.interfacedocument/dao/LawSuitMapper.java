package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawSuit;
import com.cn.interfacedocument.entity.LawSuitWithBLOBs;

public interface LawSuitMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawSuitWithBLOBs record);

    int insertSelective(LawSuitWithBLOBs record);

    LawSuitWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawSuitWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LawSuitWithBLOBs record);

    int updateByPrimaryKey(LawSuit record);
}