package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.CounselorScore;

public interface CounselorScoreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CounselorScore record);

    int insertSelective(CounselorScore record);

    CounselorScore selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CounselorScore record);

    int updateByPrimaryKey(CounselorScore record);
}