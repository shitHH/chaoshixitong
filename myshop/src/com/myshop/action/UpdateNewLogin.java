package com.myshop.action;

import com.myshop.bean.Login;
import com.myshop.service.LoginService;
import com.myshop.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 贠一凡
 * 密码修改控制器
 */
@WebServlet("/mima.action")
public class UpdateNewLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入修改密码界面");
        LoginService loginService = new LoginServiceImpl();
        //得到原来的用户名和密码
        String name = request.getParameter("userName");
        String pass = request.getParameter("passWord");
        String sure = request.getParameter("passSure");
        System.out.println(name);
        System.out.println(pass);
        System.out.println(sure);
        Login login=loginService.find(name,pass);
        if(login==null){
            //查无此人,重定向到修改密码界面
            response.sendRedirect("updatemima.jsp");
        }else{
            //进行更新
            login.setPassWord(sure);
            boolean flag = loginService.updatemima(login);
            if(flag){
                //重定向到登录页面
                response.sendRedirect("login.jsp");
            }else{
                //重定向到修改密码页面
                response.sendRedirect("updatemima.jsp");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
