package org.example;
import org.example.user.ManageUser;
import org.example.user.User;
import org.example.library.*;
import org.example.wrong.*;
public class Main {
    public static void main(String[] args) {
        User user1 = new User("qinmeng");
        User user2=new User("zhanglei");
        System.out.println(user1.getAcc());
        Book[] b = {new Book("qm",  "qwe", 213),new Book("shuihuzhuan","fdsfs",124),
        new Book("sanguoyanyi","eqwe",125),
        new Book("honogloumeng","rsf",126),
        };
        Library li = new Library();

        li.increaBooks(b);
        li.show();
        ManageUser m=new ManageUser();
        m.increaUser(user1);
        Wrong w=new Wrong();
        System.out.println(m.login(0,"123456"));
        System.out.println(w.getCode().get(m.login(0,"123456")));
        System.out.println(li.searchBook("qm"));
    }














    //登录

    //书籍目录

    //借书


}