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
import java.util.List;

/**
 * @author 赵岗刚
 * 商品列表控制器
 *
 * */
    @WebServlet("/goodslist.action")
public class GoodsListAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑
        GoodsService goodsService=new GoodsServiceImpl();
        List<Goods> list =goodsService.findAll();
        System.out.println(list);
        //创建session对象
        HttpSession session=req.getSession();
        //将用户列表放入到session中
        session.setAttribute("list",list);
        //转发到商品列表页面
        req.getRequestDispatcher("goodslist.jsp").forward(req,resp);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
