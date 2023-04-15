package org.example;
import org.example.Infomation.user.UserManager;
import org.example.interactive.Lib.Login;

/*
* 登录 √
* 查找书
* 借书
* 还书
* */
public class Main {
    public static void main(String[] args) {
        UserManager managerUser=new UserManager();
        managerUser.createThing();
        Login login=new Login();
        login.control(managerUser);
    }














    //登录

    //书籍目录

    //借书


}