package com.alicia.masseyhacksdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by alici on 5/21/2016.
 */
public class Splash extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        Thread timerThread = new Thread(){
            public void run(){
                try{//try to display splash for 4 seconds
                    sleep(3000);
                }catch(InterruptedException e){//otherwise print error
                    e.printStackTrace();
                }finally{//display the next screen
                    Intent i = new Intent(Splash.this, MainActivity.class);
                    startActivity(i);
                }
            }
        };
        timerThread.start();
    }
    @Override
    protected void onPause() {
        // destroy screen after used
        super.onPause();
        finish();
    }
}
