package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.UserAuthenticate;

public interface UserAuthenticateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserAuthenticate record);

    int insertSelective(UserAuthenticate record);

    UserAuthenticate selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserAuthenticate record);

    int updateByPrimaryKey(UserAuthenticate record);
}