package com.myshop.bean;

/**
 * @author 赵岗刚
 * 仓库管理员信息实体类
 */
public class WareHousePerp {
    /**
     * 工号
     */
private  int wId;
    /**
     * 姓名
     */
private  String userName;
    /**
     * 性别
     */
private char sex;
    /**
     * 联系电话
     */
private  String tel;
    /**
     * 地址
     */
private  String addr;

    public WareHousePerp() {
    }

    public WareHousePerp(int wid, String userName, char sex, String tel, String addr) {
        this.wId = wId;
        this.userName = userName;
        this.sex = sex;
        this.tel = tel;
        this.addr = addr;
    }

    public int getWid() {
        return wId;
    }

    public void setWid(int wid) {
        this.wId = wId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
