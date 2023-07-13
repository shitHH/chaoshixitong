package com.myshop.action;

import com.myshop.bean.Goods;
import com.myshop.service.GoodsService;
import com.myshop.service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 魏范彬
 * 通过商品id查询商品对象控制器
 */
@WebServlet("/orderfindbycid.action")
public class OrderFindBycIdAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        GoodsService goodsService=new GoodsServiceImpl();
        //获得前端页面的商品编号cid
        String cIdStr=req.getParameter("cId");
        //自动拆箱，将字符串转换为int
        int cId=Integer.valueOf(cIdStr);
        //调用业务逻辑的具体方法，通过cid查找商品对象
        Goods goods=goodsService.findById(cId);
        //创建session对象
        HttpSession session= req.getSession();
        //将goods对象放入session中
        session.setAttribute("orderfindbycid",goods);
        //转发到详情页面
        req.getRequestDispatcher("orderfindbycid.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
