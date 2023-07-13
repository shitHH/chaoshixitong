package com.myshop.action;

import com.myshop.bean.Goods;
import com.myshop.bean.Order;
import com.myshop.service.OrderService;
import com.myshop.service.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author 张向东
 * 订单申请控制器
 */
@WebServlet("/shoporderapply.action")
public class ShopOrderApplyAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        OrderService orderService=new OrderServiceImpl();
        //页面获得输入申请订单信息
        String sidStr=req.getParameter("sid");
        int sId=Integer.valueOf(sidStr);
        String cname=req.getParameter("cname");
        String number=req.getParameter("number");
        int num=Integer.valueOf(number);
        //调用业务逻辑对象的具体方法，查询商品对象
        Goods goods=orderService.findByName(cname);
        //创建order对象
        Order order=new Order();
        order.setsId(sId);
        order.setoTime(new Date());
        order.setCid(goods.getcId());
        order.settId(goods.gettId());
        order.setcName(cname);
        order.setcPrice(goods.getPrice());
        order.setcNum(num);
        order.setwId(3);
        //调用具体方法，新增订单
        boolean flag = orderService.addOrder(order);
        if(flag){
            //跳转到成功页面
            req.setAttribute("message","申请成功，请耐心等待审核");
            req.getRequestDispatcher("successful.jsp").forward(req,resp);
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
