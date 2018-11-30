package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawPromise;

public interface LawPromiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawPromise record);

    int insertSelective(LawPromise record);

    LawPromise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawPromise record);

    int updateByPrimaryKeyWithBLOBs(LawPromise record);

    int updateByPrimaryKey(LawPromise record);
}