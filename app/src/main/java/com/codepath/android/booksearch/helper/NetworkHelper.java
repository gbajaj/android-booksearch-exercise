package com.codepath.android.booksearch.helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by gauravb on 3/15/17.
 */

public class NetworkHelper {
    public static boolean isNetworkAvailable(Context ctx){
        boolean isConected = false;

        ConnectivityManager connManager;
        connManager = (ConnectivityManager)ctx.getSystemService(ctx.CONNECTIVITY_SERVICE);

        NetworkInfo nwInfo = connManager.getActiveNetworkInfo();
        if(nwInfo != null){
            isConected = true;
        }
        return isConected;

    }
}