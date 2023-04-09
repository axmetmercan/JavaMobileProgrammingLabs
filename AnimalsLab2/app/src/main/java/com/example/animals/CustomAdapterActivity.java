package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {


    final List<Animals> animals = new ArrayList<Animals>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);


        animals.add(new Animals("Ant", R.mipmap.ant));
        animals.add(new Animals("Bear", R.mipmap.bear));
        animals.add(new Animals("Cat", R.mipmap.cat));
        animals.add(new Animals("Bird", R.mipmap.bird));
        animals.add(new Animals("Dog", R.mipmap.icon));
        animals.add(new Animals("Bee", R.mipmap.bee));


        final ListView listView = (ListView) findViewById(R.id.listview);
        AnimalAdapter adapter = new AnimalAdapter(this, animals);
        listView.setAdapter(adapter);
    }
}