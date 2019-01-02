package com.example.a1.huangshuai20190102.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.Toast;

import com.example.a1.huangshuai20190102.R;
import com.example.a1.huangshuai20190102.contract.ISShowContrace;
import com.example.a1.huangshuai20190102.entity.User;
import com.example.a1.huangshuai20190102.net.OkhttpUtils;
import com.example.a1.huangshuai20190102.presenter.ShowPresenter;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ISShowContrace.iShowView {
    private RecyclerView gv;
    private String page = "1";
    private ShowPresenter showPresenter;
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onKeywordsError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPageError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailUre(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSuccess(User user) {

    }

    @Override
    public void onSuccessMsg(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        showPresenter.destroy();
        OkhttpUtils.getmInstance().cancelAllTask();
        //dsaudhuisayusy
    }
}
