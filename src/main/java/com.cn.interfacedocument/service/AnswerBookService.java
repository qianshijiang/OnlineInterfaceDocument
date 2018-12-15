package com.cn.interfacedocument.service;

import com.cn.interfacedocument.Util.DateUtil;
import com.cn.interfacedocument.Util.MD5Util;
import com.cn.interfacedocument.Util.RandomString;
import com.cn.interfacedocument.dao.AnswerbookMapper;
import com.cn.interfacedocument.entity.Answerbook;
import com.cn.interfacedocument.response.ResultModel;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 答案之书业务层
 * Created by QSJ on 2018/12/9.
 */
@Service
public class AnswerBookService {

    private static final Logger log = LoggerFactory.getLogger(AnswerBookService.class);

    @Autowired
    private AnswerbookMapper answerbookMapper;

    /**
     * 通过主键删除 真实删除
     * @param id 主键
     * @return
     */
    public int deleteByPrimaryKey(String id){
      return this.deleteByPrimaryKey(id);
    }

    /**
     * 插入数据
     * @param record 答案之书
     * @return
     */
    public int insertSelective(Answerbook record) throws Exception{
        if(record.getId()==null){
            record.setId(MD5Util.md5Encode(RandomString.getRandomString(32)));
        }
        record.setAuthor(BaseConstantService.author); //作者
        record.setPublishTime(DateUtil.getStrtoDate(BaseConstantService.pubsTime,"yyyy-MM-dd")); //出版时间
        record.setPress(BaseConstantService.pub_press); //出版社
        record.setCreatetime(DateUtil.getInDate("yyyy-MM-dd HH:mm:ss")); //创建时间

        return this.answerbookMapper.insertSelective(record);
    }

    /**
     * 通过id获取答案之书
     * @param id 答案之书id
     * @return
     */
    public Answerbook selectByPrimaryKey(String id){
       return this.answerbookMapper.selectByPrimaryKey(id);
    }

    /**
     * 修改答案之书
     * @param record 答案之书对象
     * @return
     */
    public int updateByPrimaryKeySelective(Answerbook record){
        return this.answerbookMapper.updateByPrimaryKeySelective(record);
    }

    public ResultModel findListByPage(Answerbook record,int currentPage,int pageSize){
        //设置分页信息，分别是当前页数和每页显示的总记录数
        PageHelper.startPage(currentPage, pageSize);

        int countNums = this.getCount(record);              //总记录数
        List<Answerbook> allAns = this.answerbookMapper.findListByPage(record);        //全部基础数据
        ResultModel pageData = new ResultModel(currentPage, pageSize, countNums);
        pageData.setData(allAns);
        return pageData;
    }

    /**
     * 获取数据条数
     * @param record
     * @return
     */
    public int getCount(Answerbook record){
        return this.answerbookMapper.getCount(record);
    }

    /**
     * 通过答案之书编号查询
     * @param num 答案之书编号
     * @return
     */
    public Answerbook findByAnsNum(Long ansNum) throws Exception{
        return this.answerbookMapper.findByAnsNum(ansNum);
    }
}
