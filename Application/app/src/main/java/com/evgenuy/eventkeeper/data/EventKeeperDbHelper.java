package com.evgenuy.eventkeeper.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.evgenuy.eventkeeper.data.EventKeeperContract.EventEntry;

/**
 * Created by Evgenuy on 26-Nov-17.
 */

public class EventKeeperDbHelper extends SQLiteOpenHelper {
    public static final String LOG_TAG = EventKeeperDbHelper.class.getSimpleName();
    private static final String DATABASE_NAME = "events";
    private static final int DATABASE_VERSION = 1;

    public EventKeeperDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String SQL_CREATE_EVENTS_TABLE = "CREATE TABLE " + EventEntry.TABLE_NAME + " (" +
                EventEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                EventEntry.COLUMN_TITLE + " TEXT NOT NULL, " +
                EventEntry.COLUMN_DATE + " TEXT NOT NULL, " +
                EventEntry.COLUMN_TIME + " TEXT NOT NULL, " +
                EventEntry.COLUMN_DESCRIPTION + " TEXT);";

        sqLiteDatabase.execSQL(SQL_CREATE_EVENTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
}
