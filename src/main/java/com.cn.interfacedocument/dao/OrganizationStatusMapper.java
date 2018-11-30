package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.OrganizationStatus;

public interface OrganizationStatusMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrganizationStatus record);

    int insertSelective(OrganizationStatus record);

    OrganizationStatus selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrganizationStatus record);

    int updateByPrimaryKey(OrganizationStatus record);
}