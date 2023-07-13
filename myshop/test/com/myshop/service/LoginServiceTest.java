package com.myshop.service;

import com.myshop.bean.Login;
import com.myshop.service.impl.LoginServiceImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 张向东
 * 用户登录业务逻辑接口实现测试
 */
public class LoginServiceTest {
    //创建对象
    LoginService loginService=null;
    @Before
    public void create(){
        loginService=new LoginServiceImpl();
    }
    @Test
    public void test_find(){
        Login login=loginService.find("贠一凡","666");
        System.out.println(login);
        System.out.println(login.getwId()+"\t"+login.getUserName()+"\t"+login.getPassWord());
    }
}
