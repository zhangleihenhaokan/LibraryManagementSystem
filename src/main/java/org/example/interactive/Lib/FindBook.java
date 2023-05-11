package org.example.interactive.Lib;

import org.example.Infomation.library.Book;
import org.example.Infomation.user.User;

import java.util.HashMap;
import java.util.Scanner;

public class FindBook {
    private  HashMap<String, Book> search=new HashMap<>();
    private boolean flag=true;
    private StringBuilder bookName=new StringBuilder();
    public FindBook(HashMap<String, Book> search) {
        search=search;
    }
    public boolean control()
    {
        System.out.println("客官想要找什么书？");
        Scanner input=new Scanner(System.in);
        bookName.append(input.next());
        return isContains(bookName);
    }
    public boolean isContains(StringBuilder bookName)
    {
        if(!flag)return false;
        Scanner input=new Scanner(System.in);
        if(search.containsKey(bookName))
        {
            System.out.println("有这本书");
            return flag;
        }
        else
        {
            System.out.println("没有这本书哦，再看看别的吧\n" +
                    "按q退出搜索程序或者直接搜索这本书");
            bookName.delete(0,bookName.length());
            bookName.append(input.next());
            if(bookName.compareTo(new StringBuilder("q"))==0)
            {
                flag=false;
                return false;
            }
            else {
                isContains(bookName);
            }
        }
        return flag;
    }

    public void readBook()
    {
            Book book=search.get(bookName);
            System.out.println(book.toString());
    }
}
