package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity23 extends AppCompatActivity {
    private Button button73;
    private Button button56;
    private Button button57;
    private Button button59;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_23);

        button73 = (Button) findViewById(R.id.button73);
        button73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity24();
            }
        });

        button56 = (Button) findViewById(R.id.button56);
        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity20();
            }
        });

        button57 = (Button) findViewById(R.id.button57);
        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity25();
            }
        });

        button59 = (Button) findViewById(R.id.button59);
        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity21();
            }
        });
    }
    public void openactivity24(){
        Intent intent = new Intent(this, activity24.class);
        startActivity(intent);
    }
    public void openactivity20(){
        Intent intent = new Intent(this, activity20.class);
        startActivity(intent);
    }
    public void openactivity25(){
        Intent intent = new Intent(this, activity25.class);
        startActivity(intent);
    }
    public void openactivity21(){
        Intent intent = new Intent(this, activity21.class);
        startActivity(intent);
    }
}
