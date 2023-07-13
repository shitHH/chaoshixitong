package com.myshop.service;

import com.myshop.bean.Shopdetails;

import java.util.List;

/**
 * @author 贠一凡
 * 商品信息资料的业务逻辑
 */
public interface ShopDetailsService {
    /**
     * 查询出所有商品的集合
     *
     * @return 商品的集合
     */
    public List<Shopdetails> findAllList();

    /**
     * 根据商品的编号查找出商品的对象
     *
     * @return 商品的对象
     */
    public Shopdetails findBySid(int sid);

    /**
     * 根据商品的大类，查询出商品的对象
     *
     * @param sortId 商品的大类
     * @return 商品的对象
     */
    public Shopdetails findBySortId(int sortId);


    /**
     * 根据商品的编号，查询该商品是否存在
     *
     * @param sid 商品的编号
     * @return 商品是否存在
     */
    public boolean findSid(int sid);

    /**
     * 根据商品的分类查询商品是否存在
     *
     * @param sortId 商品的类型
     * @return 商品是否存在的标识
     */
    public boolean findSortId(int sortId);

    /**
     * 更新商品的库存操作，判断是否更新成功
     *
     * @return
     */

    public boolean update(Shopdetails shopdetails);


}
