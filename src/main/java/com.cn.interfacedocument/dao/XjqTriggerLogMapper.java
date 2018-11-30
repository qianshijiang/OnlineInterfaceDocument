package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqTriggerLog;

public interface XjqTriggerLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XjqTriggerLog record);

    int insertSelective(XjqTriggerLog record);

    XjqTriggerLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XjqTriggerLog record);

    int updateByPrimaryKey(XjqTriggerLog record);
}