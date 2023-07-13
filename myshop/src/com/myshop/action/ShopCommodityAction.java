package com.myshop.action;

import com.myshop.bean.ShopCommodity;
import com.myshop.service.ShopCommodityService;
import com.myshop.service.impl.ShopCommodityServiceImpl;

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
 * 门店所在商品信息
 */
@WebServlet("/splb.action")
public class ShopCommodityAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         创建业务逻辑的对象
        ShopCommodityService shopCommodityService = new ShopCommodityServiceImpl();
        //调用业务逻辑查询所有的方法
        List<ShopCommodity> list = shopCommodityService.findAll();
        //获得session请求
        HttpSession session = request.getSession();
        //请求发送到session当中
        session.setAttribute("splb", list);
        //转发到详情页面
        request.getRequestDispatcher("md_splb.jsp").forward(request, response);


    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
