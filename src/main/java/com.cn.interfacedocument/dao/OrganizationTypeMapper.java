package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.OrganizationType;

public interface OrganizationTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrganizationType record);

    int insertSelective(OrganizationType record);

    OrganizationType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrganizationType record);

    int updateByPrimaryKey(OrganizationType record);
}