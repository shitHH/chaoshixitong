package com.myshop.action;

import com.myshop.bean.Order;
import com.myshop.service.OrderService;
import com.myshop.service.impl.OrderServiceImpl;
import com.myshop.util.ClibrationUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author xf
 * 订单ID查询订单信息——控制器
 * @version 魏范彬
 * 修改
 */
@WebServlet("/orderfindbyoid.action")
public class OrderFindByoIdAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        OrderService orderService = new OrderServiceImpl();
        //获得前端页面的值
        String oIdStr=req.getParameter("oId");
        boolean flag= ClibrationUtil.getClibration(oIdStr);
        if(flag){
            //自动拆箱，将字符串转换为int类型
            int oId=Integer.valueOf(oIdStr);
            //调用业务逻辑对象的通过订单编号查询订单对象
            Order order=orderService.findById1(oId);
            //获得session对象
            HttpSession session=req.getSession();
            //将对象放入session对象当中
            session.setAttribute("orderfindbyoid",order);
            //将页面转发到查询页面
            req.getRequestDispatcher("orderfindbyoid.jsp").forward(req, resp);
        }else{
            //跳转到错误页面
            req.setAttribute("message","操作失败");
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
