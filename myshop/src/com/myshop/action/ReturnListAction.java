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
 * 订单详情控制器
 */
@WebServlet("/returnlist.action")
public class ReturnListAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建业务逻辑对象
        ReturnService returnService=new ReturnServiceImpl();
        //调用业务逻辑的具体方法
        List<Return> list=returnService.findAllReturn();
        //通过request获得session对象
        HttpSession session=request.getSession();
        //将集合放入session中
        session.setAttribute("returnList",list);
        //转发到订单详情页面
        request.getRequestDispatcher("returnlist.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
