package com.myshop.bean;

/**
 * @author 贠一凡
 * 商品类别实例
 */
public class ShopSort {
    /**
     * 商品类别的编号
     * 是主键
     */
    private int sortId;

    /**
     * 商品的类别
     */
    private String sName;
    /**
     * 商品大类的库存
     */
    private int sortNum;


    /**
     * 重写tostring方法
     */
    @Override
    public String toString() {
        return "ShopSort{" +
                "sortId=" + sortId +
                ", sName='" + sName + '\'' +
                ", sortNum=" + sortNum +
                '}';
    }

    /**
     * 无参构造器
     */
    public ShopSort() {
    }

    /**
     * 全参构造器
     *
     * @param sortId
     * @param sName
     * @param sortNum
     */

    public ShopSort(int sortId, String sName, int sortNum) {
        this.sortId = sortId;
        this.sName = sName;
        this.sortNum = sortNum;
    }

    /**
     * 创建get和set方法
     *
     * @return
     */

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

    public int getSortNum() {
        return sortNum;
    }

    public void setSortNum(int sortNum) {
        this.sortNum = sortNum;
    }
}
