package com.myshop.action;

import com.myshop.util.ClibrationUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 魏范彬
 * 提示框
 */
@WebServlet("/goodsalert.action")
public class GoodsAlertAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过request得到用户输入的id
        String idstr=req.getParameter("cId");
        boolean flag= ClibrationUtil.getClibration(idstr);
        System.out.println(flag);
        if(flag){
            resp.getWriter().print("ok");
        }else{
            resp.getWriter().print("请输入正确的编号");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
