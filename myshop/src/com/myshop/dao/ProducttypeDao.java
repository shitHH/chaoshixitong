package com.myshop.dao;



import com.myshop.bean.Goods;
import com.myshop.bean.Producttype;

import java.util.List;

/**
 * @author 赵岗刚
 * 仓库商品类型接口
 */
public interface ProducttypeDao {
    /**
     * 增加
     *
     */
    public int addEmp(Producttype producttype);

    /**
     * 查询出来所有的商品类型集合，
     * @return 商品信息对象
     */
    public List<Producttype> findAll();

    /**
     * 通过 tId查询出该商品的信息
     * @param tId 商品类型编号
     * @return 商品信息对象
     */
    public Goods findById(int tId);

    /**
     * 删除
     * @param tId 商品类型编号
     * @return 受影响行数
     */
    public int deleteEmp(int tId);


    /**
     * 更新商品信息
     *@return 受影响行数
     */
    public  int updateEmp(Producttype producttype);
}
