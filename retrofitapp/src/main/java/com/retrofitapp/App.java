package com.retrofitapp;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Денис on 11.08.2017.
 */

public class App extends Application {

    private static UmoriliApi umoriliApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        retrofit = new Retrofit.Builder()
                .baseUrl("http://www.umori.li/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        umoriliApi = retrofit.create(UmoriliApi.class);
    }

    public static UmoriliApi getApi(){
        return umoriliApi;
    }
}
