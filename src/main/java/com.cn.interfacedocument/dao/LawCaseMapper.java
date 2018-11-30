package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawCase;
import com.cn.interfacedocument.entity.LawCaseWithBLOBs;

public interface LawCaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawCaseWithBLOBs record);

    int insertSelective(LawCaseWithBLOBs record);

    LawCaseWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawCaseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LawCaseWithBLOBs record);

    int updateByPrimaryKey(LawCase record);
}