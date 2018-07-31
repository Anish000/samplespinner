package com.example.omika.samplespinner;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Main extends AppCompatActivity {
    private ArrayList<textspinner> mList;
    private textspinneradapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initList();

        Spinner spinnerCountries = findViewById(R.id.spinnertext);

        mAdapter = new textspinneradapter(this, mList);
        spinnerCountries.setAdapter(mAdapter);

        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textspinner clickedItem = (textspinner) parent.getItemAtPosition(position);
                String clickedCountryName = clickedItem.gettext();
                Toast.makeText(Main.this, clickedCountryName + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    private void initList() {
        mList = new ArrayList<>();
        mList.add(new textspinner("Bold", R.drawable.text));
        mList.add(new textspinner("Format", R.drawable.format));
        mList.add(new textspinner("Translate", R.drawable.translate));
    }
}
