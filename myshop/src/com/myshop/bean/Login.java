package com.myshop.bean;

/**
 * @author 赵岗刚
 * 登录权限实体类
 * @author 张向东
 * password属性添加
 */
public class Login {
    /**
     * 工号
     */
    private  int wId;
    /**
     * 姓名
     */
    private  String userName;
    /**
     * 密码
     */
    private  String passWord;
    /**
     * 性别
     */
    private char sex;
    /**
     * 职位
     */
    private String position;

    public Login() {

    }

    public Login(String userName) {
        this.userName = userName;
    }

    public Login(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public Login(int wId, String userName, String passWord, char sex, String position) {
        this.wId = wId;
        this.userName = userName;
        this.passWord = passWord;
        this.sex = sex;
        this.position = position;
    }

    public int getwId() {
        return wId;
    }

    public void setwId(int wId) {
        this.wId = wId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
