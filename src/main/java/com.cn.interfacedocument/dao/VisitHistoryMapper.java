package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.VisitHistory;

public interface VisitHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VisitHistory record);

    int insertSelective(VisitHistory record);

    VisitHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VisitHistory record);

    int updateByPrimaryKey(VisitHistory record);
}