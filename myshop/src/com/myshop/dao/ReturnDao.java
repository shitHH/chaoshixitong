package com.myshop.dao;

import com.myshop.bean.Return;

import java.util.List;

/**
 * @author 魏范彬
 * 退换货订单数据访问接口
 */
public interface ReturnDao {

    /**
     * 查询所有订单信息
     * @return 订单集合
     */
    public List<Return> findAll();

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
     * @return 受影响行数
     */
    public int save(Return ret);

    /**
     * 根据订单编号更新订单信息
     * @param ret
     * @return 受影响行数
     */
    public int update(Return ret);

    /**
     * 根据订单编号删除订单
     * @param oid
     * @return 受影响的行数
     */
    public int deleteById(int oid);

}
