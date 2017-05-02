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
    String dateString,yearString;







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
        datalist.add("3");
        datalist.add("4");
        datalist.add("5");
        datalist.add("6");
        datalist.add("7");
        datalist.add("8");
        datalist.add("9");
        datalist.add("10");
        datalist.add("11");
        datalist.add("12");
        datalist.add("13");
        datalist.add("14");
        datalist.add("15");
        datalist.add("16");
        datalist.add("17");
        datalist.add("18");
        datalist.add("19");
        datalist.add("20");
        datalist.add("21");
        datalist.add("22");
        datalist.add("23");
        datalist.add("24");
        datalist.add("25");
        datalist.add("26");
        datalist.add("27");
        datalist.add("28");
        datalist.add("29");
        datalist.add("30");
        datalist.add("31");
        ArrayAdapter<String> dateAdapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,datalist);

        ArrayList<String>monthlist= new ArrayList<String>();
        monthlist.add("มกราคม");
        monthlist.add("มีนาคม");
        monthlist.add("พฤษภาคม");
        ArrayAdapter<String> monthStrings = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,monthlist);

        ArrayList<String> yearList = new ArrayList<String>();
        yearList.add("2560");
        yearList.add("2561");
        yearList.add("2562");
        ArrayAdapter<String> yearStrings = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,yearList);

        dateSpinner.setAdapter(dateAdapter);
        monthSpinner.setAdapter(monthStrings);
        yearSpinner.setAdapter(yearStrings);

        dateString = dateSpinner.getResources().toString().trim();



    }


    public void onsearchfight(View view){
        Intent onsearchfightIntent = new Intent(Select.this,MainActivity.class);
        onsearchfightIntent.putExtra("dategogo",dateString);


        startActivity(onsearchfightIntent);


    }


}

