package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqTriggerInfo;

public interface XjqTriggerInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XjqTriggerInfo record);

    int insertSelective(XjqTriggerInfo record);

    XjqTriggerInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XjqTriggerInfo record);

    int updateByPrimaryKeyWithBLOBs(XjqTriggerInfo record);

    int updateByPrimaryKey(XjqTriggerInfo record);
}