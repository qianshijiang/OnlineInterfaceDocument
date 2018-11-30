package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.DisputesScore;
import com.cn.interfacedocument.entity.DisputesScoreWithBLOBs;

public interface DisputesScoreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DisputesScoreWithBLOBs record);

    int insertSelective(DisputesScoreWithBLOBs record);

    DisputesScoreWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DisputesScoreWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DisputesScoreWithBLOBs record);

    int updateByPrimaryKey(DisputesScore record);
}