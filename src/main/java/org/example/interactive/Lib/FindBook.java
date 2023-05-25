package org.example.interactive.Lib;

import org.example.Infomation.library.Book;
import org.example.Infomation.user.Cookie;
import org.example.Infomation.user.UserManager;

import java.util.HashMap;
import java.util.Scanner;

public class FindBook {
    private  HashMap<String, Book> search=new HashMap<>();
    private boolean ifFindBook=true;

    private StringBuilder bookName=new StringBuilder();
    public FindBook(HashMap<String, Book> search) {
        this.search=search;
    }
    public boolean control()
    {
        System.out.println("客官想要找什么书？");
        Scanner input=new Scanner(System.in);
        bookName.append(input.next());
       if(isContains(bookName))
       {
            readBook();
            return true;
       }
       return false;
    }
    public boolean isContains(StringBuilder bookName)
    {
        if(!ifFindBook)
            return false;
        Scanner input=new Scanner(System.in);
        if(search.containsKey(new String(bookName)))
        {
            System.out.println("有这本书");
            return ifFindBook;
        }
        else
        {

            for(Book str:search.values())
                System.out.println(str);
            System.out.println(search.values()+"没有这本书哦，再看看别的吧\n" +
                    "按q退出搜索程序或者直接搜索这本书");
            bookName.delete(0,bookName.length());
            bookName.append(input.next());
            if(bookName.compareTo(new StringBuilder("q"))==0)
            {
                ifFindBook=false;
                return ifFindBook;
            }
            else {
                isContains(bookName);
            }
        }
        return ifFindBook;
    }

    public void readBook()
    {
            Book book=search.get(new String(bookName));
            System.out.println(book.toString());
    }
}
