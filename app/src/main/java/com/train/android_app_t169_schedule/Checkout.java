package com.train.android_app_t169_schedule;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class Checkout extends AppCompatActivity implements View.OnClickListener{
    public Button btn1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkout);

        btn1 = (Button) findViewById(R.id.buy_ticket);
        btn1.setOnClickListener (this);
    }

            @Override
            public void onClick(View view) {
                Toast.makeText(this,"Ticket Booked Successfully",Toast.LENGTH_SHORT).show();
                Intent int1 = new Intent(Checkout.this, MainActivity.class);
                startActivity(int1);
            }

}