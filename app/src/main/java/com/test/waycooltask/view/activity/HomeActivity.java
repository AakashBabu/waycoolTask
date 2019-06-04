package com.test.waycooltask.view.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.test.waycooltask.R;
import com.test.waycooltask.view.adapter.BannerAdapter;

import java.util.ArrayList;

import butterknife.BindView;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.list_banner)
    RecyclerView list_banner;

    @BindView(R.id.rcv_products)
    RecyclerView rcv_products;

    @BindView(R.id.tab_items)
    TabLayout tab_items;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void setUpBanner(){
        LinearLayoutManager layoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        list_banner.setLayoutManager(layoutManager);
        list_banner.setAdapter(new BannerAdapter(this,new ArrayList<String>()));
    }

    public void setUpTab(){
        String[] tabs = {"Popular","Recent","Whats New","Seasonal","Todays Offer"};
        for(int i=0;i<tabs.length;i++)
            tab_items.addTab(tab_items.newTab().setText(tabs[i]));
    }

}
