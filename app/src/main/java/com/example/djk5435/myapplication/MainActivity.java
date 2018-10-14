package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity1();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity19();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                openactivity13();
            }
        });
    }
    public void openactivity1(){
        Intent intent = new Intent(this, activity1.class);
        startActivity(intent);
    }
    public void openactivity19(){
        Intent intent = new Intent(this, activity19.class);
        startActivity(intent);
    }
    public void openactivity13(){
        Intent intent = new Intent(this, activity13.class);
        startActivity(intent);
    }
}
