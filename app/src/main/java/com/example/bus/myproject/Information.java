package com.example.bus.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
    }
    public void clsce (View view){
        Intent onClickclsce = new Intent(Information.this,MainActivity.class);

        startActivity(onClickclsce);

    }
}
