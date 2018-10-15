package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity9 extends AppCompatActivity {
    private Button button32;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);

        button32 = (Button) findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity3();
            }
        });
    }
    public void openactivity3(){
        Intent intent = new Intent(this, activity3.class);
        startActivity(intent);
    }
}
