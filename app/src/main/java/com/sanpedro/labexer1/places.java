package com.sanpedro.labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
    }

    public void displayWeb1(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/University_of_Santo_Tomas_Field"));
        startActivity(i);
    }

    public void displayWeb2(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/Arch_of_the_Centuries"));
        startActivity(i);
    }

    public void displayWeb3(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://ph21stcenturypark.blogspot.com/2012/10/ust-quadri-park.html"));
        startActivity(i);
    }

    public void displayWeb4(View v){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://foursquare.com/v/benavides-park-lovers-lane/4d7da9728700370435b36299"));
        startActivity(i);
    }

    public void backbtn(View v){
        Intent i = new Intent(this , MainActivity.class);
        startActivity(i);
    }


}
