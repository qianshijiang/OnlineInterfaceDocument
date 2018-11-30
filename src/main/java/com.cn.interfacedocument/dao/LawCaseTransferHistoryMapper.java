package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawCaseTransferHistory;

public interface LawCaseTransferHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawCaseTransferHistory record);

    int insertSelective(LawCaseTransferHistory record);

    LawCaseTransferHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawCaseTransferHistory record);

    int updateByPrimaryKey(LawCaseTransferHistory record);
}