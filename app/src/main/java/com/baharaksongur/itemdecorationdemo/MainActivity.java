package com.baharaksongur.itemdecorationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter adapter;
    ArrayList<String> titles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titles = new ArrayList<>();
        setTitles();

        recyclerView = findViewById(R.id.rcv_demo);
        adapter = new CustomAdapter(this, titles);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);
       recyclerView.setLayoutManager(layoutManager);

       recyclerView.addItemDecoration(new CustomItemDecoration());
    }

    public void setTitles(){
        titles.add("demo1");
        titles.add("demo2");
        titles.add("demo3");
        titles.add("demo4");
        titles.add("demo5");
    }
}
