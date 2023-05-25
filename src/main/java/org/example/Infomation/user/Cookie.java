package org.example.Infomation.user;

public class Cookie//外部类可以使用它吗 TODO
{
    String name;
    boolean beAuthenticated=false;

    public Cookie() {
    }

    public Cookie(String name, boolean beAuthenticated) {
        this.name = name;
        this.beAuthenticated = beAuthenticated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBeAuthenticated() {
        return beAuthenticated;
    }

    public void setBeAuthenticated(boolean beAuthenticated) {
        this.beAuthenticated = beAuthenticated;
    }
}
