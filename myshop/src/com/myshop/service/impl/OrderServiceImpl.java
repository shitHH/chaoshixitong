package com.myshop.service.impl;

import com.myshop.bean.Goods;
import com.myshop.bean.Order;
import com.myshop.dao.GoodsDao;
import com.myshop.dao.OrderDao;
import com.myshop.service.OrderService;
import com.myshop.util.SqlSessionUtil;

import java.util.List;

/**
 * @author xf
 * 业务逻辑层实现
 * @version 魏范彬
 * 新增通过订单状态查询订单集合
 * 新增通过商品名称查询对象
 */
public class OrderServiceImpl implements OrderService {

    //      创建数据访问对象
    GoodsDao goodsdao = SqlSessionUtil.getSession().getMapper(GoodsDao.class);
    OrderDao orderDao = SqlSessionUtil.getSession().getMapper(OrderDao.class);

    /**
     * 查看仓库货物信息
     *
     * @return list
     */
    @Override
    public List<Goods> findAll() {
        List<Goods> list = goodsdao.findAll();
        return list;
    }

    /**
     * 查看所有订单
     *
     * @return
     */
    @Override
    public List<Order> findAll2() {
        return orderDao.findAll();
    }


    /**
     * 订单id查询所有的订单货物信息
     *
     * @param oId
     * @return
     */
    @Override
    public Order findById1(int oId) {
        return orderDao.findById1(oId);
    }


    /**
     * 通过店面sid查询该店的订单
     *
     * @param sid
     * @return 店面订单集合
     */
    @Override
    public List<Order> findById2(int sid) {
        return orderDao.findById2(sid);
    }

    @Override
    public List<Order> findByState(String state) {
        return orderDao.findByState(state);
    }

    @Override
    public List<Order> findByDeliver(String deliver) {
        return orderDao.findByDeliver(deliver);
    }

    /**
     * 根据货物id查看货物信息
     *
     * @param cid 商品编号
     * @return
     */
    @Override
    public Goods findById3(int cid) {
        Goods goods = goodsdao.findById(cid);
        return goods;
    }

    @Override
    public Goods findByName(String cName) {
        return goodsdao.findByName(cName);
    }

    /**
     * 增加订单信息
     *
     * @return 返回影响行数
     */
    @Override
    public boolean addOrder(Order order) {
        return orderDao.addOrder(order) > 0 ? true : false;
    }

    /**
     * 删除订单
     *
     * @return 返回影响行数
     */
    @Override
    public boolean deleteOrder(int oid) {
        return orderDao.deleteOrder2(oid) > 0 ? true : false;
    }

    /**
     * 根据订单oid更新订单信息
     */
    @Override
    public boolean updateOrder(Order order) {
        return orderDao.updateOrder(order) > 0 ? true : false;
    }
}
