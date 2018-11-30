package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.UserGkalThumb;

public interface UserGkalThumbMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserGkalThumb record);

    int insertSelective(UserGkalThumb record);

    UserGkalThumb selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserGkalThumb record);

    int updateByPrimaryKey(UserGkalThumb record);
}