package com.cn.interfacedocument.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;
import java.util.Date;

@ApiModel(value = "二维码主表",description = "记录生成的二维码信息")
public class Qrcode implements Serializable{

    @NotEmpty(message = "主键id不能为空")
    @ApiModelProperty(value = "主键ID")
    private String id;

    @ApiModelProperty(value = "二维码描述")
    private String describetion;

    @ApiModelProperty(value = "二维码扫描次数")
    private Long scanTimes;

    @ApiModelProperty(value = "创建时间")
    private Date createtime;

    @ApiModelProperty(value = "修改时间")
    private Date updatetime;

    @ApiModelProperty(value = "二维码编号")
    private Long qrnumber;

    @ApiModelProperty(value = "答案之书ID")
    private String answerBookId;

    @ApiModelProperty(value = "删除标志：0:未删除，1:删除")
    private String deleteFlage;

    @ApiModelProperty(value = "存储的地址")
    private String url;

    @ApiModelProperty(value = "'二维码类型：0:普通二维码；1:设置颜色的二维码；3:带logo的二维码；4:带背景的二维码；5:重新着色位置探测图像")
    private String qrcodeType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDescribetion() {
        return describetion;
    }

    public void setDescribetion(String describetion) {
        this.describetion = describetion == null ? null : describetion.trim();
    }

    public Long getScanTimes() {
        return scanTimes;
    }

    public void setScanTimes(Long scanTimes) {
        this.scanTimes = scanTimes;
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

    public Long getQrnumber() {
        return qrnumber;
    }

    public void setQrnumber(Long qrnumber) {
        this.qrnumber = qrnumber;
    }

    public String getAnswerBookId() {
        return answerBookId;
    }

    public void setAnswerBookId(String answerBookId) {
        this.answerBookId = answerBookId == null ? null : answerBookId.trim();
    }

    public String getDeleteFlage() {
        return deleteFlage;
    }

    public void setDeleteFlage(String deleteFlage) {
        this.deleteFlage = deleteFlage == null ? null : deleteFlage.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getQrcodeType() {
        return qrcodeType;
    }

    public void setQrcodeType(String qrcodeType) {
        this.qrcodeType = qrcodeType == null ? null : qrcodeType.trim();
    }
}