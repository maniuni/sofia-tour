package com.example.android.sofiatour;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of landmarks in Sofia.
 */
public class LandmarksFragment extends Fragment {


    public LandmarksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.touritems_list, container, false);

        /** Create a list of tour items */
        final ArrayList<TourItem> tourItems = new ArrayList<>();
        tourItems.add(new TourItem(R.drawable.landmarks_alexandernevski, R.string.landmarks_alexanderNevski));
        tourItems.add(new TourItem(R.drawable.landmarks_nationalpalace, R.string.landmarks_nationalPalace));
        tourItems.add(new TourItem(R.drawable.landmarks_university, R.string.landmarks_university));
        tourItems.add(new TourItem(R.drawable.landmarks_stsofia, R.string.landmarks_stSofia));
        tourItems.add(new TourItem(R.drawable.landmarks_unknownsoldier, R.string.landmarks_unknownSoldier));
        tourItems.add(new TourItem(R.drawable.landmarks_banya, R.string.landmarks_banya));

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
