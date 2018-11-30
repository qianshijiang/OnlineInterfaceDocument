package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.CounselorAndMediators;

public interface CounselorAndMediatorsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CounselorAndMediators record);

    int insertSelective(CounselorAndMediators record);

    CounselorAndMediators selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CounselorAndMediators record);

    int updateByPrimaryKey(CounselorAndMediators record);
}