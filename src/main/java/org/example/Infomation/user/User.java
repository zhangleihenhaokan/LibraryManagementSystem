package org.example.Infomation.user;

import java.time.LocalDate;
import java.util.Date;

public class User {
    private String name;
    private static int basicAcc = 0;
    private int NumOfBorrBooks=0;
    private int account;
    private String passwd;
    private LocalDate BorrowingTime;
    private LocalDate ReturnTime;
    //构造函数

    public User(String name) {
        this.name = name;
        this.account = basicAcc++;
        this.passwd = "123456";
    }

    public int getNumOfBorrBooks() {
        return NumOfBorrBooks;
    }

    public void setNumOfBorrBooks(int NumOfBorrBooks) {
        NumOfBorrBooks = NumOfBorrBooks;
    }

    public User(String name, String passwd) {
        this.name = name;
        this.account = basicAcc++;
        this.passwd = passwd;
    }
    //获取器和设置器
    public void setBorrowingTime(LocalDate borrowingTime) {
        BorrowingTime = borrowingTime;
    }

    public void setReturnTime(LocalDate returnTime) {
        ReturnTime = returnTime;
    }

    public LocalDate getBorrowingTime() {
        return BorrowingTime;
    }

    public LocalDate getReturnTime() {
        return ReturnTime;
    }

    public int getAcc() {
        return account;
    }

    public  String getPwd() {
        return passwd;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString()
    {
        return "借阅者"+name+"的账号:"+account;
    }










}
