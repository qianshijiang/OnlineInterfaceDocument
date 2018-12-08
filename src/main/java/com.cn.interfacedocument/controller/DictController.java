package com.cn.interfacedocument.controller;

import com.cn.interfacedocument.response.ResultModel;
import com.cn.interfacedocument.service.DictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 基础表控制层
 * Created by QSJ on 2018/11/29.
 */
@RestController
@RequestMapping(value = "/dict")
// 表示标识这个类是swagger的资源
@Api(value = "DictController", tags = {"restful api示例"})
public class DictController {

    @Autowired
    private DictService dictService;

    @ApiOperation("添加")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResultModel add(@RequestBody Dict dict) {
        Integer row = dictService.insert(dict);

        if (row > 0) {
          return ResultModel.success("新增成功",row);
        }else{
          return ResultModel.fail("新增失败","-1");
        }
    }

    @ApiOperation("分页查询")
    @RequestMapping(value = "/findListByPage", method = RequestMethod.POST)
    @ResponseBody
    public ResultModel findListByPage(Dict dict,int currentPage,int pageSize){
      int startPage = currentPage==0?1:currentPage;
      int pagSize = pageSize==0?10:pageSize;
      return ResultModel.successfull("查询成功",this.dictService.findListByPage(dict,startPage,pagSize));
    }









}
