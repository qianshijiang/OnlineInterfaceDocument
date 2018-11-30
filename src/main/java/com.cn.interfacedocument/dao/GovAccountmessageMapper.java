package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.GovAccountmessage;

public interface GovAccountmessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GovAccountmessage record);

    int insertSelective(GovAccountmessage record);

    GovAccountmessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovAccountmessage record);

    int updateByPrimaryKey(GovAccountmessage record);
}