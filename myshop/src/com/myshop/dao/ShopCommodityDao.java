package com.myshop.dao;

import com.myshop.bean.ShopCommodity;

import java.util.List;

/**
 * @author 贠一凡
 * 索引表的接口
 */
public interface ShopCommodityDao {
    /**
     * 查询所有信息，返回集合内所有信息
     *
     * @return 返回集合
     */
    public List<ShopCommodity> findAll();

    /**
     * 根据门店的编号查找门店的商品信息
     *
     * @param id 门店的店号
     * @return 门店商品信息的集合
     */
    public List<ShopCommodity> findById(int id);

    /**
     * 根据商品的类型查询出商品的集合
     *
     * @param sortId 商品的类型
     * @return 商品的集合
     */
    public ShopCommodity findBySortId(int sortId);

    /**
     * 根据门店商品编号查询商品的信息
     * @param sid 商品的编号
     * @return 商品的集合对象
     */
      public List<ShopCommodity> findBySid(int sid);


}
