package com.myshop.bean;

/**
 * @author 赵岗刚
 * 仓库实体类
 *
 */
public class WareHouse {
    /**
     * 编号
     */
    private  int id;
    /**
     * 商品名称
     */
    private  String cName;
    /**
     * 商品类别编号
     */
    private  int  tId;
    /**
     * 工号
     */
    private  int  wId;

    public WareHouse() {
    }

    public WareHouse(int id, String cName, int tId, int wId) {
        this.id = id;
        this.cName = cName;
        this.tId = tId;
        this.wId = wId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }
}
