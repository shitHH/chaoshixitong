package com.myshop.action;

import com.myshop.service.GoodsService;
import com.myshop.service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 赵岗刚
 * 货物删除展示控制器
 */
@WebServlet("/goodsdeletelist.action")
public class GoodsDeleteAction extends HttpServlet{
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           //创建业务逻辑对象
            GoodsService goodsService=new GoodsServiceImpl();
            //通过request得到用户输入的id
            String idStr=req.getParameter("id");
            System.out.println(idStr);
            if (idStr!=null){
                int id=Integer.valueOf(idStr) ;
                boolean flag=goodsService.deleteEmp(id);
                if (flag){
                    //转发向到货物删除展示控制器
                 req.getRequestDispatcher("goodsdeleteshow.action").forward(req,resp);
                }else{

                    req.setAttribute("message","删除失败");
                    //转发到错误页面
                    req.getRequestDispatcher("error.jsp").forward(req,resp);
                }
            }
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doGet(req, resp);
        }
}
