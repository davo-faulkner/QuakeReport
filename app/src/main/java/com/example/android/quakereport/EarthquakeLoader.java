package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Davo on 3/7/2017.
 */

/**
 * Loads a list of earthquakes by using an AsyncTask to perform the
 * network request to the given URL.
 */
public class EarthquakeLoader extends AsyncTaskLoader<ArrayList<Earthquake>> {

    /**
     * Tag for log messages
     */
    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    /**
     * Query URL
     */
    private String mUrl;

    /**
     * Constructs a new {@link EarthquakeLoader}.
     *
     * @param context of the activity
     * @param url     to load data from
     */
    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        Log.e(LOG_TAG, "onStartLoading called.");
        forceLoad();
    }

    /**
     * This is on a background thread.
     */
    @Override
    public ArrayList<Earthquake> loadInBackground() {
        Log.e(LOG_TAG, "loadInBackground called.");
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes(mUrl);
        return earthquakes;
    }
}