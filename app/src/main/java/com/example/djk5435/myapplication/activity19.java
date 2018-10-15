package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity19 extends AppCompatActivity {
    private Button button46;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_19);

        button46 = (Button) findViewById(R.id.button46);
        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity20();
            }
        });
    }
    public void openactivity20(){
        Intent intent = new Intent(this, activity20.class);
        startActivity(intent);
    }
}
