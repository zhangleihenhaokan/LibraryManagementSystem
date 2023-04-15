package org.example.abstraction;
import java.util.HashMap;

public abstract class ReadLocalStor<E> {
    private int Num;
    private HashMap<Integer, E> List = new HashMap<>();//用来顺序输出书本的内容
    private HashMap<String,E> search=new HashMap<>();//用户查找书名，查看是否有这边书

    public ReadLocalStor()
    {
        Num = 0;
    }
    public void setNum(int num) {
        Num = num;
    }

    public void setList(HashMap<Integer, E> list) {
        List = list;
    }

    public void setSearch(HashMap<String, E> search) {
        this.search = search;
    }

    public int getNum() {
        return Num;
    }


    public HashMap<Integer, E> getList() {
        return List;
    }

    public HashMap<String, E> getSearch() {
        return search;
    }

    public  E search(String name)
        {
            if(search.containsKey(name))
            {
                return search.get(name);
            }else
            {
                return null;
            }
        }


    public abstract void  createThing() ;
    //抽象方法不能有主体
    public abstract void increaThing(E e);


    public void show() {
            for(int i:List.keySet())
                System.out.println(List.get(i));
        }
    }
