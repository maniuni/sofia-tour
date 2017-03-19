package com.example.android.sofiatour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of parks in Sofia.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.touritems_list, container, false);

        /** Create a list of Tour items */
        final ArrayList<TourItem> tourItems = new ArrayList<>();
        tourItems.add(new TourItem(R.drawable.parks_south, R.string.parks_south));
        tourItems.add(new TourItem(R.drawable.parks_north, R.string.parks_north));
        tourItems.add(new TourItem(R.drawable.parks_west, R.string.parks_west));
        tourItems.add(new TourItem(R.drawable.parks_borisova, R.string.parks_borisova));
        tourItems.add(new TourItem(R.drawable.parks_doctors, R.string.parks_doctors));
        tourItems.add(new TourItem(R.drawable.parks_bells, R.string.parks_bells));

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
