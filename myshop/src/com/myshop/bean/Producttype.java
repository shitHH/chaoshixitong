package com.myshop.bean;
/**
 * @author 赵岗刚
 * 商品类型实体类
 */
public class Producttype {
    /**
     * 商品类型
     */
    private  int  tId;
    /**
     * 商品类型名
     */
    private  String tName;

    public Producttype() {
    }

    public Producttype(int tId, String tName) {
        this.tId = tId;
        this.tName = tName;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }
}
