package com.codepath.android.booksearch.Rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rparuthi on 3/15/2017.
 */

public class ApiClient {
    public static final String BASE_URL = "http://openlibrary.org/";
    private static Retrofit retrofit = null;

    public static  Retrofit getClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

