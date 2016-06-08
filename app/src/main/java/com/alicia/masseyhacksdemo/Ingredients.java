package com.alicia.masseyhacksdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by alici on 5/22/2016.
 */
public class Ingredients extends AppCompatActivity {
    Button b1, b2, b3,b4, go;
    Boolean c1 = false,c2 = false,c3 = false,c4 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredients);
        b1= (Button)findViewById(R.id.spon1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1==false){
                    b1.setBackgroundResource(R.drawable.button_boarder2);
                    c1=true;
                }else{
                    b1.setBackgroundResource(R.drawable.button_boarder);
                    //b1.setTextColor(0);
                    c1=false;
                }
            }
        });
        b2= (Button)findViewById(R.id.spon2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c2==false){
                    b2.setBackgroundResource(R.drawable.button_boarder2);
                    c2=true;
                }else{
                    b2.setBackgroundResource(R.drawable.button_boarder);
                    //b2.setTextColor(0);
                    c2=false;
                }
            }
        });
        b3= (Button)findViewById(R.id.spon3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c3==false){
                    b3.setBackgroundResource(R.drawable.button_boarder2);
                    c3=true;
                }else{
                    b3.setBackgroundResource(R.drawable.button_boarder);
                    //b3.setTextColor(0);
                    c3=false;
                }
            }
        });
        b4= (Button)findViewById(R.id.spon4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c4==false){
                    b4.setBackgroundResource(R.drawable.button_boarder2);
                    c4=true;
                }else{
                    b4.setBackgroundResource(R.drawable.button_boarder);
                    //b4.setTextColor(0);
                    c4=false;
                }
            }
        });
        go = ( Button)findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Ingredients.this, RecipeChoice.class);
                startActivity(i);
            }
        });
    }
}
