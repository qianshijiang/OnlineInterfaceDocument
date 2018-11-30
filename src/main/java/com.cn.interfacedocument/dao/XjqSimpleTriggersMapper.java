package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqSimpleTriggers;
import com.cn.interfacedocument.entity.XjqSimpleTriggersKey;

public interface XjqSimpleTriggersMapper {
    int deleteByPrimaryKey(XjqSimpleTriggersKey key);

    int insert(XjqSimpleTriggers record);

    int insertSelective(XjqSimpleTriggers record);

    XjqSimpleTriggers selectByPrimaryKey(XjqSimpleTriggersKey key);

    int updateByPrimaryKeySelective(XjqSimpleTriggers record);

    int updateByPrimaryKey(XjqSimpleTriggers record);
}