package com.myshop.action;

import com.myshop.bean.Return;
import com.myshop.service.ReturnService;
import com.myshop.service.impl.ReturnServiceImpl;

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
 * 退换货订单展示控制器
 */
@WebServlet("/housereturndeliver.action")
public class HouseReturnDeliverAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        ReturnService returnService=new ReturnServiceImpl();
        //调用业务逻辑的具体方法
        List<Return> list=returnService.findByState("审核通过");
        //创建session对象
        HttpSession session=req.getSession();
        //将集合放入对象中
        session.setAttribute("housereturndeliver",list);
        //跳转到当前页面
        req.getRequestDispatcher("housereturndeliver.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
