package com.myshop.util;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 赵岗刚
 * sqlsession工具类
 */
public class SqlSessionUtil {
    public static SqlSession getSession() {
        SqlSession session=null;
        try {
            //以字符串的形式得到配置文件的文件名
            String resource="configuration.xml";
            //创建输入流，读取配置文件
            InputStream inputStream= Resources.getResourceAsStream(resource);
            //根据输入流创建SqlSessionFactory工厂对象
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            //根据输入流，开启会话
            session =sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return session;
    }

}
