package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawWholeConfirm;

public interface LawWholeConfirmMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawWholeConfirm record);

    int insertSelective(LawWholeConfirm record);

    LawWholeConfirm selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawWholeConfirm record);

    int updateByPrimaryKey(LawWholeConfirm record);
}