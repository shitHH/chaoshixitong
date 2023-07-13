package com.myshop.service;

import com.myshop.bean.ShopCommodity;
import com.myshop.service.impl.ShopCommodityServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author 贠一凡
 * 商品大类信息表业务逻辑层的测试类
 */
public class ShopCommodityServiceTest {
    //创建业务逻辑层的对象
    ShopCommodityService shopCommodityService;

    @Before
    public void create() {
        //new业务逻辑层的实现类
        shopCommodityService = new ShopCommodityServiceImpl();
    }

    @Test
    public void test_findBySortId() {
        ShopCommodity shopCommodity = shopCommodityService.findBySortId(1001);
        System.out.println(shopCommodity);


    }


    @Test
    public void test_findById() {
        List<ShopCommodity> list = shopCommodityService.findById(1);
        if (list != null) {
            for (ShopCommodity sc : list) {
                System.out.println(sc.getsName() + "\t" + sc.getNumber());
            }
        }
    }


    @Test
    public void test_findBySid() {

        List<ShopCommodity> list = shopCommodityService.findBySid(1001001);
        if (list != null) {
            for (ShopCommodity sc : list) {
                System.out.println(sc.getsName() + "\t" + sc.getId());
            }
        }


    }


    //测试所有信息的集合
    @Test
    public void test_findAll() {
        List<ShopCommodity> list = shopCommodityService.findAll();
        System.out.println(list.size());
        if (list != null) {
            for (ShopCommodity sc : list) {
                System.out.println(sc.getSid() + "\t" + sc.getsName() + "\t" + sc.getSortId() + "\t" + sc.getNumber() + "\t" + sc.getId());
            }
        }


    }


}
