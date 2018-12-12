package com.cn.interfacedocument.Util;

import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

public class Base64Util {


    /**
     * BASE64解密
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }


    public static String decryptBASE64ToString(String key){
        byte[] bytes;
        try{
            bytes = (new BASE64Decoder()).decodeBuffer(key);
            return new String(bytes);
        }catch (Exception e){
            return "";
        }

    }

    /**
     * BASE64加密
     * @param key
     * @return
     * @throws Exception
     */
    public static String encryptBASE64(byte[] key) throws Exception {
        return (new BASE64Encoder()).encodeBuffer(key);
    }


    /**
     * 将Base64位的图片解码后转换问文件对象
     * @param base64
     * @return
     */
    public static MultipartFile base64ToMultipart(String base64) {
        try {
            String[] baseStrs = base64.split(",");

            BASE64Decoder decoder = new BASE64Decoder();
            byte[] b = new byte[0];
            b = decoder.decodeBuffer(baseStrs[1]);

            for(int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {
                    b[i] += 256;
                }
            }

            return new BASE64DecodedMultipartFile(b, baseStrs[0]);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws Exception
    {
        String para = "4722";
        String data = Base64Util.encryptBASE64(para.getBytes());
        System.out.println("加密前："+data);

        byte[] byteArray = Base64Util.decryptBASE64("MTIwNg==");
        System.out.println("解密后："+Base64Util.decryptBASE64ToString("MTIwNg=="));
    }
}
