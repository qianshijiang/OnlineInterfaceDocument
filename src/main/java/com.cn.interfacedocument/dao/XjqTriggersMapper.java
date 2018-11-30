package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqTriggers;
import com.cn.interfacedocument.entity.XjqTriggersKey;

public interface XjqTriggersMapper {
    int deleteByPrimaryKey(XjqTriggersKey key);

    int insert(XjqTriggers record);

    int insertSelective(XjqTriggers record);

    XjqTriggers selectByPrimaryKey(XjqTriggersKey key);

    int updateByPrimaryKeySelective(XjqTriggers record);

    int updateByPrimaryKeyWithBLOBs(XjqTriggers record);

    int updateByPrimaryKey(XjqTriggers record);
}