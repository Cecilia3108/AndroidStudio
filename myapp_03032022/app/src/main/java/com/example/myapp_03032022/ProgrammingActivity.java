package com.example.myapp_03032022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.myapp_03032022.models.Product;

public class ProgrammingActivity extends AppCompatActivity {
    private Button btnGetRadioButton;
    private RadioButton java;
    private RadioButton csharp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programming);

        Product product=new Product(1,"sth",123);
        Toast.makeText(this,String.format("product detail: %s",product.toString()),Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_programming);

        btnGetRadioButton= (Button) findViewById(R.id.button);
        csharp=(RadioButton) findViewById((R.id.rbCSharp));
        java=(RadioButton) findViewById((R.id.rbJava));

        btnGetRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(csharp.callOnClick()){
                    Toast.makeText(getApplicationContext(),csharp.getText().toString().trim(),Toast.LENGTH_LONG).show();
                    return;
                }else if(java.callOnClick()){
                    Toast.makeText(getApplicationContext(),java.getText().toString().trim(),Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"choice invalid",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}