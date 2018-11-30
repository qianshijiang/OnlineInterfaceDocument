package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.ConsoleUser;

public interface ConsoleUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ConsoleUser record);

    int insertSelective(ConsoleUser record);

    ConsoleUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ConsoleUser record);

    int updateByPrimaryKey(ConsoleUser record);
}