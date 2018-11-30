package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawCaseDossierAttachment;

public interface LawCaseDossierAttachmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawCaseDossierAttachment record);

    int insertSelective(LawCaseDossierAttachment record);

    LawCaseDossierAttachment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawCaseDossierAttachment record);

    int updateByPrimaryKey(LawCaseDossierAttachment record);
}