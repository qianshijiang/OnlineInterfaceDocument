package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Modal;

public interface ModalMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Modal record);

    int insertSelective(Modal record);

    Modal selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Modal record);

    int updateByPrimaryKeyWithBLOBs(Modal record);

    int updateByPrimaryKey(Modal record);
}