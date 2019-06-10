package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SubjectsAdapter extends ArrayAdapter<Subjects> {
    public SubjectsAdapter(Activity context, ArrayList<Subjects> words) {
        super(context, 0, words);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object position in the list
        Subjects currentSubject = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.place_text_view);
        placeTextView.setText(currentSubject.getPlace());

        // Find the TextView in the list_item.xml layout with the ID
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentSubject.getDescription());

        // Find the TextView in the list_item.xml layout with the ID
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);
        locationTextView.setText(currentSubject.getLocation());

        // Find the TextView in the list_item.xml layout with the ID
        TextView hoursTextView = (TextView) listItemView.findViewById(R.id.hours_text_view);
        hoursTextView.setText(currentSubject.getHours());

        // Find the ImageView in the list_item.xml layout with the ID
        ImageView tourImageView = (ImageView) listItemView.findViewById(R.id.tour_image_view);
        tourImageView.setImageResource(currentSubject.getImageResourceId());

        // Return the list layout (4 TextViews and 1 ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
