package com.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Денис on 26.08.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
