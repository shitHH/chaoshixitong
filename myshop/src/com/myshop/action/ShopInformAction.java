package com.myshop.action;

import com.myshop.bean.ShopInform;
import com.myshop.service.ShopInformService;
import com.myshop.service.impl.ShopInformServiceImpl;

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
 * 门店信息展示
 */
@WebServlet("/shopinform.action")
public class ShopInformAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        ShopInformService shopInformService=new ShopInformServiceImpl();
        //调用具体的业务逻辑对象，查询出门店集合
        List<ShopInform> list=shopInformService.findAll();
        //创建session对象
        HttpSession session=req.getSession();
        //将集合放入session中
        session.setAttribute("shopinform",list);
        //转发到指定页面
        req.getRequestDispatcher("md_splb.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
