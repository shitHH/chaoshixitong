package com.myshop.dao;

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

/**
 * @author 魏范彬
 * 仓库订单数据访问测试
 */
public class WareHouseOrderDaoTest {

    WareHouseOrderDao wareHouseOrderDao;

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
        wareHouseOrderDao=session.getMapper(WareHouseOrderDao.class);
    }

    @Test
    public void test_findAll(){
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

}
