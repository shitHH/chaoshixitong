package com.myshop.service;

import com.myshop.bean.ShopCommodity;

import java.util.List;

/**
 * @author 贠一凡
 * 门店内的商品信息业务逻辑
 */
public interface ShopCommodityService {
    /**
     * 查询出所有商品的集合
     *
     * @return
     */
    public List<ShopCommodity> findAll();

    /**
     * 根据商品的商品编号查询出该商品的对象
     *
     * @return
     */
    public List<ShopCommodity> findBySid(int sid);

    /**
     * 根据商品的大类编号，查询出商品的对象
     *
     * @param sortId 商品大类编号
     * @return 商品的对象
     */
    public ShopCommodity findBySortId(int sortId);


    /**
     * 根据门店的编号查询门店的商品信息
     *
     * @param id 门店的店号
     * @return 商品集合对象
     */
    public List<ShopCommodity> findById(int id);


}
