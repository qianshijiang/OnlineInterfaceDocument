package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Areas;

public interface AreasMapper {
    int deleteByPrimaryKey(String code);

    int insert(Areas record);

    int insertSelective(Areas record);

    Areas selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Areas record);

    int updateByPrimaryKey(Areas record);
}