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
*@auther 张向东
*登录控制器
*/
@WebServlet("/login.action")
public class LoginAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入登录权限控制");
        //创建业务逻辑对象
        LoginService loginService=new LoginServiceImpl();
        String userName=req.getParameter("userName");
        String passWord=req.getParameter("passWord");
        System.out.println(userName);
        System.out.println(passWord);
        //将用户信息传递给业务逻辑的具体方法，并得到返回值结果
        Login login=loginService.find(userName,passWord);
        System.out.println(login);
        //根据返回值结果响应
        if (login!=null){
            //如果用户登录成功，将用户信息存放在session中
            HttpSession session=req.getSession();
            session.setAttribute("currentLogin",login);
            if (login.getwId()==1){
                //重定向到门店首页
                resp.sendRedirect("md_shouye.jsp");
            }else if (login.getwId()==2){
                //仓库界面
                resp.sendRedirect("goodshome.jsp");
            }else if(login.getwId()==3){
                //订单界面
                resp.sendRedirect("order.jsp");
            }
        }else{
            //如果失败，跳转回登录界面
            req.setAttribute("message","用户名或密码错误");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
