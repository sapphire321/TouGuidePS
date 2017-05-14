package com.example.android.touguideps;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class LocalFood extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_list);

        ArrayList<Restaurant> place = new ArrayList<Restaurant>();
        place.add(new Restaurant("Griestal", "Country place which provied food grown only by the owners. This includes meat, Wine, vegetables", R.drawable.griestal_cut));
        place.add(new Restaurant("Griestal", "Country place which provied food grown only by the owners. This includes meat, Wine, vegetables", R.drawable.san_marino));



        // Create an {@link RestaurantAdapter}, whose data source is a list of
        // {@link Restaurant}s. The adapter knows how to create list item views for each item
        // in the list.
        RestaurantAdapter adapter = new RestaurantAdapter(this, place, R.color.foodLocal);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.restaurant_list);
        listView.setAdapter(adapter);
    }
}
