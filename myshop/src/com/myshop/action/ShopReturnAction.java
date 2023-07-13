package com.myshop.action;

import com.myshop.bean.Return;
import com.myshop.service.ReturnService;
import com.myshop.service.impl.ReturnServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author 魏范彬
 * 门店退换货订单控制器
 */
@WebServlet("/shopreturn.action")
public class
ShopReturnAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        ReturnService returnService=new ReturnServiceImpl();
        //调用业务逻辑的具体方法
        List<Return> list =returnService.findAllReturn();
        //创建session对象
        HttpSession session=req.getSession();
        //将用户列表放入到session中
        session.setAttribute("shopreturnlist",list);
        //转发到用户列表页面中
        req.getRequestDispatcher("shopreturnlist.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
