package com.myshop.dao;

import com.myshop.bean.Goods;
import com.myshop.bean.Shopdetails;
import com.myshop.bean.WareHouse;

import java.util.List;

/**
 * @author 赵岗刚
 * @category 仓库数据访问层的接口
 *
 */

public interface WareHoseDao {
    /**
     * 增加
     *@return 受影响行数
     */
    public int addEmp(WareHouse wareHouse);

    /**
     * 查询出来所有的商品信息集合，除了管理员以外
     * @return 商品信息对象
     */
    public List<WareHouse> findAll();

    /**
     * 通过Id查询出该商品的信息
     * @param  id 商品编号
     * @return 商品信息对象
     */
    public WareHouse findById(int id);

    /**
     * 删除
     * @param  id 商品编号
     * @return 受影响行数
     */
    public int deleteEmp(int id);


    /**
     * 更新商品信息
     *@return 受影响行数
     */
    public  int updateEmp(WareHouse wareHouse);
}

