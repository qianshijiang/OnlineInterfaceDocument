package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawMscheme;
import com.cn.interfacedocument.entity.LawMschemeWithBLOBs;

public interface LawMschemeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawMschemeWithBLOBs record);

    int insertSelective(LawMschemeWithBLOBs record);

    LawMschemeWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawMschemeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LawMschemeWithBLOBs record);

    int updateByPrimaryKey(LawMscheme record);
}