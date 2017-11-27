package com.evgenuy.eventkeeper;

import com.evgenuy.eventkeeper.interfaces.EventDbService;
import com.evgenuy.eventkeeper.models.Event;

import java.util.List;

/**
 * Created by Evgenuy on 27-Nov-17.
 */

public class EventService implements EventDbService {
    @Override
    public List<Event> getEvents() {
        return null;
    }

    @Override
    public Event getEvent(int id) {
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
}
