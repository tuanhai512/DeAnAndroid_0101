package com.example.doanltdd.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.doanltdd.R;
import com.example.doanltdd.controller.MyList;

import java.util.HashMap;
import java.util.List;

public class ListDayOnWeekAdapter2 extends BaseExpandableListAdapter {

    Context context;
    List<String> listgroup2;
    HashMap<String,List<String>> listItem;

    public ListDayOnWeekAdapter2(Context context, List<String> listgroup2, HashMap<String, List<String>> listItem) {
        this.context = context;
        this.listgroup2 = listgroup2;
        this.listItem = listItem;
    }


    @Override
    public int getGroupCount() {
        return listgroup2.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.listItem.get(this.listgroup2.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.listgroup2.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.listItem.get(this.listgroup2.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String group =(String) getGroup(groupPosition);
        if(convertView == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) this
                    .context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_group,null);
        }
        TextView textView =convertView.findViewById(R.id.list_parent);
        textView.setText(group);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String child =(String) getChild(groupPosition,childPosition);
        if(convertView == null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) this
                    .context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_item,null);
        }
        TextView textView =convertView.findViewById(R.id.list_child);
        textView.setText(child);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (groupPosition == 0) {
                    if (childPosition == 0)
                    {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 1 - Ngày 1");
                        context.startActivity(intent);
                    }
                    if (childPosition == 1) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 1 - Ngày 2");
                        context.startActivity(intent);
                    }
                    if (childPosition == 2) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 1 - Ngày 3");
                        context.startActivity(intent);
                    }
                    if (childPosition == 3) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 1 - Ngày 4");
                        context.startActivity(intent);
                    }
                    if (childPosition == 4) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 1 - Ngày 5");
                        context.startActivity(intent);
                    }
                }
                if (groupPosition == 1) {
                    if (childPosition == 0)
                    {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 2 - Ngày 1");
                        context.startActivity(intent);
                    }
                    if (childPosition == 1) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 2 - Ngày 2");
                        context.startActivity(intent);
                    }
                    if (childPosition == 2) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 2 - Ngày 3");
                        context.startActivity(intent);
                    }
                    if (childPosition == 3) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 2 - Ngày 4");
                        context.startActivity(intent);
                    }
                    if (childPosition == 4) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 1 - Ngày 5");
                        context.startActivity(intent);
                    }
                }
                if (groupPosition == 2) {
                    if (childPosition == 0)
                    {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 3 - Ngày 1");
                        context.startActivity(intent);
                    }
                    if (childPosition == 1) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 3 - Ngày 2");
                        context.startActivity(intent);
                    }
                    if (childPosition == 2) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 3 - Ngày 3");
                        context.startActivity(intent);
                    }
                    if (childPosition == 3) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 3 - Ngày 4");
                        context.startActivity(intent);
                    }
                    if (childPosition == 4) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 3 - Ngày 5");
                        context.startActivity(intent);
                    }
                }
                if (groupPosition == 3) {
                    if (childPosition == 0)
                    {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 4 - Ngày 1");
                        context.startActivity(intent);
                    }
                    if (childPosition == 1) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 4 - Ngày 2");
                        context.startActivity(intent);
                    }
                    if (childPosition == 2) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 4 - Ngày 3");
                        context.startActivity(intent);
                    }
                    if (childPosition == 3) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 4 - Ngày 4");
                        context.startActivity(intent);
                    }
                    if (childPosition == 4) {
                        Intent intent = new Intent(context.getApplicationContext(), MyList.class);
                        intent.putExtra("name", "Nâng Cao - Tuần 4 - Ngày 5");
                        context.startActivity(intent);
                    }
                }
            }
        });
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
