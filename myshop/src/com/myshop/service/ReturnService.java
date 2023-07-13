package com.myshop.service;

import com.myshop.bean.Goods;
import com.myshop.bean.Return;

import java.util.List;

/**
 * @author 魏范彬
 * 退换货订单的业务逻辑接口
 */
public interface ReturnService {

    /**
     * 查询仓库商品集合
     * @return 商品集合
     */
    public List<Goods> findAll();

    /**
     * 根据商品名称，查询商品对象
     * @param name
     * @return 商品对象
     */
    public Goods findByName(String name);

    /**
     * 查询所有的订单集合
     * @return 订单集合
     */
    public List<Return> findAllReturn();

    /**
     * 根据订单编号查询订单
     * @return 订单对象
     */
    public Return findByOid(int oid);

    /**
     * 根据订单状态，查询到订单集合
     * @return 订单集合
     */
    public List<Return> findOrders(String orders);

    /**
     * 根据门店编号查询详细一个门店的订单集合
     * @return 具体一个门店的订单集合
     */
    public List<Return> findBySid(int sid);

    /**
     * 根据订单状态，查询订单集合
     * @param state 订单状态
     * @return 订单集合
     */
    public List<Return> findByState(String state);

    /**
     * 根据退换货状态，查询订单集合
     * @param deliver 退换货状态
     * @return 订单集合
     */
    public List<Return> findByDeliver(String deliver);

    /**
     * 增加一条订单
     * @return 是否成功
     */
    public boolean save(Return ret);

    /**
     * 根据订单编号更新订单信息
     * @param ret
     * @return 是否成功
     */
    public boolean update(Return ret);

    /**
     * 根据订单编号删除订单
     * @param oid
     * @return 是否成功
     */
    public boolean deleteById(int oid);
}
