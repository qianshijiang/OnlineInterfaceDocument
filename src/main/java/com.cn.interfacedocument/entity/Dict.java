package com.cn.interfacedocument.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 基础数据表实体
 * Created by QSJ on 2018/11/29.
 */
@ApiModel(description = "基础数据实体")
public class Dict implements Serializable{

    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("代码")
    private String code;

    @ApiModelProperty("描述")
    private String describes;

    @ApiModelProperty("类别")
    private String type;

    @ApiModelProperty("补充内容")
    private String extend;

    @ApiModelProperty("显示顺序")
    private Integer showOrder;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }
}
