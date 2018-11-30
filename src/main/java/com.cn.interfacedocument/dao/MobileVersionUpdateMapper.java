package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.MobileVersionUpdate;

public interface MobileVersionUpdateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MobileVersionUpdate record);

    int insertSelective(MobileVersionUpdate record);

    MobileVersionUpdate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MobileVersionUpdate record);

    int updateByPrimaryKey(MobileVersionUpdate record);
}