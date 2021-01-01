package com.example.doanltdd.controller;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doanltdd.R;
import com.example.doanltdd.adapter.TipsAdapter;
import com.example.doanltdd.model.ItemObject;

import java.util.ArrayList;
import java.util.List;

public class Tips extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        
        recyclerView = findViewById(R.id.rcv_tips_item);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        TipsAdapter tipsAdapter = new TipsAdapter();
        tipsAdapter.setData(getListItem());
        recyclerView.setAdapter(tipsAdapter);
    }

    private List<ItemObject> getListItem() {
        List<ItemObject> list = new ArrayList<>();
        for(int i=0;i<20;i++)
        {
            list.add(new ItemObject("Bài 1"+i,"content"+i));
        }
        return list;
    }
}