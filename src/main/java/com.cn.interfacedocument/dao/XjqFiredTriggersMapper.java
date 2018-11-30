package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqFiredTriggers;
import com.cn.interfacedocument.entity.XjqFiredTriggersKey;

public interface XjqFiredTriggersMapper {
    int deleteByPrimaryKey(XjqFiredTriggersKey key);

    int insert(XjqFiredTriggers record);

    int insertSelective(XjqFiredTriggers record);

    XjqFiredTriggers selectByPrimaryKey(XjqFiredTriggersKey key);

    int updateByPrimaryKeySelective(XjqFiredTriggers record);

    int updateByPrimaryKey(XjqFiredTriggers record);
}