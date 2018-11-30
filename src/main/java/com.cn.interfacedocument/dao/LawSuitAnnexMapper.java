package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawSuitAnnex;

public interface LawSuitAnnexMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LawSuitAnnex record);

    int insertSelective(LawSuitAnnex record);

    LawSuitAnnex selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LawSuitAnnex record);

    int updateByPrimaryKeyWithBLOBs(LawSuitAnnex record);

    int updateByPrimaryKey(LawSuitAnnex record);
}