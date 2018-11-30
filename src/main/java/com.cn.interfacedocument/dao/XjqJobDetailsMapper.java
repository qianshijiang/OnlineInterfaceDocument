package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqJobDetails;
import com.cn.interfacedocument.entity.XjqJobDetailsKey;

public interface XjqJobDetailsMapper {
    int deleteByPrimaryKey(XjqJobDetailsKey key);

    int insert(XjqJobDetails record);

    int insertSelective(XjqJobDetails record);

    XjqJobDetails selectByPrimaryKey(XjqJobDetailsKey key);

    int updateByPrimaryKeySelective(XjqJobDetails record);

    int updateByPrimaryKeyWithBLOBs(XjqJobDetails record);

    int updateByPrimaryKey(XjqJobDetails record);
}