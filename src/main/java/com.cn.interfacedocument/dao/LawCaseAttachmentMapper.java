package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawCaseAttachment;

public interface LawCaseAttachmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawCaseAttachment record);

    int insertSelective(LawCaseAttachment record);

    LawCaseAttachment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawCaseAttachment record);

    int updateByPrimaryKeyWithBLOBs(LawCaseAttachment record);

    int updateByPrimaryKey(LawCaseAttachment record);
}