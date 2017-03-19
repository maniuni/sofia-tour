package com.example.android.sofiatour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * TourItemAdapter is a type of ArrayAdapter that provides the layout
 * for each list item based on a data source which is a list of TourItem objects.
 */
public class TourItemAdapter extends ArrayAdapter<TourItem> {

    /**
     * Create a new {@link TourItemAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param tourItems is the list of {@link TourItem}s to be displayed.
     */
    public TourItemAdapter(Context context, ArrayList<TourItem> tourItems){
        super(context, 0, tourItems);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link TourItem} object located at this position in the list
        TourItem tourItem = getItem(position);

        // Find the TextView in the tourItem_list.xml layout with the ID item_name.
        TextView textView = (TextView) listItemView.findViewById(R.id.item_name);

        // Get the text string from the tourItem object and set this text on
        // the textView.
        textView.setText(tourItem.getDefaultStringId());

        // Find the ImageView in the tourItem_list.xml layout with the ID item_image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.item_image);

        // Display the provided image based on the resource ID
        imageView.setImageResource(tourItem.getImageResourceId());

        // Return the whole list item layout (containing 1 TextView and 1 ImageView) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
