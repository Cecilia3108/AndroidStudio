package com.example.listviewexample_07032022.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.listviewexample_07032022.R;
import com.example.listviewexample_07032022.models.Person;

import java.util.List;

public class PersonAdapter extends BaseAdapter {
    //constructor
    private List<Person> persons;
    public PersonAdapter(List<Person> persons){
        super(); //call parent class's methods. this = new BaseAdapter();
        this.persons=persons;
    }

    @Override
    public int getCount() {
        //how many list items?
        return persons.size();
    }

    @Override
    public Object getItem(int i) {
        return persons.get(i); //i=0, 1, 2, 3,...
    }

    @Override
    public long getItemId(int i) {
        //where's 'primary key'/'key'? (for inject)
        //persons.hashCode()
        return persons.get(i).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //what/how is the item's UI?
        //get from xml file
        Context context=parent.getContext();
        //View view =LayoutInflater.from(context).
        //        inflate(R.layout.person_list_item, parent, false);
        TextView textView1=convertView.findViewById(R.id.textView1);
        textView1.setText("something");
        //get data
        TextView textViewName=convertView.findViewById(R.id.txtName);
        TextView textViewPhone=convertView.findViewById(R.id.txtPhone);
        TextView textViewEmail=convertView.findViewById(R.id.txtEmail);
        Person selectedPerson=persons.get(i);
        //fetch data to selected view
        textViewName=setText(selectedPerson.getName());
        textViewPhone=setText(selectedPerson.getPhone());
        textViewEmail=setText(selectedPerson.getEmail());
        return LayoutInflater.from(context).
                inflate(R.layout.person_list_item, parent, false);
    }
}
