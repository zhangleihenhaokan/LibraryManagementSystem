package org.example.user;

import java.util.HashMap;
public class ManageUser {
    private HashMap<Integer,User> userList=new HashMap<>();
    public ManageUser() {};
    public void increaUser(User user)
    {
        userList.put(user.getAcc(),user);
    }
    public void increaUsers(User[] user)
    {
        for(int i=0,len=user.length;i<len;i++)
           increaUser(user[i]);
    }
    public int login(int account,String passwd)
    {
        if(userList.containsKey(account)) {
            if(!userList.get(account).getPwd().equals(passwd))
             return 2;
            else
                return 3;
        }
        else {
            return 1;
        }
    }


}
