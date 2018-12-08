package com.cn.interfacedocument.service;

import com.cn.interfacedocument.Util.DateUtil;
import com.cn.interfacedocument.Util.MD5Util;
import com.cn.interfacedocument.Util.RandomString;
import com.cn.interfacedocument.dao.QrcodeMapper;
import com.cn.interfacedocument.entity.Qrcode;
import com.cn.interfacedocument.qrcode.wrapper.QrCodeGenWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 二维码业务层
 * Created by QSJ on 2018/12/8.
 */
@Service
public class QrcodeService {

    private static final Logger log = LoggerFactory.getLogger(BaseConstantService.class);
    @Autowired
    private QrcodeMapper qrcodeMapper;

    /**
     * 通过主键id删除
     * @param id 主键id
     * @return
     */
    public int deleteByPrimaryKey(String id){
        return this.qrcodeMapper.deleteByPrimaryKey(id);
    }

    /**
     * 批量生成二维码 以对象形式插入
     * @param qrcode 二维码对象
     * @return
     */
    public int BashinsertSelectiveManual(Qrcode qrcode) throws Exception{
        String mesg = "";
        int s = 0;
        for(int i=1; i<=BaseConstantService.count; i++){
            qrcode.setId(MD5Util.md5Encode(String.valueOf(i))); //主键id
            qrcode.setDescribe("批量生成二维码");
            qrcode.setUrl("/"+ qrcode.getId() + "/" + qrcode.getId() + ".png"); //存储的url
            qrcode.setScanTimes(0L); //扫描次数
            qrcode.setQrnumber(Long.parseLong(String.valueOf(i))); //二维码编号
            qrcode.setUpdatetime(DateUtil.getInDate("yyyy-MM-dd HH:mm:ss")); //修改时间
            qrcode.setCreatetime(DateUtil.getInDate("yyyy-MM-dd HH:mm:ss")); //创建时间
            qrcode.setDeleteFlage("0"); //删除标志 0:未删除，1:删除

             s += this.qrcodeMapper.insertSelective(qrcode);

            mesg = BaseConstantService.message + "&QrcodrId=" + MD5Util.kLCode(MD5Util.md5Encode(String.valueOf(i)));
            //boolean ans = QrCodeGenWrapper.of(mesg).asFile("/data/dispute_https/DMMR/QrCode/common/"+qrcode.getId()+"/"+i+".png");

            boolean ans = QrCodeGenWrapper.of(mesg).asFile("E:/QrCode/common/qrcode/"+i+".png");

        }

        return s;
    }

    /**
     * 以接口访问形式生成
     * @param qrcode 二维码对象
     * @return
     */
    public int insertSelectiveInterfaceAccess(Qrcode qrcode) throws Exception{
        qrcode.setId(MD5Util.md5Encode(RandomString.getRandomString(32))); //主键id
        qrcode.setDescribe("单条生成二维码");
        qrcode.setUrl("/"+ qrcode.getId() + "/" + qrcode.getId() + ".png"); //存储的url
        qrcode.setScanTimes(0L); //扫描次数
        qrcode.setUpdatetime(DateUtil.getInDate("yyyy-MM-dd HH:mm:ss")); //修改时间
        qrcode.setCreatetime(DateUtil.getInDate("yyyy-MM-dd HH:mm:ss")); //创建时间
        qrcode.setDeleteFlage("0"); //删除标志 0:未删除，1:删除

        int i = this.qrcodeMapper.insertSelective(qrcode);

        String mesg = BaseConstantService.message + "&QrcodrId=" + MD5Util.kLCode(qrcode.getId());
        boolean ans = QrCodeGenWrapper.of(mesg).asFile("/data/dispute_https/DMMR/QrCode/common/"+qrcode.getId()+"/"+qrcode.getId()+".png");

        return i;
    }
}
