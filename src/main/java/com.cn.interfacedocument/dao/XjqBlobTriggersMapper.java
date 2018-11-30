package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqBlobTriggers;
import com.cn.interfacedocument.entity.XjqBlobTriggersKey;

public interface XjqBlobTriggersMapper {
    int deleteByPrimaryKey(XjqBlobTriggersKey key);

    int insert(XjqBlobTriggers record);

    int insertSelective(XjqBlobTriggers record);

    XjqBlobTriggers selectByPrimaryKey(XjqBlobTriggersKey key);

    int updateByPrimaryKeySelective(XjqBlobTriggers record);

    int updateByPrimaryKeyWithBLOBs(XjqBlobTriggers record);
}