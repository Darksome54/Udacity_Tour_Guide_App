package com.example.android.tourguideapp;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    /**
     * Toolbar toolbar;
     * <p>
     * ImageView imageView;
     **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        final Toolbar toolbar = findViewById(R.id.htab_toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle("New York City Tour Guide");
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(false);


        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);

        /**toolbar = findViewById(R.id.htab_toolbar);

         setSupportActionBar(toolbar);

         final ActionBar ab = getSupportActionBar();

         ab.setDisplayHomeAsUpEnabled(true);

         ab.setTitle("New York Tour");

         imageView= findViewById(R.id.tour_image_view);**/

    }
}
