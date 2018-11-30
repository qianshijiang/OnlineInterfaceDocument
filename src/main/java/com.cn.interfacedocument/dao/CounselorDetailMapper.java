package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.CounselorDetail;

public interface CounselorDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CounselorDetail record);

    int insertSelective(CounselorDetail record);

    CounselorDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CounselorDetail record);

    int updateByPrimaryKey(CounselorDetail record);
}