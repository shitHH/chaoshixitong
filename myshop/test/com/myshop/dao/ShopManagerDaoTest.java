package com.myshop.dao;

import com.myshop.bean.ShopManager;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 贠一凡
 * 店长的信息接口测试类
 */
public class ShopManagerDaoTest {

    private ShopManagerDao shopManagerDao;

    @Before
    public void create() throws IOException {


        //将配置文件名称给定一个字符串对象
        String resouces = "configuration.xml";
        //创建输入流对象
        InputStream inputStream = Resources.getResourceAsStream(resouces);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession(true);
        shopManagerDao = session.getMapper(ShopManagerDao.class);


    }
@Test
public void test_findByUserName(){
        ShopManager shopManager =shopManagerDao.findByUserName("魏范彬");
    System.out.println(shopManager.getWid()+"\t"+shopManager.getTel());
}



    @Test
    public void test_findAll() {
        List<ShopManager> list = shopManagerDao.findAll();
        System.out.println(list);
        if (list != null) {
        }
        for (ShopManager shopManager : list) {
            System.out.println(shopManager.getWid() + "\t" + shopManager.getUserName() + "\t" + shopManager.getSex() + "\t" + shopManager.getTel() + "\t" + shopManager.getAddr());
        }


    }

}
