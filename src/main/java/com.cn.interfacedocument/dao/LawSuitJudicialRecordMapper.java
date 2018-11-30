package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawSuitJudicialRecord;

public interface LawSuitJudicialRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawSuitJudicialRecord record);

    int insertSelective(LawSuitJudicialRecord record);

    LawSuitJudicialRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawSuitJudicialRecord record);

    int updateByPrimaryKeyWithBLOBs(LawSuitJudicialRecord record);

    int updateByPrimaryKey(LawSuitJudicialRecord record);
}