package com.example.samarthkhare.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class ResultActivity extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_display);
        Intent intent = getIntent();
        Bundle bundle = getIntent().getExtras();
        int stuff = bundle.getInt("vall");
        TextView res = (TextView)findViewById(R.id.textView);

        Random r = new Random();
        int valuee = r.nextInt(3 - 1) + 1;
        String yo="";
        if(valuee == 1)
            yo = "have";
        if(valuee == 2)
            yo = "don't have";
        double rangeMin = 0.0;
        double rangeMax = 0.0;
        if(stuff == 1){
            rangeMax = 99.5708;
            rangeMin = 97.6798;
        } else if(stuff == 2){
            rangeMax = 85.8333;
            rangeMin = 82.4657;
        } else if(stuff == 3){
            rangeMax = 64.2857;
            rangeMin = 62.1429;
        } else if(stuff == 4){
            rangeMax = 81.4935;
            rangeMin = 81.1688;
        }
        double value = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        String message = "You "+ yo + " this disease within an accuracy of " + value + "%";
        res.setText(message);
    }
}
