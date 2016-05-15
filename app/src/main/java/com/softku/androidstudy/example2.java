package com.softku.androidstudy;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by rngks on 2016-05-15.
 */
public class example2 extends AppCompatActivity{

    CoordinatorLayout lay;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;
    TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example2);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout, R.string.app_name,R.string.app_name){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        tab =(TabLayout)findViewById(R.id.tab);
        tab.addTab(tab.newTab().setText("하나"));
        tab.addTab(tab.newTab().setText("둘"));
        tab.addTab(tab.newTab().setText("세엣"));
        tab.addTab(tab.newTab().setText("네에에엣"));
        tab.addTab(tab.newTab().setText("다아앙아아아아섯"));
        tab.addTab(tab.newTab().setText("여섯"));


        lay = (CoordinatorLayout) findViewById(R.id.lay);
        Snackbar.make(lay,"상협이",Snackbar.LENGTH_SHORT).show();

    }
}
