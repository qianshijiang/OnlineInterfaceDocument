package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.XjqTriggerLogglue;

public interface XjqTriggerLogglueMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XjqTriggerLogglue record);

    int insertSelective(XjqTriggerLogglue record);

    XjqTriggerLogglue selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XjqTriggerLogglue record);

    int updateByPrimaryKeyWithBLOBs(XjqTriggerLogglue record);

    int updateByPrimaryKey(XjqTriggerLogglue record);
}