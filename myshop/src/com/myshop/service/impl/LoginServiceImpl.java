package com.myshop.service.impl;

import com.myshop.bean.Login;
import com.myshop.dao.LoginDao;
import com.myshop.service.LoginService;
import com.myshop.util.SqlSessionUtil;

import java.util.List;

/**
 * @author 张向东
 * 用户登录业务逻辑接口实现
 */
public class LoginServiceImpl implements LoginService {

    LoginDao loginDao = SqlSessionUtil.getSession().getMapper(LoginDao.class);

    @Override
    public Login find(String userName, String passWord) {
        return loginDao.find(userName, passWord);
    }

    @Override
    public boolean addEmp(Login login) {
        return loginDao.addEmp(login) > 0 ? true : false;
    }

    @Override
    public List<Login> findAll() {
        return loginDao.findAll();
    }

    @Override
    public Login findById(int wId) {
        return loginDao.findById(wId);
    }

    @Override
    public boolean deleteEmp(int wId) {
        return loginDao.deleteEmp(wId) > 0 ? true : false;
    }

    @Override
    public boolean updateEmp(Login login) {
        return loginDao.updateEmp(login) > 0 ? true : false;
    }

    @Override
    public boolean updatemima(Login login) {
        return loginDao.updatemima(login) > 0 ? true : false;
    }

    @Override
    public boolean findByName(String userName) {

        Login login = loginDao.findByName(userName);
        if (userName == null) {
            return false;
        } else {
            return true;
        }

    }


}
