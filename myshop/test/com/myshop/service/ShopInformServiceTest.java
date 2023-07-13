package com.myshop.service;

import com.myshop.bean.ShopInform;
import com.myshop.service.impl.ShopInformServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author 贠一凡
 * 门店信息业务逻辑的实现类测试
 */
public class ShopInformServiceTest {
    //创建业务逻辑层的对象
    ShopInformService shopInformService;

    @Before
    public void create() {
        shopInformService = new ShopInformServiceImpl();

    }

    @Test
    public void  test_findByWid(){
        ShopInform shopInform =shopInformService.findByWid(2);
        System.out.println(shopInform);
    }

    @Test
    public void test_findById() {
        ShopInform shopInform=shopInformService.findById(1);
        System.out.println(shopInform);

    }


    @Test
    public void test_findAll() {
        List<ShopInform> list = shopInformService.findAll();
        System.out.println(list.size());
        if (list != null) {
            for (ShopInform shopInform : list) {
                System.out.println(shopInform.getId());
                System.out.println(shopInform.getsName());
                System.out.println(shopInform.getsAddr());
                System.out.println(shopInform.getWid());
                System.out.println(shopInform.getName());
                System.out.println("--------------------------------------------------");
            }
        }


    }


}
