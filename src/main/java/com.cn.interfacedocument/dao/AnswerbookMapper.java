package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Answerbook;

import java.util.List;

public interface AnswerbookMapper extends BaseMapper<Answerbook>{

    int deleteByPrimaryKey(String id);

    int insertSelective(Answerbook record);

    Answerbook selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Answerbook record);

    int updateByPrimaryKey(Answerbook record);

    List<Answerbook> findListByPage(Answerbook record);

    List<Answerbook> findList();

    int getCount(Answerbook record);

    Answerbook findByAnsNum(Long num);
}