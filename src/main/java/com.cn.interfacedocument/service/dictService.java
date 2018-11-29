package com.cn.interfacedocument.service;

import com.cn.interfacedocument.dao.dictDao;
import com.cn.interfacedocument.entity.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by QSJ on 2018/11/29.
 */
@Service
public class dictService implements dictDao {

    @Autowired
    private dictDao dictdao;

    public int insert(Dict dict){

        return this.dictdao.insert(dict);

    }

    public int update(Dict dict){

        return this.dictdao.update(dict);

    }

    public int deleteById(Long id){

        return this.dictdao.deleteById(id);

    }

    public Dict findById(Long id){

        return this.dictdao.findById(id);

    }

    public List<Dict> findListDict(){

        return this.dictdao.findListDict();
    }

}
