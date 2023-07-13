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

@WebServlet("/orderlistdelete.action")
public class OrderListDeleteAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        OrderService orderService = new OrderServiceImpl();

        List<Order> list = orderService.findAll2();
//        通过request获得session对象
        HttpSession session =  req.getSession();
        session.setAttribute("orderlistdelete", list);
        req.getRequestDispatcher("orderdelete.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
