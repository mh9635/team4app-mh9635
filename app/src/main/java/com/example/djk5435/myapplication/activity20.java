package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity20 extends AppCompatActivity {
    private Button button48;
    private Button button49;
    private Button button50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_20);

        button48 = (Button) findViewById(R.id.button48);
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity25();
            }
        });

        button49 = (Button) findViewById(R.id.button49);
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity23();
            }
        });

        button50 = (Button) findViewById(R.id.button50);
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity21();
            }
        });
    }
    public void openactivity25(){
        Intent intent = new Intent(this, activity25.class);
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
