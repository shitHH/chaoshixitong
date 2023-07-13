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
 * @author xf
 * 退换货删除订单——获取订单信息控制器
 */
@WebServlet("/returnlistdelete.action")
public class ReturnListDeleteAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ReturnService returnService = new ReturnServiceImpl();
        List<Return> list = returnService.findAllReturn();
        HttpSession session = req.getSession();
        session.setAttribute("returnlistdelete", list);
        req.getRequestDispatcher("returndelete.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
