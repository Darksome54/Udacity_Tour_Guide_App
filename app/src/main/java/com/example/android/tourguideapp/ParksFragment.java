package com.example.android.tourguideapp;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        //Create an ArrayList for Place, Description, Location, Hours, and Image
        final ArrayList<Subjects> words = new ArrayList<>();
        words.add(new Subjects(getString(R.string.central_park),
                getString(R.string.central_park_des),
                getString(R.string.central_park_loc),
                getString(R.string.central_park_hours),
                R.drawable.central_park));
        words.add(new Subjects(getString(R.string.bryant_park),
                getString(R.string.bryant_park_des),
                getString(R.string.bryant_park_loc),
                getString(R.string.bryant_park_hours),
                R.drawable.bryant_park));
        words.add(new Subjects(getString(R.string.brooklyn_bridge_park),
                getString(R.string.brooklyn_bridge_des),
                getString(R.string.brooklyn_bridge_loc),
                getString(R.string.brooklyn_bridge_hours),
                R.drawable.brooklyn_bridge_park));

        SubjectsAdapter adapter = new SubjectsAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}

