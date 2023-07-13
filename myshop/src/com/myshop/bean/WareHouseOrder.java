package com.myshop.bean;

import java.util.Date;

/**
 * @author 魏范彬
 * 仓库订单实体类
 */
public class WareHouseOrder {

    /**
     * 主键
     */
    private int id;

    /**
     * 商品编号
     */
    private int cId;

    /**
     * 商品名称
     */
    private String cName;

    /**
     * 商品类别编号
     */
    private int tId;

    /**
     * 店面编号
     */
    private int sId;

    /**
     * 申请数量
     */
    private int oNumber;

    /**
     * 订单时间
     */
    private Date oTime;

    public WareHouseOrder() {
    }

    public WareHouseOrder(int id, int cId, String cName, int tId, int sId, int oNumber, Date oTime) {
        this.id = id;
        this.cId = cId;
        this.cName = cName;
        this.tId = tId;
        this.sId = sId;
        this.oNumber = oNumber;
        this.oTime = oTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public int getoNumber() {
        return oNumber;
    }

    public void setoNumber(int oNumber) {
        this.oNumber = oNumber;
    }

    public Date getoTime() {
        return oTime;
    }

    public void setoTime(Date oTime) {
        this.oTime = oTime;
    }
}
