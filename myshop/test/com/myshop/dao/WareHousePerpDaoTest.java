package com.myshop.dao;

import com.myshop.bean.WareHousePerp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class WareHousePerpDaoTest {
   WareHousePerpDao wareHousePerpDao=null;
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
    wareHousePerpDao=session.getMapper( WareHousePerpDao.class);
    }
    @Test
    public void test_findAll(){
        List<WareHousePerp>list= wareHousePerpDao.findAll();
        System.out.println(list);
        if (list!=null){
            for (WareHousePerp obj:list) {
                System.out.println(obj.getSex()+"\t"+obj.getWid()+"\t"+obj.getAddr()+"\t"+obj.getTel()+obj.getUserName());
            }
        }
    }
    @Test
    public void test_findById(){
        WareHousePerp wareHousePerp =wareHousePerpDao.findById(2);
        System.out.println(wareHousePerp);
        System.out.println(wareHousePerp.getSex()+"\t"+wareHousePerp.getUserName()+"\t"+ wareHousePerp.getAddr()+"\t"+wareHousePerp.getTel());
            }

    @Test
    public void test_addEmp(){
        WareHousePerp wareHousePerp =new WareHousePerp();
        wareHousePerp.setAddr("西安");
        wareHousePerp.setUserName("lisi");
        wareHousePerp.setSex('男');
        wareHousePerp.setTel("888888");
        wareHousePerp.setWid(007);
       wareHousePerpDao.addEmp(wareHousePerp);
       test_findAll();
    }
    @Test
    public void test_deleteEmp(){
       test_findAll();
      wareHousePerpDao.deleteEmp(007);
        test_findAll();
    }
    @Test
    public void test_updateEmp(){
        test_findAll();
        WareHousePerp wareHousePerp =new WareHousePerp();
        wareHousePerp.setAddr("西安");
        wareHousePerp.setUserName("lisi");
        wareHousePerp.setSex('男');
        wareHousePerp.setTel("888888");
        wareHousePerpDao.updateEmp(wareHousePerp);
        test_findAll();
    }
}
