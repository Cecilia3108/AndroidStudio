package com.example.listviewexample_07032022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.listviewexample_07032022.adapter.PersonAdapter;
import com.example.listviewexample_07032022.models.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonListActivity extends AppCompatActivity {
    private PersonAdapter personAdapter;
    private ListView listviewpersons;
    private List<Person> personList=new ArrayList<Person>();

    private RecyclerView personRecyclerView;
    private RecyclerView.Adapter personsAdapter;
    private ArrayList<Person> personData=new ArrayList<Person>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_list);
        listviewpersons=(ListView) findViewById(R.id.ListViewPersons);

        //false list
        personList.add(new Person(1,"Alice","alice@gmail.com","0123456789"));
        personList.add(new Person(2,"Adam","Adam@gmail.com","01234566354"));
        personList.add(new Person(3,"Victoria","Victoria@gmail.com","0123829789"));
        personList.add(new Person(4,"Victor","Victor@gmail.com","0341936243"));

        //objects(data) => Adapter => ListView(UI)
        listviewpersons.setAdapter(personAdapter);

        personRecyclerView=findViewById(R.id.placesRecyclerView);

        RecyclerView.LayoutManager layoutManager=new
                LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.HORIZONTAL, false);

        personRecyclerView.setLayoutManager(layoutManager);
    }
}