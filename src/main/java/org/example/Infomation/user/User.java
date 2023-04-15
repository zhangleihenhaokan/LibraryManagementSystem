package org.example.Infomation.user;

public class User {
    private String name;
    private static int basicAcc = 0;
    private int account;
    private String passwd;

    public User(String name) {
        this.name = name;
        this.account = basicAcc++;
        this.passwd = "123456";
    }

    public User(String name, String passwd) {
        this.name = name;
        this.account = basicAcc++;
        this.passwd = passwd;
    }

    public int getAcc() {
        return account;
    }

    public  String getPwd() {
        return passwd;
    }

    protected String getName() {
        return name;
    }

    @Override
    public String toString()
    {
        return "借阅者"+name+"的账号:"+account;
    }










}
