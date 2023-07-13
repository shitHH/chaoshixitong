package com.myshop.service;

import com.myshop.bean.Goods;
import com.myshop.bean.Order;

import java.util.List;

/**
 * @author xf
 * 订单审批业务层逻辑接口
 * @version 魏范彬
 * 新增通过订单状态查询订单集合
 * 新增通过商品名称查询商品对象
 */
public interface OrderService {


    /**
     * 查询仓库所有货物信息
     *
     * @return list商品详情集合
     */
    public List<Goods> findAll();

    /**
     * 查看所有订单
     *
     * @return
     */
    public List<Order> findAll2();

    /**
     * 通过订单id查询所有的订单货物信息
     *
     * @param oId
     * @return
     */
    public Order findById1(int oId);

    /**
     * 通过店面sid查询该店的订单
     *
     * @param sid
     * @return 店面订单集合
     */
    public List<Order> findById2(int sid);

    /**
     * 根据订单状态，查询订单集合
     * @param state 订单状态
     * @return 订单集合
     */
    public List<Order> findByState(String state);

    /**
     * 根据商品状态，查询订单集合
     * @param deliver 是否出货
     * @return 订单集合
     */
    public List<Order> findByDeliver(String deliver);

    /**
     * 通过id查询出仓库该商品信息及库存
     *
     * @param cid 商品编号
     * @return 商品对象
     */
    public Goods findById3(int cid);

    /**
     * 通过商品名称，查询商品对象
     * @param cName 商品名称
     * @return 商品对象
     */
    public Goods findByName(String cName);

    /**
     * 增加订单信息
     *
     * @return 是否成功
     */
    public boolean addOrder(Order order);

    /**
     * 删除订单
     *
     * @return 返回影响行数
     */
    public boolean deleteOrder(int oid);

    /**
     * 根据订单oid更新订单信息
     */
    public boolean updateOrder(Order order);


}
