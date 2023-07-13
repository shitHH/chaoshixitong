package com.myshop.dao;

import com.myshop.bean.WareHousePerp;

import java.util.List;

/**
 * @author 赵岗刚
 * @category 仓库管理员信息访问层的接口
 *
 */
public interface WareHousePerpDao {
    /**
     * 增加
     *@return 受影响行数
     */
    public int addEmp(WareHousePerp wareHousePerp);

    /**
     * 查询出来所有的人员信息集合，
     * @return 人员信息对象
     */
    public List<WareHousePerp> findAll();

    /**
     * 通过Id查询出该人员的信息
     * @param wId 工号
     * @return 人员对象
     */
    public WareHousePerp findById(int wId);

    /**
     * 删除
     * @param wId 工号
     * @return 受影响行数
     */
    public int deleteEmp(int wId);


    /**
     * 更新人员信息
     *@return 受影响行数
     */
    public  int updateEmp(WareHousePerp wareHousePerp);
}
