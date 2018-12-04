package com.cn.interfacedocument.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

@ApiModel(value = "基础数据实体",description = "基础数据信息")
public class Dict implements Serializable{

    @NotEmpty(message = "主键id不能为空")
    private Long id;

    @NotEmpty(message = "名称")
    private String name;

    @NotEmpty(message = "代码")
    private String code;

    @NotEmpty(message = "描述")
    private String describes;

    @NotEmpty(message = "类型")
    private String type;

    @NotEmpty(message = "显示顺序")
    private Integer showOrder;

    @NotEmpty(message = "补充内容")
    private String extend;

    @ApiModelProperty("主键id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ApiModelProperty("名称")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @ApiModelProperty("代码")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    @ApiModelProperty("描述")
    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes == null ? null : describes.trim();
    }

    @ApiModelProperty("类型")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    @ApiModelProperty("显示顺序")
    public Integer getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(Integer showOrder) {
        this.showOrder = showOrder;
    }

    @ApiModelProperty("补充内容")
    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }
}