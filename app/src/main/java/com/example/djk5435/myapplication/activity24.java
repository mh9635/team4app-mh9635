package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity24 extends AppCompatActivity {
    private Button button60;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_24);

        button60 = (Button) findViewById(R.id.button60);
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity23();
            }
        });
    }
    public void openactivity23(){
        Intent intent = new Intent(this, activity23.class);
        startActivity(intent);
    }
}
