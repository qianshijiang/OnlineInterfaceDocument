package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.DisputesSession;

public interface DisputesSessionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DisputesSession record);

    int insertSelective(DisputesSession record);

    DisputesSession selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DisputesSession record);

    int updateByPrimaryKeyWithBLOBs(DisputesSession record);

    int updateByPrimaryKey(DisputesSession record);
}