package com.example.zerone.moviehelper;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private ArrayList<Theatre> mTheatreData;
    private myAdapter mAdapter;
    private String[] movieList; // used to store movie name
    private String choosedMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mTheatreData = new ArrayList<>();
        mAdapter = new myAdapter(this,mTheatreData);
        mRecyclerView.setAdapter(mAdapter);
        initializeData();
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        movieList = new String[] {"Ola的家", "魔獸世界","星海爭霸2","凱蘭迪亞傳奇","Ola Query簡介","蟲族秒滅心法","Ola MapGuide教學","Ola jQuery教學","Ola Android教學"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,movieList);
        //https://developer.android.com/reference/android/R.layout.html#simple_spinner_dropdown_item  there are a lot of different type
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "你選的是" + movieList[position],
                        Toast.LENGTH_SHORT).show();
                choosedMovie = movieList[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initializeData() {
        String[] nameList = getResources().getStringArray(R.array.theatre);
        String[] addressList = getResources().getStringArray(R.array.address);
        TypedArray iamgeList = getResources().obtainTypedArray(R.array.images);
        mTheatreData.clear();
        for(int i = 0;i<nameList.length;++i){
            mTheatreData.add(new Theatre(nameList[i],addressList[i],
                    iamgeList.getResourceId(i,0)));

        }
        iamgeList.recycle();
        mAdapter.notifyDataSetChanged();
    }
}
