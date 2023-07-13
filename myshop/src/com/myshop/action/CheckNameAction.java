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
import java.util.List;

/**
 * @author 贠一凡
 * 检查用户名是否存在
 */
@WebServlet("/checkname.action")
public class CheckNameAction extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建业务逻辑的实现
        LoginService loginService = new LoginServiceImpl();

        String Name = request.getParameter("userName");

        boolean flag = loginService.findByName(Name);
        if (flag) {
            response.getWriter().println("NO");
        } else {
            response.getWriter().println("名字存在,可以修改");

        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
