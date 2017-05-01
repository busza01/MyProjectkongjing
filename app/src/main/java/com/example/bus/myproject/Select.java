package com.example.bus.myproject;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Select extends Activity {

    Spinner dateSpinner,monthSpinner,yearSpinner;
    EditText numpersonEditText;
    String dateString;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);


        dateSpinner = (Spinner) findViewById(R.id.date);
        monthSpinner = (Spinner) findViewById(R.id.month);
        yearSpinner = (Spinner) findViewById(R.id.year);
        numpersonEditText = (EditText) findViewById(R.id.numperson);

        ArrayList<String>datalist= new ArrayList<String>();
        datalist.add("1");
        datalist.add("2");
        ArrayAdapter<String> dateAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,datalist);

        ArrayList<String>monthlist= new ArrayList<String>();
        monthlist.add("มกราคม");
        monthlist.add("กุมภาพัน");
        ArrayAdapter<String> monthStrings = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,monthlist);

        ArrayList<String> yearList = new ArrayList<String>();


        dateSpinner.setAdapter(dateAdapter);
        monthSpinner.setAdapter(monthStrings);

        dateString = dateSpinner.getResources().toString().trim();











    }



    public void onsearchfight(View view){
        Intent onsearchfightIntent = new Intent(Select.this,MainActivity.class);
        onsearchfightIntent.putExtra("dategogo",dateString);


        startActivity(onsearchfightIntent);


    }


}

