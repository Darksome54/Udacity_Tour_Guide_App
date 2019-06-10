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
public class MiscellaneousFragment extends Fragment {


    public MiscellaneousFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_layout, container, false);

        //Create an ArrayList for Place, Description, Location, Hours, and Image
        final ArrayList<Subjects> words = new ArrayList<Subjects>();
        words.add(new Subjects(getString(R.string.the_highline),
                getString(R.string.the_highline_des),
                getString(R.string.the_highline_loc),
                getString(R.string.the_highline_hours),
                R.drawable.the_highline));
        words.add(new Subjects(getString(R.string.st_john),
                getString(R.string.st_john_des),
                getString(R.string.st_john_loc),
                getString(R.string.st_john_hours),
                R.drawable.st_john));
        words.add(new Subjects(getString(R.string.chelsea_market),
                getString(R.string.chelsea_market_des),
                getString(R.string.chelsea_market_loc),
                getString(R.string.chelsea_market_hours),
                R.drawable.chelsea_market));

        SubjectsAdapter adapter = new SubjectsAdapter(getActivity(), words);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
