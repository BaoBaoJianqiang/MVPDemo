package com.example.jianqiang.testmvp.biz;

import com.example.jianqiang.testmvp.bean.User;

public interface OnLoginListener
{
    void loginSuccess(User user);

    void loginFailed();
}