package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity13 extends AppCompatActivity {
    private Button button38;
    private Button button39;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13);

        button38 = (Button) findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity14();
            }
        });

        button39 = (Button) findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity16();
            }
        });
    }
    public void openactivity14(){
        Intent intent = new Intent(this, activity14.class);
        startActivity(intent);
    }
    public void openactivity16(){
        Intent intent = new Intent(this, activity16.class);
        startActivity(intent);
    }
}
