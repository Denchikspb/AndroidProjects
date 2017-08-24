package com.retrofitapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Денис on 10.08.2017.
 */

public interface UmoriliApi {
    @GET("/api/get")
    Call<List<PostModel>> getData(@Query("name") String resourceName, @Query("num") int count);
}
