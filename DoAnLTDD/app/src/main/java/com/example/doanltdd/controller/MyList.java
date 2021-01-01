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
import com.example.doanltdd.fragmentMedium.WeekOneDayFiveFragment;
import com.example.doanltdd.fragmentMedium.WeekOneDayFourFragment;
import com.example.doanltdd.fragmentMedium.WeekOneDayOneFragment;
import com.example.doanltdd.fragmentMedium.WeekOneDayThreeFragment;
import com.example.doanltdd.fragmentMedium.WeekOneDayTwoFragment;
import com.example.doanltdd.fragmentMedium.WeekTwoDayOneFragment;
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

//        listView = findViewById(R.id.listView);
//        List<Contact> contacts = new ArrayList<>();
//        contacts.add(new Contact("Adominal Crunch",R.drawable.abs));
//        contacts.add(new Contact("Bicycle Crunches",R.drawable.abs));
//        contacts.add(new Contact("Crossarm Crunches",R.drawable.abs));
//        contacts.add(new Contact("Flutter Kick",R.drawable.abs));
//        contacts.add(new Contact("Long Arm Crunch",R.drawable.abs));
//        contacts.add(new Contact("Heel Touch",R.drawable.abs));
//        contacts.add(new Contact("Russian Twist",R.drawable.abs));
//        contacts.add(new Contact("Scissors",R.drawable.abs));
//        contacts.add(new Contact("Straight Arm Plank",R.drawable.abs));
//        contacts.add(new Contact("Toy Sloiders",R.drawable.abs));
//        MyAdapter myAdapter = new MyAdapter(this,R.layout.activity_list_row_ex,contacts);
//        listView.setAdapter(myAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if(position==0) {
//                    Intent intent = new Intent(view.getContext(), Detail.class);
//                    intent.putExtra("name","Adominal Crunch");
//                    intent.putExtra("noidung", getString(R.string.adominalcrunch));
//                    startActivity(intent);
//                }
//                if(position==1) {
//                    Intent intent = new Intent(view.getContext(), Detail.class);
//                    intent.putExtra("name","Bicycle Crunch");
//                    intent.putExtra("noidung", getString(R.string.bicyclecrunch));
//                    startActivity(intent);
//                }
//                if(position==2) {
//                    Intent intent = new Intent(view.getContext(), Detail.class);
//                    startActivity(intent);
//                }
//                if(position==3) {
//                    Intent intent = new Intent(view.getContext(), Detail.class);
//                    startActivity(intent);
//                }
//                if(position==4) {
//                    Intent intent = new Intent(view.getContext(), Detail.class);
//                    startActivity(intent);
//                }
//                if(position==5) {
//                    Intent intent = new Intent(view.getContext(), Detail.class);
//                    startActivity(intent);
//                }
//                if(position==6) {
//                    Intent intent = new Intent(view.getContext(), Detail.class);
//                    startActivity(intent);
//                }
//                if(position==7) {
//                    Intent intent = new Intent(view.getContext(), Detail.class);
//                    startActivity(intent);
//                }
//                if(position==8) {
//                    Intent intent = new Intent(view.getContext(), Detail.class);
//                    startActivity(intent);
//                }
//                if(position==9) {
//                    Intent intent = new Intent(view.getContext(), Detail.class);
//                    startActivity(intent);
//                }
//            }
//        });
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
        if (name.equals("Tuần 2 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
            Fragment fragment = new WeekTwoDayOneFragment();
            loadFragment(fragment);
        }
        if (name.equals("Tuần 2 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
        }
        if (name.equals("Tuần 2 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
        }
        if (name.equals("Tuần 2 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
        }
        if (name.equals("Tuần 2 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
        }
        if (name.equals("Tuần 3 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
        }
        if (name.equals("Tuần 3 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
        }
        if (name.equals("Tuần 3 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
        }
        if (name.equals("Tuần 3 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
        }
        if (name.equals("Tuần 3 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
        }
        if (name.equals("Tuần 4 - Ngày 1")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2
            ));
        }
        if (name.equals("Tuần 4 - Ngày 2")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
        }
        if (name.equals("Tuần 4 - Ngày 3")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
        }
        if (name.equals("Tuần 4 - Ngày 4")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
        }
        if (name.equals("Tuần 4 - Ngày 5")) {
            toolbar.setTitle(name);
            toolbar.setBackground(getDrawable(R.drawable.body2));
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

