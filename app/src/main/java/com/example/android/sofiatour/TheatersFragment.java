package com.example.android.sofiatour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of theaters in Sofia.
 */
public class TheatersFragment extends Fragment {


    public TheatersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.touritems_list, container, false);

        /** Create a list of Tour items */
        final ArrayList<TourItem> tourItems = new ArrayList<>();
        tourItems.add(new TourItem(R.drawable.theaters_naroden, R.string.theaters_naroden));
        tourItems.add(new TourItem(R.drawable.theaters_army, R.string.theaters_army));
        tourItems.add(new TourItem(R.drawable.theaters_satirical, R.string.theaters_satirical));
        tourItems.add(new TourItem(R.drawable.theaters_tearandlaugh, R.string.theaters_tearandlaugh));
        tourItems.add(new TourItem(R.drawable.theaters_puppet, R.string.theaters_puppet));
        tourItems.add(new TourItem(R.drawable.theaters_199, R.string.theaters_199));

        // Create an {@link TourItemAdapter}, whose data source is a list of {@link TourItem}s. The
        // adapter knows how to create list items for each item in the list.
        TourItemAdapter adapter = new TourItemAdapter(getActivity(), tourItems);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tourItem_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link TourItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link TourItem} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
