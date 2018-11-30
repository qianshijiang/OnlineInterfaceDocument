package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqSchedulerState;
import com.cn.interfacedocument.entity.XjqSchedulerStateKey;

public interface XjqSchedulerStateMapper {
    int deleteByPrimaryKey(XjqSchedulerStateKey key);

    int insert(XjqSchedulerState record);

    int insertSelective(XjqSchedulerState record);

    XjqSchedulerState selectByPrimaryKey(XjqSchedulerStateKey key);

    int updateByPrimaryKeySelective(XjqSchedulerState record);

    int updateByPrimaryKey(XjqSchedulerState record);
}