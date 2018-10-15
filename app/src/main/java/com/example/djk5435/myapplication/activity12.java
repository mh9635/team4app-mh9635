package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity12 extends AppCompatActivity {
    private Button button37;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12);

        button37 = (Button) findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity10();
            }
        });
    }
    public void openactivity10(){
        Intent intent = new Intent(this, activity10.class);
        startActivity(intent);
    }
}
