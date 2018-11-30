package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqCalendars;
import com.cn.interfacedocument.entity.XjqCalendarsKey;

public interface XjqCalendarsMapper {
    int deleteByPrimaryKey(XjqCalendarsKey key);

    int insert(XjqCalendars record);

    int insertSelective(XjqCalendars record);

    XjqCalendars selectByPrimaryKey(XjqCalendarsKey key);

    int updateByPrimaryKeySelective(XjqCalendars record);

    int updateByPrimaryKeyWithBLOBs(XjqCalendars record);
}