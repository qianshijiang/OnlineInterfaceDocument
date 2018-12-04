package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Dict;

import java.util.List;

public interface DictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dict record);

    int insertSelective(Dict record);

    Dict selectByPrimaryKey(Long id);

    List<Dict> findListByPage(Dict dict);

    int updateByPrimaryKeySelective(Dict record);

    int updateByPrimaryKeyWithBLOBs(Dict record);

    int updateByPrimaryKey(Dict record);
}