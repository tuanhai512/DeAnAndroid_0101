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
import com.example.doanltdd.adapter.ListDayOnWeekAdapter;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ListDayOnWeek extends AppCompatActivity {
    ExpandableListView expandableListView;
    List<String> listGroup;
    HashMap<String,List<String>> listItem;
    ListDayOnWeekAdapter adapter;
    NavigationView navigationView, navigationView2;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_day_on_week);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navView);
        toolbar = findViewById(R.id.toolbar);
        expandableListView = findViewById(R.id.expandable_listview);
        listGroup = new ArrayList<>();
        listItem = new HashMap<>();
        adapter = new ListDayOnWeekAdapter(this,listGroup,listItem);
        expandableListView.setAdapter(adapter);
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
        if (name.equals("CƠ BẢN")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));


        }
    }

    private void initListData() {
        listGroup.add(getString (R.string.group1));
        listGroup.add(getString (R.string.group2));
        listGroup.add(getString (R.string.group3));
        listGroup.add(getString (R.string.group4));

        String[] array;
        List<String> list1 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group1);
        for(String item: array)
        {
            list1.add(item);
        }
        List<String> list2 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group1);
        for(String item: array)
        {
            list2.add(item);
        }
        List<String> list3 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group1);
        for(String item: array)
        {
            list3.add(item);
        }
        List<String> list4 = new ArrayList<>();
        array = getResources().getStringArray(R.array.group1);
        for(String item: array)
        {
            list4.add(item);
        }
        listItem.put(listGroup.get(0),list1);
        listItem.put(listGroup.get(1),list2);
        listItem.put(listGroup.get(2),list3);
        listItem.put(listGroup.get(3),list4);
        adapter.notifyDataSetChanged();
    }

}