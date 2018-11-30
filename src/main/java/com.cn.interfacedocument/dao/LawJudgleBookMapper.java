package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawJudgleBook;
import com.cn.interfacedocument.entity.LawJudgleBookWithBLOBs;

public interface LawJudgleBookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawJudgleBookWithBLOBs record);

    int insertSelective(LawJudgleBookWithBLOBs record);

    LawJudgleBookWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawJudgleBookWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LawJudgleBookWithBLOBs record);

    int updateByPrimaryKey(LawJudgleBook record);
}