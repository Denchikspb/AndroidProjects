package com.weather;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class WeatherPreferenceActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        String action = getIntent().getAction();

        addPreferencesFromResource(R.xml.weather_prefs);


    }
}
