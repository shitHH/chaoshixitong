package com.myshop.service.impl;

import com.myshop.bean.ShopManager;
import com.myshop.dao.ShopManagerDao;
import com.myshop.service.ShopManagerService;
import com.myshop.util.SqlSessionUtil;

import java.util.List;

/**
 * @author 魏范彬
 * 店长信息业务实现类
 */
public class ShopManagerServiceImpl implements ShopManagerService {
    //创建数据访问对象
    ShopManagerDao shopManagerDao= SqlSessionUtil.getSession().getMapper(ShopManagerDao.class);
    @Override
    public List<ShopManager> findAll() {
        return shopManagerDao.findAll();
    }

    @Override
    public ShopManager findByUserName(String userName) {
        return shopManagerDao.findByUserName(userName);
    }
}
