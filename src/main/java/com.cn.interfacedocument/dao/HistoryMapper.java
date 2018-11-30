package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.History;

public interface HistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(History record);

    int insertSelective(History record);

    History selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(History record);

    int updateByPrimaryKey(History record);
}