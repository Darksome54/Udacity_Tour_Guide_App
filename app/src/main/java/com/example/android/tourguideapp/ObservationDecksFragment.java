package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ObservationDecksFragment extends Fragment {


    public ObservationDecksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        //Create an ArrayList for Place, Description, Location, Hours, and Image
        final ArrayList<Subjects> words = new ArrayList<>();
        words.add(new Subjects(getString(R.string.one_world_obs),
                getString(R.string.one_world_obs_des),
                getString(R.string.one_world_obs_loc),
                getString(R.string.one_world_obs_hours),
                R.drawable.one_world_obs));
        words.add(new Subjects(getString(R.string.thirty_rock),
                getString(R.string.thirty_rock_des),
                getString(R.string.thirty_rock_loc),
                getString(R.string.thirty_rock_hours),
                R.drawable.thirty_rock));
        words.add(new Subjects(getString(R.string.empire_state),
                getString(R.string.empire_state_des),
                getString(R.string.empire_state_loc),
                getString(R.string.empire_state_hours),
                R.drawable.empire_state));

        SubjectsAdapter adapter = new SubjectsAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
