package com.cn.interfacedocument.controller;

import com.cn.interfacedocument.entity.Answerbook;
import com.cn.interfacedocument.response.ResultModel;
import com.cn.interfacedocument.service.AnswerBookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 答案之书控制层
 * Created by QSJ on 2018/12/9.
 */
@RestController
@RequestMapping("/Qrcode/Answerbook")
@Api(value = "AnswerBookController",tags = "答案之书接口")
public class AnswerBookController {

    private static final Logger log = LoggerFactory.getLogger(AnswerBookController.class);

    @Autowired
    private AnswerBookService answerBookService;

    @ApiOperation(value = "通过ID删除")
    @RequestMapping(value = "/deleteByKey",method = {RequestMethod.GET,RequestMethod.POST})
    public ResultModel deleteByPrimaryKey(String id){
      try{
          int i = this.answerBookService.deleteByPrimaryKey(id);
          if(i>0){
              return ResultModel.success("删除成功",i);
          }else{
              return ResultModel.fail("删除失败","");
          }
      }catch (Exception e){
          e.printStackTrace();
          log.info(e.toString());
          return ResultModel.fail("服务器发生未知错误，请稍后重试","");
      }
    }

    @ApiOperation(value = "通过ID查询")
    @RequestMapping(value = "/selectByKey",method = {RequestMethod.GET,RequestMethod.POST})
    public ResultModel selectByPrimaryKey(@RequestBody String id){
       try{
           Answerbook ans = this.answerBookService.selectByPrimaryKey(id);
           return ResultModel.success("查询成功",ans);
       }catch (Exception e){
           e.printStackTrace();
           log.info(e.toString());
           return ResultModel.fail("服务器发生未知错误，请稍后重试","");
       }
    }

    @ApiOperation(value = "修改答案之书")
    @RequestMapping(value = "/updateBySelect",method = RequestMethod.POST)
    public ResultModel updateByPrimaryKeySelective(@RequestBody Answerbook answerbook){
      try{
          int i = this.answerBookService.updateByPrimaryKeySelective(answerbook);
          if(i>0){
              return ResultModel.success("修改成功",i);
          }else{
              return ResultModel.fail("修改失败","");
          }
      }catch (Exception e){
          e.printStackTrace();
          log.info(e.toString());
          return ResultModel.fail("服务器发生未知错误，请稍后重试","");
      }
    }

    @ApiOperation("答案之书分页查询")
    @RequestMapping(value = "/findListByPage", method = RequestMethod.POST)
    @ResponseBody
    public ResultModel findListByPage(@RequestBody Answerbook answerbook,int currentPage,int pageSize){
        try{
            int startPage = currentPage==0?1:currentPage;
            int pagSize = pageSize==0?10:pageSize;
            return ResultModel.successfull("查询成功",this.answerBookService.findListByPage(answerbook, currentPage, pageSize));
        }catch (Exception e){
            e.printStackTrace();
            log.info(e.toString());
            return ResultModel.fail("服务器发生未知错误，请稍后重试","");
        }
    }
    @ApiOperation("答案之书通过编号查询")
    @RequestMapping(value = "/findByAnsNum", method = RequestMethod.POST)
    @ResponseBody
    public ResultModel findByAnsNum(@RequestBody Long ansNum){
        try{
            return ResultModel.success("查询成功",this.answerBookService.findByAnsNum(ansNum));
        }catch (Exception e){
            e.printStackTrace();
            log.info(e.toString());
            return ResultModel.fail("服务器发生未知错误，请稍后重试","");
        }
    }
}
