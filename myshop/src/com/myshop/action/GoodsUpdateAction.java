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

/**
 * @author 赵岗刚
 * 更新展示控制器
 */
@WebServlet("/goodsupdate.action")
public class GoodsUpdateAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //创建业务逻辑对象
        GoodsService goodsService = new GoodsServiceImpl();
        //创建session对象
        HttpSession session = req.getSession();
        Object obj = session.getAttribute("cId");
        System.out.println(obj);
        int id=(int)obj;
        System.out.println("==================");
        //通过request得到用户输入的cid
        String name = req.getParameter("name");
        String tId = req.getParameter("tId");
        String place = req.getParameter("place");
        String supplie = req.getParameter("supplie");
        String prodateStr = req.getParameter("prodate");
        String expdate = req.getParameter("expdate");
        String storage = req.getParameter("storage");
        String price = req.getParameter("price");
        String number = req.getParameter("number");
        if (id!=0 || name != null && name != "" || tId != null && tId != "" || place != null && place != "" || prodateStr != null && prodateStr != "" || supplie != null && supplie != "" || expdate != null && expdate != "" || storage != null && storage != "" || price != null && price != "" || number != null && number != "") {
            Goods goods = goodsService.findById(id);
            goods.setName(name);
            int tId1 = Integer.valueOf(tId);
            goods.settId(tId1);
            goods.setPlace(place);
            goods.setSupplie(supplie);
            Date prodate = DateUtil.getDate(prodateStr);
            goods.setProdate(prodate);
            goods.setExpdate(expdate);
            goods.setStorage(storage);
            double price1 = Double.valueOf(price);
            goods.setPrice(price1);
            int number1 = Integer.valueOf(number);
            goods.setNumber(number1);
            boolean flag = goodsService.updateEmp(goods);
            if (flag) {
                //重定向到新展示控制器
                req.getRequestDispatcher("goodsupdateshow.action").forward(req, resp);
            } else {
                //转发到错误页面
                req.setAttribute("message", "更新失败");
                req.getRequestDispatcher("error.jsp").forward(req, resp);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
