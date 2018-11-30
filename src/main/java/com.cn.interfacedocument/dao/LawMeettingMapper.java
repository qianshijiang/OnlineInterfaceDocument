package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawMeetting;

public interface LawMeettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawMeetting record);

    int insertSelective(LawMeetting record);

    LawMeetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawMeetting record);

    int updateByPrimaryKeyWithBLOBs(LawMeetting record);

    int updateByPrimaryKey(LawMeetting record);
}