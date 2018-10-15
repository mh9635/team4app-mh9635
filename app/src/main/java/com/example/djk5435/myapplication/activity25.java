package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity25 extends AppCompatActivity {
    private Button button61;
    private Button button63;
    private Button button64;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_25);

        button61 = (Button) findViewById(R.id.button61);
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity20();
            }
        });

        button63 = (Button) findViewById(R.id.button63);
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity23();
            }
        });

        button64 = (Button) findViewById(R.id.button64);
        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity21();
            }
        });
    }
    public void openactivity20(){
        Intent intent = new Intent(this, activity20.class);
        startActivity(intent);
    }
    public void openactivity23(){
        Intent intent = new Intent(this, activity23.class);
        startActivity(intent);
    }
    public void openactivity21(){
        Intent intent = new Intent(this, activity21.class);
        startActivity(intent);
    }
}
