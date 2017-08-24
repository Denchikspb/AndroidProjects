package com.androidprojects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView myRecyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private String[] array = {"123", "456", "789"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRecyclerView = (RecyclerView) findViewById(R.id.recycler);

        layoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(layoutManager);

        adapter = new Adapter(array);
        myRecyclerView.setAdapter(adapter);
    }
}
