package com.myshop.service.impl;

import com.myshop.bean.ShopInform;
import com.myshop.dao.ShopInformDao;
import com.myshop.service.ShopInformService;
import com.myshop.util.SqlSessionUtil;

import java.util.List;

/**
 * @author 贠一凡
 * 门店信息业务逻辑的实现类
 */
public class ShopInformServiceImpl implements ShopInformService {
    //创建数据访问的对象
    ShopInformDao shopInformDao = SqlSessionUtil.getSession().getMapper(ShopInformDao.class);


    @Override
    public List<ShopInform> findAll() {
        return shopInformDao.findAll();
    }

    @Override
    public ShopInform findById(int id) {
        return shopInformDao.findById(id);
    }

    @Override
    public ShopInform findByWid(int wid) {
        return shopInformDao.findByWid(wid);
    }
}
