package com.myshop.action;

import com.myshop.service.OrderService;
import com.myshop.service.ReturnService;
import com.myshop.service.impl.OrderServiceImpl;
import com.myshop.service.impl.ReturnServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xf
 * 退换货删除订单——根据订单ID删除 控制器
 */
@WebServlet("/deletereturn.action")
public class DeleteReturnAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        创建业务逻辑实现对象
        ReturnService returnService = new ReturnServiceImpl();
//        从前端获取订单的编号
        String oIdStr = req.getParameter("oId");
//        自动拆箱
        int oid = Integer.valueOf(oIdStr);
//        调用具体业务
        Boolean flog = returnService.deleteById(oid);
        System.out.println(flog);
//         业务逻辑判断
        if (flog) {
//            转发到控制器中
            req.getRequestDispatcher("returnlistdelete.action").forward(req, resp);
        } else {
//            转到错误界面
            req.setAttribute("message", "删除失败");
            req.getRequestDispatcher("error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
