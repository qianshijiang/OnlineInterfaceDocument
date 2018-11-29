package com.cn.interfacedocument.dao;

import com.cn.interfacedocument.entity.Dict;

import java.util.List;

/**
 * Created by QSJ on 2018/11/29.
 */
public interface dictDao {
    /**
     * 插入数据
     * @param dict 基础数据实体
     * @return
     */
    int insert(Dict dict);

    /**
     * 修改数据
     * @param dict 基础数据实体
     * @return
     */
    int update(Dict dict);

    /**
     * 删除数据
     * @param id 基础数据id
     * @return
     */
    int deleteById(Long id);

    /**
     * 查询
     * @param id 主键id
     * @return
     */
    Dict findById(Long id);

    /**
     * 查询所有的
     * @return 基础数据实体集合
     */
    List<Dict> findListDict();
}
