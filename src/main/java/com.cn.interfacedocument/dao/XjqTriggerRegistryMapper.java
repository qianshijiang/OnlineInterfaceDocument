package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqTriggerRegistry;

public interface XjqTriggerRegistryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XjqTriggerRegistry record);

    int insertSelective(XjqTriggerRegistry record);

    XjqTriggerRegistry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XjqTriggerRegistry record);

    int updateByPrimaryKey(XjqTriggerRegistry record);
}