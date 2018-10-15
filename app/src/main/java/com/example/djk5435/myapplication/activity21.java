package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity21 extends AppCompatActivity {
    private Button button66;
    private Button button69;
    private Button button52;
    private Button button53;
    private Button button54;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_21);

        button66 = (Button) findViewById(R.id.button66);
        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity22();
            }
        });

        button69 = (Button) findViewById(R.id.button69);
        button69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity18();
            }
        });

        button52 = (Button) findViewById(R.id.button52);
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity21();
            }
        });

        button53 = (Button) findViewById(R.id.button53);
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity25();
            }
        });

        button54 = (Button) findViewById(R.id.button54);
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity23();
            }
        });
    }
    public void openactivity22(){
        Intent intent = new Intent(this, activity22.class);
        startActivity(intent);
    }
    public void openactivity18(){
        Intent intent = new Intent(this, activity18.class);
        startActivity(intent);
    }
    public void openactivity21() {
        Intent intent = new Intent(this, activity21.class);
        startActivity(intent);
    }
    public void openactivity25(){
        Intent intent = new Intent(this, activity25.class);
        startActivity(intent);
    }
    public void openactivity23(){
        Intent intent = new Intent(this, activity23.class);
        startActivity(intent);
    }
}
