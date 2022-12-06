package com.example.disease_list_api222;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private ArrayList<String> arrayList = new ArrayList<String>();
    private Adapter adapter = new Adapter(arrayList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        linearLayoutManager = new LinearLayoutManager(this);
        ((LinearLayoutManager) linearLayoutManager).setReverseLayout(true);
        ((LinearLayoutManager) linearLayoutManager).setStackFromEnd(true);

        recyclerView.setLayoutManager(linearLayoutManager);



        adapter.addItem("first Data Test");
        adapter.addItem("Second Data Test");
        adapter.addItem("Third Data Test");
        adapter.addItem("fourth Data Test");

        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();




    }
}