package com.myshop.bean;

import java.util.Date;

/**
 * @author 贠一凡
 * 商品信息实体类
 */
public class Shopdetails {
    /**
     * 商品编号
     */
    private int sid;

    /**
     * 商品类别编号
     */
    private int sortId;
    /**
     * 商品名称
     */
    private String sName;
    /**
     * 商品产地
     */
    private String place;
    /**
     * 商品供应商
     */
    private String supplie;
    /**
     * 生产日期
     */
    private Date prodate;
    /**
     * 保质期
     */
    private String expdate;
    /**
     * 储存方式
     */
    private String storage;
    /**
     * 商品的价格
     */
    private Double cPrice;
    /**
     * 当前库存
     */
    private int inventory;


    @Override
    public String toString() {
        return "Shopdetails{" +
                "sid=" + sid +
                ", sortId=" + sortId +
                ", sName='" + sName + '\'' +
                ", place='" + place + '\'' +
                ", supplie='" + supplie + '\'' +
                ", prodate=" + prodate +
                ", expdate='" + expdate + '\'' +
                ", storage='" + storage + '\'' +
                ", cPrice=" + cPrice +
                ", inventory=" + inventory +
                '}';
    }


    public Shopdetails(int sid, int sortId, String sName, int inventory) {
        this.sid = sid;
        this.sortId = sortId;
        this.sName = sName;
        this.inventory = inventory;
    }

    /**
     * 无参构造器
     */
    public Shopdetails() {
    }

    /**
     * 创建全参构造器
     *
     * @param sid
     * @param sortId
     * @param sName
     * @param place
     * @param supplie
     * @param prodate
     * @param expdate
     * @param storage
     * @param cPrice
     * @param inventory
     */
    public Shopdetails(int sid, int sortId, String sName, String place, String supplie, Date prodate, String expdate, String storage, Double cPrice, int inventory) {
        this.sid = sid;
        this.sortId = sortId;
        this.sName = sName;
        this.place = place;
        this.supplie = supplie;
        this.prodate = prodate;
        this.expdate = expdate;
        this.storage = storage;
        this.cPrice = cPrice;
        this.inventory = inventory;
    }

    /**
     * 创建get和set方法
     *
     * @return
     */
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getSupplie() {
        return supplie;
    }

    public void setSupplie(String supplie) {
        this.supplie = supplie;
    }

    public Date getProdate() {
        return prodate;
    }

    public void setProdate(Date prodate) {
        this.prodate = prodate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public Double getcPrice() {
        return cPrice;
    }

    public void setcPrice(Double cPrice) {
        this.cPrice = cPrice;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}

