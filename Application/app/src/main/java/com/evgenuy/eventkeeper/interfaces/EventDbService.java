package com.evgenuy.eventkeeper.interfaces;

import com.evgenuy.eventkeeper.models.Event;

import java.util.List;

/**
 * Created by Evgenuy on 27-Nov-17.
 */

public interface EventDbService {
    List<Event> getEvents();
    boolean editEvent(Event event);
    Event createEvent(Event event);
    boolean deleteEvent(int id);
}
