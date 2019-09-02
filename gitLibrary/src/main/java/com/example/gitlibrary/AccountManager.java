package com.example.gitlibrary;

/**
 * Created by yangyeah on 2019/9/2
 * <p>
 * describe:
 */
public class AccountManager {
    private AccountManager(){}
    private static class Singleton{
        private static AccountManager manager=new AccountManager();
    }
    public static AccountManager getInstance(){
        return Singleton.manager;
    }

    public void init() {

    }
}
