package com.myshop.action;

import com.myshop.bean.Shopdetails;
import com.myshop.service.ShopDetailsService;
import com.myshop.service.impl.ShopDetailsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author 贠一凡
 * 商品信息一览表的商品资料控制器
 */
@WebServlet("/shopdetails.action")
public class ShopDetailsAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ShopDetailsService shopDetailsService = new ShopDetailsServiceImpl();
        List<Shopdetails> list = shopDetailsService.findAllList();
        System.out.println(list);
        //创建session对象
        HttpSession session = request.getSession();
        //将商品列表放入到session当中
        session.setAttribute("map", list);
        //转发到商品列表当中
        request.getRequestDispatcher("md_spzl.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
