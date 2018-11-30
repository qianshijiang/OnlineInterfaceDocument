package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqSimpropTriggers;
import com.cn.interfacedocument.entity.XjqSimpropTriggersKey;

public interface XjqSimpropTriggersMapper {
    int deleteByPrimaryKey(XjqSimpropTriggersKey key);

    int insert(XjqSimpropTriggers record);

    int insertSelective(XjqSimpropTriggers record);

    XjqSimpropTriggers selectByPrimaryKey(XjqSimpropTriggersKey key);

    int updateByPrimaryKeySelective(XjqSimpropTriggers record);

    int updateByPrimaryKey(XjqSimpropTriggers record);
}