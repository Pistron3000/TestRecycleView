package com.example.testrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv);

        List<String> name = new ArrayList<>();
        name.add("John");
        name.add("Vitek");
        name.add("Santek");
        name.add("Pistron");
        name.add("Example");
        name.add("John");
        name.add("Vitek");
        name.add("Santek");
        name.add("Pistron");
        name.add("Example");

        rv.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(this, name);
        rv.setAdapter(adapter);
    }
}