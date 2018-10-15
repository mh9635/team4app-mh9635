package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity17 extends AppCompatActivity {
    private Button button70;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_17);

        button70 = (Button) findViewById(R.id.button70);
        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity16();
            }
        });
    }
    public void openactivity16(){
        Intent intent = new Intent(this, activity16.class);
        startActivity(intent);
    }
}
