package com.example.android.touguideps;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class ItalianFood_Fragment extends Fragment {


    public ItalianFood_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.restaurant_list, container, false);
        super.onCreate(savedInstanceState);


        ArrayList<Restaurant> place = new ArrayList<Restaurant>();
        place.add(new Restaurant(getString(R.string.Header_sanMarino), getString(R.string.Description_sanMarino), R.drawable.san_marino));


        // Create an {@link RestaurantAdapter}, whose data source is a list of
        // {@link Restaurant}s. The adapter knows how to create list item views for each item
        // in the list.
        RestaurantAdapter adapter = new RestaurantAdapter(getActivity(), place, R.color.foodItalian);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) rootView.findViewById(R.id.restaurant_list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
