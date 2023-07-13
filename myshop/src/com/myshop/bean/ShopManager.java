package com.myshop.bean;

/**
 * @author 贠一凡
 * 店长的个人信息实体类
 */
public class ShopManager {
    /**
     * 店长的工号
     */
    private int wid;
    /**
     * 店长的姓名
     */
    private String userName;
    /**
     * 店长的性别
     */
    private String sex;
    /**
     * 店长的联系电话
     */
    private String tel;
    /**
     * 店长的家庭住址
     */
    private String addr;


    @Override
    public String toString() {
        return "ShopManager{" +
                "wid=" + wid +
                ", userName='" + userName + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    /**
     * 创建无参的构造器
     */
    public ShopManager() {
    }

    /**
     * 创建全参构造器
     *
     * @param wid
     * @param userName
     * @param sex
     * @param tel
     * @param addr
     */
    public ShopManager(int wid, String userName, String sex, String tel, String addr) {
        this.wid = wid;
        this.userName = userName;
        this.sex = sex;
        this.tel = tel;
        this.addr = addr;
    }

    /**
     * 创建get和set方法
     *
     * @return
     */

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
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
