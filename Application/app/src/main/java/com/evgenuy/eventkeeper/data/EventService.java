package com.evgenuy.eventkeeper.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;

import com.evgenuy.eventkeeper.interfaces.EventDbService;
import com.evgenuy.eventkeeper.models.Event;
import com.evgenuy.eventkeeper.data.EventKeeperContract.EventEntry;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/**
 * Created by Evgenuy on 27-Nov-17.
 */

public class EventService implements EventDbService {

    private EventKeeperDbHelper dbHelper;
    private DateFormat dateFormat;
    private DateFormat timeFormat;

    public EventService(Context context) {
        dbHelper = new EventKeeperDbHelper(context);
        dateFormat = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        timeFormat = new SimpleDateFormat("HH:mm")
    }

    @Override
    public List<Event> getEvents() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String[] projection = {
                EventEntry._ID,
                EventEntry.COLUMN_TITLE,
                EventEntry.COLUMN_TIME,
                EventEntry.COLUMN_DATE,
                EventEntry.COLUMN_DESCRIPTION };
        Cursor cursor = db.query(
                EventEntry.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null
        );

        return null;
    }

    @Override
    public boolean editEvent(Event event) {
        return false;
    }

    @Override
    public Event createEvent(Event event) {
        return null;
    }

    @Override
    public boolean deleteEvent(int id) {
        return false;
    }

    private ArrayList<Event> parseQuery(Cursor cursor){
        int idColumnIndex = cursor.getColumnIndex(EventEntry._ID);
        int titleColumnIndex = cursor.getColumnIndex(EventEntry.COLUMN_TITLE);
        int timeColumnIndex = cursor.getColumnIndex(EventEntry.COLUMN_TIME);
        int dateColumnIndex = cursor.getColumnIndex(EventEntry.COLUMN_DATE);
        int descriptionColumnIndex = cursor.getColumnIndex(EventEntry.COLUMN_DESCRIPTION);
        ArrayList<Event> eventsList = new ArrayList<Event>();
        while (cursor.moveToNext()) {
            eventsList.add(new Event(
                    cursor.getInt(idColumnIndex),
                    cursor.getString(titleColumnIndex),
                    cursor.getString(descriptionColumnIndex),
                    dateFormat.parse(cursor.getString(dateColumnIndex)),
                    new Time(timeFormat.parse(cursor.getString(timeColumnIndex)).getTime())
            ));

        }
        return eventsList;
    }
}
