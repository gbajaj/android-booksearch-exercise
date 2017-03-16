package com.codepath.android.booksearch.Rest;

import com.codepath.android.booksearch.models.Response;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by rparuthi on 3/15/2017.
 */

public interface ApiInterface {

    @GET("search.json")
    Call<Response> getBooks(@Query("q") String queryText);
}
