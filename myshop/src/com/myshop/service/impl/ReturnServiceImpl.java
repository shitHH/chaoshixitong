package com.myshop.service.impl;

import com.myshop.bean.Goods;
import com.myshop.bean.Return;
import com.myshop.dao.GoodsDao;
import com.myshop.dao.ReturnDao;
import com.myshop.service.ReturnService;
import com.myshop.util.SqlSessionUtil;

import java.util.List;

/**
 * @author 魏范彬
 * 退换货业务逻辑的实现类
 */
public class ReturnServiceImpl implements ReturnService {


    //创建数据访问对象
    GoodsDao goodsDao= SqlSessionUtil.getSession().getMapper(GoodsDao.class);
    ReturnDao returnDao=SqlSessionUtil.getSession().getMapper(ReturnDao.class);


    @Override
    public List<Goods> findAll() {
        List<Goods> list=goodsDao.findAll();
        return list;
    }

    @Override
    public Goods findByName(String name) {
        return goodsDao.findByName(name);
    }

    @Override
    public List<Return> findAllReturn() {
        return returnDao.findAll();
    }


    @Override
    public Return findByOid(int oid) {
        return returnDao.findByOid(oid);
    }


    @Override
    public List<Return> findOrders(String orders) {
        return returnDao.findOrders(orders);
    }

    @Override
    public List<Return> findBySid(int sid) {
        return returnDao.findBySid(sid);
    }

    @Override
    public List<Return> findByState(String state) {
        return returnDao.findByState(state);
    }

    @Override
    public List<Return> findByDeliver(String deliver) {
        return returnDao.findByDeliver(deliver);
    }

    @Override
    public boolean save(Return ret) {
        return returnDao.save(ret)>0?true:false;
    }

    @Override
    public boolean update(Return ret) {
        return returnDao.update(ret)>0?true:false;
    }

    @Override
    public boolean deleteById(int oid) {
        return returnDao.deleteById(oid)>0?true:false;
    }
}
