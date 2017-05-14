package com.example.android.touguideps;

public class Restaurant
{
    private String mPlaceName;
    private String mPlaceDescription;
    private int mPlaceImage;

    /**
     * (Constructor)Create a new Restaurant Object
     *
     * @param placeName is the Restaurant name
     * @param placeDescription is the Restaurant description
     * @param placeImage is the Restaurant Image
     *
    */
    public Restaurant(String placeName, String placeDescription, int placeImage)
    {
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
        mPlaceImage = placeImage;
    }

    /**
     * Getters
     * */
    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    public int getPlaceImage() {
        return mPlaceImage;
    }
}
