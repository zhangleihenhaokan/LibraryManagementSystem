package org.example.user;

public class User {
    private String name;
    private static int basicAcc=0;
    private int account;
    private  String passwd;

    public  User(String name)
    {
        this.name=name;
        this.account=basicAcc++;
        this.passwd="123456";
    }
    public int getAcc()
    {
        return account;
    }
    protected String getPwd(){return passwd;}










}
