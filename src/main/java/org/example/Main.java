package org.example;
import org.example.Infomation.library.Book;
import org.example.Infomation.library.Library;
import org.example.Infomation.user.UserManager;
import org.example.abstraction.ReadLocalStor;
import org.example.interactive.Lib.FindBook;
import org.example.interactive.Lib.Login;
import org.example.interactive.Lib.PromptPage;

import java.util.Scanner;

/*
 * 登录=√
 * 借书
 * 还书
 * */
public class Main {
    public static <User> void main(String[] args) {
        ReadLocalStor<Book> library=new Library();
        library.createThing();
        ReadLocalStor<org.example.Infomation.user.User> managerUser=new UserManager();
        managerUser.createThing();
        FindBook findBook=new FindBook(library.getSearch());
        Scanner input=new Scanner(System.in);
        char userInput=input.next().charAt(0);
        PromptPage.print();
        while(true)
        {
            switch(userInput)
            {
                case '1':  //登录 √
                    Login login=new Login();
                    //TODO
                    //参数部分的形式为什么不能是它自己的，而是用了父类
                    login.control(managerUser);
                case '2':
                    findBook.control();//如果查到有这本书
                case '3':
                    //还书的逆过程
                case 'q':
                    //把cookie注销掉后退出

            }
        }
//

        //查找书



    }











    //登录

    //书籍目录

    //借书


}