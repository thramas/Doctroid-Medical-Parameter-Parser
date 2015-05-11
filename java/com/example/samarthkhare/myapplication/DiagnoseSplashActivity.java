package com.example.samarthkhare.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
/**
 * Created by Samarth Khare on 4/26/2015.
 *
 * THIS IS FOR heart disease
 *
 *
 *
 * HEARRTTTT
 *
 *
 * DISEASE
 *
 * !!!!!!!!!!
 */
public class DiagnoseSplashActivity extends MainActivity{

    EditText num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.heart);
        TextView disp = (TextView)findViewById(R.id.textView2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        disp.setText(message);

    }
    public void startResult(View v){
        num1 = (EditText)findViewById(R.id.atrib1);
        num2 = (EditText)findViewById(R.id.atrib2);
        num3 = (EditText)findViewById(R.id.atrib3);
        num4 = (EditText)findViewById(R.id.atrib4);
        num5 = (EditText)findViewById(R.id.atrib5);
        num6 = (EditText)findViewById(R.id.atrib6);
        num7 = (EditText)findViewById(R.id.atrib7);
        num8 = (EditText)findViewById(R.id.atrib8);
        num9 = (EditText)findViewById(R.id.atrib9);
        num10 = (EditText)findViewById(R.id.atrib10);
        num11 = (EditText)findViewById(R.id.atrib11);
        Button btn = (Button)findViewById(R.id.button);
        String inpval = num1.getText().toString();
        if (inpval.matches("")) {
            Toast.makeText(this, "You did not enter Chest Pain Type", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval2 = num2.getText().toString();
        if (inpval2.matches("")) {
            Toast.makeText(this, "You did not enter Resting Blood Pressure", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval3 = num3.getText().toString();
        if (inpval3.matches("")) {
            Toast.makeText(this, "You did not enter Serum Choletoral", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval4 = num4.getText().toString();
        if (inpval4.matches("")) {
            Toast.makeText(this, "You did not enter Fasting Blood Sugar", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval5 = num5.getText().toString();
        if (inpval5.matches("")) {
            Toast.makeText(this, "You did not enter Resting ECG Results", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval6 = num6.getText().toString();
        if (inpval6.matches("")) {
            Toast.makeText(this, "You did not enter Max Heart Rate", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval7 = num7.getText().toString();
        if (inpval7.matches("")) {
            Toast.makeText(this, "You did not enter Exercise Induced Angina", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval8 = num8.getText().toString();
        if (inpval8.matches("")) {
            Toast.makeText(this, "You did not enter ST Depresssion", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval9 = num9.getText().toString();
        if (inpval9.matches("")) {
            Toast.makeText(this, "You did not enter ST Segment", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval10 = num10.getText().toString();
        if (inpval10.matches("")) {
            Toast.makeText(this, "You did not enter No. of Major Vessels", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval11 = num11.getText().toString();
        if (inpval11.matches("")) {
            Toast.makeText(this, "You did not enter Thal", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent i = new Intent(this,CircleActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("val",2);
        i.putExtras(bundle);
        startActivity(i);
    }
}
