package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity1 extends AppCompatActivity {
    private Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity2();
            }
        });
    }
    public void openactivity2(){
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }
}
