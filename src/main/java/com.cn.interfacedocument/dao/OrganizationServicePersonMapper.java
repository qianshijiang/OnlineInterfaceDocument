package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.OrganizationServicePerson;

public interface OrganizationServicePersonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrganizationServicePerson record);

    int insertSelective(OrganizationServicePerson record);

    OrganizationServicePerson selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrganizationServicePerson record);

    int updateByPrimaryKey(OrganizationServicePerson record);
}