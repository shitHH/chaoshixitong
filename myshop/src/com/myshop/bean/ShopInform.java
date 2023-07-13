package com.myshop.bean;

import java.io.StringReader;

/**
 * @author 贠一凡
 * 门店信息实体类
 */
public class ShopInform {

    /**
     * 门店的编号，主键
     */
    private int id;

    /**
     * 门店的店名
     */
    private String sName;
    /**
     * 门店的位置
     */
    private String sAddr;

    /**
     * 店长的工号
     */
    private int wid;

    /**
     * 店长的姓名
     */
    private String name;

    @Override
    public String toString() {
        return "ShopInform{" +
                "id=" + id +
                ", sName='" + sName + '\'' +
                ", sAddr='" + sAddr + '\'' +
                ", wid=" + wid +
                ", name='" + name + '\'' +
                '}';
    }

    /**
     * 无参
     */
    public ShopInform() {
    }

    /**
     * 创建全参构造器
     *
     * @param id
     * @param sName
     * @param sAddr
     * @param wid
     * @param name
     */
    public ShopInform(int id, String sName, String sAddr, int wid, String name) {
        this.id = id;
        this.sName = sName;
        this.sAddr = sAddr;
        this.wid = wid;
        this.name = name;
    }

    /**
     * get和set方法
     *
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsAddr() {
        return sAddr;
    }

    public void setsAddr(String sAddr) {
        this.sAddr = sAddr;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
