package com.sanpedro.labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayAct2(View v){
        Intent i = new Intent(this , places.class);
        startActivity(i);
    }

    public void displayLog(View v){
        Intent i = new Intent(this , Service.class);
        startActivity(i);
    }
}
