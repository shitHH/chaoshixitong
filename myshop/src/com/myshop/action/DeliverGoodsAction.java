package com.myshop.action;

import com.myshop.bean.Goods;
import com.myshop.bean.Order;
import com.myshop.service.GoodsService;
import com.myshop.service.OrderService;
import com.myshop.service.impl.GoodsServiceImpl;
import com.myshop.service.impl.OrderServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 魏范彬
 * 商品发货控制器
 */
@WebServlet("/delivergoods.action")
public class DeliverGoodsAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        OrderService orderServic=new OrderServiceImpl();
        GoodsService goodsService=new GoodsServiceImpl();
        //获得前端页面的oid
        String oIdStr=req.getParameter("oId");
        if(oIdStr!=null){
            int oId=Integer.valueOf(oIdStr);
            //调用业务逻辑的具体方法，通过oId查询出订单对象
            Order order=orderServic.findById1(oId);
            order.setState(order.getState());
            order.setDeliver("已发货");
            boolean flag1=orderServic.updateOrder(order);
            System.out.println(flag1);

            //获取订单对象的中的cid和cNum
            int cId=order.getCid();
            int cNum=order.getcNum();
            //调用业务逻辑的具体方法，通过商品编号cid获得商品对象
            Goods goods=goodsService.findById(cId);
            goods.setNumber(goods.getNumber()-cNum);
            boolean flag2=goodsService.updateEmp(goods);
            if(flag1&&flag2){
                //跳转到当前页面
                req.getRequestDispatcher("housedeliver.action").forward(req,resp);
            }else{
                //跳转到错误页面
                req.setAttribute("message","操作失败");
                req.getRequestDispatcher("error.jsp").forward(req,resp);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
