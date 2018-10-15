package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity6 extends AppCompatActivity {
    private Button button26;
    private Button button27;
    private Button button28;
    private Button button30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        button26 = (Button) findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity8();
            }
        });

        button27 = (Button) findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity2();
            }
        });

        button28 = (Button) findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity5();
            }
        });

        button30 = (Button) findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity3();
            }
        });
    }
    public void openactivity8(){
        Intent intent = new Intent(this, activity8.class);
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
    public void openactivity3(){
        Intent intent = new Intent(this, activity3.class);
        startActivity(intent);
    }
}
