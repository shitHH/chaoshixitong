package com.myshop.dao;


import com.myshop.bean.Login;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 赵岗刚
 * @author 张向东
 * 增加find用户名和密码查询抽象方法
 * @category 登录权限访问层的接口
 */
public interface LoginDao {
    /**
     * 根据用户名和密码返回用户对象
     *
     * @param userName
     * @param passWord
     * @return 人员对象
     */
    public Login find(@Param("userName") String userName, @Param("passWord") String passWord);

    /**
     * 增加
     *
     * @return 受影响行数
     */
    public int addEmp(Login login);

    /**
     * 查询出来所有的人员信息集合，
     *
     * @return 人员信息对象
     */
    public List<Login> findAll();

    /**
     * 通过Id查询出该人员的信息
     *
     * @param wId 工号
     * @return 人员对象
     */
    public Login findById(int wId);

    /**
     * 删除
     *
     * @param wId 工号
     * @return 受影响行数
     */
    public int deleteEmp(int wId);


    /**
     * 更新人员信息
     *
     * @return 受影响行数
     */
    public int updateEmp(Login login);

    /**
     * 更改用户的密码
     *
     * @param login
     * @return
     */
    public int updatemima(Login login);

    /**
     * 通过用户的名字找到用户的对象
     *
     * @param userName
     * @return
     */
    public Login findByName(String userName);
}
