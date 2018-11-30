package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawSuitMeetting;

public interface LawSuitMeettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawSuitMeetting record);

    int insertSelective(LawSuitMeetting record);

    LawSuitMeetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawSuitMeetting record);

    int updateByPrimaryKey(LawSuitMeetting record);
}