package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.DataOnlineLawCaseCount;

public interface DataOnlineLawCaseCountMapper {
    int deleteByPrimaryKey(Integer onlinelawcasecount);

    int insert(DataOnlineLawCaseCount record);

    int insertSelective(DataOnlineLawCaseCount record);
}