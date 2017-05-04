package com.example.jianqiang.testmvvm;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.jianqiang.testmvvm.databinding.ActivityPersonBinding;


public class PersonActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        ActivityPersonBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_person);
        User user = new User("Test", "User");
        binding.setUser(user);

    }
}
