package com.example.android.sofiatour;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the ViewPager in activity_main.xml
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        // Make a new CategoryAdapter
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Make the viewPager use the categoryAdapter that we made above
        viewPager.setAdapter(categoryAdapter);

        /** Find the TabLayout and set up with the ViewPager */
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
