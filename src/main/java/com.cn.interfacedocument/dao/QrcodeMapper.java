package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Qrcode;

import java.util.List;

public interface QrcodeMapper extends BaseMapper<Qrcode> {

    int deleteByPrimaryKey(String id);

    int insertSelective(Qrcode record);

    Qrcode selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Qrcode record);

    int updateByPrimaryKey(Qrcode record);

    List<Qrcode> findListByPage(Qrcode record);

    List<Qrcode> findList();

    int getCount();

}