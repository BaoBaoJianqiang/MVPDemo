package com.example.jianqiang.testmvp.view;

import com.example.jianqiang.testmvp.bean.User;
import com.example.jianqiang.testmvp.engine.ActivityScope;
import com.example.jianqiang.testmvp.presenter.UserLoginPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class UserLoginActivityModule {

    private UserLoginActivity userLoginActivity;

    public UserLoginActivityModule(UserLoginActivity userLoginActivity) {
        this.userLoginActivity = userLoginActivity;
    }


    @Provides
    @ActivityScope
    UserLoginActivity provideUserLoginActivity() {
        return userLoginActivity;
    }


    @Provides
    @ActivityScope
    UserLoginPresenter provideMainActivityPresenter(UserLoginActivity userLoginActivity) {
        return new UserLoginPresenter(userLoginActivity);
    }
}
