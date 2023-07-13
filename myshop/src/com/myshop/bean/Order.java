package com.myshop.bean;

import java.util.Date;

/**
 * @author 魏范彬
 * 订单信息实体类
 * @author xf
 * 增加价格属性、添加字符串转换toString
 * 增加审批人员wid、增加商品编号属性cid
 */
public class Order {

    /**
     * 主键   订单编号
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
     * 商品类型编号
     */
    private int tId;

    /**
     * 商品编号
     */
    private int cid;
    /**
     * 商品名称
     */
    private String cName;

    /**
     * 商品价格
     */
    private double cPrice;

    /**
     * 申请数量
     */
    private int cNum;

    /**
     * 订单申请状态
     */
    private String state;

    /**
     *审批人员
     */
    private int wId;

    /**
     * 是否出货
     */
    public String deliver;

    public Order() {
    }

    public Order(int oId, int sId, Date oTime, int tId, int cid, String cName, double cPrice, int cNum, String state, int wId) {
        this.oId = oId;
        this.sId = sId;
        this.oTime = oTime;
        this.tId = tId;
        this.cid = cid;
        this.cName = cName;
        this.cPrice = cPrice;
        this.cNum = cNum;
        this.state = state;
        this.wId = wId;
    }

    public Order(int oId, int sId, Date oTime, int tId, int cid, String cName, double cPrice, int cNum, String state, int wId, String deliver) {
        this.oId = oId;
        this.sId = sId;
        this.oTime = oTime;
        this.tId = tId;
        this.cid = cid;
        this.cName = cName;
        this.cPrice = cPrice;
        this.cNum = cNum;
        this.state = state;
        this.wId = wId;
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

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public double getcPrice() {
        return cPrice;
    }

    public void setcPrice(double cPrice) {
        this.cPrice = cPrice;
    }

    public int getcNum() {
        return cNum;
    }

    public void setcNum(int cNum) {
        this.cNum = cNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    public String getDeliver() {
        return deliver;
    }

    public void setDeliver(String deliver) {
        this.deliver = deliver;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oId=" + oId +
                ", sId=" + sId +
                ", oTime=" + oTime +
                ", tId=" + tId +
                ", cid=" + cid +
                ", cName='" + cName + '\'' +
                ", cPrice=" + cPrice +
                ", cNum=" + cNum +
                ", state='" + state + '\'' +
                ", wId=" + wId +
                ", deliver='" + deliver + '\'' +
                '}';
    }
}
