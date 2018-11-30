package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.DisputesMessage;

public interface DisputesMessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DisputesMessage record);

    int insertSelective(DisputesMessage record);

    DisputesMessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DisputesMessage record);

    int updateByPrimaryKeyWithBLOBs(DisputesMessage record);

    int updateByPrimaryKey(DisputesMessage record);
}