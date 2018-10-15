package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity15 extends AppCompatActivity {
    private Button button42;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_15);

        button42 = (Button) findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity14();
            }
        });
    }
    public void openactivity14(){
        Intent intent = new Intent(this, activity14.class);
        startActivity(intent);
    }
}
