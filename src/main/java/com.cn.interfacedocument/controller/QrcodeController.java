package com.cn.interfacedocument.controller;

import com.cn.interfacedocument.entity.Qrcode;
import com.cn.interfacedocument.response.ResultModel;
import com.cn.interfacedocument.service.QrcodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 二维码控制层
 * Created by QSJ on 2018/12/8.
 */
@RestController
@RequestMapping("/Qrcode")
@Api(value = "QrcodeController", tags = {"restful 二维码接口"})
public class QrcodeController {

    private static final Logger log = LoggerFactory.getLogger(QrcodeController.class);

    @Autowired
    private QrcodeService qrcodeService;

    @ApiOperation(value = "通过ID删除")
    @RequestMapping(value = "/deleteByKey",method = {RequestMethod.GET,RequestMethod.POST})
    public ResultModel deleteByPrimaryKey(String id){
        try{
            int i = this.qrcodeService.deleteByPrimaryKey(id);
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

    @ApiOperation(value = "以接口形式访问单条添加")
    @RequestMapping(value = "/insertAccess",method = RequestMethod.POST)
    public ResultModel insertSelectiveInterfaceAccess(@RequestBody Qrcode qrCode){
        try{
            int i = this.qrcodeService.insertSelectiveInterfaceAccess(qrCode);
            if(i>0){
                return ResultModel.success("新增成功",i);
            }else{
                return ResultModel.fail("新增失败","");
            }
        }catch (Exception e){
            e.printStackTrace();
            log.info(e.toString());
            return ResultModel.fail("服务器发生未知错误，请稍后重试","");
        }
    }

    @ApiOperation(value = "以接口形式访问批量添加")
    @RequestMapping(value = "/insertManual",method = RequestMethod.POST)
    public ResultModel BashinsertSelectiveManual(@RequestBody Qrcode qrCode){
        try{
            int i = this.qrcodeService.BashinsertSelectiveManual(qrCode);
            if(i>0){
                return ResultModel.success("新增成功",i);
            }else{
                return ResultModel.fail("新增失败","");
            }
        }catch (Exception e){
            e.printStackTrace();
            log.info(e.toString());
            return ResultModel.fail("服务器发生未知错误，请稍后重试","");
        }
    }



}
