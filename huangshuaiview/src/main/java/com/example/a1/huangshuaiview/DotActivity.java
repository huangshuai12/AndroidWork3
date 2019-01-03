package com.example.a1.huangshuaiview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.a1.huangshuaiview.bean.DotBean;

import java.util.Random;

public class DotActivity extends AppCompatActivity {

    private DoView dotview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dot);
        initView();
    }

    public void add(View view) {
        DotBean dotBean = new DotBean();
        dotBean.setX(new Random().nextInt(800));
        dotBean.setY(new Random().nextInt(1500));
        dotBean.setChecked(false);
        dotview.add(dotBean);
    }

    public void clear(View view) {
    }

    private void initView() {
        dotview = (DoView) findViewById(R.id.dotview);
    }
}
