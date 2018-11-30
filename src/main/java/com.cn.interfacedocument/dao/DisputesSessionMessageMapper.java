package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.DisputesSessionMessage;

public interface DisputesSessionMessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DisputesSessionMessage record);

    int insertSelective(DisputesSessionMessage record);

    DisputesSessionMessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DisputesSessionMessage record);

    int updateByPrimaryKeyWithBLOBs(DisputesSessionMessage record);

    int updateByPrimaryKey(DisputesSessionMessage record);
}