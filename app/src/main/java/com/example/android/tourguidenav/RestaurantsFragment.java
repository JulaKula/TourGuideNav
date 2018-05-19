package com.example.android.tourguidenav;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        // Create an ArrayList and add newly created Location objects
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));
        locations.add(new Location(R.string.restaurant, R.string.description));



        // Create a LocationAdapter, with the foregoing ArrayList as data source. Connect adapter with listView
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
