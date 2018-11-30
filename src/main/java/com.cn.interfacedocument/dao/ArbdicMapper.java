package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Arbdic;

public interface ArbdicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Arbdic record);

    int insertSelective(Arbdic record);

    Arbdic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Arbdic record);

    int updateByPrimaryKey(Arbdic record);
}