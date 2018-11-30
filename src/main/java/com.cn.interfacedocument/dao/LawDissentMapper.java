package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawDissent;

public interface LawDissentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawDissent record);

    int insertSelective(LawDissent record);

    LawDissent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawDissent record);

    int updateByPrimaryKey(LawDissent record);
}