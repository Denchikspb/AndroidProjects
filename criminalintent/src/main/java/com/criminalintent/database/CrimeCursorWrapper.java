package com.criminalintent.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.criminalintent.database.CrimeDBSchema.CrimeTable;
import com.criminalintent.model.Crime;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Денис on 03.09.2017.
 */

public class CrimeCursorWrapper extends CursorWrapper {
    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Crime getCrime() {
        String uuidString = getString(getColumnIndex(CrimeTable.Cols.UUID));
        String title = getString(getColumnIndex(CrimeTable.Cols.TITLE));
        long date = getLong(getColumnIndex(CrimeTable.Cols.DATE));
        int isSolved = getInt(getColumnIndex(CrimeTable.Cols.SOLVED));
        String suspect = getString(getColumnIndex(CrimeTable.Cols.SUSPECT));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setDate(new Date(date));
        crime.setTitle(title);
        crime.setSolved(isSolved != 0);
        crime.setSuspect(suspect);

        return crime;
    }

}