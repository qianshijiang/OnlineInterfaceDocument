package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Session;
import com.cn.interfacedocument.entity.SessionWithBLOBs;

public interface SessionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SessionWithBLOBs record);

    int insertSelective(SessionWithBLOBs record);

    SessionWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SessionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SessionWithBLOBs record);

    int updateByPrimaryKey(Session record);
}