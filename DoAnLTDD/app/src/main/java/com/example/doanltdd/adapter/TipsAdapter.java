package com.example.doanltdd.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doanltdd.R;
import com.example.doanltdd.model.ItemObject;
import com.ramotion.foldingcell.FoldingCell;

import java.util.List;

public class TipsAdapter extends RecyclerView.Adapter<TipsAdapter.ItemViewHolder> {

    private List<ItemObject> mListItem;
    public void setData(List<ItemObject> list)
    {
        this.mListItem = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_tips,parent,false);
        return new ItemViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        ItemObject itemObject = mListItem.get(position);
        if(itemObject == null)
        {
            return;
        }
        holder.tvTitle.setText(itemObject.getTitle());
        holder.tvContent.setText(itemObject.getContent());
        holder.foldingCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.foldingCell.toggle(false);
            }

        });
        holder.tvContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),itemObject.getContent(),Toast.LENGTH_SHORT).show();
            }
        });
        holder.tvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),itemObject.getTitle(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        if(mListItem!=null)
        {
            return mListItem.size();
        }
        return  0;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder
    {
        private FoldingCell foldingCell;
        private TextView tvTitle;
        private TextView tvContent;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            foldingCell = itemView.findViewById(R.id.folding_cell);
            tvTitle=itemView.findViewById(R.id.textview_title);
            tvContent=itemView.findViewById(R.id.textview_context);

        }
    }
}
