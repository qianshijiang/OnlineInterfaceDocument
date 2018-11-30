package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Qrcode;

public interface QrcodeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Qrcode record);

    int insertSelective(Qrcode record);

    Qrcode selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Qrcode record);

    int updateByPrimaryKey(Qrcode record);
}