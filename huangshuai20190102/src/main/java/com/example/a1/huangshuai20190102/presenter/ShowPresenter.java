package com.example.a1.huangshuai20190102.presenter;



import com.example.a1.huangshuai20190102.contract.ISShowContrace;
import com.example.a1.huangshuai20190102.entity.User;
import com.example.a1.huangshuai20190102.model.ShowModel;
import com.example.a1.huangshuai20190102.net.RequestCallback;

import java.util.HashMap;

public class ShowPresenter extends ISShowContrace.IShowPresenter {
    private ShowModel showModel;
    private ISShowContrace.iShowView iShowView;
    public ShowPresenter(ISShowContrace.iShowView iShowView) {
        this.showModel=new ShowModel();
        this.iShowView = iShowView;
    }

    @Override
    public void show(HashMap<String, String> params) {
        if (showModel!=null){
            showModel.show(params, new RequestCallback() {
                @Override
                public void onFailUre(String msg) {
                    if (iShowView!=null){
                        iShowView.onFailUre(msg);
                    }
                }

                @Override
                public void onSuccess(User user) {
                    if (iShowView!=null){
                        iShowView.onSuccess(user);
                    }
                }

                @Override
                public void onSuccessMsg(String msg) {
                    if (iShowView!=null){
                        iShowView.onSuccessMsg(msg);
                    }
                }
            });
        }
    }

    public void destroy(){

        if (iShowView!=null){
            iShowView = null;
        }

    }
}
