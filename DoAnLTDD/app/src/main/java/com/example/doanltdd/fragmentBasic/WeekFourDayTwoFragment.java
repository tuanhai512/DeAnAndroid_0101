package com.example.doanltdd.fragmentBasic;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.doanltdd.R;
import com.example.doanltdd.adapter.ContactAdapter;
import com.example.doanltdd.controller.Detail;
import com.example.doanltdd.fragment.AbsFragment;
import com.example.doanltdd.fragment.ChestFragment;
import com.example.doanltdd.model.Contact;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AbsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeekFourDayTwoFragment extends Fragment {
    ListView listView;
    ArrayList<Contact> arrayList;
    ContactAdapter contactAdapter;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WeekFourDayTwoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AbsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ChestFragment newInstance(String param1, String param2) {
        ChestFragment fragment = new ChestFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_week_two_day_one, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        listView = view.findViewById(R.id.listView);
        arrayList = getMockData();
        contactAdapter = new ContactAdapter(getContext(),R.layout.activity_list_row_ex,arrayList);
        listView.setAdapter(contactAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), Detail.class);
                    intent.putExtra("name", "Đá Bay");
                    intent.putExtra("noidung", getString(R.string.flutterkick));
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), Detail.class);
                    intent.putExtra("name", "Vỗ Tay Qua Đầu");
                    intent.putExtra("noidung", getString(R.string.clapoverhead));
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), Detail.class);
                    intent.putExtra("name", "Đá Mông Ngược");
                    intent.putExtra("noidung", getString(R.string.glutterkickback));
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), Detail.class);
                    intent.putExtra("name", "Hít Đất Lên Dốc");
                    intent.putExtra("noidung", getString(R.string.inlinepushup));
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), Detail.class);
                    intent.putExtra("name", "Tạ Đơn Nhảy Squat");
                    intent.putExtra("noidung", getString(R.string.dumbbeljumpingsquat));
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), Detail.class);
                    intent.putExtra("name", "Bước Chân Lên Ghế");
                    intent.putExtra("noidung", getString(R.string.stepontochair));
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(view.getContext(), Detail.class);
                    intent.putExtra("name", "Hít Đất Trên Tường");
                    intent.putExtra("noidung", getString(R.string.dumbbeljumpingsquat));
                    startActivity(intent);
                }
            }
        });
    }
    public ArrayList<Contact> getMockData(){
        ArrayList<Contact> tmp = new ArrayList<>();
        tmp.add(new Contact(getString(R.string.tittleflutterkick),Contact.convertStringToBitmapFromAccess(getContext()
                ,"abs.png")));
        tmp.add(new Contact(getString(R.string.tittleclapoverhead),Contact.convertStringToBitmapFromAccess(getContext()
                ,"arm.png")));
        tmp.add(new Contact(getString(R.string.tittleglutterkickback),Contact.convertStringToBitmapFromAccess(getContext()
                ,"butt.png")));
        tmp.add(new Contact(getString(R.string.titleinlinepushup),Contact.convertStringToBitmapFromAccess(getContext()
                ,"chest.png")));
        tmp.add(new Contact(getString(R.string.titledumbbeljumpingsquat),Contact.convertStringToBitmapFromAccess(getContext()
                ,"fullbody.png")));
        tmp.add(new Contact(getString(R.string.titlestepontochair),Contact.convertStringToBitmapFromAccess(getContext()
                ,"legs.png")));
        tmp.add(new Contact(getString(R.string.titlewallpushup),Contact.convertStringToBitmapFromAccess(getContext()
                ,"back.png")));


        return tmp;
    }
}