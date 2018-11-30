package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.MobileImg;

public interface MobileImgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MobileImg record);

    int insertSelective(MobileImg record);

    MobileImg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MobileImg record);

    int updateByPrimaryKey(MobileImg record);
}