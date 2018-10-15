package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity5 extends AppCompatActivity {
    private Button button21;
    private Button button22;
    private Button button24;
    private Button button25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity10();
            }
        });

        button22 = (Button) findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity2();
            }
        });

        button24 = (Button) findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity6();
            }
        });

        button25 = (Button) findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity3();
            }
        });

    }
    public void openactivity10(){
        Intent intent = new Intent(this, activity10.class);
        startActivity(intent);
    }
    public void openactivity2(){
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }
    public void openactivity6(){
        Intent intent = new Intent(this, activity6.class);
        startActivity(intent);
    }
    public void openactivity3(){
        Intent intent = new Intent(this, activity3.class);
        startActivity(intent);
    }
}
