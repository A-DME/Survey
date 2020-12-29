package com.example.anticorona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

public class Analysis extends AppCompatActivity {

    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        res=findViewById(R.id.res);
     Intent i=getIntent();
//        String[] o=i.getStringArrayExtra("Survey");
//        Log.i("shakalala",o[0]);
        res.setText("bla");
//        res.setText(o[0]);



    }
}