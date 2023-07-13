package com.myshop.action;

import com.myshop.bean.Goods;
import com.myshop.bean.Return;
import com.myshop.service.ReturnService;
import com.myshop.service.impl.ReturnServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author 魏范彬
 * 退换货申请控制器
 */
@WebServlet("/shopreturnapply.action")
public class ShopReturnApplyAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        ReturnService returnService=new ReturnServiceImpl();
        //获取退换货申请页面的相关信息
        String name=req.getParameter("name");
        String numberStr=req.getParameter("number");
        String orders=req.getParameter("orders");
        String reason=req.getParameter("reason");
        String sidStr=req.getParameter("sid");
        //调用具体方法
        Goods goods=returnService.findByName(name);
        //创建退换货对象
        Return ret=new Return();
        ret.setsId(Integer.valueOf(sidStr));
        ret.setoTime(new Date());
        ret.setcId(goods.getcId());
        ret.settId(goods.gettId());
        ret.setName(name);
        ret.setPrice(goods.getPrice());
        ret.setoNumber(Integer.valueOf(numberStr));
        ret.setOrders(orders);
        ret.setReason(reason);
        ret.setwId(3);
        //调用具体的业务逻辑方法
        boolean flag=returnService.save(ret);
        if(flag){
            //跳转到成功页面
            req.setAttribute("message","申请成功，请耐心等待审核");
            req.getRequestDispatcher("successful.jsp").forward(req,resp);
        }else{
            //跳转到错误页面
            req.setAttribute("message","操作失败");
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
