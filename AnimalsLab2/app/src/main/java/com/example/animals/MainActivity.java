package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnArray = findViewById(R.id.btnArrayAdapter);
        btnArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(MainActivity.class.getName(), "array button clik");
                Intent intent = new Intent(MainActivity.this, ArrayAdapterAcrtivity.class);
                startActivity(intent);
                //ArrayAdapterAcrtivity activity = new ArrayAdapterAcrtivity();
            }
        });

        Button btnCustom = findViewById(R.id.btnCustomAdapter);
        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomAdapterActivity.class);
                startActivity(intent);
            }
        });
    }
}