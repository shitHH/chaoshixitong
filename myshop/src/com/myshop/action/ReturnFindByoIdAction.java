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

/**
 * @author 魏范彬
 * 根据订单id查询订单对象
 */
@WebServlet("/returnfindbyoid.action")
public class ReturnFindByoIdAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        ReturnService returnService=new ReturnServiceImpl();
        //获得前端页面的oid
        String oIdStr=req.getParameter("oId");
        //自动拆箱，将字符串转化为int
        int oId=Integer.valueOf(oIdStr);
        //调用业务逻辑的具体方法
        Return ret=returnService.findByOid(oId);
        //通过request获得session对象
        HttpSession session=req.getSession();
        //将集合放入session中
        session.setAttribute("returnfindbyoid",ret);
        //转发到订单详情页面
        req.getRequestDispatcher("returnfindbyoid.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
