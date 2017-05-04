package com.example.jianqiang.testmvp.biz;

import com.example.jianqiang.testmvp.bean.User;

public class UserBiz implements IUserBiz
{
    @Override
    public void login(final String username, final String password, final OnLoginListener loginListener) {
        new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    Thread.sleep(2000);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

                //模拟登录成功
                if ("baobao".equals(username) && "jianqiang".equals(password))
                {
                    User user = new User();
                    user.setUsername(username);
                    user.setPassword(password);
                    loginListener.loginSuccess(user);
                } else
                {
                    loginListener.loginFailed();
                }
            }
        }.start();
    }
}