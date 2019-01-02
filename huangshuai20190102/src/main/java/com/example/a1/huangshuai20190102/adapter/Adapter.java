package com.example.a1.huangshuai20190102.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.a1.huangshuai20190102.R;
import com.example.a1.huangshuai20190102.entity.User;



import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context context;
    private List<User.DataBean.BannerBean> list;

    public Adapter(Context context) {
        this.context = context;
        this.list=new ArrayList<>();
    }

    public void setList(List<User.DataBean.BannerBean> list) {
        if (list!=null) {
            this.list=list;
        }
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.pop, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        User.DataBean.BannerBean dataBean = list.get(i);
        String[] split = dataBean.getUrl().split("!");
        Glide.with(context).load(split[0]).into(viewHolder.image);
        viewHolder.title.setText(list.get(i).getTitle());
        viewHolder.price.setText(list.get(i).getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView title;
        private TextView price;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
            price = itemView.findViewById(R.id.price);
        }
    }
}
