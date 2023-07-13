package com.myshop.service;

import com.myshop.bean.Goods;
import com.myshop.bean.Order;
import com.myshop.dao.GoodsDao;
import com.myshop.dao.OrderDao;
import com.myshop.service.impl.OrderServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @author xf
 * 订单审批业务测试
 */
public class OrderServiceTest {

    //    创建业务层对象
    OrderService orderService;

    @Before
    public void create() {
        orderService = new OrderServiceImpl();
    }

    //    更新订单信息
    @Test
    public void updateOrder() {
        Order order = orderService.findById1(100009);
        order.setcName("乐事薯片");
        boolean flog = orderService.updateOrder(order);
        System.out.println(flog);
        findAll1();
    }

    //    删除订单信息
    @Test
    public void deleteOrdr() {
        orderService.deleteOrder(100010);
        findAll1();
    }

    //    增加订单信息
    @Test
    public void addOrder() {
        Order order = new Order();
        order.setsId(2);
        order.setoTime(new Date());
        order.setCid(1001002);
        order.settId(1001);
        order.setcName("百草味猪肉铺");
        order.setcPrice(9.9);
        order.setcNum(20);
        order.setwId(3);

        boolean flog = orderService.addOrder(order);
        System.out.println(flog);

        findAll1();
    }

    //      通过id查询出仓库该商品信息及库存
    @Test
    public void findById3() {
        Goods goods = orderService.findById3(1003001);
        System.out.println(goods);
    }

    //      查询仓库所有货物信息
    @Test
    public void findAll() {
        List<Goods> list = orderService.findAll();
        System.out.println(list.size());
        if (list != null) {
            for (Goods goods : list) {
                System.out.println(goods.getName());
                System.out.println(goods.getNumber());
                System.out.println(goods.getPrice());
                System.out.println(goods.getcId());
                System.out.println(goods.getPlace());
                System.out.println(goods.getSupplie());
                System.out.println(goods.getStorage());
                System.out.println(".......................");
            }
        }
    }

    //       通过店面sid查询该店的订单
    @Test
    public void findById2() {
        List<Order> list = orderService.findById2(1);
        System.out.println(list);
    }

    //    查看所有订单
    @Test
    public void findAll1() {
        List<Order> list = orderService.findAll2();
        System.out.println(list.size());
        if (list != null) {
            System.out.println(list);
        }
    }

    //    订单id查询所有的订单货物信息
    @Test
    public void findById1() {
        Order order = orderService.findById1(100001);
        System.out.println(order);
    }

    //    根据货物id查看货物信息
    @Test
    public void find_ById3() {
        Goods goods = orderService.findById3(1001001);
        System.out.println(goods.getName());
        System.out.println(goods.getNumber());
        System.out.println(goods.getPrice());
        System.out.println(goods.getcId());
        System.out.println(goods.getPlace());
        System.out.println(goods.getSupplie());
        System.out.println(goods.getStorage());
        System.out.println(".........................");

    }

    //    查看仓库货物信息
    @Test
    public void find_All() {
        List<Goods> list = orderService.findAll();
        System.out.println(list.size());
        if (list != null) {
            for (Goods goods : list) {
                System.out.println(goods.getName());
                System.out.println(goods.getNumber());
                System.out.println(goods.getPrice());
                System.out.println(goods.getcId());
                System.out.println(goods.getPlace());
                System.out.println(goods.getSupplie());
                System.out.println(goods.getStorage());
                System.out.println(".........................");
            }
        }

    }

}
