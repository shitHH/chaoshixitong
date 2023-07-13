package com.myshop.action;

import com.myshop.bean.Goods;
import com.myshop.service.GoodsService;
import com.myshop.service.impl.GoodsServiceImpl;
import com.myshop.util.ClibrationUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author 赵岗刚
 * 通过cId查询
 */
@WebServlet("/findbycid.action")
public class GoodsFindByCid extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //创建业务逻辑对象
        GoodsService goodsService=new GoodsServiceImpl();
        //通过request得到用户输入的id
        String idstr=req.getParameter("cId");
        boolean flag= ClibrationUtil.getClibration(idstr);
        System.out.println(flag);
        if (flag){
            int cId=Integer.valueOf(idstr);
            Goods goods=goodsService.findById(cId);
            //创建session对象
            HttpSession session=req.getSession();
            //将对象放入到session
            session.setAttribute("findbycid",goods);
            //转发到通过cid查询展示页面
            req.getRequestDispatcher("goodsfindbycidlist.jsp").forward(req,resp);
        }else{
            //转发到通过cid查询页面
            req.getRequestDispatcher("goodsfindbycid.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
