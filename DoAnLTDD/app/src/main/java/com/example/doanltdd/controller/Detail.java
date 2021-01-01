package com.example.doanltdd.controller;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.doanltdd.R;
import com.example.doanltdd.model.Contact;

import java.util.List;

public class Detail extends AppCompatActivity {
    TextView itemclick2_name, itemclick2_noidung;
    ImageView itemclick2_imgView;
    Bundle bundle;
    Button btnNext, btnPrev;
    int position;
    static MediaPlayer mediaPlayer;
    List<Contact> listEX;
    String sName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        itemclick2_name = (TextView) findViewById(R.id.itemclick2_name);
        itemclick2_noidung = (TextView) findViewById(R.id.itemclick2_noidung);
        itemclick2_imgView = (ImageView) findViewById(R.id.itemclick2_imgview);
        btnNext=(Button)findViewById(R.id.btnNext);
        btnPrev=(Button)findViewById(R.id.btnPrev);
        bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("name");
            String noidung = bundle.getString("noidung");
            setUp(name, noidung);
        }

    }

    private void setUp(String name, String noidung) {
        if (name.equals("Gập Bụng")) {
            itemclick2_imgView.setImageResource(R.drawable.adominalcrunch);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
            btnNext.setOnClickListener(new View.OnClickListener() {
             @Override
           public void onClick(View v) {
                 Intent intent = new Intent(Detail.this, Test.class);
                 startActivity(intent);
               }
            });
        }
        if (name.equals("Gập Bụng Đạp Xe")) {
            itemclick2_imgView.setImageResource(R.drawable.bicyclecrunches);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Gập Bụng Tay Chéo")) {
            itemclick2_imgView.setImageResource(R.drawable.crossaimcrunches);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Đá Bay")) {
            itemclick2_imgView.setImageResource(R.drawable.flutterkick);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Chạm Gót Chân")) {
            itemclick2_imgView.setImageResource(R.drawable.heeltouch);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Kéo Cánh Tay")) {
            itemclick2_imgView.setImageResource(R.drawable.armcissors);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Vỗ Tay Qua Đầu")) {
            itemclick2_imgView.setImageResource(R.drawable.clapoverhead);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Căng Vai")) {
            itemclick2_imgView.setImageResource(R.drawable.shoulderstretch);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Cơ Tam Đầu")) {
            itemclick2_imgView.setImageResource(R.drawable.tricpesdips);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Thế Cây Cầu")) {
            itemclick2_imgView.setImageResource(R.drawable.brigde);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Nhấc Mông Thế Cây Cầu")) {
            itemclick2_imgView.setImageResource(R.drawable.buttbrigde);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Bài Tập Mông Nở")) {
            itemclick2_imgView.setImageResource(R.drawable.firehydrant);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Đá Mông Ngược")) {
            itemclick2_imgView.setImageResource(R.drawable.glutekickback);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Vào Và Ra")) {
            itemclick2_imgView.setImageResource(R.drawable.inandout);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Xuống Dốc")) {
            itemclick2_imgView.setImageResource(R.drawable.declinepushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Lên Dốc")) {
            itemclick2_imgView.setImageResource(R.drawable.inlinepushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Quỳ Gối")) {
            itemclick2_imgView.setImageResource(R.drawable.kneepushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Một Chân Trụ")) {
            itemclick2_imgView.setImageResource(R.drawable.onelegpushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Truyền Thống")) {
            itemclick2_imgView.setImageResource(R.drawable.pushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Xoay Đầu Gối Để Duỗi Cơ")) {
            itemclick2_imgView.setImageResource(R.drawable.alternatingkneetocheststrech);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Bird Dog")) {
            itemclick2_imgView.setImageResource(R.drawable.birddog);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Burpees")) {
            itemclick2_imgView.setImageResource(R.drawable.burpees);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Tạ Đơn Nhảy Squat")) {
            itemclick2_imgView.setImageResource(R.drawable.dumbbeljumpingsquat);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Nhảy Đập Tay")) {
            itemclick2_imgView.setImageResource(R.drawable.jumpingjacks);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Chùng Chân Sang Ngang")) {
            itemclick2_imgView.setImageResource(R.drawable.sidelunges);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Bước Chân Lên Ghế")) {
            itemclick2_imgView.setImageResource(R.drawable.stepontochair);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Chạy Chống Tay Lên Tường")) {
            itemclick2_imgView.setImageResource(R.drawable.runonethewall);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Ngồi Dựa Tường")) {
            itemclick2_imgView.setImageResource(R.drawable.wallsit);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Nâng Tay Dài")) {
            itemclick2_imgView.setImageResource(R.drawable.longarmcrunch);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Plank Thẳng Tay")) {
            itemclick2_imgView.setImageResource(R.drawable.straightarmplank);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Xoay Chiều")) {
            itemclick2_imgView.setImageResource(R.drawable.pushupandrotation);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Tay Trước Tay Sau")) {
            itemclick2_imgView.setImageResource(R.drawable.stagerredpushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Trên Tường")) {
            itemclick2_imgView.setImageResource(R.drawable.wallpushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Rộng Tay")) {
            itemclick2_imgView.setImageResource(R.drawable.widearmpushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Gập Bụng Đạp Xe")) {
            itemclick2_imgView.setImageResource(R.drawable.bicyclecrunches);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Gập Bụng Tay Chéo")) {
            itemclick2_imgView.setImageResource(R.drawable.crossaimcrunches);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Đá Bay")) {
            itemclick2_imgView.setImageResource(R.drawable.flutterkick);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Chạm Gót Chân")) {
            itemclick2_imgView.setImageResource(R.drawable.heeltouch);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Kéo Cánh Tay")) {
            itemclick2_imgView.setImageResource(R.drawable.armcissors);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Vỗ Tay Qua Đầu")) {
            itemclick2_imgView.setImageResource(R.drawable.clapoverhead);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Căng Vai")) {
            itemclick2_imgView.setImageResource(R.drawable.shoulderstretch);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Cơ tam đầu")) {
            itemclick2_imgView.setImageResource(R.drawable.tricpesdips);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Thế Cây Cầu")) {
            itemclick2_imgView.setImageResource(R.drawable.brigde);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Nhấc Mông Thế Cây Cầu")) {
            itemclick2_imgView.setImageResource(R.drawable.buttbrigde);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Bài Tập Mông Nở")) {
            itemclick2_imgView.setImageResource(R.drawable.firehydrant);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Đá Mông Ngược")) {
            itemclick2_imgView.setImageResource(R.drawable.glutekickback);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Vào Và Ra")) {
            itemclick2_imgView.setImageResource(R.drawable.inandout);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Xuống Dốc")) {
            itemclick2_imgView.setImageResource(R.drawable.declinepushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Lên Dốc")) {
            itemclick2_imgView.setImageResource(R.drawable.inlinepushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Quỳ Gối")) {
            itemclick2_imgView.setImageResource(R.drawable.kneepushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Một Chân Trụ")) {
            itemclick2_imgView.setImageResource(R.drawable.onelegpushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Truyền Thống")) {
            itemclick2_imgView.setImageResource(R.drawable.pushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Xoay Đầu Gối Để Duỗi Cơ")) {
            itemclick2_imgView.setImageResource(R.drawable.alternatingkneetocheststrech);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Bird Dog")) {
            itemclick2_imgView.setImageResource(R.drawable.birddog);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Burpees")) {
            itemclick2_imgView.setImageResource(R.drawable.burpees);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Tạ Đơn Nhảy Squat")) {
            itemclick2_imgView.setImageResource(R.drawable.dumbbeljumpingsquat);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Nhảy Đập Tay")) {
            itemclick2_imgView.setImageResource(R.drawable.jumpingjacks);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Chùng Chân Sang Ngang")) {
            itemclick2_imgView.setImageResource(R.drawable.sidelunges);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Bước Chân Lên Ghế")) {
            itemclick2_imgView.setImageResource(R.drawable.stepontochair);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Chạy Chống Tay Lên Tường")) {
            itemclick2_imgView.setImageResource(R.drawable.runonethewall);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Ngồi Dựa Tường")) {
            itemclick2_imgView.setImageResource(R.drawable.wallsit);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Nâng Tay Dài")) {
            itemclick2_imgView.setImageResource(R.drawable.longarmcrunch);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Plank Thẳng Tay")) {
            itemclick2_imgView.setImageResource(R.drawable.straightarmplank);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Xoay Chiều")) {
            itemclick2_imgView.setImageResource(R.drawable.pushupandrotation);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Tay Trước Tay Sau")) {
            itemclick2_imgView.setImageResource(R.drawable.stagerredpushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Trên Tường")) {
            itemclick2_imgView.setImageResource(R.drawable.wallpushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }
        if (name.equals("Hít Đất Rộng Tay")) {
            itemclick2_imgView.setImageResource(R.drawable.widearmpushup);
            itemclick2_name.setText(name);
            itemclick2_noidung.setText(noidung);
        }



        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // mediaPlayer.stop();
                // mediaPlayer.release();
                position = ((position + 1) % listEX.size());
                Uri u = Uri.parse(listEX.get(position).toString());

                mediaPlayer = MediaPlayer.create(getApplicationContext(), u);

                sName = listEX.get(position).getTitle().toString();
                itemclick2_name.setText(sName);
                mediaPlayer.start();
                //SetTimeTotal();
                //  UpdateTimeSong();
            }
        });

       /* btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                mediaPlayer.release();

                position = ((position - 1) < 0) ? (mySongs.size() - 1) : (position - 1);
                Uri u = Uri.parse(mySongs.get(position).toString());
                mediaPlayer = MediaPlayer.create(getApplicationContext(), u);

                sName = mySongs.get(position).getName().toString();
                txtTittle.setText(sName);
                mediaPlayer.start();
               // SetTimeTotal();
               // UpdateTimeSong();
            }
        });*/
    }
}