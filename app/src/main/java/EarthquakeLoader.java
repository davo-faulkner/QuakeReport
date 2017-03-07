import android.content.AsyncTaskLoader;
import android.content.Context;

import com.example.android.quakereport.Earthquake;

import java.util.List;

/**
 * Created by Davo on 3/7/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>>{

    public EarthquakeLoader(Context context, String url) {
        super(context);
        // TODO: Finish implementing this constructor
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        // TODO: Implement this method
    }
}