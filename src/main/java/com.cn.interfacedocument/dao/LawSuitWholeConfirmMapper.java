package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawSuitWholeConfirm;

public interface LawSuitWholeConfirmMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawSuitWholeConfirm record);

    int insertSelective(LawSuitWholeConfirm record);

    LawSuitWholeConfirm selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawSuitWholeConfirm record);

    int updateByPrimaryKey(LawSuitWholeConfirm record);
}