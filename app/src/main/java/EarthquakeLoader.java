import android.content.AsyncTaskLoader;
import android.content.Context;

import com.example.android.quakereport.Earthquake;
import com.example.android.quakereport.QueryUtils;

import java.util.ArrayList;

/**
 * Created by Davo on 3/7/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader<ArrayList<Earthquake>> {
    private static String USGS_REQUEST_URL = null;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        // TODO: Finish implementing this constructor
        USGS_REQUEST_URL = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public ArrayList<Earthquake> loadInBackground() {
        // TODO: Implement this method
        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes(USGS_REQUEST_URL);
        return earthquakes;
    }
}