package com.myshop.dao;

import com.myshop.bean.Goods;
import com.myshop.bean.WareHouseOrder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class GoodsDaoTest {
    WareHouseOrderDao wareHouseOrderDao;
    GoodsDao goodsDao=null;
    @Before
    public void create() throws IOException {
    //1获取当前Mybatis总的配置文件路径
    String resource ="configuration.xml";
    //2获取当前文件得输入流
    InputStream inputStream= Resources.getResourceAsStream(resource);
    //3通过流对象创建一个SessionFactory对象，数据库会话工厂
    SqlSessionFactory sessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
    //4根据会话工厂得到SqlSession对象，true表示自动提交
    SqlSession session=sessionFactory.openSession(true);
    //5通过session对象的动态代理，创建接口对象
    goodsDao=session.getMapper(GoodsDao.class);
    wareHouseOrderDao=session.getMapper(WareHouseOrderDao.class);

    }
    @Test
    public void test_findAll1(){
        List<WareHouseOrder> list=wareHouseOrderDao.findAll();
        System.out.println(list.size());
        if(list!=null){
            for(WareHouseOrder who:list){
                System.out.println(who.getId());
                System.out.println(who.getcId());
                System.out.println(who.getcName());
                System.out.println(who.gettId());
                System.out.println(who.getsId());
                System.out.println(who.getoNumber());
                System.out.println(who.getoTime());
                System.out.println("====================================");
            }
        }
    }
    @Test
    public void test_findAll(){
        List<Goods>list= goodsDao.findAll();
        System.out.println(list);
        if (list!=null){
            for (Goods goods:list) {
                System.out.println(goods.getcId()+"\t"+goods.getNumber()+"\t"+goods.getName());
            }
        }


    }
    @Test
    public void test_findById(){
      Goods goods=goodsDao.findById(1001001);
        System.out.println(goods);
        System.out.println(goods.getcId()+"\t"+goods.getNumber()+"\t"+goods.getName());
            }

    @Test
    public void test_addEmp(){
       Goods goods=new Goods();
       goods.setName("haiui");
       goods.setPrice(20.20);
       goods.setcId(1);
       goodsDao.addEmp(goods);
       test_findAll();
    }
    @Test
    public void test_deleteEmp(){
       test_findAll();
       goodsDao.deleteEmp(1);
        test_findAll();
    }
    @Test
    public void test_updateEmp(){
        test_findAll();
        Goods goods=new  Goods();
        goods.setName("百事可乐");
        goodsDao.updateEmp(goods);
        test_findAll();
    }

    @Test
    public void test_findByName(){
        Goods goods=goodsDao.findByName("红富士苹果");
        System.out.println(goods);
    }
}
