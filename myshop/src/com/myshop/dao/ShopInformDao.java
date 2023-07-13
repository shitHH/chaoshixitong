package com.myshop.dao;

import com.myshop.bean.ShopInform;

import java.util.List;

/**
 * @author 贠一凡
 * 门店信息的接口
 */
public interface ShopInformDao {

    /**
     * 查询门店的信息
     *
     * @return 门店信息的集合
     */
    public List<ShopInform> findAll();

    /**
     * 根据门店的编号，查出门店的对象
     *
     * @param id 门店的编号
     * @return 门店的对象
     */
    public ShopInform findById(int id);

    /**
     * 根据店长的工号查询店长所在门店的信息
     *
     * @param wid 店长的工号
     * @return 门店的对象
     */
    public ShopInform findByWid(int wid);


}
