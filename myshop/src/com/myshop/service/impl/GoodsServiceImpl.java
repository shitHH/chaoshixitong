package com.myshop.service.impl;


import com.myshop.bean.Goods;
import com.myshop.bean.WareHouseOrder;
import com.myshop.dao.GoodsDao;
import com.myshop.dao.WareHouseOrderDao;
import com.myshop.service.GoodsService;
import com.myshop.util.SqlSessionUtil;

import java.util.List;

/**
 * @author 赵岗刚
 * 货物逻辑的实现类
 */
public class GoodsServiceImpl implements GoodsService {


    //创建数据访问对象
    GoodsDao goodsDao= SqlSessionUtil.getSession().getMapper(GoodsDao.class);
    WareHouseOrderDao wareHouseOrderDao= SqlSessionUtil.getSession().getMapper(WareHouseOrderDao.class);
    @Override
    public boolean addEmp(Goods goods) {
      return goodsDao.addEmp(goods)>0? true : false;
    }

    @Override
    public List<Goods> findAll() {
        List<Goods> list=goodsDao.findAll();
        return list;
    }

    @Override
    public Goods findById(int cId) {
        return goodsDao.findById(cId);
    }

    @Override
    public Goods findByName(String name) {
        return goodsDao.findByName(name);
    }

    @Override
    public boolean deleteEmp(int cId) {
        return goodsDao.deleteEmp(cId)>0? true : false;
    }

    @Override
    public boolean updateEmp(Goods goods)  {
        return goodsDao.updateEmp(goods)>0? true : false;
    }
    @Override
    public List<WareHouseOrder> findAll1() {

        return wareHouseOrderDao.findAll();
    }
}
