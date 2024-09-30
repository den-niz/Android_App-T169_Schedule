package com.train.android_app_t169_schedule;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.train.android_app_t169_schedule.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    public CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10 ,card11, card12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);

        card1=(CardView) findViewById(R.id.c1);
        card2=(CardView) findViewById(R.id.c2);
        card3=(CardView) findViewById(R.id.c3);
        card4=(CardView) findViewById(R.id.c4);
        card5=(CardView) findViewById(R.id.c5);
        card6=(CardView) findViewById(R.id.c6);
        card7=(CardView) findViewById(R.id.c7);
        card8=(CardView) findViewById(R.id.c8);
        card9=(CardView) findViewById(R.id.c9);
        card10=(CardView) findViewById(R.id.c10);
        card11=(CardView) findViewById(R.id.c11);
        card12=(CardView) findViewById(R.id.c12);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);
        card9.setOnClickListener(this);
        card10.setOnClickListener(this);
        card11.setOnClickListener(this);
        card12.setOnClickListener(this);
        ImageView back2;
        back2 = findViewById(R.id.back2);
        back2.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        }));
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.c1:
                i = new Intent(this,Train1.class);
                startActivity(i);
                break;
            case R.id.c2:
                i = new Intent(this,Train2.class);
                startActivity(i);
                break;
            case R.id.c3:
                i = new Intent(this,Train3.class);
                startActivity(i);
                break;
            case R.id.c4:
                i = new Intent(this,Train4.class);
                startActivity(i);
                break;
            case R.id.c5:
                i = new Intent(this,Train5.class);
                startActivity(i);
                break;
            case R.id.c6:
                i = new Intent(this,Train6.class);
                startActivity(i);
                break;
            case R.id.c7:
                i = new Intent(this,Train7.class);
                startActivity(i);
                break;
            case R.id.c8:
                i = new Intent(this,Train8.class);
                startActivity(i);
                break;
            case R.id.c9:
                i = new Intent(this,Train9.class);
                startActivity(i);
                break;
            case R.id.c10:
                i = new Intent(this,Train10.class);
                startActivity(i);
                break;
            case R.id.c11:
                i = new Intent(this,Train11.class);
                startActivity(i);
                break;
            case R.id.c12:
                i = new Intent(this,Train12.class);
                startActivity(i);
                break;

        }

    }
}
