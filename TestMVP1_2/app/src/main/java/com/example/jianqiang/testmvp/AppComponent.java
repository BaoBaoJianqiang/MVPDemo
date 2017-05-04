package com.example.jianqiang.testmvp;

import android.app.Application;
import com.example.jianqiang.testmvp.bean.User;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    Application getApplication();
}
