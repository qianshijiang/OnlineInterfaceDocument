package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawSuitVideo;

public interface LawSuitVideoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawSuitVideo record);

    int insertSelective(LawSuitVideo record);

    LawSuitVideo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawSuitVideo record);

    int updateByPrimaryKey(LawSuitVideo record);
}