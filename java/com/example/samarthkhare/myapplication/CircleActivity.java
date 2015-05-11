package com.example.samarthkhare.myapplication;

import android.content.Intent;
import android.os.Bundle;

public class CircleActivity extends DiagnoseSplashActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        Intent intent = getIntent();
        Thread background = new Thread() {
            public void run() {
                try {
                    // Thread will sleep for 3 seconds
                    sleep(3*1000);

                    // After 3 seconds redirect to another intent
                    Bundle bundle = getIntent().getExtras();
                    int stuff = bundle.getInt("val");
                    Intent i=new Intent(getBaseContext(),ResultActivity.class);
                    Bundle bund = new Bundle();
                    bund.putInt("vall",stuff);
                    i.putExtras(bund);
                    startActivity(i);

                    //Remove activity
                    finish();

                } catch (Exception e) {

                }
            }
        };

        // start thread
        background.start();
    }
}
