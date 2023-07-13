package com.myshop.dao;

import com.myshop.bean.Return;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author 魏范彬
 * 退换货订单的数据访问测试
 */
public class ReturnDaoTest {
    ReturnDao returnDao;
    @Before
    public void create() throws IOException {
        //以字符串的形式得到配置文件的文件名
        String resource="configuration.xml";
        //创建输入流，读取配置文件
        InputStream inputStream= Resources.getResourceAsStream(resource);
        //根据输入流创建SqlSessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        //根据工厂对象，开启会话
        SqlSession session=sqlSessionFactory.openSession(true);
        //创建接口实例化对象
        returnDao=session.getMapper(ReturnDao.class);
    }

    @Test
    public void test_findAll(){
        List<Return> list=returnDao.findAll();
        System.out.println(list.size());

    }

    @Test
    public void test_findByOid(){
        Return return1=returnDao.findByOid(100002);
        System.out.println(return1);

    }

    @Test
    public void test_findOrders(){
        List<Return> list=returnDao.findOrders("退货");
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
        List<Return> list=returnDao.findBySid(1);
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
        rn.setsId(2);
        rn.setoTime(new Date());
        rn.setcId(1003001);
        rn.settId(1003);
        rn.setName("红富士苹果");
        rn.setPrice(15);
        rn.setoNumber(50);
        rn.setOrders("退货");
        rn.setReason("坏了");
        rn.setwId(3);

        int i=returnDao.save(rn);
        System.out.println(i);

        test_findOrders();

    }

    @Test
    public void test_update(){
        Return return1=returnDao.findByOid(100004);
        return1.setOrders("换货");
        /*int i=returnDao.update(return1);
        System.out.println(i);
*/
        test_findOrders();

    }

    @Test
    public void test_deleteById(){
        int i=returnDao.deleteById(100003);
        System.out.println(i);
        test_findAll();

    }








}
