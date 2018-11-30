package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.DelaySend;

public interface DelaySendMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DelaySend record);

    int insertSelective(DelaySend record);

    DelaySend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DelaySend record);

    int updateByPrimaryKey(DelaySend record);
}