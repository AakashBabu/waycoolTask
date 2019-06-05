package com.test.waycooltask.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ScrollView;

import com.test.waycooltask.R;
import com.test.waycooltask.view.adapter.CategoryAdapter;

import java.util.ArrayList;

import butterknife.BindView;

public class CategoryActivity extends AppCompatActivity {

    @BindView(R.id.rv_category)
    RecyclerView rv_category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        setUpCategoryList();
    }

    private void setUpCategoryList() {
        GridLayoutManager layout = new GridLayoutManager(this,3);
        rv_category.setLayoutManager(layout);
        rv_category.setAdapter(new CategoryAdapter(this,new ArrayList<String>(),rv_category.getHeight()/3));
    }
}
