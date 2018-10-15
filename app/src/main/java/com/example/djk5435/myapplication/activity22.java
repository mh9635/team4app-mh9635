package com.example.djk5435.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity22 extends AppCompatActivity {
    private Button button72;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_22);

        button72 = (Button) findViewById(R.id.button72);
        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                openactivity21();
            }
        });
    }
    public void openactivity21(){
        Intent intent = new Intent(this, activity21.class);
        startActivity(intent);
    }
}
