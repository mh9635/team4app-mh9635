package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity3 extends AppCompatActivity {
    private Button button12;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity4();
            }
        });

        button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity9();
            }
        });

        button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity2();
            }
        });

        button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity5();
            }
        });

        button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity6();
            }
        });
    }
    public void openactivity4(){
        Intent intent = new Intent(this, activity4.class);
        startActivity(intent);
    }

    public void openactivity9(){
        Intent intent = new Intent(this, activity9.class);
        startActivity(intent);
    }

    public void openactivity2(){
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }

    public void openactivity5(){
        Intent intent = new Intent(this, activity5.class);
        startActivity(intent);
    }

    public void openactivity6(){
        Intent intent = new Intent(this, activity6.class);
        startActivity(intent);
    }
}