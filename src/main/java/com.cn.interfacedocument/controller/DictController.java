package com.cn.interfacedocument.controller;

import com.cn.interfacedocument.entity.Dict;
import com.cn.interfacedocument.response.ResultModel;
import com.cn.interfacedocument.service.DictService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
    private ResultModel add(@RequestBody Dict dict) {
        Integer row = dictService.insert(dict);

        if (row > 0) {
          return ResultModel.success("新增成功",row);
        }else{
          return ResultModel.fail("新增失败","-1");
        }
    }



}
