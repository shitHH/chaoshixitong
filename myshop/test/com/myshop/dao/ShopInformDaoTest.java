package com.myshop.dao;

import com.myshop.bean.ShopInform;
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
 * 门店信息的测试类
 */
public class ShopInformDaoTest {
    private ShopInformDao shopInformDao;

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
        shopInformDao = session.getMapper(ShopInformDao.class);


    }
@Test
public void test_findByWid(){
        ShopInform shopInform =shopInformDao.findByWid(2);

    System.out.println(shopInform.getsName()+shopInform.getName());
}


    @Test
    public void test_findAll() {
        List<ShopInform> list = shopInformDao.findAll();
        System.out.println(list);
        if (list != null) {
            for (ShopInform shopInform : list) {
                System.out.println(shopInform.getId() + "\t" + shopInform.getsName() + "\t" + shopInform.getsAddr() + "\t" + shopInform.getName() + "\t" + shopInform.getWid());
            }
        }
    }

}
