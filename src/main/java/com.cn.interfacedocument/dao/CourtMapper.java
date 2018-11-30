package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Court;

public interface CourtMapper {
    int deleteByPrimaryKey(String courtCode);

    int insert(Court record);

    int insertSelective(Court record);

    Court selectByPrimaryKey(String courtCode);

    int updateByPrimaryKeySelective(Court record);

    int updateByPrimaryKey(Court record);
}