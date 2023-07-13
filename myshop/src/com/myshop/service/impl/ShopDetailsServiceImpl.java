package com.myshop.service.impl;

import com.myshop.bean.Shopdetails;
import com.myshop.dao.ShopdetailsDao;
import com.myshop.service.ShopDetailsService;
import com.myshop.util.SqlSessionUtil;

import java.util.List;

public class ShopDetailsServiceImpl implements ShopDetailsService {
    //创建数据访问的对象
    ShopdetailsDao shopdetailsDao = SqlSessionUtil.getSession().getMapper(ShopdetailsDao.class);

    @Override
    public List<Shopdetails> findAllList() {
        return shopdetailsDao.findAll();
    }

    @Override
    public Shopdetails findBySid(int sid) {
        return shopdetailsDao.findById(sid);
    }

    @Override
    public Shopdetails findBySortId(int sortId) {
        return shopdetailsDao.findBySortId(sortId);
    }

    @Override
    public boolean findSid(int sid) {
        Shopdetails shopdetails = shopdetailsDao.findById(sid);
        if (shopdetails != null) {
            return true;
        } else {
            return false;
        }


    }

    @Override
    public boolean findSortId(int sortId) {
        Shopdetails shopdetails = shopdetailsDao.findBySortId(sortId);
        if (shopdetails != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean update(Shopdetails shopdetails) {
        return shopdetailsDao.updateinventory(shopdetails) > 0 ? true : false;
    }


}
