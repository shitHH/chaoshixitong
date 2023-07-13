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
import java.io.IOException;
import java.util.Date;

/**
 * @author 赵岗刚
 * 商品添加控制器
 *
 * */
@WebServlet("/goodsadd.action")
public class GoodsAddAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
       GoodsService goodsService=new GoodsServiceImpl();
        String idStr=req.getParameter("cId");
        int id=Integer.valueOf(idStr);
        String name=req.getParameter("name");
        String  Id=req.getParameter("tId");
        int tId=Integer.valueOf(Id);
        String place=req.getParameter("place");
        String prodatestr=req.getParameter("prodate");
        System.out.println(prodatestr);
        Date date= DateUtil.getDate(prodatestr);
        String supplie=req.getParameter("supplie");
        String expdate=req.getParameter( "expdate");
        String storage=req.getParameter("storage");
        String  price=req.getParameter("price");
        double  price1=Double.valueOf(price);
        String number=req.getParameter("number");
        int number1=Integer.valueOf(number);
        //创建Goods对象
        Goods goods=new Goods();
        goods.setcId(id);
        goods.setName(name);
        goods.settId(tId);
        goods.setSupplie(supplie);
        goods.setPlace(place);
        goods.setProdate(date);
        goods.setExpdate(expdate);
        goods.setStorage(storage);
        goods.setPrice(price1);
        goods.setNumber(number1);
        //调用业务逻辑的具体方法，得到返回值对象
        boolean flag=goodsService.addEmp(goods);
        if(flag){
            //转发向到商品展示控制器
            req.getRequestDispatcher("goodslist.action").forward(req,resp);
        }else{
            //转发到错误页面
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
