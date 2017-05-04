package com.example.jianqiang.testmvp.view;

import android.app.Activity;
import android.os.Bundle;

import com.example.jianqiang.testmvp.R;
import com.example.jianqiang.testmvp.bean.User;

public interface IUserLoginView
{
    //获取输入值，用于登录
    String getUserName();
    String getPassword();

    //Reset操作
    void clearUserName();
    void clearPassword();

    //进度条
    void showLoading();
    void hideLoading();

    //登录成功，跳转Activity；登录失败，显示错误信息
    void toMainActivity(User user);
    void showFailedError();

}
