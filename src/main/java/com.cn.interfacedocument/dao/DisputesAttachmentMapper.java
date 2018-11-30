package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.DisputesAttachment;

public interface DisputesAttachmentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DisputesAttachment record);

    int insertSelective(DisputesAttachment record);

    DisputesAttachment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DisputesAttachment record);

    int updateByPrimaryKey(DisputesAttachment record);
}