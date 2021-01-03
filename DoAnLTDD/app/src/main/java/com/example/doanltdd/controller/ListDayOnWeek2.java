package com.example.doanltdd.controller;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.doanltdd.R;
import com.example.doanltdd.adapter.ListDayOnWeekAdapter2;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ListDayOnWeek2 extends AppCompatActivity {
    ExpandableListView expandableListView;
    List<String> listGroup2;
    HashMap<String,List<String>> listItem;
    ListDayOnWeekAdapter2 listDayOnWeekAdapter2;
    NavigationView navigationView, navigationView2;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    Bundle bundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_day_on_week);

        //getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      //  getSupportActionBar().setHomeButtonEnabled(true);
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navView);
        toolbar = findViewById(R.id.toolbar);
        expandableListView = findViewById(R.id.expandable_listview);
        listGroup2 = new ArrayList<>();
        listItem = new HashMap<>();
        listDayOnWeekAdapter2 = new ListDayOnWeekAdapter2(this,listGroup2,listItem);
        expandableListView.setAdapter(listDayOnWeekAdapter2);
        initListData();
        bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("name");
            setUp(name);
        }
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.info) {
                    Toast.makeText(getApplicationContext(), "Thông tin", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else if (item.getItemId() == R.id.setup) {
                    Toast.makeText(getApplicationContext(), "Cài đặt", Toast.LENGTH_SHORT).show();
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
                return false;
            }
        });
        acctionToolBar();

    }

    private void acctionToolBar() {
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_baseline_dehaze_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    private void setUp(String name) {
        if (name.equals("NÂNG CAO")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
        }

    }

    private void initListData() {
        listGroup2.add(getString (R.string.group1));
        listGroup2.add(getString (R.string.group2));
        listGroup2.add(getString (R.string.group3));
        listGroup2.add(getString (R.string.group4));

        String[] array;
        List<String> list1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group3);
        for(String item: array)
        {
            list1.add(item);
        }
        List<String> list2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group3);
        for(String item: array)
        {
            list2.add(item);
        }
        List<String> list3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group3);
        for(String item: array)
        {
            list3.add(item);
        }
        List<String> list4 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group3);
        for(String item: array)
        {
            list4.add(item);
        }
        listItem.put(listGroup2.get(0),list1);
        listItem.put(listGroup2.get(1),list2);
        listItem.put(listGroup2.get(2),list3);
        listItem.put(listGroup2.get(3),list4);
        listDayOnWeekAdapter2.notifyDataSetChanged();
    }

}