package com.example.jianqiang.testdatabindingallsyntax;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.jianqiang.testdatabindingallsyntax.databinding.ActivityA2Binding;

public class A2Activity extends Activity {

    ActivityA2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_a2);
        User user = new User("Test", "User");
        binding.setUser(user);

        binding.setName1("baobao");

    }

    public void showName(View view) {
        String name1 = binding.getName1();
        TextView tv1 = (TextView)findViewById(R.id.t1);
        tv1.setText(name1);
    }
}
