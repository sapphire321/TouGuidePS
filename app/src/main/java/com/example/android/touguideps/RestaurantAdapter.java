package com.example.android.touguideps;


import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link RestaurantAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link Restaurant} objects.
 * */
public class RestaurantAdapter extends ArrayAdapter<Restaurant>
{
    private int mColorResoiurceId;
    /**
     * This is our own custom constructor (It doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate thye layout file.
     * @param place A List of RestaurantAdapter to display in a list.
     * @param colorResourceId is the resource id for the background color for this list of words
     * */
    public RestaurantAdapter(Activity context, ArrayList<Restaurant> place, int colorResourceId)
    {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, place);
        mColorResoiurceId = colorResourceId;
    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the {@link Restaurant} object located at this position in the list
        Restaurant currentRestaurant = getItem(position);

        // Find the TextView in the list_item.xml layout
        TextView headerTextView = (TextView) listItemView.findViewById(R.id.Header_text_view);
        //Get the Header name from the current Restaurant Object
        // and set this text on the Header TextView
        headerTextView.setText(currentRestaurant.getPlaceName());

        // Find the TextView in the list_item.xml
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.Description_text_view);
        //Get the Description from the current Restaurant object
        // and set this text in the Description TextView
        descriptionTextView.setText(currentRestaurant.getPlaceDescription());

        //Find the ImageView in the List_item.xml
        ImageView iconImageView = (ImageView) listItemView.findViewById(R.id.image_Restaurant);
        // Get the Image from the current Restaurant object
        // and set this image in the ImageView
        iconImageView.setImageResource(currentRestaurant.getPlaceImage());

        // Set the theme color fore the list_item.xml
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that belongs to the Category
        int color = ContextCompat.getColor(getContext(), mColorResoiurceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
