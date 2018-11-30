package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.LawSuitPaperWithBLOBs;

public interface LawSuitPaperMapper {
    int insert(LawSuitPaperWithBLOBs record);

    int insertSelective(LawSuitPaperWithBLOBs record);
}