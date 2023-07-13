package com.myshop.dao;

import com.myshop.bean.Goods;
import com.myshop.bean.Order;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author xf
 * 订单Dao层数据访问测试类
 */
public class OrderDaoTest {

        OrderDao orderDao;
        GoodsDao goodsDao;

    @Before
    public void createSqlSession() throws IOException {
//          引入配置文件
        String resource = "configuration.xml";
//          创建输入流对象
        InputStream inputStream = Resources.getResourceAsStream(resource);
//          根据输入流创建会话SQLsession工厂类对象进行数据读取
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
        SqlSession sqlSession = sessionFactory.openSession(true);

        orderDao = sqlSession.getMapper(OrderDao.class);
        goodsDao=sqlSession.getMapper(GoodsDao.class);

    }

    @Test
    /**
     * 查询所有订单
     */
    public void test_findAll2() {
        List<Order> list = orderDao.findAll();
        System.out.println(list.size());
        if (list!=null){
            for(Order order:list){
                System.out.println(order.getoId());
                System.out.println(order.getsId());
                System.out.println(order.getoTime());
                System.out.println(order.getCid());
                System.out.println(order.gettId());
                System.out.println(order.getcName());
                System.out.println(order.getcPrice());
                System.out.println(order.getcNum());
                System.out.println(order.getwId());
                System.out.println(order.getState());
                System.out.println("===========================");
            }
        }
    }

    /**
     * 查询仓库所有货物信息
     */
    @Test
    public void test_findAll1() {
        List<Goods> list = goodsDao.findAll();
        if (list != null) {
            for (Goods goods : list) {
                System.out.println(goods);
            }
        }
    }

    /**
     * 通过订单id查询所有的订单货物信息
     */
    @Test
    public void test_findById1() {
        Order order = orderDao.findById1(100001);
        System.out.println(order);
    }


    /**
     * 通过查询店面ID查询该店所有的订单
     */
    @Test
    public void test_findById2() {
        List<Order> list = orderDao.findById2(1);
        if (list != null) {
            for (Order order : list) {
                System.out.println(order);
            }
        }

    }

    /**
     * 通过查询仓库货物ID找到货物详情以及库存
     */
    @Test
    public void test_findById3() {
        Goods goods = goodsDao.findById(1001001);
        System.out.println(goods);
    }

    /**
     * 根据订单号删除订单
     */
    @Test
    public void test_deleteOrder() {
        orderDao.deleteOrder2(100011);
        test_findAll2();
    }

    /**
     * 增加订单信息
     */
    @Test
    public void test_addOrder() {
        Order order = new Order();
        order.setsId(2);
        order.setoTime(new Date());
        order.setCid(1001002);
        order.settId(1001);
        order.setcName("百草味猪肉铺");
        order.setcPrice(9.9);
        order.setcNum(20);
        order.setwId(3);
        int i = orderDao.addOrder(order);
        System.out.println(i);
        test_findAll2();
    }

    /**
     * 更新订单信息
     */
    @Test
    public void test_updateOrder() {
        Order order = orderDao.findById1(100009);
        order.setcPrice(9.9);

        test_findAll2();
    }

}
