package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqPausedTriggerGrpsKey;

public interface XjqPausedTriggerGrpsMapper {
    int deleteByPrimaryKey(XjqPausedTriggerGrpsKey key);

    int insert(XjqPausedTriggerGrpsKey record);

    int insertSelective(XjqPausedTriggerGrpsKey record);
}