package com.cn.interfacedocument.service;

import com.cn.interfacedocument.dao.DictMapper;
import com.cn.interfacedocument.entity.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QSJ on 2018/11/29.
 */
@Service
public class DictService implements DictMapper {

    @Autowired
    private DictMapper dictdao;

    /**
     * 通过id删除
     * @param id 主键id
     * @return
     */
    public int deleteByPrimaryKey(Long id){
        return this.deleteByPrimaryKey(id);
    }

    /**
     * 插入数据
     * @param dict 基础数据实体
     * @return
     */
    public int insert(Dict dict){
        return this.dictdao.insert(dict);
    }

    /**
     * 插入数据
     * @param dict 基础数据实体
     * @return
     */
    public int insertSelective(Dict dict){
        return this.dictdao.insertSelective(dict);
    }

    /**
     * 通过id查询
     * @param id 主键id
     * @return
     */
    public Dict selectByPrimaryKey(Long id){
        return this.dictdao.selectByPrimaryKey(id);
    }

    /**
     * 查询所有的
     * @return
     */
    public List<Dict> findListByPage(Dict dict){
        return this.findListByPage(dict);
    }

    /**
     * 修改
     * @param dict 基础数据实体
     * @return
     */
    public int updateByPrimaryKeySelective(Dict dict){
        return this.dictdao.updateByPrimaryKeySelective(dict);
    }

    /**
     * 修改
     * @param dict 基础数据实体
     * @return
     */
    public int updateByPrimaryKeyWithBLOBs(Dict dict){
        return this.dictdao.updateByPrimaryKeyWithBLOBs(dict);
    }

    /**
     * 通过id修改
     * @param dict 基础数据实体
     * @return
     */
    public int updateByPrimaryKey(Dict dict){
        return this.dictdao.updateByPrimaryKey(dict);
    }

}
