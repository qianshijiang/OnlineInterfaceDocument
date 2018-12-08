package com.cn.interfacedocument.service;

import com.cn.interfacedocument.dao.DictMapper;
import com.cn.interfacedocument.entity.Dict;
import com.cn.interfacedocument.response.ResultModel;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层
 * Created by QSJ on 2018/11/29.
 */
@Service
public class DictService {

    @Autowired
    private DictMapper dictdao;

    /**
     * 通过id删除
     * @param id 主键id
     * @return
     */
    public int deleteByPrimaryKey(Long id){
        return this.dictdao.deleteByPrimaryKey(id);
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
     * 分页查询
     * @return
     */
    public ResultModel findListByPage(Dict dict,int currentPage,int pageSize){
        //设置分页信息，分别是当前页数和每页显示的总记录数
        PageHelper.startPage(currentPage, pageSize);

        List<Dict> allDicts = this.dictdao.findList();        //全部基础数据
        int countNums = this.dictdao.getCount();              //总记录数
        ResultModel pageData = new ResultModel(currentPage, pageSize, countNums);
        pageData.setData(allDicts);
        return pageData;
    }

    /**
     * 查询所有的
     * @return
     */
    public List<Dict> findList(){
        return this.dictdao.findList();
    }

    /**
     * 查询案件数量
     * @return
     */
    public int getCount(){
        return this.dictdao.getCount();
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
