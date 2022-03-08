package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.*;

import java.io.OptionalDataException;

public class MainActivity extends AppCompatActivity {
    public static final String pattern="[A-Z0-9._%-]+@[A-Z0-9.-]+.[A-Z]{2,4}";
    private EditText txtEmail;
    private EditText txtPass;
    private Button btnLogin;
    private TextView txtValidate;

    private String errorEmail;
    private String errorPass;
    //VALIDATE
    private boolean isEmail=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MAP PROPERTIES IN XML FILE
        txtEmail=(EditText) findViewById(R.id.txtEmail);
        txtPass=(EditText) findViewById(R.id.txtPass);
        btnLogin= (Button) findViewById(R.id.btnEnter);
        txtValidate= (TextView) findViewById(R.id.txtValidate);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isEmail){
                    Toast.makeText(getApplicationContext(),"Validate email failed",Toast.LENGTH_LONG).show();
                    return;
                }else{
                    Intent intent=new Intent(MainActivity.this, PlacedActivity.class);
                    intent.putExtra("Email",txtEmail.getText().toString().trim());
                    startActivity(intent);
                }
                //ALERT
                //Toast.makeText(getApplicationContext(),"Entered",Toast.LENGTH_LONG).show();
                //GET INPUT
                //String getEmail=txtEmail.getText().toString().trim();
                //Toast.makeText(getApplicationContext(),"Email: "+getEmail,Toast.LENGTH_LONG).show();
            }
        });
        //VALIDATION
        txtEmail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                //VALIDATE HERE
                txtValidate.setText("");
                String getEmail=txtEmail.getText().toString().trim();
                isEmail=(getEmail.matches(pattern) && getEmail.length()>0);
                if(isEmail=false){
                    txtValidate.setTextColor(Color.rgb(255,0,0));
                    txtValidate.setText("Invaild email address");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        txtPass.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                // validatePass
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}