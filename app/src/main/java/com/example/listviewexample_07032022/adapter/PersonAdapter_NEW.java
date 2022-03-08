package com.example.listviewexample_07032022.adapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.listviewexample_07032022.PersonItemView;
import com.example.listviewexample_07032022.PersonListActivity;
import com.example.listviewexample_07032022.R;
import com.example.listviewexample_07032022.models.Person;

import java.util.ArrayList;

public class PersonAdapter_NEW extends RecyclerView.Adapter<PersonItemView> {

    private ArrayList<Person> personData;
    private PersonListActivity personListActivity;
    //constructor
    PersonAdapter_NEW(ArrayList<Person> personDataData) {
        this.personData = personData;
    }
    @NonNull
    public PersonItemView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_person_item_view, viewGroup, false);
        PersonItemView placeItemView = new PersonItemView(view);

        return placeItemView;
    }

    public void onBindViewHolder(@NonNull PersonItemView placeItemView, int i) {
        Person selectedPlace = personData.get(i);
        String name = selectedPlace.getName();
        String email = selectedPlace.getEmail();
        String phone = selectedPlace.getPhone();
        placeItemView.txtName.setText(name);
        placeItemView.txtEmail.setText(email);
        //placeItemView.txtDescription.setText(phone);
    }

    public int getItemCount() {
        return personData.size();
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
}