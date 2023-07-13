package com.myshop.action;

import com.myshop.bean.Shopdetails;
import com.myshop.service.ShopDetailsService;
import com.myshop.service.impl.ShopDetailsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 贠一凡
 * 更新库存信息的控制器
 */
@WebServlet("/shopupdate.action")
public class UpdateInventoryAction extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建业务逻辑对象
        ShopDetailsService shopDetailsService = new ShopDetailsServiceImpl();
        //得到更新的库存
        String strId = request.getParameter("sid");
        String inventoryStr=request.getParameter("inventory");
        System.out.println(strId);
        System.out.println(inventoryStr);
        if (strId != null && strId != "") {
            int sid = Integer.valueOf(strId);
            int inventory=Integer.valueOf(inventoryStr);
            System.out.println(inventory);
            Shopdetails shopdetails=shopDetailsService.findBySid(sid);
            shopdetails.setInventory(inventory);
            boolean flag=shopDetailsService.update(shopdetails);
            if (flag) {
                response.sendRedirect("shopdetails.action");

            } else {
                //转发到错误页面
                request.setAttribute("message", "更新失败");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
