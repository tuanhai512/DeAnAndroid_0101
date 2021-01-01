package com.example.doanltdd.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.doanltdd.R;
import com.example.doanltdd.model.Contact;

import java.util.ArrayList;

public class ContactAdapter extends ArrayAdapter<Contact> {
    Context context;
    int layout;
    ArrayList<Contact> arrayList;

    public ContactAdapter(Context context,  int resource, ArrayList<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.layout = resource;
        this.arrayList = objects;
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(layout, parent,false);

        Contact contact = arrayList.get(position);

        TextView txtName = convertView.findViewById(R.id.textView);
        txtName.setText(contact.getTitle());
        ImageView imageView = convertView.findViewById(R.id.imageView);
        imageView.setImageBitmap(contact.getImage());

        return convertView;
    }
}
