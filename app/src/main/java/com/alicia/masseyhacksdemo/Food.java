package com.alicia.masseyhacksdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by alici on 5/21/2016.
 */
public class Food extends AppCompatActivity {
    Button breakfast, lunch, dinner, dessert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        breakfast = (Button)findViewById(R.id.spon1);
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Food.this, Ingredients.class);
                startActivity(i);
            }
        });
        lunch = (Button)findViewById(R.id.spon2);
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Food.this, Ingredients.class);
                startActivity(i);
            }
        });
        dinner = (Button)findViewById(R.id.dessert);
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Food.this, Ingredients.class);
                startActivity(i);
            }
        });
        dessert = (Button)findViewById(R.id.dinner);
        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Food.this, Ingredients.class);
                startActivity(i);
            }
        });
    }
}
