package com.evgenuy.eventkeeper.data;

import android.provider.BaseColumns;

/**
 * Created by Evgenuy on 26-Nov-17.
 */

public final class EventKeeperContract {
    private EventKeeperContract(){

    }

    public static final class EventEntry implements BaseColumns {
        public final static String TABLE_NAME = "events";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_TITLE = "title";
        public final static String COLUMN_DATE = "dateOn";
        public final static String COLUMN_TIME = "timeOn";
        public final static String COLUMN_DESCRIPTION = "description";
    }
}
