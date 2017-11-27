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
    private Date dateOn;
    private Time timeOn;

    public Event(int id, String title, String description, Date dateOn, Time timeOn) {
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

    public Date getDateOn() {
        return dateOn;
    }

    public Time getTimeOn() {
        return timeOn;
    }
}
