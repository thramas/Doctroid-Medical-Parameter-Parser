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
 * THIS IS FOR LIVER DISORDER
 *
 *
 *
 * LIIIIVERRRRRR
 *
 *
 * DISSSOORRRDERRR
 *
 * !!!!!!!!!!
 */
public class DiagnoseHeartActivity extends MainActivity {
    EditText num1,num2,num3,num4,num5,num6,num7,num8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liver);
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
        Button btn = (Button)findViewById(R.id.button);
        String inpval = num1.getText().toString();
        if (inpval.matches("")) {
            Toast.makeText(this, "You did not enter Mean Corpuscular Volume", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval2 = num2.getText().toString();
        if (inpval2.matches("")) {
            Toast.makeText(this, "You did not enter Alkphos Alkanine Phosphotase", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval3 = num3.getText().toString();
        if (inpval3.matches("")) {
            Toast.makeText(this, "You did not enter SGPT", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval4 = num4.getText().toString();
        if (inpval4.matches("")) {
            Toast.makeText(this, "You did not enter SGOT", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval5 = num5.getText().toString();
        if (inpval5.matches("")) {
            Toast.makeText(this, "You did not enter Gamma - GT", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval6 = num6.getText().toString();
        if (inpval6.matches("")) {
            Toast.makeText(this, "You did not enter No of drinks per day", Toast.LENGTH_SHORT).show();
            return;
        }
        String inpval7 = num7.getText().toString();
        if (inpval7.matches("")) {
            Toast.makeText(this, "You did not enter Selector Field", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent i = new Intent(this,CircleActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("val",3);
        i.putExtras(bundle);
        startActivity(i);
    }
}
