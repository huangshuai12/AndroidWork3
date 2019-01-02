package com.example.a1.huangshuai20190102.contract;

import com.example.a1.huangshuai20190102.entity.User;
import com.example.a1.huangshuai20190102.net.RequestCallback;

import java.util.HashMap;

public interface ISShowContrace {
    public abstract class IShowPresenter{
        public abstract void show(HashMap<String,String> params);
    }
    interface IShowModel{
        void show(HashMap<String,String> params, RequestCallback requestCallback);
    }
    interface iShowView{
        void onKeywordsError(String error);
        void onPageError(String error);
        void onFailUre(String msg);
        void onSuccess(User user);
        void onSuccessMsg(String msg);
    }
}
