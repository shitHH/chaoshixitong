package com.myshop.service.impl;

import com.myshop.bean.ShopCommodity;
import com.myshop.dao.ShopCommodityDao;
import com.myshop.service.ShopCommodityService;
import com.myshop.util.SqlSessionUtil;

import java.util.List;

/**
 * @author 贠一凡
 * 商品大类信息的业务逻辑实现层
 */
public class ShopCommodityServiceImpl implements ShopCommodityService {
    //创建数据访问的对象
    ShopCommodityDao shopCommodityDao = SqlSessionUtil.getSession().getMapper(ShopCommodityDao.class);

    @Override
    public List<ShopCommodity> findAll() {

        return shopCommodityDao.findAll();
    }

    @Override
    public List<ShopCommodity> findBySid(int sid) {
        return shopCommodityDao.findBySid(sid);
    }

    @Override
    public ShopCommodity findBySortId(int sortId) {

        return shopCommodityDao.findBySortId(sortId);

    }

    @Override
    public List<ShopCommodity> findById(int id) {
        return shopCommodityDao.findById(id);
    }


}
