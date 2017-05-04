package com.example.jianqiang.testmvp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.jianqiang.testmvp.AppComponent;
import com.example.jianqiang.testmvp.DaggerAppComponent;
import com.example.jianqiang.testmvp.R;
import com.example.jianqiang.testmvp.bean.User;
import com.example.jianqiang.testmvp.engine.BaseActivity;
import com.example.jianqiang.testmvp.presenter.UserLoginPresenter;

import javax.inject.Inject;

public class UserLoginActivity extends BaseActivity implements IUserLoginView
{
    private EditText mEtUsername, mEtPassword;
    private Button mBtnLogin, mBtnClear;
    private ProgressBar mPbLoading;

    @Inject
    UserLoginPresenter mUserLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initViews();
    }

    private void initViews()
    {
        mEtUsername = (EditText) findViewById(R.id.editTextUserName);
        mEtPassword = (EditText) findViewById(R.id.editTextPassword);

        mBtnClear = (Button) findViewById(R.id.buttonReset);
        mBtnLogin = (Button) findViewById(R.id.buttonLogin);

        mPbLoading = (ProgressBar) findViewById(R.id.id_pb_loading);

        mBtnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mUserLoginPresenter.login();
            }
        });
        mBtnClear.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                mUserLoginPresenter.clear();
            }
        });
    }


    @Override
    public String getUserName()
    {
        return mEtUsername.getText().toString();
    }

    @Override
    public String getPassword()
    {
        return mEtPassword.getText().toString();
    }

    @Override
    public void clearUserName()
    {
        mEtUsername.setText("");
    }

    @Override
    public void clearPassword()
    {
        mEtPassword.setText("");
    }

    @Override
    public void showLoading()
    {
        mPbLoading.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading()
    {
        mPbLoading.setVisibility(View.GONE);
    }

    @Override
    public void toMainActivity(User user)
    {
        Toast.makeText(this, user.getUsername() +
                " login success , to MainActivity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailedError() {
        Toast.makeText(this,
                "login failed", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void setupActivityComponent(AppComponent appComponent) {
        //UserLoginActivityComponent，
        // 把UserLoginActivityModule和  UserLoginActivity、UserLoginPresenter捆在一起
        DaggerUserLoginActivityComponent.builder()
                .appComponent(appComponent)
                .userLoginActivityModule(new UserLoginActivityModule(this))
                .build()
                .inject(this);
    }
}