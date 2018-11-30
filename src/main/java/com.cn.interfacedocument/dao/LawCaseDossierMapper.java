package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawCaseDossier;

public interface LawCaseDossierMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawCaseDossier record);

    int insertSelective(LawCaseDossier record);

    LawCaseDossier selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawCaseDossier record);

    int updateByPrimaryKey(LawCaseDossier record);
}