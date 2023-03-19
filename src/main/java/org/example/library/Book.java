package org.example.library;
public class Book
{
    String name;
    int ISBN;
    String author;
    public String getName()
    {
        return name;
    }
    public  Book(String name,String author,int id)
    {
        this.name=name;
        this.author=author;
        this.ISBN=id;

    }
    @Override
    public String toString()
    {
        return name+":"+ISBN+","+"author="+author;
    }
}