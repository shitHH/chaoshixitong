package com.myshop.dao;

import com.myshop.bean.Goods;
import com.myshop.bean.Order;

import java.util.List;

/**
 * @author xf
 * 店面订单信息查询 & 仓库货物信息以及库存查询 接口
 * @version 魏范彬
 * 新增通过订单状态查询订单集合
 */
public interface OrderDao {

    /**
     * 查询所有订单信息
     */
    public List<Order> findAll();

    /**
     * 通过店面订单oid查询所有的订单货物信息
     * @param oId
     * @return
     */
    public Order findById1(int oId);

    /**
     * 通过店面sid查询该店的订单
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
     * @param cid 商品编号
     * @return 商品对象
     */
    public Goods findById3(int cid);

    /**
     * 增加订单信息
     * @return 返回影响行数
     */
    public int addOrder(Order order);

//    /**
//     * 删除一月前的订单
//     * 暂缓
//     */
//    public void deleteOrder1();

    /**
     * 删除订单
     * @return  返回影响行数
     */
    public int deleteOrder2(int oid);

    /**
     * 根据订单oid更新订单信息
     */
    public int updateOrder(Order order);
}
