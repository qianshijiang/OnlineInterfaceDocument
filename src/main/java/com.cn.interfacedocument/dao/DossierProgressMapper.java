package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.DossierProgress;

public interface DossierProgressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DossierProgress record);

    int insertSelective(DossierProgress record);

    DossierProgress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DossierProgress record);

    int updateByPrimaryKey(DossierProgress record);
}