package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.MobileNotice;

public interface MobileNoticeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MobileNotice record);

    int insertSelective(MobileNotice record);

    MobileNotice selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MobileNotice record);

    int updateByPrimaryKeyWithBLOBs(MobileNotice record);

    int updateByPrimaryKey(MobileNotice record);
}