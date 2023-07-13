package com.myshop.dao;

import com.myshop.bean.ShopCommodity;
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
 * 门店商品信息表的测试类
 */
public class ShopCommodityDaoTest {
    private ShopCommodityDao shopCommodityDao;

    @Before
    public void create() throws IOException {


        //将配置文件名称给定一个字符串对象
        String resouces = "configuration.xml";
        //创建输入流对象
        InputStream inputStream = Resources.getResourceAsStream(resouces);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession(true);
        shopCommodityDao = session.getMapper(ShopCommodityDao.class);


    }

    @Test
    public void test_findById() {
    List<ShopCommodity> list =shopCommodityDao.findById(2);
        System.out.println(list);
        if (list!=null){
            for (ShopCommodity shopCommodity:list) {
                System.out.println(shopCommodity.getsName());
            }
        }
    }

    @Test
    public void test_findAll() {

        List<ShopCommodity> list = shopCommodityDao.findAll();
        System.out.println(list);
        if (list != null) {
            //for循环遍历
            for (ShopCommodity shopC : list) {
                System.out.println(shopC.getSid() + "\t" + shopC.getsName() + "\t" + shopC.getSortId() + "\t" + shopC.getNumber() + "\t" + shopC.getId());
            }
        }


    }
}
