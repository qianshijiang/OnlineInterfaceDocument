package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.GovLawCase;

public interface GovLawCaseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GovLawCase record);

    int insertSelective(GovLawCase record);

    GovLawCase selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovLawCase record);

    int updateByPrimaryKey(GovLawCase record);
}