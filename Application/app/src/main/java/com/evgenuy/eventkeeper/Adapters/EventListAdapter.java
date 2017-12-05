package com.evgenuy.eventkeeper.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.evgenuy.eventkeeper.R;
import com.evgenuy.eventkeeper.models.Event;

import java.util.ArrayList;

/**
 * Created by Evgenuy on 06-Dec-17.
 */

public class EventListAdapter extends ArrayAdapter<Event> {

    private static class ViewHolder{
        private TextView timeText;
        private TextView titleText;
        private TextView dateText;
    }

    private ViewHolder viewHolder;

    public EventListAdapter( Context context, int textViewResourceId, ArrayList<Event> objects) {
        super(context, textViewResourceId, objects);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(this.getContext())
                    .inflate(R.layout.list_item, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.timeText = (TextView) convertView.findViewById(R.id.time);
            viewHolder.dateText = (TextView) convertView.findViewById(R.id.date);
            viewHolder.titleText = (TextView) convertView.findViewById(R.id.title);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Event item = getItem(position);
        if (item!= null) {
            viewHolder.titleText.setText(item.getTitle());
            viewHolder.dateText.setText(item.getDateOn());
            viewHolder.timeText.setText(item.getTimeOn());
        }

        return convertView;
    }
}
