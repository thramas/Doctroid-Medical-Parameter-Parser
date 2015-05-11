package com.example.samarthkhare.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "com.example.samarthkhare.MESSAGE";
    EditText name, age;
    CheckBox disease1,disease2,disease3,disease4;
    Button btn;
    String selectedDisease;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);/*
        disease1 = (CheckBox)findViewById(R.id.bcancer);
        disease2 = (CheckBox)findViewById(R.id.lcancer);
        disease3 = (CheckBox)findViewById(R.id.mcancer);
        disease4 = (CheckBox)findViewById(R.id.mcancer);
        */
        btn = (Button)findViewById(R.id.submit);
    }

    public void genderCheck(View view){
        CheckBox malechoice,femalechoice;
        malechoice = (CheckBox)findViewById(R.id.male);
        femalechoice = (CheckBox)findViewById(R.id.female);
        boolean checked = ((CheckBox) view).isChecked();
        femalechoice.setEnabled(true);
        malechoice.setEnabled(true);
        if(malechoice.isChecked()){
            femalechoice.setEnabled(false);
        } else if(femalechoice.isChecked()){
            malechoice.setEnabled(false);
        }
    }
    public void onCheckBoxSelected(View view) {
        // Is the button now checked?
        boolean checked = ((CheckBox) view).isChecked();
        disease1 = (CheckBox)findViewById(R.id.bcancer);
        disease2 = (CheckBox)findViewById(R.id.lcancer);
        disease3 = (CheckBox)findViewById(R.id.mcancer);
        disease4 = (CheckBox)findViewById(R.id.ncancer);
        disease1.setEnabled(true);
        disease2.setEnabled(true);
        disease3.setEnabled(true);
        disease4.setEnabled(true);
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.bcancer:
                if (checked){
                    selectedDisease = "Breast Cancer";
                    disease2.setEnabled(false);
                    disease3.setEnabled(false);
                    disease4.setEnabled(false);
                }
                break;
            case R.id.lcancer:
                if (checked){
                    selectedDisease = "Heart Disease";
                    disease1.setEnabled(false);
                    disease3.setEnabled(false);
                    disease4.setEnabled(false);
                }
                break;
            case R.id.mcancer:
                if (checked){
                    selectedDisease = "Liver Disorder";
                    disease1.setEnabled(false);
                    disease2.setEnabled(false);
                    disease4.setEnabled(false);
                }
                break;
            case R.id.ncancer:
                if (checked){
                    selectedDisease = "Pima Indian Diabetes";
                    disease1.setEnabled(false);
                    disease2.setEnabled(false);
                    disease3.setEnabled(false);
                }
                break;
        }
    }
    public void launchDiagnose(View v){
        EditText name_entry = (EditText) findViewById(R.id.name);
        String inpval = name_entry.getText().toString();
        if (inpval.matches("")) {
            Toast.makeText(this, "You did not enter the patient's name", Toast.LENGTH_SHORT).show();
            return;
        }
        EditText age_entry = (EditText) findViewById(R.id.age);
        String inpval2 = age_entry.getText().toString();
        if (inpval2.matches("")) {
            Toast.makeText(this, "You did not enter patient's age", Toast.LENGTH_SHORT).show();
            return;
        }
        String message = name_entry.getText().toString();
        message = message + " : Age " + age_entry.getText().toString() + " : " + selectedDisease;
        if(selectedDisease == "Heart Disease") {
            Intent diag = new Intent(this, DiagnoseSplashActivity.class);
            diag.putExtra(EXTRA_MESSAGE, message);
            startActivity(diag);
        } else if(selectedDisease == "Breast Cancer"){
            Intent diag = new Intent(this, DiagnoseBreastActivity.class);
            diag.putExtra(EXTRA_MESSAGE, message);
            startActivity(diag);
        } else if(selectedDisease == "Liver Disorder"){
            Intent diag = new Intent(this, DiagnoseHeartActivity.class);
            diag.putExtra(EXTRA_MESSAGE, message);
            startActivity(diag);
        } else if(selectedDisease == "Pima Indian Diabetes"){
            Intent diag = new Intent(this, DiagnosePimaActivity.class);
            diag.putExtra(EXTRA_MESSAGE, message);
            startActivity(diag);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}