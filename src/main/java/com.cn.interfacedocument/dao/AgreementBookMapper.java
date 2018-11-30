package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.AgreementBook;

public interface AgreementBookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AgreementBook record);

    int insertSelective(AgreementBook record);

    AgreementBook selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AgreementBook record);

    int updateByPrimaryKey(AgreementBook record);
}