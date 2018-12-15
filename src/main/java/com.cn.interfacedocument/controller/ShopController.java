package com.cn.interfacedocument.controller;

import com.cn.interfacedocument.entity.Shop;
import com.cn.interfacedocument.response.ResultModel;
import com.cn.interfacedocument.service.ShopService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 店铺控制层
 * Created by QSJ on 2018/12/9.
 */
@RestController
@RequestMapping("/Qrcode/Shop")
@Api(value = "ShopController",tags = "店铺接口")
public class ShopController {

    private static final Logger log = LoggerFactory.getLogger(ShopController.class);
    @Autowired
    private ShopService shopService;

    @ApiOperation(value = "通过ID删除")
    @RequestMapping(value = "/deleteByKey",method = {RequestMethod.GET,RequestMethod.POST})
    public ResultModel deleteByPrimaryKey(@RequestBody String params){
      try{
           JSONObject obj = JSONObject.fromObject(params).getJSONObject("param");
           String id = obj.getString("id");

           int i = this.shopService.deleteByPrimaryKey(id);
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

    @ApiOperation(value = "新增数据")
    @RequestMapping(value = "/insertSelct",method = {RequestMethod.POST})
    public ResultModel insertSelective(){
      try{
          int i = this.shopService.insertSelective();
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

    @ApiOperation(value = "通过Id数据")
    @RequestMapping(value = "/selectByKey",method = {RequestMethod.GET,RequestMethod.POST})
    public ResultModel selectByPrimaryKey(@RequestBody String params){
      try{

          JSONObject obj = JSONObject.fromObject(params).getJSONObject("param");
          String id = obj.getString("id");
          Shop shop = this.shopService.selectByPrimaryKey(id);
          return ResultModel.success("查询成功",shop);
      }catch (Exception e){
          e.printStackTrace();
          log.info(e.toString());
          return ResultModel.fail("服务器发生未知错误，请稍后重试","");
      }
    }

    @ApiOperation(value = "修改店铺数据")
    @RequestMapping(value = "/updateBySelect",method = {RequestMethod.POST})
    public ResultModel updateByPrimaryKeySelective(@RequestBody Shop shop){
        try{
            int i = this.shopService.updateByPrimaryKeySelective(shop);
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

    @ApiOperation("店铺分页查询")
    @RequestMapping(value = "/findListByPage", method = RequestMethod.POST)
    @ResponseBody
    public ResultModel findListByPage(@RequestBody Shop shop, int currentPage, int pageSize, HttpServletRequest request){
      try{
          int startPage = currentPage==0?1:currentPage;
          int pagSize = pageSize==0?10:pageSize;

          return ResultModel.successfull("查询成功",this.shopService.findListByPage(shop,startPage,pagSize));
      }catch (Exception e){
          e.printStackTrace();
          log.info(e.toString());
          return ResultModel.fail("服务器发生未知错误，请稍后重试","");
      }
    }
}
