package org.example.interactive.Lib;

public class PromptPage {
    public PromptPage() {
    }
    public static void homepagePrompt()
    {
        System.out.println("----------");
        System.out.println("""
                 * 1.登录
                 * 2.查找书
                 * 3.还书
                 * q.退出
                """);
        System.out.println("----------");
    }
    public static void searchBookReminder()
    {
        System.out.println("----------");
        System.out.println("""
                 * 1.借书
                 * 2.查找其他的书籍
                 * q.退出
                """);
        System.out.println("----------");
    }
}
