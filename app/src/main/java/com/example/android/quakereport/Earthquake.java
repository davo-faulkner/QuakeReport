package com.example.android.quakereport;

/**
 * Created by Davo on 2/23/2017.
 */

public class Earthquake {

    private Double mMagnitude;
    private String mCity;
    private Long mTiumeInMilliseconds;
    private String mUrl;

    public Earthquake(Double magnitude, String city, Long date, String url) {
        mMagnitude = magnitude;
        mCity = city;
        mTiumeInMilliseconds = date;
        mUrl = url;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }
    public String getCity() {
        return mCity;
    }
    public Long getTiumeInMilliseconds() {
        return mTiumeInMilliseconds;
    }
    public String getUrl() {
        return mUrl;
    }
}
