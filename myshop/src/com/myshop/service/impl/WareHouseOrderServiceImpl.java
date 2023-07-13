package com.myshop.service.impl;

import com.myshop.bean.WareHouseOrder;
import com.myshop.dao.WareHouseOrderDao;
import com.myshop.service.WareHouseOrderService;
import com.myshop.util.SqlSessionUtil;

import java.util.List;

/**
 * @author 魏范彬
 * 仓库订单业务逻辑实现类
 */
public class WareHouseOrderServiceImpl implements WareHouseOrderService {

    //创建数据访问对象
    WareHouseOrderDao wareHouseOrderDao= SqlSessionUtil.getSession().getMapper(WareHouseOrderDao.class);

    @Override
    public List<WareHouseOrder> findAll() {
        return wareHouseOrderDao.findAll();
    }

    @Override
    public List<WareHouseOrder> findBySid() {
        return wareHouseOrderDao.findBySid();
    }

    @Override
    public boolean update(WareHouseOrder who) {
        return wareHouseOrderDao.update(who)>0?true:false;
    }

    @Override
    public boolean deleteById(int id) {
        return wareHouseOrderDao.deleteById(id)>0?true:false;
    }

    @Override
    public boolean save(WareHouseOrder who) {
        return wareHouseOrderDao.save(who)>0?true:false;
    }
}
