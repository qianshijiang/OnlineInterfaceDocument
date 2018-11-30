package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LoginCount;

public interface LoginCountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LoginCount record);

    int insertSelective(LoginCount record);

    LoginCount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LoginCount record);

    int updateByPrimaryKey(LoginCount record);
}