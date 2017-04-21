package com.example.priyamangal.listviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] arrayOfAnimals = {"Lion", "Tiger", "Dog", "Cat", "Cow", "Pig", "Goat"};

        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayOfAnimals);

        final ListView listView = (ListView) findViewById(R.id.thelistview);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String animalSelected = "You have selected "+ listView.getItemAtPosition(position);

                Toast.makeText(MainActivity.this, animalSelected, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
