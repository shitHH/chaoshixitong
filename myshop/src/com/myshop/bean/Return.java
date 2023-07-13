package com.myshop.bean;

import java.util.Date;

/**
 * @author 魏范彬
 * 退换货订单实体类
 */
public class Return {

    /**
     * 订单编号
     */
    private int oId;

    /**
     * 门店编号
     */
    private int sId;

    /**
     * 订单时间
     */
    private Date oTime;

    /**
     * 商品编号
     */
    private int cId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品类别编号
     */
    private int tId;

    /**
     * 商品价格
     */
    private double price;

    /**
     * 商品申请数量
     */
    private int oNumber;

    /**
     * 订单类别
     */
    private String orders;

    /**
     * 退换货原因
     */
    private String reason;

    /**
     * 工号
     */
    private int wId;

    /**
     * 订单状态
     */
    private String state;

    /**
     * 商品状态
     */
    private String deliver;

    public Return() {
    }

    public Return(int oId, int sId, Date oTime, int cId, String name, int tId, double price, int oNumber, String orders, String reason) {
        this.oId = oId;
        this.sId = sId;
        this.oTime = oTime;
        this.cId = cId;
        this.name = name;
        this.tId = tId;
        this.price = price;
        this.oNumber = oNumber;
        this.orders = orders;
        this.reason = reason;
    }

    public Return(int oId, int sId, Date oTime, int cId, String name, int tId, double price, int oNumber, String orders, String reason, int wId) {
        this.oId = oId;
        this.sId = sId;
        this.oTime = oTime;
        this.cId = cId;
        this.name = name;
        this.tId = tId;
        this.price = price;
        this.oNumber = oNumber;
        this.orders = orders;
        this.reason = reason;
        this.wId = wId;
    }

    public Return(int oId, int sId, Date oTime, int cId, String name, int tId, double price, int oNumber, String orders, String reason, int wId, String state) {
        this.oId = oId;
        this.sId = sId;
        this.oTime = oTime;
        this.cId = cId;
        this.name = name;
        this.tId = tId;
        this.price = price;
        this.oNumber = oNumber;
        this.orders = orders;
        this.reason = reason;
        this.wId = wId;
        this.state = state;
    }

    public Return(int oId, int sId, Date oTime, int cId, String name, int tId, double price, int oNumber, String orders, String reason, int wId, String state, String deliver) {
        this.oId = oId;
        this.sId = sId;
        this.oTime = oTime;
        this.cId = cId;
        this.name = name;
        this.tId = tId;
        this.price = price;
        this.oNumber = oNumber;
        this.orders = orders;
        this.reason = reason;
        this.wId = wId;
        this.state = state;
        this.deliver = deliver;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public Date getoTime() {
        return oTime;
    }

    public void setoTime(Date oTime) {
        this.oTime = oTime;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getoNumber() {
        return oNumber;
    }

    public void setoNumber(int oNumber) {
        this.oNumber = oNumber;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDeliver() {
        return deliver;
    }

    public void setDeliver(String deliver) {
        this.deliver = deliver;
    }

    @Override
    public String toString() {
        return "Return{" +
                "oId=" + oId +
                ", sId=" + sId +
                ", oTime=" + oTime +
                ", cId=" + cId +
                ", name='" + name + '\'' +
                ", tId=" + tId +
                ", price=" + price +
                ", oNumber=" + oNumber +
                ", orders='" + orders + '\'' +
                ", reason='" + reason + '\'' +
                ", wId=" + wId +
                ", state='" + state + '\'' +
                ", deliver='" + deliver + '\'' +
                '}';
    }
}
