package com.example.drivetomsu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOne = findViewById(R.id.button);
        buttonOne.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Uri googleMaps= Uri.parse("google.navigation:q=1 Normal Ave Montclair NJ 07043");
                Intent map = new Intent(Intent.ACTION_VIEW, googleMaps);
                map.setPackage("com.google.android.apps.maps");
                startActivity(map);
            }
        });
    }
}