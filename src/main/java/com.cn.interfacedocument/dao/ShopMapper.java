package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Shop;

import java.util.List;

public interface ShopMapper extends BaseMapper<Shop>{

    int deleteByPrimaryKey(String id);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);

    List<Shop> findListByPage(Shop record);

    List<Shop> findList();

    int getCount(Shop record);

}