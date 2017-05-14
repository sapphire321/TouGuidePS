package com.example.android.touguideps;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LocalFood_Fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.restaurant_list, container, false);
        super.onCreate(savedInstanceState);


        ArrayList<Restaurant> place = new ArrayList<Restaurant>();
        place.add(new Restaurant(getString(R.string.Header_griestal), getString(R.string.Description_griestal), R.drawable.griestal_cut));




        // Create an {@link RestaurantAdapter}, whose data source is a list of
        // {@link Restaurant}s. The adapter knows how to create list item views for each item
        // in the list.
        RestaurantAdapter adapter = new RestaurantAdapter(getActivity(), place, R.color.foodLocal);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.restaurant_list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
