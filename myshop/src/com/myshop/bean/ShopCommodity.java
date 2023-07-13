package com.myshop.bean;

/**
 * @author 贠一凡
 * 门店内的商品信息表，是个索引表
 */
public class ShopCommodity {
    /**
     * 建立的索引表，门店内的商品信息的主键
     * 商品的编号
     */
    private int sid;
    /**
     * 商品的名称
     */
    private String sName;
    /**
     * 商品类别编号
     */
    private int sortId;
    /**
     * 商品的数量
     */
    private int number;
    /**
     * 门店的编号
     */
    private int id;


//    重写tostring

    @Override
    public String toString() {
        return "ShopCommodity{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", sortId=" + sortId +
                ", number=" + number +
                ", id=" + id +
                '}';
    }

    /**
     * 无参构造器
     */

    public ShopCommodity() {
    }

    /**
     * 创建全参构造器
     *
     * @param sid
     * @param sName
     * @param sortId
     * @param number
     * @param id
     */
    public ShopCommodity(int sid, String sName, int sortId, int number, int id) {
        this.sid = sid;
        this.sName = sName;
        this.sortId = sortId;
        this.number = number;
        this.id = id;
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

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
