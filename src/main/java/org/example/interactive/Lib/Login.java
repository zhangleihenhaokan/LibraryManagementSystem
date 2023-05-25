package org.example.interactive.Lib;

import org.example.Infomation.user.User;
import org.example.MyLog.Log;
import org.example.abstraction.ReadLocalStor;

import java.util.Scanner;
import java.util.logging.Level;

public class Login {
    private Integer name;
    private int lockNum = 0;
    private boolean cookie = false;//做一个东西，里面涉及人名字以及它的登录状态
    public Login(){}
    //检验账号密码是否有问题
    private boolean validate(int account, String passwd) {
        if ( passwd.length() < 9) {
            System.out.println("密码不小于9位");
            lockNum++;
            return false;
        }
        return true;
    }

    public boolean isCookie() {
        return cookie;
    }

    private boolean loginBackGro(ReadLocalStor<User> userManager,boolean flag)
    {

        String passwd;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的账号");
        name = input.nextInt();//超过11位就报错
        System.out.println("请输入您的密码");
        passwd = input.next();
        if (validate(name, passwd)) {
            if (login( userManager,name, passwd)) {
                flag=true;
                return flag;
            }
        }
        if (lockNum < 3) {
            loginBackGro(userManager,flag);
        }
        return flag;
    }

    //检测是否需要重新输入验证密码
    public void control(ReadLocalStor<User> userManager) {
        cookie=loginBackGro(userManager,false);
        if(lockNum>=3)
        {
            System.out.println("多次输入错误账号被锁定，请稍后再尝试");
            Log log=new Log();
            log.logger.log(Level.SEVERE,"账号"+name+"多次输入错误账号被锁定");
            try
            {
                Thread.sleep(300000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            lockNum=0;
            loginBackGro(userManager,false);
        }
    }

    public boolean login(ReadLocalStor<User> userManager,int account, String passwd) {
        if (userManager.getList().containsKey(account)&&(userManager.getList().get(account).getPwd().equals(passwd))) {
            System.out.println("登录成功");
            lockNum = 0;
            return true;
        }
        else {
            System.out.println("账号或密码错误");
            lockNum++;
            return false;
        }
    }
}
