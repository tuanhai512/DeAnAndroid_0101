package com.example.doanltdd.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doanltdd.R;
import com.example.doanltdd.adapter.ExerciseAdapter;
import com.example.doanltdd.adapter.ExerciseHardAdapter;
import com.example.doanltdd.adapter.ExerciseMediumAdapter;
import com.example.doanltdd.model.Exercise;
import com.example.doanltdd.model.ExerciseHard;
import com.example.doanltdd.model.ExerciseMedium;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    RecyclerView rvData1,rvData2,rvData3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvData1 = findViewById(R.id.rcv_item);
        rvData2 = findViewById(R.id.rcv_item1);
        rvData3 = findViewById(R.id.rcv_item2);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navView);
        toolbar = findViewById(R.id.toolbar);

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
                else if (item.getItemId() == R.id.tips) {
                    Intent intent = new Intent(MainActivity.this,Tips.class);
                    startActivity(intent);
                }
                return false;
            }
        });

        acctionToolBar();

        ExerciseAdapter exerciseAdapter = new ExerciseAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvData1.setLayoutManager(linearLayoutManager);
        rvData1.setFocusable(false);
        rvData1.setNestedScrollingEnabled(false);
        exerciseAdapter.setData(getlistExcercise());
        rvData1.setAdapter(exerciseAdapter);

        ExerciseHardAdapter exerciseHardAdapter = new ExerciseHardAdapter();
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        rvData2.setLayoutManager(linearLayoutManager1);
        rvData2.setFocusable(false);
        rvData2.setNestedScrollingEnabled(false);
        exerciseHardAdapter.setData(getlistExcerciseHard());
        rvData2.setAdapter(exerciseHardAdapter);

        ExerciseMediumAdapter exerciseMediumAdapter = new ExerciseMediumAdapter();
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this);
        rvData3.setLayoutManager(linearLayoutManager2);
        rvData3.setFocusable(false);
        rvData3.setNestedScrollingEnabled(false);
        exerciseMediumAdapter.setData(getlistExcerciseMedium());
        rvData3.setAdapter(exerciseMediumAdapter);


    }

    private List<ExerciseHard> getlistExcerciseHard() {
        List<ExerciseHard> exerciseList = new ArrayList<>();
        exerciseList.add(new ExerciseHard(R.drawable.absbackground,"Cơ bụng"));
        exerciseList.add(new ExerciseHard(R.drawable.armbackground,"Cơ tay"));
        exerciseList.add(new ExerciseHard(R.drawable.buttbackground,"Cơ mông"));
        exerciseList.add(new ExerciseHard(R.drawable.chestbackground,"Cơ ngực"));
        exerciseList.add(new ExerciseHard(R.drawable.fullbodybackground,"Cơ toàn thân"));
        exerciseList.add(new ExerciseHard(R.drawable.legsbackground,"Cơ chân"));
        exerciseList.add(new ExerciseHard(R.drawable.backbackground,"Cơ lưng"));

        return exerciseList;
    }
    private List<Exercise> getlistExcercise() {
        List<Exercise> exerciseList1 = new ArrayList<>();
        exerciseList1.add(new Exercise(R.drawable.body2,"Cơ bản"));
        exerciseList1.add(new Exercise(R.drawable.body3,"Trung bình"));
        exerciseList1.add(new Exercise(R.drawable.buttbackground,"Nâng cao"));


        return exerciseList1;

    }
    private List<ExerciseMedium> getlistExcerciseMedium() {
        List<ExerciseMedium> exerciseList2 = new ArrayList<>();
        exerciseList2.add(new ExerciseMedium(R.drawable.mixbackgroundone,"BỤNG - TAY - LƯNG"));
        exerciseList2.add(new ExerciseMedium(R.drawable.mixbackgroundtwo,"MÔNG - NGỰC"));
        exerciseList2.add(new ExerciseMedium(R.drawable.mixbackgroundthree,"TOÀN THÂN - CHÂN"));
        return exerciseList2;

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
}



