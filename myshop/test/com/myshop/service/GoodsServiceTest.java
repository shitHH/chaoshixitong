package com.myshop.service;

import com.myshop.bean.Goods;
import com.myshop.service.impl.GoodsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @author 赵岗刚
 * 仓库商品业务逻辑测试
 */
public class GoodsServiceTest {
    GoodsService goodsService;
    @Before
    public void create()  {
        goodsService=new GoodsServiceImpl();
    }
    @Test
    public void test_findAll(){
        List<Goods> list=goodsService.findAll();
        System.out.println(list.size());
        if(list!=null){
            for(Goods goods:list){
                System.out.println(goods.getcId());
                System.out.println(goods.getName());
                System.out.println(goods.gettId());
                System.out.println(goods.getPlace());
                System.out.println(goods.getSupplie());
                System.out.println(goods.getProdate());
                System.out.println(goods.getExpdate());
                System.out.println(goods.getStorage());
                System.out.println(goods.getPrice());
                System.out.println(goods.getNumber());
                System.out.println("========================");
            }
        }
    }
    @Test
    public void test_findById(){
        Goods goods=goodsService.findById(32131);
        System.out.println(goods);
        System.out.println(goods.getcId());
        System.out.println(goods.getName());
        System.out.println(goods.gettId());
        System.out.println(goods.getPlace());
        System.out.println(goods.getSupplie());
        System.out.println(goods.getProdate());
        System.out.println(goods.getExpdate());
        System.out.println(goods.getStorage());
        System.out.println(goods.getPrice());
        System.out.println(goods.getNumber());
        System.out.println("========================");
    }
    @Test
    public void test_addEmp(){
        Goods goods=new Goods();
        goods.setName("haiui");
        goods.setcId(1);
        goods.setPrice(20.20);
        goodsService.addEmp(goods);
        test_findAll();
    }
    @Test
    public void test_deleteEmp(){
        test_findAll();
        goodsService.deleteEmp(1);
        test_findAll();
    }
    @Test
    public void test_updateEmp(){
        test_findAll();
        Goods goods= goodsService.findById(32131);
        goods.setName("百事");
        goodsService.updateEmp(goods);
        test_findAll();
    }

}



