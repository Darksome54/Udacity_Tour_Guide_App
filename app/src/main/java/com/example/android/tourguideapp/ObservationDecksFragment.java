package com.example.android.tourguideapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
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
