package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Nemessage;

public interface NemessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Nemessage record);

    int insertSelective(Nemessage record);

    Nemessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Nemessage record);

    int updateByPrimaryKeyWithBLOBs(Nemessage record);

    int updateByPrimaryKey(Nemessage record);
}