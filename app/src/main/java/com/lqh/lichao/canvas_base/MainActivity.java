package com.lqh.lichao.canvas_base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //setContentView(new MyView(this));
        //setContentView(new MyClipImage(this));
        //setContentView(new MyView1(MainActivity.this));
        //setContentView(new MyView2(MainActivity.this));
        setContentView(new MyView3(MainActivity.this));
    }
}
