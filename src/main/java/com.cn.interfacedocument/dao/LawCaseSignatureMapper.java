package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawCaseSignature;

public interface LawCaseSignatureMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawCaseSignature record);

    int insertSelective(LawCaseSignature record);

    LawCaseSignature selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawCaseSignature record);

    int updateByPrimaryKeyWithBLOBs(LawCaseSignature record);

    int updateByPrimaryKey(LawCaseSignature record);
}