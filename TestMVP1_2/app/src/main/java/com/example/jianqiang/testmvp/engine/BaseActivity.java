package com.example.jianqiang.testmvp.engine;

import android.app.Activity;
import android.os.Bundle;

import com.example.jianqiang.testmvp.AppApplication;
import com.example.jianqiang.testmvp.AppComponent;

public abstract class BaseActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupActivityComponent(AppApplication.get(this).getAppComponent());
    }

    protected abstract  void setupActivityComponent(AppComponent appComponent);
}
