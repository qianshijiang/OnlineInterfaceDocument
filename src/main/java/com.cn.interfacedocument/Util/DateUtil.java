package com.cn.interfacedocument.Util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间处理工具类
 * Created by QSJ on 2018/4/25.
 */
public class DateUtil {

    /**
     * 时间戳转换成日期格式字符串
     * @param seconds 精确到秒的字符串
     * @param format
     * @return
     */
    public static String timeStamp2Date(String seconds,String format) {
        if(seconds == null || seconds.isEmpty() || seconds.equals("null")){
            return "";
        }
        if(format == null || format.isEmpty()){
            format = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(Long.valueOf(seconds+"000")));
    }
    /**
     * 日期格式字符串转换成时间戳
     * @param date_str 字符串日期
     * @param format 如：yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static Timestamp date2TimeStamp(String date_str, String format){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Date date = sdf.parse(date_str);
            long rs = date.getTime();
            String result = sdf.format(rs);
            return Timestamp.valueOf(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 取得当前时间戳（精确到秒）
     * @return
     */
    public static String timeStamp(){
        long time = System.currentTimeMillis();
        String t = String.valueOf(time/1000);
        return t;
    }

    /**
     * 获取某年第一天日期
     * @param year 年份
     * @return Date
     */
    public static java.sql.Date getYearFirst(String year) throws Exception{
        String years = "";
        if(year.length()==4){
            years = year + "-01" + "-01";
        } else{
            years = year;
        }
        return java.sql.Date.valueOf(years);
    }

    /**
     * 返回当前系统时间
     * @param format 时间格式
     * @return
     * @throws Exception
     */
    public static Date getInDate(String format) throws Exception{
        SimpleDateFormat simple = new SimpleDateFormat(format);
        Date date = new Date();
        String res = simple.format(date);
        return simple.parse(res);
    }

    /**
     * 返回当前系统的时间戳
     * @param format
     * @return
     * @throws Exception
     */
    public static Timestamp getInTimestam(String format) throws Exception{
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Date date = new Date();
            long rs = date.getTime();
            String result = sdf.format(rs);
            return Timestamp.valueOf(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将字符串日期转换为Date
     * @param date 字符串日期
     * @param format 格式
     * @return
     */
    public static Date getStrtoDate(String date,String format) throws Exception{
        SimpleDateFormat simple = new SimpleDateFormat(format);
        if(date==null || "".equals(date)){
            Date nowdate = new Date();
            String res = simple.format(nowdate);
            return simple.parse(res);
        }else{
            return simple.parse(date);
        }
    }
}
