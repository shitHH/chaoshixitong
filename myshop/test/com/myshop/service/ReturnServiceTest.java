package com.myshop.service;

import com.myshop.bean.Goods;
import com.myshop.bean.Return;
import com.myshop.service.impl.ReturnServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @author 魏范彬
 * 退换货业务逻辑测试
 */
public class ReturnServiceTest {

    ReturnService returnService;
    @Before
    public void create()  {
        returnService=new ReturnServiceImpl();
    }

    @Test
    public void test_findAll(){
        List<Goods> list=returnService.findAll();
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
    public void test_findAllReturn(){
        List<Return> list=returnService.findAllReturn();
        System.out.println(list.size());
    }
    @Test
    public void test_findByOid(){
        Return return1=returnService.findByOid(100002);
        System.out.println(return1);

    }

    @Test
    public void test_findOrders(){
        List<Return> list=returnService.findOrders("退货");
        System.out.println(list.size());
        if(list!=null){
            for (Return rn:list){
                System.out.println(rn.getoId());
                System.out.println(rn.getcId());
                System.out.println(rn.gettId());
                System.out.println(rn.getName());
                System.out.println(rn.getOrders());
                System.out.println("====================================");
            }
        }

    }


    @Test
    public void test_findBySid(){
        List<Return> list=returnService.findBySid(1);
        System.out.println(list.size());
        if(list!=null){
            for (Return rn:list){
                System.out.println(rn.getoId());
                System.out.println(rn.getcId());
                System.out.println(rn.gettId());
                System.out.println(rn.getName());
                System.out.println(rn.getOrders());
                System.out.println("====================================");
            }
        }
    }


    @Test
    public void test_save(){
        Return rn=new Return();
        rn.setsId(1);
        rn.setoTime(new Date());
        rn.setcId(1003001);
        rn.settId(1003);
        rn.setName("红富士苹果");
        rn.setPrice(15);
        rn.setoNumber(50);
        rn.setOrders("退货");
        rn.setReason("坏了");
        rn.setwId(3);

        boolean flag=returnService.save(rn);
        System.out.println(flag);

        test_findOrders();

    }

    @Test
    public void test_update(){
        Return return1=returnService.findByOid(100005);
        return1.setOrders("换货");

        boolean flag=returnService.update(return1);
        System.out.println(flag);

        test_findOrders();

    }

    @Test
    public void test_deleteById(){
        boolean flag=returnService.deleteById(100005);
        System.out.println(flag);
        test_findAll();

    }





}
