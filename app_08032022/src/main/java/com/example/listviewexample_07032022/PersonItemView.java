package com.example.listviewexample_07032022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.listviewexample_07032022.models.Person;

public class PersonItemView extends RecyclerView.ViewHolder {

    public TextView txtName;
    public TextView txtEmail;
    public TextView txtPhone;
    public PersonItemView(View view) {
        super(view);
        txtName = (TextView) view.findViewById(R.id.txtPersonName);
        txtEmail = (TextView) view.findViewById(R.id.txtEmail);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer currentPosition = getLayoutPosition();
                //navigate to "detail place"
            }
        });
    }
}