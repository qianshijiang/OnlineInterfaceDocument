package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.OrganizationServiceSearch;
import com.cn.interfacedocument.entity.OrganizationServiceSearchKey;

public interface OrganizationServiceSearchMapper {
    int deleteByPrimaryKey(OrganizationServiceSearchKey key);

    int insert(OrganizationServiceSearch record);

    int insertSelective(OrganizationServiceSearch record);

    OrganizationServiceSearch selectByPrimaryKey(OrganizationServiceSearchKey key);

    int updateByPrimaryKeySelective(OrganizationServiceSearch record);

    int updateByPrimaryKey(OrganizationServiceSearch record);
}