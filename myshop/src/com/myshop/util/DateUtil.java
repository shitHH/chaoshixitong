package com.myshop.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 魏范彬
 * 将字符串日期转换为Date类型
 */
public class DateUtil {
    public static Date getDate(String str){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}


