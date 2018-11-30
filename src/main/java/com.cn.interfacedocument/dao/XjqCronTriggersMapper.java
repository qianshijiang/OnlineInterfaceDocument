package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqCronTriggers;
import com.cn.interfacedocument.entity.XjqCronTriggersKey;

public interface XjqCronTriggersMapper {
    int deleteByPrimaryKey(XjqCronTriggersKey key);

    int insert(XjqCronTriggers record);

    int insertSelective(XjqCronTriggers record);

    XjqCronTriggers selectByPrimaryKey(XjqCronTriggersKey key);

    int updateByPrimaryKeySelective(XjqCronTriggers record);

    int updateByPrimaryKey(XjqCronTriggers record);
}