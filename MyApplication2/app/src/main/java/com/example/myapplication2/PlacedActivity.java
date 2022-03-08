package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;

public class PlacedActivity extends AppCompatActivity {
    private TextView txtInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placed);
        txtInfo=(TextView) findViewById(R.id.txtInfo);

        Bundle extras=getIntent().getExtras();
        if(extras!=null){
            String email=extras.getString("email");
            txtInfo.setText(email);
        }
    }
}