package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqLocksKey;

public interface XjqLocksMapper {
    int deleteByPrimaryKey(XjqLocksKey key);

    int insert(XjqLocksKey record);

    int insertSelective(XjqLocksKey record);
}