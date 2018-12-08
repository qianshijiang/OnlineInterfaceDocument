package com.cn.interfacedocument.qrcode.productQrCode;

import com.cn.interfacedocument.Util.MD5Util;
import com.cn.interfacedocument.qrcode.util.FileWriteUtil;
import com.cn.interfacedocument.qrcode.wrapper.QrCodeGenWrapper;
import com.cn.interfacedocument.qrcode.wrapper.QrCodeOptions;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/**
 * 批量生成二维码
 * Created by QSJ on 2018/12/7.
 */
public class BashPrcQrCode {

    /**
     * 生成二维码的数量
     */
    private static final Integer count = 100;
    /**
     * 二维码携带的前缀信息
     */
    private static String message = "https:www.baidu.com";

    private static final Logger log = LoggerFactory.getLogger(BashPrcQrCode.class);

    /**
     * 批量生成普通二维码
     */
    public static void BashPrcCommonQrCode(String msg,Integer count){
        try{
            String mesg = "";
            for(int i=0;i<=count;i++){
                mesg = msg + "&QrcodrId=" + MD5Util.kLCode(MD5Util.md5Encode(String.valueOf(i)));
                boolean ans = QrCodeGenWrapper.of(mesg).asFile("E:/QrCode/common/qrcode/"+i+".png");
                System.out.println(ans);
            }
        }catch (Exception e){
            e.printStackTrace();
            log.info(e.toString());
        }
    }
    /**
     *  批量生成红色的二维码 300x300, 无边框
     */
    public static void BashPrcRedQrCode(String msg,Integer count){
        try{
            String mesg = "";
            for(int i=0;i<=count;i++){
                mesg = msg + "&QrcodrId=" + MD5Util.kLCode(MD5Util.md5Encode(String.valueOf(i)));
                boolean ans = QrCodeGenWrapper.of(mesg)
                        .setW(300)
                        .setDrawPreColor(0xffff0000)
                        .setDrawBgColor(0xffffffff)
                        .setPadding(0)
                        .asFile("E:/QrCode/redRecode/qrcode/"+i+".png");
                System.out.println(ans);
            }

        }catch (Exception e){
            e.printStackTrace();
            log.info(e.toString());
        }
    }

    /**
     * 批量生成带logo的二维码
     * @param msg 二维码信息
     * @param count 生成的数量
     */
    public static void BashPrcLogoQrCode(String msg,Integer count){
        try{
            String mesg = "";
            String logo = "https://static.oschina.net/uploads/user/283/566591_100.jpeg";
            for(int i=0;i<=count;i++) {
                mesg = msg + "&QrcodrId=" + MD5Util.kLCode(MD5Util.md5Encode(String.valueOf(i)));
                boolean ans = QrCodeGenWrapper.of(mesg)
                        .setW(300)
                        .setDrawPreColor(0xffff0000)
                        .setDrawBgColor(0xffffffff)
                        .setPadding(0)
                        .setLogo(logo)
                        .setLogoBgColor(0xff808080)
                        .setLogoBorder(true)
                        .asFile("E:/QrCode/logoQrCode/qrcode/"+i+".png");
                System.out.println(ans);
            }
        }catch (Exception e){
            e.printStackTrace();
            log.info(e.toString());
        }
    }

    /**
     * 根据本地文件生成二维码
     * @param msg 二维码信息
     * @param count 生成二维码的数量
     */
    public static void BashLocalQrcode(String msg,Integer count){
        try{
            String mesg = "";
            String logo = "logo.jpg";
            for(int i=0;i<=count;i++) {
                mesg = msg + "&QrcodrId=" + MD5Util.kLCode(MD5Util.md5Encode(String.valueOf(i)));
                boolean ans = QrCodeGenWrapper.of(mesg)
                        .setW(300)
                        .setDrawPreColor(0xffff0000)
                        .setDrawBgColor(0xffffffff)
                        .setPadding(0)
                        .setLogo(logo)
                        .setLogoStyle(QrCodeOptions.LogoStyle.ROUND)
                        .setLogoBgColor(0xff00ff00)
                        .setLogoBorder(true)
                        .asFile("E:/QrCode/localQrCode/qrcode/"+i+".png");
                System.out.println(ans);
            }
        }catch (Exception e){
            e.printStackTrace();
            log.info(e.toString());
        }
    }

    /**
     *  根据本地文件生成带logo的二维码，无边框， 重新着色位置探测图像， 设置背景
     * @param msg 二维码信息
     * @param count 生成的二维码数量
     */
    public static void BashLocalLogoQrcode(String msg,Integer count){
        try {
            String mesg = "";
            String logo = "logo.jpg";
            String bg = "bg.png";
            for(int i=0;i<=count;i++) {
                mesg = msg + "&QrcodrId=" + MD5Util.kLCode(MD5Util.md5Encode(String.valueOf(i)));
                boolean ans = QrCodeGenWrapper.of(mesg)
                        .setW(300)
                        .setDrawPreColor(0xff0000ff)
                        .setDrawBgColor(0xffffffff)
                        .setDetectOutColor(0xff00FF00)
                        .setDetectInColor(0xffff0000)
                        .setPadding(1)
                        .setLogo(logo)
                        .setLogoRate(12)
                        .setLogoStyle(QrCodeOptions.LogoStyle.ROUND)
                        .setLogoBorder(true)
                        .setLogoBgColor(Color.GREEN)
                        .setBgImg(bg)
                        .setBgOpacity(0.8f)
                        .setBgStyle(QrCodeOptions.BgImgStyle.FILL)
                        .setBgStartX(108)
                        .setBgStartY(40)
                        .asFile("E:/QrCode/locallogoQrCode/qrcode/"+i+".png");
                System.out.println(ans);
            }

        }catch (Exception e){
            e.printStackTrace();
            log.info(e.toString());
        }
    }

    /**
     * 根据本地文件生成待logo的二维码， 重新着色位置探测图像
     * @param msg 二维码信息
     * @param count 生成二维码的数量
     */
    public static void BashColorCode(String msg,Integer count){
        try{
            String mesg = "";
            String logo = "logo.jpg";
            String bg = "bg.png";
            for(int i=0;i<=count;i++) {
                mesg = msg + "&QrcodrId=" + MD5Util.kLCode(MD5Util.md5Encode(String.valueOf(i)));
                BufferedImage img = QrCodeGenWrapper.of(mesg)
                        .setW(500)
                        .setDrawPreColor(0xff002fa7) // 宝石蓝
                        .setDetectOutColor(0xff00ff00)
                        .setDetectInColor(0xffff0000)
                        .setPadding(1)
                        .setErrorCorrection(ErrorCorrectionLevel.H)
                        .setLogo(logo)
                        .setLogoStyle(QrCodeOptions.LogoStyle.ROUND)
                        .setLogoBgColor(0xff00cc00)
                        .setBgImg(bg)
                        .setDrawStyle(QrCodeOptions.DrawStyle.IMAGE.name())
                        .setDrawImg("xhrSize4.jpg")
                        .asBufferedImage();

                File file = new File("E:/QrCode/colorQrCode/qrcode/" + i + ".png");

                FileWriteUtil.mkDir(file);
                boolean ans = ImageIO.write(img, "png", file);
                System.out.println(ans);

                //ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                //ImageIO.write(img, "png", outputStream);
                //String img64 = Base64Util.encode(outputStream);
                //System.out.println("<img src=\"data:image/png;base64," + img64 + "\" />");
            }
        }catch (Exception e){
            e.printStackTrace();
            log.info(e.toString());
        }
    }

    /**
     * 根据本地文件生成待logo的二维码， 重新着色位置探测图像
     * @param msg
     * @param count
     */
    public static void BashStyleCode(String msg,Integer count){
        try{
            String mesg = "";
            String logo = "logo.jpg";
            String bg = "bg.png";
            mesg = msg + "&QrcodrId=" + MD5Util.kLCode(MD5Util.md5Encode(String.valueOf(123456)));
            for (QrCodeOptions.DrawStyle style : QrCodeOptions.DrawStyle.values()) {
                BufferedImage img = QrCodeGenWrapper.of(mesg)
                        .setW(540)
                        .setDrawPreColor(0xff002fa7) // 宝石蓝
                        .setDetectOutColor(0xff0000ff)
                        .setDetectInColor(Color.RED)
                        .setPadding(1)
                        .setErrorCorrection(ErrorCorrectionLevel.H)
                        .setLogo(logo)
                        .setLogoStyle(QrCodeOptions.LogoStyle.ROUND)
                        .setLogoBgColor(0xff00cc00)
                        .setLogoRate(15)
                        .setBgImg(bg)
                        .setBgOpacity(0.93f)
                        .setDrawStyle(style.name())
                        .setDrawImg("xhrBase.jpg")
                        .setDrawEnableScale(true)
                        .asBufferedImage();

                File file = new File("E:/QrCode/styleQrCode/qrcode/" + style.name() + ".png");

                FileWriteUtil.mkDir(file);
                boolean ans = ImageIO.write(img, "png", file);
                System.out.println(ans);
            }

        }catch(Exception e){
            e.printStackTrace();
            log.info(e.toString());
        }
    }

    /**
     *  批量根据本地文件生成待logo的二维码， 重新着色位置探测图像
     * @param msg
     * @param count
     */
    public static void BashStyleCodeV2(String msg,Integer count){
        try{
            String mesg = "";
            String logo = "logo.jpg";
            String bg = "http://bpic.588ku.com/master_pic/00/10/04/8656612a16e2e6a.jpg";
            for(int i=0;i<=count;i++) {
                mesg = msg + "&QrcodrId=" + MD5Util.kLCode(MD5Util.md5Encode(String.valueOf(i)));
                BufferedImage img = QrCodeGenWrapper.of(mesg)
                        .setW(550)
                        .setDrawPreColor(0xff002fa7) // 宝石蓝
                        .setDetectOutColor(0xff0000ff)
                        .setDetectInColor(Color.RED)
                        .setDetectImg("detect.png")
                        .setPadding(1)
                        .setErrorCorrection(ErrorCorrectionLevel.H)
                        .setLogo(logo)
                        .setLogoStyle(QrCodeOptions.LogoStyle.ROUND)
                        .setLogoBgColor(0xff00cc00)
                        .setLogoRate(15)
                        .setDrawStyle(QrCodeOptions.DrawStyle.CIRCLE.name())
                        .setDrawEnableScale(true)
                        .setDrawImg("xhrBase.jpg")
                        .setDrawRow2Img("xhrr2.jpeg")
                        .setDrawCol2Img("xhrc2.jpeg")
                        .setDrawSize4Img("xhrSize4.jpg")
                        .setBgStyle(QrCodeOptions.BgImgStyle.PENETRATE)
                        .setBgOpacity(1.0f)
                        .setBgImg(bg)
                        .setBgStartX(10)
                        .setBgStartY(100)
                        .asBufferedImage();
                File file = new File("E:/QrCode/styleQrCode/qrcode/" + i + ".png");

                FileWriteUtil.mkDir(file);
                boolean ans = ImageIO.write(img, "png", file);
                System.out.println(ans);
            }

        }catch (Exception e){
            e.printStackTrace();
            log.info(e.toString());
        }
    }

    public static void main(String[] args){

       // BashPrcQrCode.BashPrcCommonQrCode(message,count);
        BashPrcQrCode.BashStyleCodeV2(message,count);
    }
}
