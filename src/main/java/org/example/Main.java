package org.example;
import org.example.Infomation.library.Library;
import org.example.Infomation.user.UserManager;
import org.example.interactive.Lib.FindBook;
import org.example.interactive.Lib.Login;

import java.util.Scanner;

/*
* 登录 √
* 查找书
* 借书
* 还书
* */
public class Main {
    public static void main(String[] args) {
        Library library=new Library();
        library.createThing();
        UserManager managerUser=new UserManager();
        managerUser.createThing();
        //登录 √
        Login login=new Login();
        login.control(managerUser);
        //查找书
        FindBook findBook=new FindBook(library.getSearch());
        if(findBook.control())
            findBook.readBook();


}











    //登录

    //书籍目录

    //借书


}