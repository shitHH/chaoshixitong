package com.myshop.dao;

import com.myshop.bean.ShopSort;

import java.util.List;

/**
 * @author 贠一凡
 * 商品类别表的接口
 */
public interface ShopSortDao {
    /**
     * 查询商品类别编号类名称和大类库存
     *
     * @return 三种数据的集合
     */
    public List<ShopSort> findAll();

    /**
     * 根据商品的库存查询出这大类的信息
     *
     * @param sortNum
     * @return
     */
    public List<ShopSort> findBySortNum(int sortNum);

    /**
     * 根据商品类别的编号，找到这类商品对象
     *
     * @param sortId 商品类别编号
     * @return 商品的对象
     */
    public ShopSort findBySortId(int sortId);

    /**
     * 更新商品的库存信息，返回受影响的行数
     *
     * @param shopSort 商品对象
     * @return 受影响的航行数
     */
    public int update(ShopSort shopSort);

    /**
     * 增加新的商品大类
     *
     * @param shopSort 商品对象
     * @return 收影响的行数
     */

    public int saveInfo(ShopSort shopSort);

}
