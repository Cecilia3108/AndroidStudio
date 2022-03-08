package com.example.a01_03_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;

public class UserInfoActivity extends AppCompatActivity {
    private String language = "English";
    private String result = "";
    private String isBeautiful = "";
    private String isUgly = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_info);

        // Spinner element
        Spinner spinner = findViewById(R.id.spinner);

        // Spinner click listener
        // spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<>();
        categories.add("English");
        categories.add("Tagalog");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        
        //=========================================
        //button clicked
        Button btnSend = findViewById(R.id.btnSend);
        EditText FirstName=findViewById(R.id.txtFirstName);
        EditText LastName=findViewById(R.id.txtLastName);
        EditText Email=findViewById(R.id.txtEmail);

        /*Object view;
        btnSend.setOnClickListener(View view)->{
            String message=String format("firstname: %s lastname: %s email: %s")
        }*/
    }
    //@Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();
        // first create references to the controls we want to change based on language selection
        CheckBox cbBeautiful = (CheckBox)findViewById(R.id.chkBeautiful);
        CheckBox cbUgly = (CheckBox)findViewById(R.id.chkUgly);
        RadioButton radBoy = (RadioButton)findViewById(R.id.rbBoy);
        RadioButton radGirl = (RadioButton)findViewById(R.id.rbGirl);
        Button btnSend = (Button)findViewById(R.id.btnSend);
        TextView lblFirstName = (TextView)findViewById(R.id.txtFirstName);
        TextView lblLastName = (TextView)findViewById(R.id.txtLastName);
        TextView lblEmail = (TextView)findViewById(R.id.txtEmail);
        // Now we check to see if English selected and set labels to English
        if (item == "English") {
            cbBeautiful.setText("Beautiful");
            cbUgly.setText("Ugly");
            radBoy.setText("Boy");
            radGirl.setText("Girl");
            btnSend.setText("SEND");
            lblFirstName.setText("First Name");
            lblLastName.setText("Last Name");
            lblEmail.setText("Email");
            language = "English";
        }
        else // if not English, must be Tagalog
        {
            cbBeautiful.setText("Magando ako");
            cbUgly.setText("Pangit ako");
            radBoy.setText("Batang lalaki");
            radGirl.setText("batang babae");
            btnSend.setText("MAGPADALA");
            lblFirstName.setText("Pangalan");
            lblLastName.setText("Huling pangalan");
            lblEmail.setText("Email");
            language = "Tagalog";
        }

        // Showing selected spinner item
        {
            Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
        }
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // Auto-generated method stub
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        String boyGirl = "";
        switch(view.getId()) {
            case R.id.rbBoy:
                if (checked)
                    boyGirl = "boy";
                break;
            case R.id.rbGirl:
                if (checked)
                    boyGirl = "girl";
                break;
        }
    }
}