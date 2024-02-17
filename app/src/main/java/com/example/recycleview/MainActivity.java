package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));
        items.add(new Item("John wick","john.wick@email.com",R.drawable.john));
        items.add(new Item("Jiny wick","jiny.wick@email.com",R.drawable.jiny));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}