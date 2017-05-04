package com.example.jianqiang.testdatabindingallsyntax;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.jianqiang.testdatabindingallsyntax.databinding.ActivityA1Binding;

public class A1Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityA1Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_a1);
        User user = new User("Test", "User");
        binding.setUser(user);

        binding.setName1("baobao");
    }
}
