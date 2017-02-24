package com.example.android.quakereport;

/**
 * Created by Davo on 2/23/2017.
 */

public class Earthquake {

    private String mMagnitude;
    private String mCity;
    private String mDate;

    public Earthquake(String magnitude, String city, String date) {
        mMagnitude = magnitude;
        mCity = city;
        mDate = date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }
    public String getCity() {
        return mCity;
    }
    public String getDate() {
        return mDate;
    }
}
