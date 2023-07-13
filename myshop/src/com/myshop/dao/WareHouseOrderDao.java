package com.myshop.dao;

import com.myshop.bean.WareHouseOrder;

import java.util.List;

/**
 * @author 魏范彬
 * 仓库订单数据访问接口
 */
public interface WareHouseOrderDao {

    /**
     * 查询所有的订单信息
     * @return 订单集合
     */
    public List<WareHouseOrder> findAll();

    /**
     * 根据店面编号，查询出订单集合
     * @return 订单集合
     */
    public List<WareHouseOrder> findBySid();

    /**
     * 更新信息
     * @return 受影响行数
     */
    public int update(WareHouseOrder who);

    /**
     * 根据id，删除订单对象
     * @return 受影响行数
     */
    public int deleteById(int id);

    /**
     * 增加一条订单
     * @param who
     * @return 受影响行数
     */
    public int save(WareHouseOrder who);


}
