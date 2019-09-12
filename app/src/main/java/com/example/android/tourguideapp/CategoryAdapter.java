package com.example.android.tourguideapp;


import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;
    public CategoryAdapter(Context context, FragmentManager fm) {
        // Required empty public constructor
        super(fm);
        mContext = context;
    }


    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ParksFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new ObservationDecksFragment();
        } else {
            return new MiscellaneousFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.parks_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.museums_fragment);
        } else if (position == 2) {
            return mContext.getString(R.string.observation_decks_fragment);
        } else {
            return mContext.getString(R.string.miscellaneous_fragment);
        }
    }
}