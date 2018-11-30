package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawSuitPriChat;

public interface LawSuitPriChatMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawSuitPriChat record);

    int insertSelective(LawSuitPriChat record);

    LawSuitPriChat selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawSuitPriChat record);

    int updateByPrimaryKey(LawSuitPriChat record);
}