package com.myshop.service;



import com.myshop.bean.Goods;
import com.myshop.bean.WareHouseOrder;

import java.util.List;

/**
 * @author 赵岗刚
 * 仓库商品接口业务
 */
public interface GoodsService {
    /**
     * 增加
     *@return 受影响行数
     */
    public boolean addEmp(Goods goods);

    /**
     * 查询出来所有的商品信息集合，
     * @return 商品信息对象
     */
    public List<Goods> findAll();

    /**
     * 通过Id查询出该商品的信息
     * @param cId 商品编号
     * @return 商品信息对象
     */
    public Goods findById(int cId);

    /**
     * 根据商品名称，查询商品对象
     * @param name
     * @return 商品对象
     */
    public Goods findByName(String name);

    /**
     * 删除
     * @param cId 商品编号
     *  @return 收影响行数
     */
    public boolean deleteEmp(int cId);


    /**
     * 更新商品信息
     *@return 收影响行数
     */
    public boolean updateEmp(Goods goods);
    /**
     * 查询所有的订单信息
     * @return 订单集合
     */
    public List<WareHouseOrder> findAll1();
}


