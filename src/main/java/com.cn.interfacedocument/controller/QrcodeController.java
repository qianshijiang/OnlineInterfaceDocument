package com.cn.interfacedocument.controller;

import com.cn.interfacedocument.entity.Qrcode;
import com.cn.interfacedocument.response.ResultModel;
import com.cn.interfacedocument.service.QrcodeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 二维码控制层
 * Created by QSJ on 2018/12/8.
 */
@RestController
@RequestMapping("/Qrcode")
@Api(value = "QrcodeController", tags = {"二维码接口"})
public class QrcodeController {

    private static final Logger log = LoggerFactory.getLogger(QrcodeController.class);

    @Autowired
    private QrcodeService qrcodeService;

    @ApiOperation(value = "通过ID删除")
    @RequestMapping(value = "/deleteByKey",method = {RequestMethod.GET,RequestMethod.POST})
    public ResultModel deleteByPrimaryKey(@RequestBody String params){
        try{
            JSONObject obj = JSONObject.fromObject(params).getJSONObject("param");
            String id = obj.getString("id");

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
    public ResultModel insertSelectiveInterfaceAccess(@RequestBody Qrcode qrcode){
        try{
            int i = this.qrcodeService.insertSelectiveInterfaceAccess(qrcode);
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

    @ApiOperation(value = "以接口形式访问批量添加(1000张)")
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

    @ApiOperation(value = "以接口形式访问批量添加(10000张)")
    @RequestMapping(value = "/insertManualten",method = RequestMethod.POST)
    public ResultModel BashinsertTenThousand(@RequestBody Qrcode qrCode){
        try{
            int i = this.qrcodeService.BashinsertTenThousand(qrCode);
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

    @ApiOperation(value = "以接口形式访问批量添加(100000张)")
    @RequestMapping(value = "/insertManualhun",method = RequestMethod.POST)
    public ResultModel BashinsertHundredThousand(@RequestBody Qrcode qrCode){
        try{
            int i = this.qrcodeService.BashinsertHundredThousand(qrCode);
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

    @ApiOperation("分页查询")
    @RequestMapping(value = "/findListByPage", method = RequestMethod.POST)
    @ResponseBody
    public ResultModel findListByPage(@RequestBody Qrcode qrcode,int currentPage,int pageSize){
        try{
            int startPage = currentPage==0?1:currentPage;
            int pagSize = pageSize==0?10:pageSize;

            return ResultModel.successfull("查询成功",this.qrcodeService.findListByPage(qrcode,startPage,pagSize));
        }catch (Exception e){
            e.printStackTrace();
            log.info(e.toString());
            return ResultModel.fail("服务器发生未知错误，请稍后重试","");
        }

    }

    /**
     * 修改
     * @param qrcode 二维码对象
     * @return
     */
    @ApiOperation("修改数据")
    @RequestMapping(value = "/updateBySelective", method = RequestMethod.POST)
    public ResultModel updateByPrimaryKeySelective(@RequestBody Qrcode qrcode){
        try{
            int i = this.qrcodeService.updateByPrimaryKeySelective(qrcode);
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

    @ApiOperation("以Id查询")
    @RequestMapping(value = "/selectByPrimaryKey", method = RequestMethod.POST)
    @ResponseBody
    public ResultModel selectByPrimaryKey(@RequestBody String params){
        try{
            JSONObject obj = JSONObject.fromObject(params).getJSONObject("param");
            String id = obj.getString("id");

            Qrcode qrcode = this.qrcodeService.selectByPrimaryKey(id);
            return ResultModel.success("查询成功",qrcode);
        }catch (Exception e){
            e.printStackTrace();
            log.info(e.toString());
            return ResultModel.fail("服务器发生未知错误，请稍后重试","");
        }
    }
}
