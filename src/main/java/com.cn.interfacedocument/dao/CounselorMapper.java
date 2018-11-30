package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Counselor;

public interface CounselorMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Counselor record);

    int insertSelective(Counselor record);

    Counselor selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Counselor record);

    int updateByPrimaryKey(Counselor record);
}