package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ArrayAdapterAcrtivity extends ListActivity {

    static final String[] ANIMALS = new String[]{"cat","dog","bird","bee","tiger", "monkey"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_array_adapter_acrtivity);
        setListAdapter( new ArrayAdapter<String>(this, R.layout.activity_array_adapter_acrtivity, ANIMALS));

        ListView l = getListView();
        getListView().setTextFilterEnabled(true);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ArrayAdapterAcrtivity.this, ((TextView)view).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}