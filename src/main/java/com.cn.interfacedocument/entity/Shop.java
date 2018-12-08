package com.cn.interfacedocument.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value ="店铺表",description = "记录店铺基本信息")
public class Shop implements Serializable{
    @NotEmpty(message = "店铺id")
    @ApiModelProperty(value = "主键ID")
    private String id;

    @ApiModelProperty(value = "店铺名称")
    private String name;

    @ApiModelProperty(value = "店铺地址")
    private String address;

    @ApiModelProperty(value = "店主名字")
    private String shopkeeper;

    @ApiModelProperty(value = "店铺描述")
    private String describe;

    @ApiModelProperty(value = "订货号码")
    private String orderPhone;

    @ApiModelProperty(value = "订货数量")
    private Long orderAmount;

    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    @ApiModelProperty(value = "修改时间")
    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getShopkeeper() {
        return shopkeeper;
    }

    public void setShopkeeper(String shopkeeper) {
        this.shopkeeper = shopkeeper == null ? null : shopkeeper.trim();
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone == null ? null : orderPhone.trim();
    }

    public Long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}