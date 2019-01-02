package com.example.a1.huangshuaiview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private MyView myview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        myview.invalidate();
        myview.postInvalidate();
    }


    private void initView() {
        myview = (MyView) findViewById(R.id.myview);
    }
}
