package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawsAndRegulations;

public interface LawsAndRegulationsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawsAndRegulations record);

    int insertSelective(LawsAndRegulations record);

    LawsAndRegulations selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawsAndRegulations record);

    int updateByPrimaryKeyWithBLOBs(LawsAndRegulations record);

    int updateByPrimaryKey(LawsAndRegulations record);
}