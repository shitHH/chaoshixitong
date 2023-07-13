package com.myshop.dao;

import com.myshop.bean.Shopdetails;
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
 * 商品信息的测试类
 */
public class ShopdetailsDaoTest {
    private ShopdetailsDao shopdetailsDao;

    @Before
    public void create() throws IOException {
        //将配置文件名称给定一个字符串对象
        String resouces = "configuration.xml";
        //创建输入流对象
        InputStream inputStream = Resources.getResourceAsStream(resouces);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession(true);
        shopdetailsDao = session.getMapper(ShopdetailsDao.class);


    }

    @Test
    public void test_updateinventory() {
        test_findAll();
        Shopdetails sd = shopdetailsDao.findById(1001001);
        sd.setInventory(88);
//        shopdetailsDao.updateinventory(1001001);
        test_findAll();


    }

    @Test
    public void test_findbyid() {
        Shopdetails shopdetails = shopdetailsDao.findById(1001001);
        System.out.println(shopdetails);
    }

    @Test
    public void test_findAll() {
        List<Shopdetails> list = shopdetailsDao.findAll();
        if (list != null) {
            for (Shopdetails shopdetails : list) {
                System.out.println(shopdetails.getSid() + "\t" + shopdetails.getsName() + "\t" + shopdetails.getPlace()+"\t"+shopdetails.getInventory());
            }
        }
    }
}
