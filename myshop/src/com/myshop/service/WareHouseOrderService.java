package com.myshop.service;

import com.myshop.bean.WareHouseOrder;

import java.util.List;

/**
 * @author 魏范彬
 * 仓库订单业务逻辑接口
 */
public interface WareHouseOrderService {

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
     * @return 是否成功
     */
    public boolean update(WareHouseOrder who);

    /**
     * 根据id，删除订单对象
     * @return 是否成功
     */
    public boolean deleteById(int id);

    /**
     * 增加一条订单
     * @param who
     * @return 是否成功
     */
    public boolean save(WareHouseOrder who);
}
