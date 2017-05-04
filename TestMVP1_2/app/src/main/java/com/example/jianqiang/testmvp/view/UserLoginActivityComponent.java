package com.example.jianqiang.testmvp.view;

import com.example.jianqiang.testmvp.AppComponent;
import com.example.jianqiang.testmvp.engine.ActivityScope;
import com.example.jianqiang.testmvp.presenter.UserLoginPresenter;

import dagger.Component;

@ActivityScope
@Component(modules = UserLoginActivityModule.class, dependencies = AppComponent.class)
public interface UserLoginActivityComponent {
    UserLoginActivity inject(UserLoginActivity mainActivity);

    UserLoginPresenter presenter();
}