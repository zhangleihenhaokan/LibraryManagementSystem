package org.example;
import org.example.Infomation.library.Book;
import org.example.Infomation.library.Library;
import org.example.Infomation.user.Cookie;
import org.example.Infomation.user.UserManager;
import org.example.abstraction.ReadLocalStor;
import org.example.interactive.Lib.BorrowOrReturnBooks;
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
        Library library=new Library();
        library.createThing();
        UserManager usermanager=new UserManager();
        usermanager.createThing();
        FindBook findBook=new FindBook(library.getSearch());
        Scanner input=new Scanner(System.in);
        char userInput=input.next().charAt(0);
        PromptPage.homepagePrompt();
        Cookie cookie=new Cookie();
        //boolean flag=false;
        BorrowOrReturnBooks borrowOrReturnBooks=new BorrowOrReturnBooks(library,usermanager,cookie);
        while(true)
        {

            switch(userInput) {
                case '1':  //登录 √
                    Login login = new Login(cookie);
                    login.control(usermanager);
                    break;
                case '2':
                    if (findBook.control())
                    //如果查到有这本书
                    {
                        //分支：
                        PromptPage.searchBookReminder();
                        // 是否借书或者查找其他书籍或者退出
                        userInput = input.next().charAt(0);
                        switch (userInput) {
                            case '1':
                                borrowOrReturnBooks.bookBorrowingOperate();
                                break;
                            case '2':
                            //TODO
                                break;
                            default:
                                System.exit(0);
                        }
                    }
                    break;
                case '3':
                    //还书的逆过程
                default:
                    //把cookie注销掉后退出
                    cookie.setBeAuthenticated(false);
                    cookie.setName(null);
                    System.exit(0);
            }
                    PromptPage.homepagePrompt();
                    userInput=input.next().charAt(0);

        }
//

        //查找书



    }











    //登录

    //书籍目录

    //借书


}