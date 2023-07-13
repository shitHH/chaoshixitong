package com.myshop.action;

import com.myshop.bean.Goods;
import com.myshop.bean.Return;
import com.myshop.bean.Shopdetails;
import com.myshop.service.GoodsService;
import com.myshop.service.ReturnService;
import com.myshop.service.ShopDetailsService;
import com.myshop.service.impl.GoodsServiceImpl;
import com.myshop.service.impl.ReturnServiceImpl;
import com.myshop.service.impl.ShopDetailsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 魏范彬
 * 仓库退换货订单控制器
 */
@WebServlet("/deliverreturn.action")
public class DeliverReturnAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        ReturnService returnService=new ReturnServiceImpl();
        GoodsService goodsService=new GoodsServiceImpl();
        ShopDetailsService shopDetailsService=new ShopDetailsServiceImpl();
        //获得前端页面的oid
        String oIdStr=req.getParameter("oId");
        if(oIdStr!=null){
            int oId=Integer.valueOf(oIdStr);
            //调用业务逻辑的具体方法，通过oId查询出订单对象
            Return ret=returnService.findByOid(oId);
            ret.setState(ret.getState());
            ret.setDeliver("已退货");
            boolean flag1=returnService.update(ret);
            System.out.println(flag1);

            //获取订单对象的中的cid和cNum
            int cId=ret.getcId();
            int cNum=ret.getoNumber();
            //调用业务逻辑的具体方法，通过商品编号cid获得商品对象
            Goods goods=goodsService.findById(cId);
            goods.setNumber(goods.getNumber()+cNum);
            boolean flag2=goodsService.updateEmp(goods);

            Shopdetails shopdetails=shopDetailsService.findBySid(cId);
            shopdetails.setInventory(shopdetails.getInventory()-cNum);
            boolean flag3=shopDetailsService.update(shopdetails);
            if(flag1&&flag2&&flag3){
                //跳转到当前页面
                req.getRequestDispatcher("housereturndeliver.action").forward(req,resp);
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
