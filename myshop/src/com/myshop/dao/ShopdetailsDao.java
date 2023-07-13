package com.myshop.dao;


import com.myshop.bean.Shopdetails;

import java.util.List;

/**
 * @author 贠一凡
 * @category 商品信息资料展示数据访问层的接口
 */
public interface ShopdetailsDao {
    /**
     * 查询出来所有的商品集合，
     *
     * @return商品对象
     */
    public List<Shopdetails> findAll();


    /**
     * 通过id查询出该商品信息
     *
     * @param sid 商品编号
     * @return商品对象
     */
    public Shopdetails findById(int sid);

    /**
     * 通过商品的储存方式找商品的对象
     *
     * @param storage 储存方式
     * @return 商品的对象
     */
    public Shopdetails findstorage(String storage);

    /**
     * 通过商品的库存查询商品的信息
     *
     * @param inventory 商品的库存
     * @return 商品的对象
     */
    public Shopdetails findinventory(int inventory);

    /**
     * 更新商品信息
     *
     * @return 受影响的行数
     */
    public int updateinventory(Shopdetails shopdetails);


    /**
     * 根据商品的大类，查询出商品的对象
     *
     * @param sortId 商品的大类
     * @return 商品的对象
     */
    public Shopdetails findBySortId(int sortId);

}
