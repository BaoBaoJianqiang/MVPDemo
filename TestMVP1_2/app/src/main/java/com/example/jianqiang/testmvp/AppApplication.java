package com.example.jianqiang.testmvp;

import android.app.Application;
import android.content.Context;

public class AppApplication extends Application {

    private AppComponent appComponent;

    public static AppApplication get(Context context) {
        return (AppApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        //Component，把AppComponent和AppApplication粘合在一起
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }


    public AppComponent getAppComponent() {
        return appComponent;
    }
}