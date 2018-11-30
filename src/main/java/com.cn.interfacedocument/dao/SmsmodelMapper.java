package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Smsmodel;

public interface SmsmodelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Smsmodel record);

    int insertSelective(Smsmodel record);

    Smsmodel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Smsmodel record);

    int updateByPrimaryKey(Smsmodel record);
}