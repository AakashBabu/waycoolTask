package com.test.waycooltask.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.test.waycooltask.R;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder>{

    Context context;
    List<String> model;
    int pixels;
    int showCount = 6;

    public CategoryAdapter(Context context, List<String> model,int pixels) {
        this.context = context;
        this.model = model;
        this.pixels = pixels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_category,null));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        RelativeLayout.LayoutParams rel_btn = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, pixels);
        viewHolder.ll_holder.setLayoutParams(rel_btn);
        viewHolder.txt_title.setText(model.get(i));
        if(i<= showCount){
            viewHolder.ll_holder.setVisibility(View.VISIBLE);
        }else
            viewHolder.ll_holder.setVisibility(View.GONE);
//        Picasso.get().load(banner.get(i)).into(viewHolder.img_cat);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView img_cat;
        TextView txt_title;
        RelativeLayout ll_holder;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ll_holder = itemView.findViewById(R.id.ll_holder);
            img_cat = itemView.findViewById(R.id.img_cat);
            txt_title = itemView.findViewById(R.id.txt_title);
        }
    }

}
