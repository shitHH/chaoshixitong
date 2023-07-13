package com.myshop.dao;

import com.myshop.bean.Login;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class LoginDaoTest {
  LoginDao loginDao;
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
        loginDao=session.getMapper( LoginDao.class);
    }

    @Test
    public void test_find(){
        Login login=loginDao.find("徐飞","666");
        System.out.println(login);
        System.out.println(login.getwId()+"\t"+login.getUserName()+"\t"+login.getPassWord());

    }

    @Test
    public void test_findAll(){
        List<Login>list= loginDao.findAll();
        System.out.println(list);
        if (list!=null){
            for (Login obj:list) {
                System.out.println(obj.getSex()+"\t"+obj.getwId()+"\t"+obj.getPosition()+"\t"+obj.getUserName());
            }
        }
    }
    @Test
    public void test_findById(){
        Login login=loginDao.findById(1);
        System.out.println(login);
        System.out.println(login.getSex()+"\t"+login.getUserName()+"\t"+login.getPosition()+"\t"+login.getwId());
            }

    @Test
    public void test_addEmp(){
      Login login=new Login();
      login.setwId(10);
       login.setPosition("dianzhang1");
       login.setSex('男');
       login.setUserName("laaa");
       loginDao.addEmp(login);
       test_findAll();
    }
    @Test
    public void test_deleteEmp(){
       test_findAll();
     loginDao.deleteEmp(10);
        test_findAll();
    }
    @Test
    public void test_updateEmp(){
        test_findAll();
        Login login=new Login();
        login.setwId(1);
        login.setPosition("dianzhang1");
        login.setSex('男');
        login.setUserName("laaa");
        loginDao.updateEmp(login);
        test_findAll();


    }
}
