package com.example.jianqiang.testdatabindingallsyntax;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goto1(View view) {
        startActivity(new Intent(this, A1Activity.class));
    }

    public void goto2(View view) {
        startActivity(new Intent(this, A2Activity.class));
    }

    public void goto3(View view) {
        startActivity(new Intent(this, A3Activity.class));
    }

    public void goto4(View view) {
        startActivity(new Intent(this, A4Activity.class));
    }

    public void goto5(View view) {
        startActivity(new Intent(this, A5Activity.class));
    }
}
