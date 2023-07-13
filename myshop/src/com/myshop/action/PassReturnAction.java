package com.myshop.action;

import com.myshop.bean.Return;
import com.myshop.service.ReturnService;
import com.myshop.service.impl.ReturnServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 魏范彬
 * 退换货订单的通过控制器
 */
@WebServlet("/passreturn.action")
public class PassReturnAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        ReturnService returnService=new ReturnServiceImpl();
        //获得前端页面的订单编号oId
        String oIdStr=req.getParameter("oId");
        if(oIdStr!=null){
            //自动拆箱
            int oId=Integer.valueOf(oIdStr);
            //调用具体的业务逻辑对象
            Return ret =returnService.findByOid(oId);
            ret.setState("审核通过");
            boolean flag=returnService.update(ret);
            System.out.println(flag);
            if(flag){
                //转发到订单控制器
                req.getRequestDispatcher("returnlist.action").forward(req,resp);
            }else{
                //跳转到错误页面
                req.setAttribute("message","操作失败");
                req.getRequestDispatcher("error.jsp").forward(req,resp);
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
