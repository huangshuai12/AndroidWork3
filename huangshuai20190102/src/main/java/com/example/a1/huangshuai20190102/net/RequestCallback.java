package com.example.a1.huangshuai20190102.net;

import com.example.a1.huangshuai20190102.entity.User;

public interface RequestCallback {
    public void onFailUre(String msg);
    public void onSuccess(User user);
    void onSuccessMsg(String msg);
}
