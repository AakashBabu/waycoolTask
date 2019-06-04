package com.test.waycooltask.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.test.waycooltask.R;

import butterknife.BindView;

public class CartActivity extends AppCompatActivity {

    @BindView(R.id.rv_product_list)
    RecyclerView rv_product_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
    }
}
