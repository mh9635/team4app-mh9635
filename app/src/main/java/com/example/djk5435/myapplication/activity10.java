package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity10 extends AppCompatActivity {
    private Button button34;
    private Button button35;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        button34 = (Button) findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity11();
            }
        });

        button35 = (Button) findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity12();
            }
        });
    }
    public void openactivity11(){
        Intent intent = new Intent(this, activity11.class);
        startActivity(intent);
    }
    public void openactivity12(){
        Intent intent = new Intent(this, activity12.class);
        startActivity(intent);
    }
}
