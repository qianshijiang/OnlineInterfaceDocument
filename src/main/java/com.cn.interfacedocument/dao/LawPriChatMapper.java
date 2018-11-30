package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawPriChat;

public interface LawPriChatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawPriChat record);

    int insertSelective(LawPriChat record);

    LawPriChat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawPriChat record);

    int updateByPrimaryKey(LawPriChat record);
}