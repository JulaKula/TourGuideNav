package com.example.android.tourguidenav;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    // Create the LocationAdapter constructor
    public LocationAdapter(Context context, ArrayList<Location> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Create a Location object and call its methods to assign proper values to views in the layout
        Location currentLocation = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name);
        assert currentLocation != null;
        nameTextView.setText(currentLocation.getName());

        TextView descriptionTextView = listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentLocation.getDescription());

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentLocation.getPhoto());
//        if (currentLocation.getPhoto() != 0) {
//            imageView.setVisibility(View.VISIBLE);
//        }

        return listItemView;
    }
}

