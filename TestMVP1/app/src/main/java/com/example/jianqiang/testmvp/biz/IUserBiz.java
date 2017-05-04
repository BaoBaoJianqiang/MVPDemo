package com.example.jianqiang.testmvp.biz;

public interface IUserBiz
{
    public void login(String username, String password, OnLoginListener loginListener);
}