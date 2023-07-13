package com.myshop.service;

import com.myshop.bean.ShopManager;
import com.myshop.service.impl.ShopManagerServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author 魏范彬
 * 店长信息业务逻辑测试
 */
public class ShopManagerServiceTest {

    //创建业务逻辑对象
    ShopManagerService shopManagerService;
    @Before
    public void create(){
        shopManagerService=new ShopManagerServiceImpl();
    }

    @Test
    public void test_findAll(){
        List<ShopManager> list=shopManagerService.findAll();
        if(list!=null){
            for(ShopManager shopManager:list){
                System.out.println(shopManager.getWid());
                System.out.println(shopManager.getUserName());
                System.out.println(shopManager.getSex());
                System.out.println(shopManager.getTel());
                System.out.println(shopManager.getAddr());
                System.out.println("=====================================");
            }

        }
    }

    @Test
    public void test_findByUserName(){
        ShopManager shopManager=shopManagerService.findByUserName("贠一凡");
        System.out.println(shopManager);
    }


}
