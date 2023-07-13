package com.myshop.dao;

import com.myshop.bean.ShopManager;

import java.util.List;

/**
 * @author 贠一凡
 * 店长信息实体类的接口
 */
public interface ShopManagerDao {
    /**
     * 查询出所有信息
     *
     * @return
     */
    public List<ShopManager> findAll();

    /**
     * 根据店长的名字查询出店长的对象
     *
     * @param userName 店长的名字（可以重名）
     * @return 店长对象
     */
    public ShopManager findByUserName(String userName);


}
