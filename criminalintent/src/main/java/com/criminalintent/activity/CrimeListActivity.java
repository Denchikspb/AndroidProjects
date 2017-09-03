package com.criminalintent.activity;

import android.support.v4.app.Fragment;

import com.criminalintent.fragment.CrimeListFragment;

/**
 * Created by Денис on 26.08.2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
