package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SubjectsAdapter extends ArrayAdapter<Subjects> {
    private Context mContext;

    /**Removed "Activity" and replaced with "Context"**/
    public SubjectsAdapter(Context context, ArrayList<Subjects> words) {
        super(context, 0, words);
        this.mContext = context;
    }

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
        TextView placeTextView = listItemView.findViewById(R.id.place_text_view);
        placeTextView.setText(currentSubject.getPlace());

        // Find the TextView in the list_item.xml layout with the ID
        TextView descriptionTextView = listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentSubject.getDescription());

        // Find the TextView in the list_item.xml layout with the ID
        TextView locationTextView = listItemView.findViewById(R.id.location_text_view);
        locationTextView.setText(currentSubject.getLocation());


        RelativeLayout locationLayout = listItemView.findViewById(R.id.location_layout);
        locationLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String location = ((TextView) view.findViewById(R.id.location_text_view)).getText().toString();
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + "+" + location + ", NYC");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                mContext.startActivity(mapIntent);
            }
        });

        // Find the TextView in the list_item.xml layout with the ID
        TextView hoursTextView = listItemView.findViewById(R.id.hours_text_view);
        hoursTextView.setText(currentSubject.getHours());

        // Find the ImageView in the list_item.xml layout with the ID
        ImageView tourImageView = listItemView.findViewById(R.id.tour_image_view);
        tourImageView.setImageResource(currentSubject.getImageResourceId());

        // Return the list layout (4 TextViews and 1 ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
