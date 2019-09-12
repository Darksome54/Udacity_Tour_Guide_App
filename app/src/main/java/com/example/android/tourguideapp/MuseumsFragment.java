package com.example.android.tourguideapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        //Create an ArrayList for Place, Description, Location, Hours, and Image
        final ArrayList<Subjects> words = new ArrayList<>();
        words.add(new Subjects(getString(R.string.natural_history_museum),
                getString(R.string.natural_history_museum_des),
                getString(R.string.natural_history_museum_loc),
                getString(R.string.natural_history_museum_hours),
                R.drawable.natural_history_museum));
        words.add(new Subjects(getString(R.string.guggenheim_museum),
                getString(R.string.guggenheim_museum_des),
                getString(R.string.guggenheim_museum_loc),
                getString(R.string.guggenheim_museum_hours),
                R.drawable.guggenheim_museum));
        words.add(new Subjects(getString(R.string.world_trade_center),
                getString(R.string.world_trade_center_des),
                getString(R.string.world_trade_center_loc),
                getString(R.string.world_trade_center_hours),
                R.drawable.world_trade_center));

        SubjectsAdapter adapter = new SubjectsAdapter(getActivity(), words);
        ListView listView = rootView.findViewById(R.id.list);

        //Allows the CollapsingToolbar to scroll up with the ViewPager
        listView.setNestedScrollingEnabled(true);
        listView.setAdapter(adapter);

        /**listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String location = ((TextView)view.findViewById(R.id.location_text_view)).getText().toString();
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + "+" + location + ", NYC" );
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });**/

        return rootView;
    }

}
