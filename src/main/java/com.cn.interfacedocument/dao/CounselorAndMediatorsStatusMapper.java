package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.CounselorAndMediatorsStatus;

public interface CounselorAndMediatorsStatusMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CounselorAndMediatorsStatus record);

    int insertSelective(CounselorAndMediatorsStatus record);

    CounselorAndMediatorsStatus selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CounselorAndMediatorsStatus record);

    int updateByPrimaryKey(CounselorAndMediatorsStatus record);
}