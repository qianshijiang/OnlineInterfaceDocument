package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqTriggerGroup;

public interface XjqTriggerGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XjqTriggerGroup record);

    int insertSelective(XjqTriggerGroup record);

    XjqTriggerGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XjqTriggerGroup record);

    int updateByPrimaryKey(XjqTriggerGroup record);
}