package com.myshop.dao;

import com.myshop.bean.ShopSort;
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
 * 商品大类表的测试
 */
public class ShopSortTest {

    private ShopSortDao shopSortDao;

    @Before
    public void create() throws IOException {
        //1获取当前Mybatis总的配置文件路径
        String resource = "configuration.xml";
        //2获取当前文件得输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //3通过流对象创建一个SessionFactory对象，数据库会话工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //4根据会话工厂得到SqlSession对象，true表示自动提交
        SqlSession session = sessionFactory.openSession(true);
        //5通过session对象的动态代理，创建接口对象
        shopSortDao = session.getMapper(ShopSortDao.class);


    }

    @Test
    public void test_saveInfo() {
        test_findAll();
        ShopSort shopSort = new ShopSort();
        shopSort.setSortId(1005);
        shopSort.setsName("米面粮油");
        shopSort.setSortNum(500);
        shopSortDao.saveInfo(shopSort);
        test_findAll();

    }

    @Test
    public void test_findAll() {
        List<ShopSort> list = shopSortDao.findAll();
        System.out.println(list);
        if (list != null) {
            for (ShopSort shopSort : list) {
                System.out.println(shopSort.getSortId() + "\t" + shopSort.getsName() + "\t" + shopSort.getSortNum());
            }
        }


    }
}
