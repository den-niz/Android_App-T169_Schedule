package com.train.android_app_t169_schedule;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but1 = (Button) findViewById(R.id.show_schedule);
        Spinner spinner1 =(Spinner) findViewById(R.id.source);
        Spinner spinner2 =(Spinner) findViewById(R.id.destination);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(int1);
            }
        });

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Stations,R.layout.dropdown);
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.Destinations,R.layout.dropdown);
        adapter1.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter1);
        spinner2.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if (adapterView.getItemAtPosition(i).equals("Select Station")) {

        }
        else
        {
            String text = adapterView.getItemAtPosition(i).toString();
            if (adapterView.getItemAtPosition(i).equals("Jiashan")){
                Intent intent = new Intent(MainActivity.this, Train1.class);
                startActivity(intent);
            }if (adapterView.getItemAtPosition(i).equals("Jiaxing")){
                Intent intent = new Intent(MainActivity.this, Train2.class);
                startActivity(intent);
            }if (adapterView.getItemAtPosition(i).equals("Hangzhou South")){
                Intent intent = new Intent(MainActivity.this, Train3.class);
                startActivity(intent);
            }if (adapterView.getItemAtPosition(i).equals("Yiwu")){
                Intent intent = new Intent(MainActivity.this, Train4.class);
                startActivity(intent);
            }if (adapterView.getItemAtPosition(i).equals("Jinhua")){
                Intent intent = new Intent(MainActivity.this, Train5.class);
                startActivity(intent);
            }if (adapterView.getItemAtPosition(i).equals("Longyou")){
                Intent intent = new Intent(MainActivity.this, Train6.class);
                startActivity(intent);
            }if (adapterView.getItemAtPosition(i).equals("Quzhou")){
                Intent intent = new Intent(MainActivity.this, Train7.class);
                startActivity(intent);
            }if (adapterView.getItemAtPosition(i).equals("Shangrao")){
                Intent intent = new Intent(MainActivity.this, Train8.class);
                startActivity(intent);
            }if (adapterView.getItemAtPosition(i).equals("Yingtan")){
                Intent intent = new Intent(MainActivity.this, Train9.class);
                startActivity(intent);
            }if (adapterView.getItemAtPosition(i).equals("Jian")){
                Intent intent = new Intent(MainActivity.this, Train10.class);
                startActivity(intent);
            }if (adapterView.getItemAtPosition(i).equals("Ganzhou")){
                Intent intent = new Intent(MainActivity.this, Train11.class);
                startActivity(intent);
            }if (adapterView.getItemAtPosition(i).equals("Guangzhou")){
                Intent intent = new Intent(MainActivity.this, Train12.class);
                startActivity(intent);
            }

        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}