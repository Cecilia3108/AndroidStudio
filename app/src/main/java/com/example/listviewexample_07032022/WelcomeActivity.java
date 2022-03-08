package com.example.listviewexample_07032022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button btnNavigateToPersonList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnNavigateToPersonList=(Button) findViewById(R.id.NavigateToPersonList);

        btnNavigateToPersonList.setOnClickListener((View view)->{

        });
    }
}