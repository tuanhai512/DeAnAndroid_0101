package com.example.doanltdd.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.doanltdd.R;
import com.example.doanltdd.controller.MyList;
import com.example.doanltdd.model.ExerciseHard;

import java.util.List;

public class ExerciseHardAdapter extends RecyclerView.Adapter<ExerciseHardAdapter.ExerciseViewHoder> {
    private Context context;
    private List<ExerciseHard> exerciseList;

    private AdapterView.OnItemClickListener listener;
    public void setData(List<ExerciseHard> list)
    {
        this.exerciseList = list;
        notifyDataSetChanged();
    }
    public void setData(List<ExerciseHard> list,Context context)
    {
        this.context = context;
        this.exerciseList = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ExerciseViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row_excercise_hard,parent,false);
        return new ExerciseViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHoder holder, int position) {
        ExerciseHard exerciseHard = exerciseList.get(position);

        if(exerciseHard == null) {
            return;
        }

        holder.tvName.setImageResource(exerciseHard.getResourceID());
        holder.exName.setText(exerciseHard.getName());
        holder.itemView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position==0) {
                    Intent intent = new Intent(holder.itemView.getContext(), MyList.class);
                    intent.putExtra("name","CƠ BỤNG");
                    holder.itemView.getContext().startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent = new Intent(holder.itemView.getContext(), MyList.class);
                    intent.putExtra("name", "CƠ TAY");
                    holder.itemView.getContext().startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent = new Intent(holder.itemView.getContext(), MyList.class);
                    intent.putExtra("name", "CƠ MÔNG");
                    holder.itemView.getContext().startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent = new Intent(holder.itemView.getContext(), MyList.class);
                    intent.putExtra("name", "CƠ NGỰC");
                    holder.itemView.getContext().startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent = new Intent(holder.itemView.getContext(), MyList.class);
                    intent.putExtra("name", "CƠ TOÀN THÂN");
                    holder.itemView.getContext().startActivity(intent);
                }
                if(position==5)
                {
                    Intent intent = new Intent(holder.itemView.getContext(), MyList.class);
                    intent.putExtra("name", "CƠ CHÂN");
                    holder.itemView.getContext().startActivity(intent);
                }
                if(position==6)
                {
                    Intent intent = new Intent(holder.itemView.getContext(), MyList.class);
                    intent.putExtra("name", "CƠ SAU");
                    holder.itemView.getContext().startActivity(intent);
                }

            }

        });

    }

    @Override
    public int getItemCount() {
        if(exerciseList != null)
        {
            return exerciseList.size();
        }
        return 0;
    }


   class ExerciseViewHoder extends RecyclerView.ViewHolder {
        //Khởi tạo biến
        private ImageView tvName;
        private TextView exName;
       // LinearLayout linearLayout;
       // RecyclerView recyclerView;

        public ExerciseViewHoder(View itemView) {
            super(itemView);
            //Gán biến
            tvName= (ImageView) itemView.findViewById(R.id.tv_name);
            exName=(TextView) itemView.findViewById(R.id.textview_name);
          //  recyclerView= (RecyclerView) itemView.findViewById(R.id.rcv_item1);
            itemView.setOnClickListener(v -> Toast.makeText(context.getApplicationContext(),""+getAdapterPosition(),Toast.LENGTH_LONG).show());
        }


    }


}
