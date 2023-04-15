package org.example.Infomation.library;
import org.example.abstraction.ReadLocalStor;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * */
public class Library extends ReadLocalStor<Book> {


    private HashMap<Integer, Book> bookList = new HashMap<>();//用来顺序输出书本的内容
    private HashMap<String,Book> search=new HashMap<>();//用户查找书名，查看是否有这边书

    public Library()
    {
        super();
    }
    public int getBookNum()
    {
        return getNum();
    }
    //用户查找书名，查看是否有这边书
    public Book searchBook(String name)
    {
        if(search.containsKey(name))
        {
            return search.get(name);
        }else
        {
            return null;
        }
    }

    //读取本地存储的数据
    @Override
    //读取本地存储的数据
    public  void  createThing()
    {
       createThing("D:\\book.txt");
    }

    public  void  createThing(String name)
    {
        try (Scanner input = new Scanner(new File(name))) {
            while (input.hasNextLine()) {
                String[] bookInfor=input.nextLine().split(" ");
                System.out.println(bookInfor[0]+" "+bookInfor[1]);
                Book book=new Book(bookInfor[0],bookInfor[1],getNum());
                increaThing(book);
                setNum(getNum()+1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public  void increaThing(Book book)
    {
        bookList.put(book.ISBN, book);
        search.put(book.name,book);
        System.out.println("success2");
    }

    //用来顺序输出书本的内容
    public void show() {
        for(int i:bookList.keySet())
            System.out.println(bookList.get(i));
    }
}