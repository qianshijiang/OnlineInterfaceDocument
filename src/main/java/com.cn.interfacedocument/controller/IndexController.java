package com.cn.interfacedocument.controller;

import com.cn.interfacedocument.response.ResultModel;
import com.cn.interfacedocument.service.BaseConstantService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主页控制层
 * Created by QSJ on 2018/12/15.
 */
@RestController
@RequestMapping(value = "/Index")
@Api(value = "IndexController", tags = {"主页接口"})
public class IndexController {

    @ApiOperation(value = "主页接口")
    @RequestMapping(value = "/Indexpage",method = {RequestMethod.GET,RequestMethod.POST})
    public ResultModel index(String QrcodrId,String ShopId,Long AnsBookNum) {

        String url = BaseConstantService.message + "?QrcodrId=" + QrcodrId + "&ShopId=" + "&AnsBookNum=" + AnsBookNum;

        return ResultModel.success("访问成功",url);
    }
}
