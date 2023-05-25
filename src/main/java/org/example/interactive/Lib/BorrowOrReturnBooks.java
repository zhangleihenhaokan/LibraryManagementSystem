package org.example.interactive.Lib;

import org.example.Infomation.library.Library;
import org.example.Infomation.user.Cookie;
import org.example.Infomation.user.User;
import org.example.Infomation.user.UserManager;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ResourceBundle;

public class BorrowOrReturnBooks {
    private Library library;//TODO 这个地方需要初始化吗？
    private UserManager userManager;
    private Cookie cookie;

    public BorrowOrReturnBooks(Library library, UserManager userManager, Cookie cookie) {
        this.library = library;
        this.userManager = userManager;
        this.cookie=cookie;
    }
//记录这本书的借阅日期，和还书日期，书的数量减1
    public void bookBorrowingOperate()
    {
        //判断身份是否登录成功
        if(cookie.isBeAuthenticated())
        {
            //记录这本书的借阅日期，和还书日期，借书的数量+1
            LocalDate BorrowingTime=LocalDate.now();
            User reader= userManager.search(cookie.getName());
            reader.setBorrowingTime(BorrowingTime);
            reader.setReturnTime(BorrowingTime.plusMonths(2));
            reader.setNumOfBorrBooks(reader.getNumOfBorrBooks()+1);
        }
        else
        {
            System.out.println("登录后方可借书");
        }



    }

    public void returnBorrowingOperate()
    {
        if(cookie.isBeAuthenticated())
        {

            User reader= userManager.search(cookie.getName());
            if(reader.getNumOfBorrBooks()>0)
            {
                reader.setNumOfBorrBooks(0);
                reader.setBorrowingTime(null);
                reader.setReturnTime(null);
            }

        }
        else
        {
            System.out.println("登录后方可还书");
        }
    }

}
