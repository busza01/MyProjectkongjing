package com.example.bus.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void startapp (View view){
        Intent onClickstartapp = new Intent(Home.this,Select.class);
        startActivity(onClickstartapp);
    }
}
