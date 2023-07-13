package com.myshop.util;

/**
 * @author 魏范彬
 * 校准工具
 */
public class ClibrationUtil {
    public static boolean getClibration(String id){
        boolean flag=false;
        if(id!=null&&id!=""){
            char[] chars=id.toCharArray();
            for (char c:chars){
                if(c>=48&&c<=57){
                    flag=true;
                }else{
                    flag=false;
                    break;
                }
            }
            return flag;
        }else{
            return flag;
        }
    }
}
