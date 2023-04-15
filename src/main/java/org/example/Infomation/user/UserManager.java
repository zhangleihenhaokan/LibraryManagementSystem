package org.example.Infomation.user;
import org.example.abstraction.ReadLocalStor;
import java.io.File;
import java.util.Scanner;


public class UserManager extends ReadLocalStor<User> {

    public UserManager() {
        super();
    }

    @Override
    //读取本地存储的数据
    public  void  createThing(){
        createThing("D:\\user.txt");
    }
    public void createThing(String name) {
        try (Scanner input = new Scanner(new File(name))) {
            while (input.hasNextLine()) {
                String[] UserInfor = (input.nextLine().split(" "));
                User user = new User(UserInfor[0], UserInfor[1]);
                increaThing(user);
                setNum(getNum() + 1);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void increaThing(User user) {

        getList().put(getNum(), user);
        getSearch().put(user.getName(), user);
    }


}

