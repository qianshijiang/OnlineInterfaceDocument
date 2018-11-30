package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawSuitNemessage;

public interface LawSuitNemessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawSuitNemessage record);

    int insertSelective(LawSuitNemessage record);

    LawSuitNemessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawSuitNemessage record);

    int updateByPrimaryKeyWithBLOBs(LawSuitNemessage record);

    int updateByPrimaryKey(LawSuitNemessage record);
}