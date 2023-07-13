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
 * 门店订单查询
 */
@WebServlet("/orderfindbysid.action")
public class OrderFindBysIdAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        OrderService orderService = new OrderServiceImpl();
        //获得前端页面的值
        String sIdStr=req.getParameter("sId");
        //自动拆箱，将字符串转换为int类型
        int sId=Integer.valueOf(sIdStr);
        //调用业务逻辑对象的通过订单编号查询订单对象
        List<Order> list =orderService.findById2(sId);
        //获得session对象
        HttpSession session=req.getSession();
        //将对象放入session对象当中
        session.setAttribute("orderfindbysid",list);
        //将页面转发到查询页面
        req.getRequestDispatcher("orderfindbysid.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
