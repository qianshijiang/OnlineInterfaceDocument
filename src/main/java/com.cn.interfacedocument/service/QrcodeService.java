package com.cn.interfacedocument.service;

import com.cn.interfacedocument.Util.DateUtil;
import com.cn.interfacedocument.Util.MD5Util;
import com.cn.interfacedocument.Util.RandomString;
import com.cn.interfacedocument.dao.QrcodeMapper;
import com.cn.interfacedocument.entity.Qrcode;
import com.cn.interfacedocument.qrcode.wrapper.QrCodeGenWrapper;
import com.cn.interfacedocument.response.ResultModel;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

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
        int result = 0;
        for(int i=1; i<=BaseConstantService.count; i++){
            Random ra = new Random(); //生成1-318之间的随机整数
            result = ra.nextInt(318)+1;
            String qrcodeId = MD5Util.md5Encode(RandomString.getRandomString(32));
            qrcode.setId(qrcodeId); //主键id
            qrcode.setDescribetion("批量生成二维码");
            qrcode.setUrl("/"+ qrcode.getId() + "/" + i + ".png"); //存储的urli
            qrcode.setScanTimes(0L); //扫描次数
            qrcode.setQrnumber(Long.parseLong(String.valueOf(i))); //二维码编号
            qrcode.setUpdatetime(DateUtil.getInDate("yyyy-MM-dd HH:mm:ss")); //修改时间
            qrcode.setCreatetime(DateUtil.getInDate("yyyy-MM-dd HH:mm:ss")); //创建时间
            qrcode.setDeleteFlage("0"); //删除标志 0:未删除，1:删除
            qrcode.setAnswerBookNum(Long.parseLong(String.valueOf(result))); //设置答案之书ID
            qrcode.setQrcodeType("0"); //普通二维码

            mesg = BaseConstantService.message + "?QrcodrId=" + qrcodeId + "&ShopId=" + BaseConstantService.shopID_one  + "&AnsBookNum=" + qrcode.getAnswerBookNum();
            qrcode.setQrcodeContent(mesg); //设置二维码内容

            s += this.qrcodeMapper.insertSelective(qrcode);

            boolean ans = QrCodeGenWrapper.of(mesg).asFile("/data/dispute_https/DMMR/QrCode/common/"+qrcode.getId()+"/"+i+".png");

            //boolean ans = QrCodeGenWrapper.of(mesg).asFile("E:/QrCode/common/qrcode/"+i+".png");

        }

        return s;
    }

    /**
     * 以接口访问形式生成
     * @param qrcode 二维码对象
     * @return
     */
    public int insertSelectiveInterfaceAccess(Qrcode qrcode) throws Exception{
        Random ra = new Random(); //生成1-318之间的随机整数
        int result = ra.nextInt(318)+1;;
        qrcode.setId(MD5Util.md5Encode(RandomString.getRandomString(32))); //主键id
        qrcode.setDescribetion("单条生成二维码");
        qrcode.setUrl("/"+ qrcode.getId() + "/" + qrcode.getId() + ".png"); //存储的url
        qrcode.setScanTimes(0L); //扫描次数
        qrcode.setQrcodeType("0"); //普通二维码
        qrcode.setUpdatetime(DateUtil.getInDate("yyyy-MM-dd HH:mm:ss")); //修改时间
        qrcode.setCreatetime(DateUtil.getInDate("yyyy-MM-dd HH:mm:ss")); //创建时间
        qrcode.setDeleteFlage("0"); //删除标志 0:未删除，1:删除
        qrcode.setAnswerBookNum(Long.parseLong(String.valueOf(result))); //设置答案之书书号

        String mesg = BaseConstantService.message + "?QrcodrId=" + qrcode.getId() + "&ShopId=" + BaseConstantService.shopID_one + "&AnsBookNum=" + qrcode.getAnswerBookNum();
        qrcode.setQrcodeContent(mesg); //设置二维码连接地址

        int i = this.qrcodeMapper.insertSelective(qrcode); //插入二维码表

        boolean ans = QrCodeGenWrapper.of(mesg).asFile("/data/dispute_https/DMMR/QrCode/common/"+qrcode.getId()+"/"+qrcode.getId()+".png");

        return i;
    }

    /**
     * 通过主键查询
     * @param id 二维码id
     * @return
     */
    public Qrcode selectByPrimaryKey(String id){
       Qrcode qrcode = this.qrcodeMapper.selectByPrimaryKey(id);
       long scantimes = qrcode.getScanTimes() + 1L; //扫描一次加一
       Qrcode qrC = new Qrcode();
       qrC.setId(id); //设置ID
       qrC.setScanTimes(scantimes);//设置扫描次数
       qrC.setDeleteFlage("1"); //失效就设置为已删除状态
       this.updateByPrimaryKeySelective(qrC);
       return this.qrcodeMapper.selectByPrimaryKey(id);
    }

    /**
     * 依据参数对象是否有值进行修改
     * @param qrcode 二维码对象
     * @return
     */
    public int updateByPrimaryKeySelective(Qrcode qrcode){

        return this.qrcodeMapper.updateByPrimaryKeySelective(qrcode);
    }

    /**
     * 通过id修改删除状态
     * @param id 二维码id
     * @param delflage 删除标志：0:未删除，1：删除
     * @return
     */
    public int deletVirtual(String id,String delflage){
        return this.qrcodeMapper.deletVirtual(id,delflage);
    }

    /**
     * 查询数据量
     * @return
     */
    public int getCount(Qrcode qrcode){
        return this.qrcodeMapper.getCount(qrcode);
    }

    /**
     * 分页查询
     * @param qrcode 二维码对象
     * @param currentPage 页码
     * @param pageSize 每页数
     * @return
     */
    public ResultModel findListByPage(Qrcode qrcode,int currentPage,int pageSize){

        //设置分页信息，分别是当前页数和每页显示的总记录数
        PageHelper.startPage(currentPage, pageSize);

        int countNums = this.getCount(qrcode);              //总记录数
        List<Qrcode> allQrcode = this.qrcodeMapper.findListByPage(qrcode);        //全部基础数据
        ResultModel pageData = new ResultModel(currentPage, pageSize, countNums);
        pageData.setData(allQrcode);
        return pageData;
    }

    /**
     * 查询所有数据
     * @return
     */
    public List<Qrcode> findList(){
        return this.qrcodeMapper.findList();
    }
}
