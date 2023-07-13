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
 * @author xf
 * 订单业务控制层
 */
@WebServlet("/orderlist.action")
public class OrderListAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建业务逻辑对象
        OrderService orderService=new OrderServiceImpl();
        //调用业务逻辑的具体方法
        List<Order> list=orderService.findAll2();
        //通过request获得session对象
        HttpSession session=request.getSession();
        //将集合放入session中
        session.setAttribute("orderList",list);
        //转发到订单详情页面
        request.getRequestDispatcher("orderlist.jsp").forward(request,response);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
