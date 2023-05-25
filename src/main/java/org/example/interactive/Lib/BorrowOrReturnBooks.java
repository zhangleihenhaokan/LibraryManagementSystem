package org.example.interactive.Lib;

import org.example.Infomation.library.Library;
import org.example.Infomation.user.UserManager;

public class BorrowOrReturnBooks {
    Library library;//TODO 这个地方需要初始化吗？
    UserManager userManager=new UserManager();

    public BorrowOrReturnBooks(Library library, UserManager userManager) {
        this.library = library;
        this.userManager = userManager;
    }
//记录这本书的借阅日期，和还书日期，书的数量减1
    public void bookBorrowingOperate()
    {
        //TODO
        //判断身份是否登录成功
        //记录这本书的借阅日期，和还书日期，书的数量减1

    }

    public void returnBorrowingOperate()
    {
       //逆过程
    }

}
