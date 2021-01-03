package com.example.doanltdd.controller;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.doanltdd.R;
import com.example.doanltdd.fragment.AbsFragment;
import com.example.doanltdd.fragment.ArmFragment;
import com.example.doanltdd.fragment.BackFragment;
import com.example.doanltdd.fragment.ButtFragment;
import com.example.doanltdd.fragment.ChestFragment;
import com.example.doanltdd.fragment.FullBodyFragment;
import com.example.doanltdd.fragment.LegsFragment;
import com.example.doanltdd.fragmentBasic.WeekFourDayFiveFragment;
import com.example.doanltdd.fragmentBasic.WeekFourDayFourFragment;
import com.example.doanltdd.fragmentBasic.WeekFourDayOneFragment;
import com.example.doanltdd.fragmentBasic.WeekFourDayThreeFragment;
import com.example.doanltdd.fragmentBasic.WeekFourDayTwoFragment;
import com.example.doanltdd.fragmentBasic.WeekOneDayFiveFragment;
import com.example.doanltdd.fragmentBasic.WeekOneDayFourFragment;
import com.example.doanltdd.fragmentBasic.WeekOneDayOneFragment;
import com.example.doanltdd.fragmentBasic.WeekOneDayThreeFragment;
import com.example.doanltdd.fragmentBasic.WeekOneDayTwoFragment;
import com.example.doanltdd.fragmentBasic.WeekThreeDayFiveFragment;
import com.example.doanltdd.fragmentBasic.WeekThreeDayFourFragment;
import com.example.doanltdd.fragmentBasic.WeekThreeDayOneFragment;
import com.example.doanltdd.fragmentBasic.WeekThreeDayThreeFragment;
import com.example.doanltdd.fragmentBasic.WeekThreeDayTwoFragment;
import com.example.doanltdd.fragmentBasic.WeekTwoDayFiveFragment;
import com.example.doanltdd.fragmentBasic.WeekTwoDayFourFragment;
import com.example.doanltdd.fragmentBasic.WeekTwoDayOneFragment;
import com.example.doanltdd.fragmentBasic.WeekTwoDayThreeFragment;
import com.example.doanltdd.fragmentBasic.WeekTwoDayTwoFragment;
import com.example.doanltdd.fragmentHard.WeekFourDayFiveFragmentH;
import com.example.doanltdd.fragmentHard.WeekFourDayFourFragmentH;
import com.example.doanltdd.fragmentHard.WeekFourDayOneFragmentH;
import com.example.doanltdd.fragmentHard.WeekFourDayThreeFragmentH;
import com.example.doanltdd.fragmentHard.WeekFourDayTwoFragmentH;
import com.example.doanltdd.fragmentHard.WeekOneDayFiveFragmentH;
import com.example.doanltdd.fragmentHard.WeekOneDayFourFragmentH;
import com.example.doanltdd.fragmentHard.WeekOneDayOneFragmentH;
import com.example.doanltdd.fragmentHard.WeekOneDayThreeFragmentH;
import com.example.doanltdd.fragmentHard.WeekOneDayTwoFragmentH;
import com.example.doanltdd.fragmentHard.WeekThreeDayFiveFragmentH;
import com.example.doanltdd.fragmentHard.WeekThreeDayFourFragmentH;
import com.example.doanltdd.fragmentHard.WeekThreeDayOneFragmentH;
import com.example.doanltdd.fragmentHard.WeekThreeDayThreeFragmentH;
import com.example.doanltdd.fragmentHard.WeekThreeDayTwoFragmentH;
import com.example.doanltdd.fragmentHard.WeekTwoDayFiveFragmentH;
import com.example.doanltdd.fragmentHard.WeekTwoDayFourFragmentH;
import com.example.doanltdd.fragmentHard.WeekTwoDayOneFragmentH;
import com.example.doanltdd.fragmentHard.WeekTwoDayThreeFragmentH;
import com.example.doanltdd.fragmentHard.WeekTwoDayTwoFragmentH;
import com.example.doanltdd.fragmentmedium.WeekFourDayFiveFragmentM;
import com.example.doanltdd.fragmentmedium.WeekFourDayFourFragmentM;
import com.example.doanltdd.fragmentmedium.WeekFourDayOneFragmentM;
import com.example.doanltdd.fragmentmedium.WeekFourDayThreeFragmentM;
import com.example.doanltdd.fragmentmedium.WeekFourDayTwoFragmentM;
import com.example.doanltdd.fragmentmedium.WeekOneDayFiveFragmentM;
import com.example.doanltdd.fragmentmedium.WeekOneDayFourFragmentM;
import com.example.doanltdd.fragmentmedium.WeekOneDayOneFragmentM;
import com.example.doanltdd.fragmentmedium.WeekOneDayThreeFragmentM;
import com.example.doanltdd.fragmentmedium.WeekOneDayTwoFragmentM;
import com.example.doanltdd.fragmentmedium.WeekThreeDayFiveFragmentM;
import com.example.doanltdd.fragmentmedium.WeekThreeDayFourFragmentM;
import com.example.doanltdd.fragmentmedium.WeekThreeDayOneFragmentM;
import com.example.doanltdd.fragmentmedium.WeekThreeDayThreeFragmentM;
import com.example.doanltdd.fragmentmedium.WeekThreeDayTwoFragmentM;
import com.example.doanltdd.fragmentmedium.WeekTwoDayFiveFragmentM;
import com.example.doanltdd.fragmentmedium.WeekTwoDayFourFragmentM;
import com.example.doanltdd.fragmentmedium.WeekTwoDayOneFragmentM;
import com.example.doanltdd.fragmentmedium.WeekTwoDayThreeFragmentM;
import com.example.doanltdd.fragmentmedium.WeekTwoDayTwoFragmentM;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;



public class MyList extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ListView listView;
    ImageView imageView;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ex);
      //  getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imageView = findViewById(R.id.image);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navView);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
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

    private void setUp(String name) {
        if (name.equals("Cơ Bản - Tuần 1 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekOneDayOneFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 1 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekOneDayTwoFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 1 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekOneDayThreeFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 1 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekOneDayFourFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 1 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekOneDayFiveFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 2 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekTwoDayOneFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 2 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekTwoDayTwoFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 2 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekTwoDayThreeFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 2 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekTwoDayFourFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 2 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekTwoDayFiveFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 3 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekThreeDayOneFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 3 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekThreeDayTwoFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 3 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekThreeDayThreeFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 3 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekThreeDayFourFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 3 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekThreeDayFiveFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 4 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekFourDayOneFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 4 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekFourDayTwoFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 4 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekFourDayThreeFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 4 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekFourDayFourFragment();
            loadFragment(fragment);
        }
        if (name.equals("Cơ Bản - Tuần 4 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekFourDayFiveFragment();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 1 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekOneDayOneFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 1 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekOneDayTwoFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 1 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekOneDayThreeFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 1 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekOneDayFourFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 1 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekOneDayFiveFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 2 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekTwoDayOneFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 2 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekTwoDayTwoFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 2 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekTwoDayThreeFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 2 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekTwoDayFourFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 2 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekTwoDayFiveFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 3 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekThreeDayOneFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 3 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekThreeDayTwoFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 3 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekThreeDayThreeFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 3 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekThreeDayFourFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 3 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekThreeDayFiveFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 4 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekFourDayOneFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 4 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekFourDayTwoFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 4 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekFourDayThreeFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 4 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekFourDayFourFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Trung Bình - Tuần 4 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body3));
            Fragment fragment = new WeekFourDayFiveFragmentM();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 1 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekOneDayOneFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 1 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekOneDayTwoFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 1 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekOneDayThreeFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 1 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekOneDayFourFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 1 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekOneDayFiveFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 2 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekTwoDayOneFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 2 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekTwoDayTwoFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 2 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekTwoDayThreeFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 2 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekTwoDayFourFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 2 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekTwoDayFiveFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 3 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekThreeDayOneFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 3 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekThreeDayTwoFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 3 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekThreeDayThreeFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 3 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekThreeDayFourFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 3 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekThreeDayFiveFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 4 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekFourDayOneFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 4 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekFourDayTwoFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 4 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekFourDayThreeFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 4 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekFourDayFourFragmentH();
            loadFragment(fragment);
        }
        if (name.equals("Nâng Cao - Tuần 4 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new WeekFourDayFiveFragmentH();
            loadFragment(fragment);
        }

        if (name.equals("CƠ BỤNG")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.absbackground));
            Fragment fragment = new AbsFragment();
            loadFragment(fragment);
        }
        if (name.equals("CƠ TAY")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.armbackground));
            Fragment fragment = new ArmFragment();
            loadFragment(fragment);
        }
        if (name.equals("CƠ MÔNG")) {
            toolbar.setTitle(name);
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new ButtFragment();
            loadFragment(fragment);
        }
        if (name.equals("CƠ NGỰC")) {
            toolbar.setTitle(name);
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.chestbackground));
            Fragment fragment = new ChestFragment();
            loadFragment(fragment);
        }
        if (name.equals("CƠ TOÀN THÂN")) {
            toolbar.setTitle(name);
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.fullbodybackground));
            Fragment fragment = new FullBodyFragment();
            loadFragment(fragment);
        }
        if (name.equals("CƠ CHÂN")) {
            toolbar.setTitle(name);
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.legsbackground));
            Fragment fragment = new LegsFragment();
            loadFragment(fragment);
        }
        if (name.equals("CƠ SAU")) {
            toolbar.setTitle(name);
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.backbackground));
            Fragment fragment = new BackFragment();
            loadFragment(fragment);
        }

        if (name.equals("CƠ BỤNG")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.absbackground));
            Fragment fragment = new AbsFragment();
            loadFragment(fragment);
        }
        if (name.equals("CƠ TAY")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.armbackground));
            Fragment fragment = new ArmFragment();
            loadFragment(fragment);
        }
        if (name.equals("CƠ MÔNG")) {
            toolbar.setTitle(name);
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.buttbackground));
            Fragment fragment = new ButtFragment();
            loadFragment(fragment);
        }
        if (name.equals("CƠ NGỰC")) {
            toolbar.setTitle(name);
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.chestbackground));
            Fragment fragment = new ChestFragment();
            loadFragment(fragment);
        }
        if (name.equals("CƠ TOÀN THÂN")) {
            toolbar.setTitle(name);
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.fullbodybackground));
            Fragment fragment = new FullBodyFragment();
            loadFragment(fragment);
        }
        if (name.equals("CƠ CHÂN")) {
            toolbar.setTitle(name);
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.legsbackground));
            Fragment fragment = new LegsFragment();
            loadFragment(fragment);
        }
        if (name.equals("CƠ SAU")) {
            toolbar.setTitle(name);
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.backbackground));
            Fragment fragment = new BackFragment();
            loadFragment(fragment);
        }
        if (name.equals("BỤNG - TAY - LƯNG")) {
            toolbar.setTitle(name);
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.mixbackgroundone));
        }
        if (name.equals("MÔNG - NGỰC")) {
            toolbar.setTitle(name);
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.mixbackgroundtwo));
        }
        if (name.equals("TOÀN THÂN - CHÂN")) {
            toolbar.setTitle(name);
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.mixbackgroundtwo));
        }

    }
    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction =
                getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_fragment_host, fragment);
        transaction.commit();
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

