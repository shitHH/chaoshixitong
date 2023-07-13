package com.myshop.service;

import com.myshop.bean.Shopdetails;
import com.myshop.service.impl.ShopDetailsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author 贠一凡
 * 商品信息资料业务逻辑层的测试类
 */
public class ShopDetailsServiceTest {

    ShopDetailsService shopDetailsService;

    @Before
    public void creat() {
        shopDetailsService = new ShopDetailsServiceImpl();
    }


//    @Test
//    public void test_update() {
//        Shopdetails shopdetails = new Shopdetails(1002002, 1002, "康师傅", 36);
//        System.out.println(shopDetailsService.update(shopdetails));
//
//
//    }


    @Test
    public void test_findBysid() {
        Shopdetails shopdetails = shopDetailsService.findBySid(1002002);
        System.out.println(shopdetails.getsName());

    }


    @Test
    public void test_findAll() {
        List<Shopdetails> list = shopDetailsService.findAllList();
        System.out.println(list);
        for (Shopdetails shopdetails : list) {
            System.out.println(shopdetails.getSid() + "\t" + shopdetails.getSortId() + "\t" + shopdetails.getsName()
                    + "\t" + shopdetails.getPlace() + "\t" + shopdetails.getSupplie() + "\t" + shopdetails.getProdate() + "\t" + shopdetails.getExpdate() + "\t" + shopdetails.getStorage() + "\t"
                    + shopdetails.getcPrice() + "\t" + shopdetails.getInventory());
        }


    }

}
