package com.actionbar;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ArrayAdapter;

public class MainActivity extends Activity implements ActionBar.OnNavigationListener{

    String[] data = new String[] { "one", "two", "three" };
    final String LOG_TAG = "MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar bar = getActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bar.setListNavigationCallbacks(adapter, this);

    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        Log.d(LOG_TAG, "selected: position = " + i + ", id = "
                + l + ", " + data[i]);
        return false;
    }
}
