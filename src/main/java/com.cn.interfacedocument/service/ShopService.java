package com.cn.interfacedocument.service;

import com.cn.interfacedocument.Util.DateUtil;
import com.cn.interfacedocument.Util.MD5Util;
import com.cn.interfacedocument.Util.RandomString;
import com.cn.interfacedocument.dao.ShopMapper;
import com.cn.interfacedocument.entity.Shop;
import com.cn.interfacedocument.response.ResultModel;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 店铺业务层
 * Created by QSJ on 2018/12/9.
 */
@Service
public class ShopService {

    private static final Logger log = LoggerFactory.getLogger(ShopService.class);

    @Autowired
    private ShopMapper shopMapper;

    /**
     * 通过Id删除
     * @param id 店铺id
     * @return
     */
    public int deleteByPrimaryKey(String id){
       return this.shopMapper.deleteByPrimaryKey(id);
    }

    /**
     * 插入数据
     * @return
     */
    public int insertSelective() throws Exception {
        Shop shop = new Shop();
        shop.setId(MD5Util.md5Encode(RandomString.getRandomString(32))); //主键Id
        shop.setName(BaseConstantService.shopName); //店铺名称
        shop.setAddress(BaseConstantService.shopAddress); //店铺地址
        shop.setShopkeeper(BaseConstantService.shopkeeperName); //店主名字
        shop.setDescribetion(BaseConstantService.shopDescribe); //店铺描述
        shop.setOrderPhone(BaseConstantService.shoporderPhone); //订货号码
        shop.setCreatetime(DateUtil.getInDate("yyyy-MM-dd HH:mm:ss")); //创建数量
        return this.shopMapper.insertSelective(shop);
    }

    /**
     * 通过Id查询
     * @param id 主键Id
     * @return
     */
    public Shop selectByPrimaryKey(String id){
       return this.shopMapper.selectByPrimaryKey(id);
    }

    /**
     * 修改店铺信息
     * @param shop 店铺实体
     * @return
     */
    public int updateByPrimaryKeySelective(Shop shop){
      return this.shopMapper.updateByPrimaryKeySelective(shop);
    }

    /**
     * 分页查询
     * @param shop 店铺信息
     * @param currentPage 页码
     * @param pageSize 每页数量
     * @return
     */
    public ResultModel findListByPage(Shop shop,int currentPage,int pageSize){
        //设置分页信息，分别是当前页数和每页显示的总记录数
        PageHelper.startPage(currentPage, pageSize);

        int countNums = this.getCount(shop);              //总记录数
        List<Shop> allShop = this.shopMapper.findListByPage(shop);        //全部基础数据
        ResultModel pageData = new ResultModel(currentPage, pageSize, countNums);
        pageData.setData(allShop);
        return pageData;
    }

    /**
     * 查询数据条数
     * @param shop
     * @return
     */
    public int getCount(Shop shop){
        return this.shopMapper.getCount(shop);
    }

    /**
     * 查询所有数量
     * @return 返回店铺数据集合所有的
     */
    public List<Shop> findList(){
        return this.shopMapper.findList();
    }
}
