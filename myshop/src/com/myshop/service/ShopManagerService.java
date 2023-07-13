package com.myshop.service;

import com.myshop.bean.ShopManager;

import java.util.List;

/**
 * @author 魏范彬
 * 店长信息业务逻辑接口
 */
public interface ShopManagerService {
    /**
     * 查询出所有信息
     * @return 店长信息集合
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
