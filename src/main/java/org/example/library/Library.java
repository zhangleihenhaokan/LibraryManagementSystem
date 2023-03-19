package org.example.library;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
public class Library {
    private int booksNum;
    private ArrayList<Integer> bookInfor = new ArrayList<>();
    private int i = 0;
    private HashMap<Integer, Book> bookList = new HashMap<>();
    private HashMap<String,Book> search=new HashMap<>();

    public Library()
    {
        this.booksNum=0;
    }
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
    public void createBooks() throws IOException
    {
        try(DataInputStream input=new DataInputStream(new FileInputStream("D:/book.txt")))
        {
            while(true)
            {

            }
        }catch (EOFException eofe)
        {
            return;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
    public void increaBooks(Book[] book) {
        for(int i=0;i<book.length;i++)
        {
            increaBook(book[i]);
        }
    }
    public void increaBook(Book book)
    {
        bookList.put(book.ISBN, book);
        bookInfor.add(book.ISBN);
        search.put(book.name,book);
    }

    public void show() {
//        for (int i : bookInfor) {
//            System.out.println(bookList.get(i));
//        }
        for(int i:bookList.keySet())
            System.out.println(bookList.get(i));
    }
}