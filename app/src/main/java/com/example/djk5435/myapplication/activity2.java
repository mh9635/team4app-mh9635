package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity2 extends AppCompatActivity {
    private Button button7;
    private Button button8;
    private Button button9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity5();
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity6();
            }
        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity3();
            }
        });
    }
    public void openactivity5(){
        Intent intent = new Intent(this, activity5.class);
        startActivity(intent);
    }
    public void openactivity6(){
        Intent intent = new Intent (this, activity6.class);
        startActivity(intent);
    }
    public void openactivity3(){
        Intent intent = new Intent (this, activity3.class);
        startActivity(intent);
    }
}
