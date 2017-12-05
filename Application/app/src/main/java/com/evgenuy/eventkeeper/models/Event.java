package com.evgenuy.eventkeeper.models;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Evgenuy on 27-Nov-17.
 */

public class Event {
    private int id;
    private String title;
    private String description;
    private String dateOn;
    private String timeOn;

    public Event(int id, String title, String description, String dateOn, String timeOn) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateOn = dateOn;
        this.timeOn = timeOn;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDateOn() {
        return dateOn;
    }

    public String getTimeOn() {
        return timeOn;
    }
}
