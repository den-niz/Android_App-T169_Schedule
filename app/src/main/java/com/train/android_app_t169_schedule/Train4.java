package com.train.android_app_t169_schedule;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.train.android_app_t169_schedule.R;

import androidx.appcompat.app.AppCompatActivity;

public class Train4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.train4);

        Button but1 = (Button) findViewById(R.id.book_seat);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(Train4.this, Checkout.class);
                startActivity(int1);
            }
        });
        ImageView back;
        back = findViewById(R.id.back);
        back.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Train4.this,MainActivity.class);
                startActivity(intent);
            }
        }));
    }
}