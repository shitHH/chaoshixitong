package com.myshop.action;

import com.myshop.bean.Order;
import com.myshop.service.OrderService;
import com.myshop.service.impl.OrderServiceImpl;

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
 * 商品发货展示控制器
 */
@WebServlet("/housedeliver.action")
public class HouseDelicerAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        OrderService orderService=new OrderServiceImpl();
        //调用业务逻辑的具体方法
        List<Order> list=orderService.findByState("审核通过");
        //创建session对象
        HttpSession session=req.getSession();
        //将集合放入对象中
        session.setAttribute("housedeliver",list);
        //跳转到当前页面
        req.getRequestDispatcher("housedeliver.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
