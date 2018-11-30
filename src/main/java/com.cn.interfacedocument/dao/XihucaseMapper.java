package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Xihucase;

public interface XihucaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Xihucase record);

    int insertSelective(Xihucase record);

    Xihucase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Xihucase record);

    int updateByPrimaryKey(Xihucase record);
}