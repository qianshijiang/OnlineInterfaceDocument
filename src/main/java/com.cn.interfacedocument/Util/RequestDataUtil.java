package com.cn.interfacedocument.Util;

import net.sf.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 前端提交json字符串格式数据，Java后端通过自定义方法接收json字符串数据并转换为JsonObject对象
 * Created by QSJ on 2018/12/15.
 */
public class RequestDataUtil {

    public static JSONObject getRequestJsonObj(HttpServletRequest request) {
        InputStreamReader reader = null;
        InputStream in = null;
        String requsetSb = "";
        StringBuffer sb = new StringBuffer();
        try {
            in = request.getInputStream();
            reader = new InputStreamReader(in, "UTF-8");
            char[] buffer = new char[1024];
            int len;
            while ((len = reader.read(buffer)) > 0) {
                sb.append(buffer, 0, len);
            }
            //System.out.println("请求信息:" + sb.toString());
            requsetSb = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        JSONObject jsobj = JSONObject.fromObject(requsetSb.toString());
        return jsobj;
    }

    public static Object getRequestJsonObj(HttpServletRequest request, Class clazz) {
        JSONObject jsonObject = getRequestJsonObj(request);
        Object obj = JSONObject.toBean(jsonObject, clazz);
        return obj;
    }

}
