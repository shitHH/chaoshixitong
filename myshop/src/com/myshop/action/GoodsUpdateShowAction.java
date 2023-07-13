package com.myshop.action;

import com.myshop.bean.Goods;
import com.myshop.service.GoodsService;
import com.myshop.service.impl.GoodsServiceImpl;
import com.myshop.util.DateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author 赵岗刚
 * 删除从控制器
 */
@WebServlet("/goodsupdateshow.action")
public class GoodsUpdateShowAction extends HttpServlet{
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           //创建业务逻辑对象
           GoodsService goodsService=new GoodsServiceImpl();
                List<Goods> list =goodsService.findAll();
                System.out.println(list);
                //创建session对象
                HttpSession session=req.getSession();
                //将商品集合放入到session中
                session.setAttribute("goodsupdateshowlist",list);
                //转发到更新展示页面中
                req.getRequestDispatcher("goodsupdateshowlist.jsp").forward(req,resp);

            }
            @Override
            protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                doGet(req, resp);
            }
}
