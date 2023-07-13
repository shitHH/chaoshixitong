package com.myshop.service;

import com.myshop.bean.Login;

import java.util.List;

/**
 * @author 张向东
 * 用户登录权限业务逻辑接口
 */
public interface LoginService {
    /**
     * 根据用户名和密码返回用户对象
     *
     * @param userName
     * @param passWord
     * @return 人员对象
     */
    public Login find(String userName, String passWord);

    /**
     * 增加
     *
     * @return 是否成功
     */
    public boolean addEmp(Login login);

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
     * @return 是否成功
     */
    public boolean deleteEmp(int wId);


    /**
     * 更新人员信息
     *
     * @return 是否成功
     */
    public boolean updateEmp(Login login);

    /**
     * 更新密码
     *
     * @param login
     * @return
     */
    public boolean updatemima(Login login);

    /**
     * 查找用户名是否存在
     * @param userName
     * @return
     */
    public boolean findByName(String userName);
}
