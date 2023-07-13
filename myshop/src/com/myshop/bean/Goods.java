package com.myshop.bean;

import java.util.Date;

/**
 * @author 赵岗刚
 * 仓库商品实体类
 */
public class Goods {
    /**
     * 商品编号
     */
    private  int  cId;
    /**
     * 商品名称
     */
    private  String name;
    /**
     * 商品类型编号
     */
    private  int  tId;
    /**
     * 商品产地
     */
    private  String place;
    /**
     * 供应商
     */
    private  String supplie;
    /**
     * 生产日期
     */
    private Date prodate;
    /**
     * 保质期
     */
    private  String expdate;
    /**
     * 储存方式
     */
    private  String storage;
    /**
     * 商品价格
     */
    private  double price;
    /**
     * 库存
     */
    private  int number;

    public Goods() {
    }

    public Goods(int cId, String name, int tId, String place, String supplie, Date prodate, String expdate, String storage, double price, int number) {
        this.cId = cId;
        this.name = name;
        this.tId = tId;
        this.place = place;
        this.supplie = supplie;
        this.prodate = prodate;
        this.expdate = expdate;
        this.storage = storage;
        this.price = price;
        this.number = number;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "cId=" + cId +
                ", name='" + name + '\'' +
                ", tId=" + tId +
                ", place='" + place + '\'' +
                ", supplie='" + supplie + '\'' +
                ", prodate=" + prodate +
                ", expdate='" + expdate + '\'' +
                ", storage='" + storage + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
