package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity8 extends AppCompatActivity {
    private Button button31;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        button31 = (Button) findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity6();
            }
        });
    }
    public void openactivity6(){
        Intent intent = new Intent(this, activity6.class);
        startActivity(intent);
    }
}
