package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.SscbTjAllNew;

public interface SscbTjAllNewMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SscbTjAllNew record);

    int insertSelective(SscbTjAllNew record);

    SscbTjAllNew selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SscbTjAllNew record);

    int updateByPrimaryKey(SscbTjAllNew record);
}