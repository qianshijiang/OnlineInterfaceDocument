package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.GovOrganization;

public interface GovOrganizationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(GovOrganization record);

    int insertSelective(GovOrganization record);

    GovOrganization selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GovOrganization record);

    int updateByPrimaryKeyWithBLOBs(GovOrganization record);

    int updateByPrimaryKey(GovOrganization record);
}