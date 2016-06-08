package com.alicia.masseyhacksdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button sp1, sp2, sp3, sp4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1 = (Button)findViewById(R.id.spon1);
        sp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Stain.class);
                startActivity(i);
            }
        });
        sp2 = (Button)findViewById(R.id.spon2);
        sp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Laundry.class);
                startActivity(i);
            }
        });
        sp3 = (Button)findViewById(R.id.spon3);
        sp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Food.class);
                startActivity(i);
            }
        });
        sp4 = (Button)findViewById(R.id.spon4);
        sp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, activity_maps.class);
                startActivity(i);
            }
        });
    }
}
